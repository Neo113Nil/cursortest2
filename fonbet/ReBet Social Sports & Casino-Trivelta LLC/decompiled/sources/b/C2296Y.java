package b;

import b3.AbstractC2382a;

/* renamed from: b.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296Y extends w0 {

    /* renamed from: d, reason: collision with root package name */
    public final D0 f24084d;

    public C2296Y(D0 d02) {
        this.f24084d = d02;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return this.f24084d.a(z10);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 7);
        q0Var.f(false, 25, this.f24084d.f24059a);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof C2296Y) {
            return this.f24084d.c(((C2296Y) w0Var).f24084d);
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final w0 h() {
        D0 d02 = this.f24084d;
        d02.getClass();
        return d02 == this.f24084d ? this : new C2296Y(d02);
    }

    @Override // b.w0
    public final int hashCode() {
        return ~AbstractC2382a.c(this.f24084d.f24059a);
    }

    @Override // b.w0
    public final w0 i() {
        D0 d02 = this.f24084d;
        d02.getClass();
        return d02 == this.f24084d ? this : new C2296Y(d02);
    }
}
