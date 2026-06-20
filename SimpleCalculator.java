import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator i Thjeshte ne Java / Simple Calculator in Java");
        System.out.println("Zgjidh nje operacion / Choose an operation:");
        System.out.println("1. Mbledhje / Addition (+)");
        System.out.println("2. Zbritje / Subtraction (-)");
        System.out.println("3. Shumezim / Multiplication (*)");
        System.out.println("4. Pjestim / Division (/)");

        System.out.print("Shkruaj zgjedhjen tende (1-4) / Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Shkruaj numrin e pare / Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Shkruaj numrin e dyte / Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double result;

        if (choice == 1) {
            result = add(firstNumber, secondNumber);
            System.out.println("Rezultati / Result: " + result);
        } else if (choice == 2) {
            result = subtract(firstNumber, secondNumber);
            System.out.println("Rezultati / Result: " + result);
        } else if (choice == 3) {
            result = multiply(firstNumber, secondNumber);
            System.out.println("Rezultati / Result: " + result);
        } else if (choice == 4) {
            if (secondNumber == 0) {
                System.out.println("Gabim: Nuk mund te pjestohet me zero. / Error: Cannot divide by zero.");
            } else {
                result = divide(firstNumber, secondNumber);
                System.out.println("Rezultati / Result: " + result);
            }
        } else {
            System.out.println("Zgjedhje e pavlefshme. / Invalid choice.");
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
