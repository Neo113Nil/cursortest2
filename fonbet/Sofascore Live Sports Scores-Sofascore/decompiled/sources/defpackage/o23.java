package defpackage;

import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class o23 {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(double d, double d2, double d3) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        double d7 = pow * 95.047d;
        dArr[0] = d7;
        double d8 = pow2 * 100.0d;
        dArr[1] = d8;
        double d9 = pow3 * 108.883d;
        dArr[2] = d9;
        return d(d7, d8, d9);
    }

    public static void b(int i, int i2, int i3, float[] fArr) {
        float e;
        float abs;
        float f = i / 255.0f;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float max = Math.max(f, Math.max(f2, f3));
        float min = Math.min(f, Math.min(f2, f3));
        float f4 = max - min;
        float f5 = (max + min) / 2.0f;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (max == min) {
            e = 0.0f;
            abs = 0.0f;
        } else {
            e = max == f ? ((f2 - f3) / f4) % 6.0f : max == f2 ? wt3.e(f3, f, f4, 2.0f) : wt3.e(f, f2, f4, 4.0f);
            abs = f4 / (1.0f - Math.abs((2.0f * f5) - 1.0f));
        }
        float f7 = (e * 60.0f) % 360.0f;
        if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : Math.min(f7, 360.0f);
        fArr[1] = abs < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : Math.min(abs, 1.0f);
        if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 = Math.min(f5, 1.0f);
        }
        fArr[2] = f6;
    }

    public static void c(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            a70.p("outXyz must have a length of 3.");
            return;
        }
        double d = i / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
    }

    public static int d(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double pow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static double e(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            a70.p(bf3.i(i2, new StringBuilder("background can not be translucent: #")));
            return 0.0d;
        }
        if (Color.alpha(i) < 255) {
            i = h(i, i2);
        }
        double f = f(i) + 0.05d;
        double f2 = f(i2) + 0.05d;
        return Math.max(f, f2) / Math.min(f, f2);
    }

    public static double f(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        c(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    public static int g(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            a70.p(bf3.i(i2, new StringBuilder("background can not be translucent: #")));
            return 0;
        }
        double d = f;
        if (e(k(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (e(k(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static int h(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, i(Color.red(i), alpha2, Color.red(i2), alpha, i3), i(Color.green(i), alpha2, Color.green(i2), alpha, i3), i(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int i(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static double j(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int k(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        a70.p("alpha must be between 0 and 255.");
        return 0;
    }
}
