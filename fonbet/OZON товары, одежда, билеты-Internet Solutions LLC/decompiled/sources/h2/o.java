package h2;

/* loaded from: classes8.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private float f64698a;

    /* renamed from: b, reason: collision with root package name */
    private float f64699b;

    /* renamed from: c, reason: collision with root package name */
    private float f64700c;

    /* renamed from: d, reason: collision with root package name */
    private float f64701d;

    /* renamed from: e, reason: collision with root package name */
    private float f64702e;

    /* renamed from: f, reason: collision with root package name */
    private float f64703f;

    /* renamed from: g, reason: collision with root package name */
    private float f64704g;

    /* renamed from: h, reason: collision with root package name */
    private float f64705h;

    /* renamed from: i, reason: collision with root package name */
    private float f64706i;

    /* renamed from: j, reason: collision with root package name */
    private int f64707j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f64708k = false;

    /* renamed from: l, reason: collision with root package name */
    private float f64709l;

    /* renamed from: m, reason: collision with root package name */
    private float f64710m;

    /* renamed from: n, reason: collision with root package name */
    private float f64711n;

    private void e(float f7, float f11, float f12, float f13, float f14) {
        this.f64706i = f11;
        if (f7 == 0.0f) {
            f7 = 1.0E-4f;
        }
        float f15 = f7 / f12;
        float f16 = (f15 * f7) / 2.0f;
        if (f7 < 0.0f) {
            float sqrt = (float) Math.sqrt((f11 - ((((-f7) / f12) * f7) / 2.0f)) * f12);
            if (sqrt < f13) {
                this.f64707j = 2;
                this.f64698a = f7;
                this.f64699b = sqrt;
                this.f64700c = 0.0f;
                float f17 = (sqrt - f7) / f12;
                this.f64701d = f17;
                this.f64702e = sqrt / f12;
                this.f64704g = ((f7 + sqrt) * f17) / 2.0f;
                this.f64705h = f11;
                this.f64706i = f11;
                return;
            }
            this.f64707j = 3;
            this.f64698a = f7;
            this.f64699b = f13;
            this.f64700c = f13;
            float f18 = (f13 - f7) / f12;
            this.f64701d = f18;
            float f19 = f13 / f12;
            this.f64703f = f19;
            float f21 = ((f7 + f13) * f18) / 2.0f;
            float f22 = (f19 * f13) / 2.0f;
            this.f64702e = ((f11 - f21) - f22) / f13;
            this.f64704g = f21;
            this.f64705h = f11 - f22;
            this.f64706i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f64707j = 1;
            this.f64698a = f7;
            this.f64699b = 0.0f;
            this.f64704g = f11;
            this.f64701d = (2.0f * f11) / f7;
            return;
        }
        float f23 = f11 - f16;
        float f24 = f23 / f7;
        if (f24 + f15 < f14) {
            this.f64707j = 2;
            this.f64698a = f7;
            this.f64699b = f7;
            this.f64700c = 0.0f;
            this.f64704g = f23;
            this.f64705h = f11;
            this.f64701d = f24;
            this.f64702e = f15;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f7 * f7) / 2.0f) + (f12 * f11));
        float f25 = (sqrt2 - f7) / f12;
        this.f64701d = f25;
        float f26 = sqrt2 / f12;
        this.f64702e = f26;
        if (sqrt2 < f13) {
            this.f64707j = 2;
            this.f64698a = f7;
            this.f64699b = sqrt2;
            this.f64700c = 0.0f;
            this.f64701d = f25;
            this.f64702e = f26;
            this.f64704g = ((f7 + sqrt2) * f25) / 2.0f;
            this.f64705h = f11;
            return;
        }
        this.f64707j = 3;
        this.f64698a = f7;
        this.f64699b = f13;
        this.f64700c = f13;
        float f27 = (f13 - f7) / f12;
        this.f64701d = f27;
        float f28 = f13 / f12;
        this.f64703f = f28;
        float f29 = ((f7 + f13) * f27) / 2.0f;
        float f31 = (f28 * f13) / 2.0f;
        this.f64702e = ((f11 - f29) - f31) / f13;
        this.f64704g = f29;
        this.f64705h = f11 - f31;
        this.f64706i = f11;
    }

    @Override // h2.n
    public final float a() {
        return this.f64708k ? -d(this.f64711n) : d(this.f64711n);
    }

    @Override // h2.n
    public final boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f64706i - this.f64710m) < 1.0E-5f;
    }

    public final void c(float f7, float f11, float f12, float f13, float f14, float f15) {
        this.f64709l = f7;
        boolean z11 = f7 > f11;
        this.f64708k = z11;
        if (z11) {
            e(-f12, f7 - f11, f14, f15, f13);
        } else {
            e(f12, f11 - f7, f14, f15, f13);
        }
    }

    public final float d(float f7) {
        float f11;
        float f12;
        float f13 = this.f64701d;
        if (f7 <= f13) {
            f11 = this.f64698a;
            f12 = this.f64699b;
        } else {
            int i11 = this.f64707j;
            if (i11 == 1) {
                return 0.0f;
            }
            f7 -= f13;
            f13 = this.f64702e;
            if (f7 >= f13) {
                if (i11 == 2) {
                    return 0.0f;
                }
                float f14 = f7 - f13;
                float f15 = this.f64703f;
                if (f14 >= f15) {
                    return 0.0f;
                }
                float f16 = this.f64700c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f64699b;
            f12 = this.f64700c;
        }
        return (((f12 - f11) * f7) / f13) + f11;
    }

    @Override // h2.n
    public final float getInterpolation(float f7) {
        float f11;
        float f12 = this.f64701d;
        if (f7 <= f12) {
            float f13 = this.f64698a;
            f11 = ((((this.f64699b - f13) * f7) * f7) / (f12 * 2.0f)) + (f13 * f7);
        } else {
            int i11 = this.f64707j;
            if (i11 == 1) {
                f11 = this.f64704g;
            } else {
                float f14 = f7 - f12;
                float f15 = this.f64702e;
                if (f14 < f15) {
                    float f16 = this.f64704g;
                    float f17 = this.f64699b;
                    f11 = ((((this.f64700c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i11 == 2) {
                    f11 = this.f64705h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f64703f;
                    if (f18 <= f19) {
                        float f21 = this.f64705h;
                        float f22 = this.f64700c * f18;
                        f11 = (f21 + f22) - ((f22 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f64706i;
                    }
                }
            }
        }
        this.f64710m = f11;
        this.f64711n = f7;
        return this.f64708k ? this.f64709l - f11 : this.f64709l + f11;
    }
}
