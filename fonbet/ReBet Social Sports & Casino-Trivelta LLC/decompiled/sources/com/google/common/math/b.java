package com.google.common.math;

import Ra.n;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final double f36874a = Math.log(2.0d);
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d10, double d11, double d12) {
        f.d("tolerance", d12);
        if (Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static boolean b(double d10) {
        if (c.b(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(c.a(d10)) <= Math.getExponent(d10);
        }
        return false;
    }

    public static boolean c(double d10) {
        if (d10 > 0.0d && c.b(d10)) {
            long a10 = c.a(d10);
            if ((a10 & (a10 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(double d10, RoundingMode roundingMode) {
        boolean c10;
        n.e(d10 > 0.0d && c.b(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (!c.c(d10)) {
            return d(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (a.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                f.f(c(d10));
                return !r1 ? exponent + 1 : exponent;
            case 2:
                if (!r1) {
                }
                break;
            case 3:
                r1 = !c(d10);
                if (!r1) {
                }
                break;
            case 4:
                r1 = exponent < 0;
                c10 = c(d10);
                r1 &= !c10;
                if (!r1) {
                }
                break;
            case 5:
                r1 = exponent >= 0;
                c10 = c(d10);
                r1 &= !c10;
                if (!r1) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double d11 = c.d(d10);
                if (d11 * d11 > 2.0d) {
                    r1 = true;
                }
                if (!r1) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static double e(double d10, RoundingMode roundingMode) {
        if (!c.b(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                f.f(b(d10));
                return d10;
            case 2:
                return (d10 >= 0.0d || b(d10)) ? d10 : ((long) d10) - 1;
            case 3:
                return (d10 <= 0.0d || b(d10)) ? d10 : ((long) d10) + 1;
            case 4:
                return d10;
            case 5:
                if (b(d10)) {
                    return d10;
                }
                return ((long) d10) + (d10 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d10);
            case 7:
                double rint = Math.rint(d10);
                return Math.abs(d10 - rint) == 0.5d ? d10 + Math.copySign(0.5d, d10) : rint;
            case 8:
                double rint2 = Math.rint(d10);
                return Math.abs(d10 - rint2) == 0.5d ? d10 : rint2;
            default:
                throw new AssertionError();
        }
    }

    public static long f(double d10, RoundingMode roundingMode) {
        double e10 = e(d10, roundingMode);
        f.a(((-9.223372036854776E18d) - e10 < 1.0d) & (e10 < 9.223372036854776E18d), d10, roundingMode);
        return (long) e10;
    }
}
