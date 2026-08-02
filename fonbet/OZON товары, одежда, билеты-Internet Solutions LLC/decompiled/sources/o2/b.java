package o2;

import h2.l;
import h2.n;
import h2.o;

/* loaded from: classes8.dex */
public final class b extends p2.d {

    /* renamed from: a, reason: collision with root package name */
    private o f77613a;

    /* renamed from: b, reason: collision with root package name */
    private l f77614b;

    /* renamed from: c, reason: collision with root package name */
    private n f77615c;

    public b() {
        o oVar = new o();
        this.f77613a = oVar;
        this.f77615c = oVar;
    }

    @Override // p2.d
    public final float a() {
        return this.f77615c.a();
    }

    public final void b(float f7, float f11, float f12, float f13, float f14, float f15) {
        o oVar = this.f77613a;
        this.f77615c = oVar;
        oVar.c(f7, f11, f12, f13, f14, f15);
    }

    public final boolean c() {
        return this.f77615c.b();
    }

    public final void d(float f7, float f11, float f12, float f13, float f14, float f15, int i11) {
        if (this.f77614b == null) {
            this.f77614b = new l();
        }
        l lVar = this.f77614b;
        this.f77615c = lVar;
        lVar.c(f7, f11, f12, f13, f14, f15, i11);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        return this.f77615c.getInterpolation(f7);
    }
}
