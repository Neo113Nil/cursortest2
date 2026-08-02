package defpackage;

import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bi2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public bi2(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static bi2 a(int i) {
        svk svkVar = svk.k;
        float G = wkn.G(Color.red(i));
        float G2 = wkn.G(Color.green(i));
        float G3 = wkn.G(Color.blue(i));
        float[][] fArr = wkn.e;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * G3) + (fArr2[1] * G2) + (fArr2[0] * G);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * G3) + (fArr3[1] * G2) + (fArr3[0] * G);
        float[] fArr4 = fArr[2];
        float f3 = (G3 * fArr4[2]) + (G2 * fArr4[1]) + (G * fArr4[0]);
        float[][] fArr5 = wkn.b;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = svkVar.g;
        float f7 = svkVar.i;
        float f8 = svkVar.d;
        float f9 = svkVar.a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = svkVar.h;
        float pow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * svkVar.b) / f9, svkVar.j * f8)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, svkVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * svkVar.e) * svkVar.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f7 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new bi2(atan2, pow5, pow4, f21, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static bi2 b(float f, float f2, float f3) {
        svk svkVar = svk.k;
        float f4 = svkVar.d;
        Math.sqrt(f / 100.0d);
        float f5 = svkVar.a + 4.0f;
        float f6 = svkVar.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * svkVar.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new bi2(f3, f2, f, f7, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(svk svkVar) {
        float f;
        float f2 = this.b;
        double d = f2;
        float f3 = this.c;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float f4 = svkVar.f;
                float f5 = svkVar.h;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d3 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = svkVar.a * ((float) Math.pow(f3 / 100.0d, (1.0d / svkVar.d) / svkVar.j));
                float f6 = cos * 3846.1538f * svkVar.e * svkVar.c;
                float f7 = pow2 / svkVar.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f6 * 23.0f)));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
                float c = mz1.c(f10, 261.0f, f11 - (891.0f * f9), 1403.0f);
                float c2 = mz1.c(f10, 6300.0f, f11 - (f9 * 220.0f), 1403.0f);
                float f13 = 100.0f / f5;
                float signum = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum2 = Math.signum(c) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(c) * 27.13d) / (400.0d - Math.abs(c))), 2.380952380952381d));
                float signum3 = Math.signum(c2) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(c2) * 27.13d) / (400.0d - Math.abs(c2))), 2.380952380952381d));
                float[] fArr = svkVar.g;
                float f14 = signum / fArr[0];
                float f15 = signum2 / fArr[1];
                float f16 = signum3 / fArr[2];
                float[][] fArr2 = wkn.c;
                float[] fArr3 = fArr2[0];
                float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
                float[] fArr4 = fArr2[1];
                float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
                float[] fArr5 = fArr2[2];
                return o23.d(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
            }
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f42 = svkVar.f;
        float f52 = svkVar.h;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d32 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = svkVar.a * ((float) Math.pow(f3 / 100.0d, (1.0d / svkVar.d) / svkVar.j));
        float f62 = cos3 * 3846.1538f * svkVar.e * svkVar.c;
        float f72 = pow22 / svkVar.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f82 = (((0.305f + f72) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f62 * 23.0f)));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = ((288.0f * f102) + ((451.0f * f92) + f112)) / 1403.0f;
        float c3 = mz1.c(f102, 261.0f, f112 - (891.0f * f92), 1403.0f);
        float c22 = mz1.c(f102, 6300.0f, f112 - (f92 * 220.0f), 1403.0f);
        float f132 = 100.0f / f52;
        float signum4 = Math.signum(f122) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum22 = Math.signum(c3) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(c3) * 27.13d) / (400.0d - Math.abs(c3))), 2.380952380952381d));
        float signum32 = Math.signum(c22) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(c22) * 27.13d) / (400.0d - Math.abs(c22))), 2.380952380952381d));
        float[] fArr6 = svkVar.g;
        float f142 = signum4 / fArr6[0];
        float f152 = signum22 / fArr6[1];
        float f162 = signum32 / fArr6[2];
        float[][] fArr22 = wkn.c;
        float[] fArr32 = fArr22[0];
        float f172 = (fArr32[2] * f162) + (fArr32[1] * f152) + (fArr32[0] * f142);
        float[] fArr42 = fArr22[1];
        float f182 = (fArr42[2] * f162) + (fArr42[1] * f152) + (fArr42[0] * f142);
        float[] fArr52 = fArr22[2];
        return o23.d(f172, f182, (f162 * fArr52[2]) + (f152 * fArr52[1]) + (f142 * fArr52[0]));
    }
}
