package f0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f9296k;

    /* renamed from: a, reason: collision with root package name */
    public final float f9297a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9298b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9299c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9300d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9301e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9302f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f9303g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9304h;

    /* renamed from: i, reason: collision with root package name */
    public final float f9305i;
    public final float j;

    static {
        float[] fArr = b.f9271c;
        float k6 = (float) ((b.k() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f9269a;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f6;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f6 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-k6) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float f18 = 1.0f / ((5.0f * k6) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(k6 * 5.0d))) + (f19 * k6);
        float k9 = b.k() / fArr[1];
        double d11 = k9;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr6[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr6[2];
        float[] fArr7 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f9296k = new m(k9, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f17, 1.0f, new float[]{(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f6, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f9302f = f6;
        this.f9297a = f10;
        this.f9298b = f11;
        this.f9299c = f12;
        this.f9300d = f13;
        this.f9301e = f14;
        this.f9303g = fArr;
        this.f9304h = f15;
        this.f9305i = f16;
        this.j = f17;
    }
}
