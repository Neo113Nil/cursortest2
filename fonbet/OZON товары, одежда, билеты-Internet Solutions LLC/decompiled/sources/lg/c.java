package lg;

import B0.A0;
import C.C2702w;
import I0.C3173b;

/* loaded from: classes10.dex */
public final class c {
    public static int a(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 > j12 ? 1 : 0;
    }

    public static long b(long j11, long j12) {
        return j11 >= 0 ? j11 / j12 : ((j11 + 1) / j12) - 1;
    }

    public static int c(int i11, int i12) {
        return ((i11 % i12) + i12) % i12;
    }

    public static int d(int i11, long j11) {
        long j12 = i11;
        return (int) (((j11 % j12) + j12) % j12);
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static int f(int i11, int i12) {
        int i13 = i11 + i12;
        if ((i11 ^ i13) >= 0 || (i11 ^ i12) < 0) {
            return i13;
        }
        throw new ArithmeticException(A0.a(i11, i12, "Addition overflows an int: ", " + "));
    }

    public static long g(long j11, long j12) {
        long j13 = j11 + j12;
        if ((j11 ^ j13) >= 0 || (j11 ^ j12) < 0) {
            return j13;
        }
        StringBuilder d11 = C2702w.d(j11, "Addition overflows a long: ", " + ");
        d11.append(j12);
        throw new ArithmeticException(d11.toString());
    }

    public static long h(int i11, long j11) {
        if (i11 == -1) {
            if (j11 != Long.MIN_VALUE) {
                return -j11;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i11);
        }
        if (i11 == 0) {
            return 0L;
        }
        if (i11 == 1) {
            return j11;
        }
        long j12 = i11;
        long j13 = j11 * j12;
        if (j13 / j12 == j11) {
            return j13;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i11);
    }

    public static int i(long j11) {
        if (j11 > 2147483647L || j11 < -2147483648L) {
            throw new ArithmeticException(C3173b.b(j11, "Calculation overflows an int: "));
        }
        return (int) j11;
    }
}
