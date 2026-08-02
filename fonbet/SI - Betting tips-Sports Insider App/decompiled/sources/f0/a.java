package f0;

import android.graphics.Color;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9263a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9264b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9265c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9266d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9267e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9268f;

    public a(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f9263a = f6;
        this.f9264b = f10;
        this.f9265c = f11;
        this.f9266d = f12;
        this.f9267e = f13;
        this.f9268f = f14;
    }

    public static a a(int i5) {
        m mVar = m.f9296k;
        float e7 = b.e(Color.red(i5));
        float e9 = b.e(Color.green(i5));
        float e10 = b.e(Color.blue(i5));
        float[][] fArr = b.f9272d;
        float[] fArr2 = fArr[0];
        float f6 = (fArr2[2] * e10) + (fArr2[1] * e9) + (fArr2[0] * e7);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * e10) + (fArr3[1] * e9) + (fArr3[0] * e7);
        float[] fArr4 = fArr[2];
        float f11 = (e10 * fArr4[2]) + (e9 * fArr4[1]) + (e7 * fArr4[0]);
        float[][] fArr5 = b.f9269a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f6);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f6);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f6 * fArr8[0]);
        float[] fArr9 = mVar.f9303g;
        float f15 = mVar.f9305i;
        float f16 = mVar.f9300d;
        float f17 = mVar.f9297a;
        float f18 = fArr9[0] * f12;
        float f19 = fArr9[1] * f13;
        float f20 = fArr9[2] * f14;
        float f21 = mVar.f9304h;
        float pow = (float) Math.pow((Math.abs(f18) * f21) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * mVar.f9298b) / f17, mVar.j * f16)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f17 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f9302f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f9301e) * mVar.f9299c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f16) / f28);
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f15 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f27;
        return new a(atan2, pow5, pow4, f29, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f6, float f10, float f11) {
        m mVar = m.f9296k;
        float f12 = mVar.f9300d;
        Math.sqrt(f6 / 100.0d);
        float f13 = mVar.f9297a + 4.0f;
        float f14 = mVar.f9305i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * mVar.f9300d) / f13);
        float f15 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f6, f15, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(m mVar) {
        float f6;
        float f10 = this.f9264b;
        double d10 = f10;
        float f11 = this.f9265c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 != 0.0d) {
                f6 = f10 / ((float) Math.sqrt(d11 / 100.0d));
                float f12 = mVar.f9302f;
                float f13 = mVar.f9304h;
                float pow = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, f12), 0.73d), 1.1111111111111112d);
                double d12 = (this.f9263a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
                float pow2 = mVar.f9297a * ((float) Math.pow(f11 / 100.0d, (1.0d / mVar.f9300d) / mVar.j));
                float f14 = cos * 3846.1538f * mVar.f9301e * mVar.f9299c;
                float f15 = pow2 / mVar.f9298b;
                float sin = (float) Math.sin(d12);
                float cos2 = (float) Math.cos(d12);
                float f16 = (((0.305f + f15) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f14 * 23.0f)));
                float f17 = cos2 * f16;
                float f18 = f16 * sin;
                float f19 = f15 * 460.0f;
                float f20 = ((288.0f * f18) + ((451.0f * f17) + f19)) / 1403.0f;
                float d13 = d9.e.d(f18, 261.0f, f19 - (891.0f * f17), 1403.0f);
                float d14 = d9.e.d(f18, 6300.0f, f19 - (f17 * 220.0f), 1403.0f);
                float f21 = 100.0f / f13;
                float signum = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float signum2 = Math.signum(d13) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d13) * 27.13d) / (400.0d - Math.abs(d13))), 2.380952380952381d));
                float signum3 = Math.signum(d14) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d14) * 27.13d) / (400.0d - Math.abs(d14))), 2.380952380952381d));
                float[] fArr = mVar.f9303g;
                float f22 = signum / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.f9270b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return g0.c.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f6 = 0.0f;
        float f122 = mVar.f9302f;
        float f132 = mVar.f9304h;
        float pow3 = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, f122), 0.73d), 1.1111111111111112d);
        double d122 = (this.f9263a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d122) + 3.8d)) * 0.25f;
        float pow22 = mVar.f9297a * ((float) Math.pow(f11 / 100.0d, (1.0d / mVar.f9300d) / mVar.j));
        float f142 = cos3 * 3846.1538f * mVar.f9301e * mVar.f9299c;
        float f152 = pow22 / mVar.f9298b;
        float sin2 = (float) Math.sin(d122);
        float cos22 = (float) Math.cos(d122);
        float f162 = (((0.305f + f152) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f142 * 23.0f)));
        float f172 = cos22 * f162;
        float f182 = f162 * sin2;
        float f192 = f152 * 460.0f;
        float f202 = ((288.0f * f182) + ((451.0f * f172) + f192)) / 1403.0f;
        float d132 = d9.e.d(f182, 261.0f, f192 - (891.0f * f172), 1403.0f);
        float d142 = d9.e.d(f182, 6300.0f, f192 - (f172 * 220.0f), 1403.0f);
        float f212 = 100.0f / f132;
        float signum4 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float signum22 = Math.signum(d132) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d132) * 27.13d) / (400.0d - Math.abs(d132))), 2.380952380952381d));
        float signum32 = Math.signum(d142) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(d142) * 27.13d) / (400.0d - Math.abs(d142))), 2.380952380952381d));
        float[] fArr6 = mVar.f9303g;
        float f222 = signum4 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.f9270b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return g0.c.a(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
