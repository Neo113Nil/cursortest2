package b;

/* renamed from: b.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2319p extends w0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C2319p f24135f = new C2319p((byte) 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C2319p f24136g = new C2319p((byte) -1);

    /* renamed from: d, reason: collision with root package name */
    public final byte f24137d;

    public C2319p(byte b10) {
        this.f24137d = b10;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, 1);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        byte b10 = this.f24137d;
        q0Var.k(z10, 1);
        q0Var.c(1);
        q0Var.f24140a.write(b10);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        return (w0Var instanceof C2319p) && j() == ((C2319p) w0Var).j();
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.w0
    public final w0 h() {
        return j() ? f24136g : f24135f;
    }

    @Override // b.w0
    public final int hashCode() {
        return j() ? 1 : 0;
    }

    public final boolean j() {
        return this.f24137d != 0;
    }

    public final String toString() {
        return j() ? "TRUE" : "FALSE";
    }
}
