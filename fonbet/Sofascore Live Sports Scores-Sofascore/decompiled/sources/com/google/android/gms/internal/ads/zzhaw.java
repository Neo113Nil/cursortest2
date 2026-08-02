package com.google.android.gms.internal.ads;

import defpackage.lko;
import defpackage.o3a;
import defpackage.ogj;
import defpackage.x2a;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhaw {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (d > 0.0d && x2a.X(d)) {
            long V = x2a.V(d);
            if ((V & ((-1) + V)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(double d) {
        boolean a2;
        RoundingMode roundingMode = RoundingMode.CEILING;
        zzguk.b("x must be positive and finite", d > 0.0d && x2a.X(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return b(d * 4.503599627370496E15d) - 52;
        }
        switch (lko.a[roundingMode.ordinal()]) {
            case 1:
                o3a.S(a(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r2 = !a(d);
                return !r2 ? exponent + 1 : exponent;
            case 4:
                r2 = exponent < 0;
                a2 = a(d);
                r2 &= !a2;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                a2 = a(d);
                r2 &= !a2;
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

    public static boolean c(double d) {
        if (x2a.X(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(x2a.V(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
