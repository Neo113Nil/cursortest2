package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t00 {
    public static final float[] a;

    static {
        float f;
        float e;
        float f2;
        float f3;
        float f4;
        float f5;
        float e2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        a = fArr;
        float[] fArr2 = new float[101];
        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                e = wt3.e(f13, f9, 2.0f, f9);
                f2 = f11 - e;
                f3 = e * 3.0f * f2;
                f4 = e * e * e;
                float f14 = (((e * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f11;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f12) {
                    f13 = e;
                } else {
                    f9 = e;
                }
                f11 = f5;
            }
            float f15 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + e) * f3) + f4;
            float f16 = f5;
            while (true) {
                e2 = wt3.e(f16, f10, f, f10);
                f6 = f5 - e2;
                f7 = e2 * 3.0f * f6;
                f8 = e2 * e2 * e2;
                float f17 = (((f6 * f15) + e2) * f7) + f8;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = e2;
                    } else {
                        f10 = e2;
                    }
                    f15 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((e2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static s00 a(float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = 1.0f;
        float b = llf.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        int i = (int) (100.0f * b);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float b2 = me4.b(b, f4, f6, f5);
            f2 = f6;
            f3 = b2;
        }
        return new s00(f3, f2);
    }
}
