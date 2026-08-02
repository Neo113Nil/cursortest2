package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class e75 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (gz8.O(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(gz8.N(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && gz8.O(d)) {
            long N = gz8.N(d);
            if ((N & (N - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(double d) {
        boolean b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        z1a.r("x must be positive and finite", d > 0.0d && gz8.O(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (d75.a[roundingMode.ordinal()]) {
            case 1:
                f6a.k(b(d));
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !b(d);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                b = b(d);
                r2 &= !b;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                b = b(d);
                r2 &= !b;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                ogj.b();
                return 0;
        }
    }
}
