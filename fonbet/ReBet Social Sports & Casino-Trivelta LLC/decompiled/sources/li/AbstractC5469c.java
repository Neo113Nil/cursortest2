package li;

import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: li.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5469c {
    public static int a(int i10, int i11) {
        return i10 >= 0 ? i10 / i11 : ((i10 + 1) / i11) - 1;
    }

    public static long b(long j10, int i10) {
        return j10 >= 0 ? j10 / i10 : ((j10 + 1) / i10) - 1;
    }

    public static int c(int i10, int i11) {
        return i10 - (i11 * a(i10, i11));
    }

    public static int d(long j10, int i10) {
        return (int) (j10 - (i10 * b(j10, i10)));
    }

    public static int e(int i10, int i11) {
        if (i11 == 0) {
            return i10;
        }
        long j10 = i10 + i11;
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i10);
        sb2.append(',');
        sb2.append(i11);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static long f(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        if (j11 <= 0 ? j10 >= Long.MIN_VALUE - j11 : j10 <= LongCompanionObject.MAX_VALUE - j11) {
            return j10 + j11;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j10);
        sb2.append(',');
        sb2.append(j11);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static int g(long j10) {
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new ArithmeticException("Out of range: " + j10);
    }

    public static int h(int i10, int i11) {
        if (i11 == 1) {
            return i10;
        }
        long j10 = i10 * i11;
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i10);
        sb2.append(',');
        sb2.append(i11);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static long i(long j10, long j11) {
        if (j11 == 1) {
            return j10;
        }
        if (j11 <= 0 ? j11 >= -1 ? !(j11 == -1 && j10 == Long.MIN_VALUE) : j10 <= Long.MIN_VALUE / j11 && j10 >= LongCompanionObject.MAX_VALUE / j11 : j10 <= LongCompanionObject.MAX_VALUE / j11 && j10 >= Long.MIN_VALUE / j11) {
            return j10 * j11;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j10);
        sb2.append(',');
        sb2.append(j11);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static int j(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return -i10;
        }
        throw new ArithmeticException("Not negatable: " + i10);
    }

    public static long k(long j10) {
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        throw new ArithmeticException("Not negatable: " + j10);
    }

    public static int l(int i10, int i11) {
        if (i11 == 0) {
            return i10;
        }
        long j10 = i10 - i11;
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i10);
        sb2.append(',');
        sb2.append(i11);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }

    public static long m(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        if (j11 <= 0 ? j10 <= LongCompanionObject.MAX_VALUE + j11 : j10 >= Long.MIN_VALUE + j11) {
            return j10 - j11;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j10);
        sb2.append(',');
        sb2.append(j11);
        sb2.append(')');
        throw new ArithmeticException(sb2.toString());
    }
}
