package o9;

/* renamed from: o9.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8667i {

    /* renamed from: a, reason: collision with root package name */
    private final float f77822a;

    /* renamed from: b, reason: collision with root package name */
    private final float f77823b;

    /* renamed from: c, reason: collision with root package name */
    private final float f77824c;

    /* renamed from: d, reason: collision with root package name */
    private final float f77825d;

    /* renamed from: e, reason: collision with root package name */
    private final float f77826e;

    /* renamed from: f, reason: collision with root package name */
    private final float f77827f;

    /* renamed from: g, reason: collision with root package name */
    private final float f77828g;

    /* renamed from: h, reason: collision with root package name */
    private final float f77829h;

    /* renamed from: i, reason: collision with root package name */
    private final float f77830i;

    private C8667i(float f7, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f77822a = f7;
        this.f77823b = f13;
        this.f77824c = f16;
        this.f77825d = f11;
        this.f77826e = f14;
        this.f77827f = f17;
        this.f77828g = f12;
        this.f77829h = f15;
        this.f77830i = f18;
    }

    public static C8667i a(float f7, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26) {
        C8667i b11 = b(f7, f11, f12, f13, f14, f15, f16, f17);
        float f27 = b11.f77826e;
        float f28 = b11.f77830i;
        float f29 = b11.f77827f;
        float f31 = b11.f77829h;
        float f32 = (f27 * f28) - (f29 * f31);
        float f33 = b11.f77828g;
        float f34 = b11.f77825d;
        float f35 = (f29 * f33) - (f34 * f28);
        float f36 = (f34 * f31) - (f27 * f33);
        float f37 = b11.f77824c;
        float f38 = b11.f77823b;
        float f39 = (f37 * f31) - (f38 * f28);
        float f41 = b11.f77822a;
        float f42 = (f28 * f41) - (f37 * f33);
        float f43 = (f33 * f38) - (f31 * f41);
        float f44 = (f38 * f29) - (f37 * f27);
        float f45 = (f37 * f34) - (f29 * f41);
        float f46 = (f41 * f27) - (f38 * f34);
        C8667i b12 = b(f18, f19, f21, f22, f23, f24, f25, f26);
        float f47 = b12.f77822a;
        float f48 = b12.f77825d;
        float f49 = b12.f77828g;
        float f51 = (f49 * f44) + (f48 * f39) + (f47 * f32);
        float f52 = (f49 * f45) + (f48 * f42) + (f47 * f35);
        float f53 = f49 * f46;
        float f54 = f53 + (f48 * f43) + (f47 * f36);
        float f55 = b12.f77823b;
        float f56 = b12.f77826e;
        float f57 = b12.f77829h;
        float f58 = (f57 * f44) + (f56 * f39) + (f55 * f32);
        float f59 = (f57 * f45) + (f56 * f42) + (f55 * f35);
        float f61 = f57 * f46;
        float f62 = f61 + (f56 * f43) + (f55 * f36);
        float f63 = b12.f77824c;
        float f64 = b12.f77827f;
        float f65 = f39 * f64;
        float f66 = b12.f77830i;
        return new C8667i(f51, f52, f54, f58, f59, f62, (f44 * f66) + f65 + (f32 * f63), (f45 * f66) + (f42 * f64) + (f35 * f63), (f66 * f46) + (f64 * f43) + (f63 * f36));
    }

    public static C8667i b(float f7, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f7 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new C8667i(f12 - f7, f14 - f12, f7, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = f13 - f15;
        float f24 = f17 - f15;
        float f25 = (f21 * f24) - (f22 * f23);
        float f26 = ((f24 * f18) - (f22 * f19)) / f25;
        float f27 = ((f21 * f19) - (f18 * f23)) / f25;
        return new C8667i((f26 * f12) + (f12 - f7), (f27 * f16) + (f16 - f7), f7, (f26 * f13) + (f13 - f11), (f27 * f17) + (f17 - f11), f11, f26, f27, 1.0f);
    }

    public final void c(float[] fArr) {
        int length = fArr.length - 1;
        for (int i11 = 0; i11 < length; i11 += 2) {
            float f7 = fArr[i11];
            int i12 = i11 + 1;
            float f11 = fArr[i12];
            float f12 = (this.f77827f * f11) + (this.f77824c * f7) + this.f77830i;
            fArr[i11] = (((this.f77825d * f11) + (this.f77822a * f7)) + this.f77828g) / f12;
            fArr[i12] = (((this.f77826e * f11) + (this.f77823b * f7)) + this.f77829h) / f12;
        }
    }
}
