package y0;

import S0.C0;
import S0.C3956f1;
import S0.C3985t0;
import S0.C3987u0;
import org.jetbrains.annotations.NotNull;
import x0.C10577F;
import x0.C10621z;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f105707a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3987u0 f105708b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3985t0 f105709c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f105710d;

    /* renamed from: e, reason: collision with root package name */
    private Object f105711e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10577F f105712f;

    public Q(int i11, float f7, @NotNull b0 b0Var) {
        this.f105707a = b0Var;
        this.f105708b = C3956f1.a(i11);
        this.f105709c = C0.a(f7);
        this.f105712f = new C10577F(i11, 30, 100);
    }

    public final void a(int i11) {
        float E11 = this.f105707a.E() == 0 ? 0.0f : i11 / r0.E();
        C3985t0 c3985t0 = this.f105709c;
        c3985t0.h(c3985t0.getFloatValue() + E11);
    }

    public final int b() {
        return this.f105708b.getIntValue();
    }

    public final float c() {
        return this.f105709c.getFloatValue();
    }

    @NotNull
    public final C10577F d() {
        return this.f105712f;
    }

    public final int e(@NotNull F f7, int i11) {
        int a11 = C10621z.a(i11, this.f105711e, f7);
        if (i11 != a11) {
            this.f105708b.d(a11);
            this.f105712f.b(i11);
        }
        return a11;
    }

    public final void f(float f7, int i11) {
        this.f105708b.d(i11);
        this.f105712f.b(i11);
        this.f105709c.h(f7);
        this.f105711e = null;
    }

    public final void g(float f7) {
        this.f105709c.h(f7);
    }

    public final void h(@NotNull N n11) {
        C10806m k11 = n11.k();
        this.f105711e = k11 != null ? k11.c() : null;
        if (this.f105710d || !n11.f().isEmpty()) {
            this.f105710d = true;
            C10806m k12 = n11.k();
            int index = k12 != null ? k12.getIndex() : 0;
            float l11 = n11.l();
            this.f105708b.d(index);
            this.f105712f.b(index);
            this.f105709c.h(l11);
        }
    }
}
