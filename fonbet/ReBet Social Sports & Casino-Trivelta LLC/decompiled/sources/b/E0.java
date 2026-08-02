package b;

/* loaded from: classes.dex */
public final class E0 extends C2303c0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24061d;

    public E0(int i10, int i11, boolean z10, C2306e c2306e) {
        super(i10, i11, c2306e);
        this.f24061d = z10;
    }

    @Override // b.C2303c0, b.InterfaceC2310g
    public final w0 b() {
        C2306e c2306e = this.f24095c;
        int i10 = this.f24093a;
        int i11 = this.f24094b;
        if (!this.f24061d) {
            return new B0(4, i10, i11, new C2317n(((C2302c) c2306e.f24098a).k()));
        }
        C2326w b10 = c2306e.b();
        int i12 = b10.f24150b;
        if (i12 == 1) {
            return new B0(3, i10, i11, b10.a(0));
        }
        p0 p0Var = j0.f24123a;
        return new B0(4, i10, i11, i12 < 1 ? j0.f24123a : new p0(b10));
    }
}
