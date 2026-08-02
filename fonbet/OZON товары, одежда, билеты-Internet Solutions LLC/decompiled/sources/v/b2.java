package v;

import E0.C2942q;

/* loaded from: classes8.dex */
final class b2 implements C.v0 {

    /* renamed from: a, reason: collision with root package name */
    private float f101209a;

    /* renamed from: b, reason: collision with root package name */
    private final float f101210b;

    /* renamed from: c, reason: collision with root package name */
    private final float f101211c;

    /* renamed from: d, reason: collision with root package name */
    private float f101212d;

    b2(float f7, float f11) {
        this.f101210b = f7;
        this.f101211c = f11;
    }

    @Override // C.v0
    public final float a() {
        return this.f101210b;
    }

    @Override // C.v0
    public final float b() {
        return this.f101212d;
    }

    @Override // C.v0
    public final float c() {
        return this.f101211c;
    }

    @Override // C.v0
    public final float d() {
        return this.f101209a;
    }

    final void e(float f7) throws IllegalArgumentException {
        if (f7 > 1.0f || f7 < 0.0f) {
            throw new IllegalArgumentException(C2942q.b(f7, "Requested linearZoom ", " is not within valid range [0..1]"));
        }
        this.f101212d = f7;
        float f11 = this.f101210b;
        if (f7 != 1.0f) {
            float f12 = this.f101211c;
            if (f7 == 0.0f) {
                f11 = f12;
            } else {
                double d11 = 1.0f / f12;
                double d12 = 1.0d / ((((1.0f / f11) - d11) * f7) + d11);
                double d13 = f12;
                double d14 = f11;
                if (d12 < d13) {
                    d12 = d13;
                } else if (d12 > d14) {
                    d12 = d14;
                }
                f11 = (float) d12;
            }
        }
        this.f101209a = f11;
    }

    final void f(float f7) throws IllegalArgumentException {
        float f11 = this.f101210b;
        float f12 = this.f101211c;
        if (f7 > f11 || f7 < f12) {
            StringBuilder sb2 = new StringBuilder("Requested zoomRatio ");
            sb2.append(f7);
            sb2.append(" is not within valid range [");
            sb2.append(f12);
            sb2.append(" , ");
            throw new IllegalArgumentException(B4.V.b(f11, "]", sb2));
        }
        this.f101209a = f7;
        float f13 = 0.0f;
        if (f11 != f12) {
            if (f7 == f11) {
                f13 = 1.0f;
            } else if (f7 != f12) {
                float f14 = 1.0f / f12;
                f13 = ((1.0f / f7) - f14) / ((1.0f / f11) - f14);
            }
        }
        this.f101212d = f13;
    }
}
