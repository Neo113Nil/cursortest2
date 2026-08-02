package b;

/* loaded from: classes.dex */
public final class g0 extends AbstractC2278F {
    public g0(p0 p0Var) {
        super(p0Var);
    }

    @Override // b.AbstractC2278F
    public final F0 n() {
        C2326w c2326w = new C2326w(4);
        C2307e0 c2307e0 = this.f24062d;
        if (c2307e0 != null) {
            c2326w.b(c2307e0);
        }
        C2290S c2290s = this.f24063f;
        if (c2290s != null) {
            c2326w.b(c2290s);
        }
        w0 w0Var = this.f24064g;
        if (w0Var != null) {
            c2326w.b(w0Var.i());
        }
        int i10 = this.f24065h;
        c2326w.b(new B0(i10 == 0, i10, this.f24066i));
        return new p0(c2326w);
    }

    @Override // b.w0
    public final w0 i() {
        return this;
    }
}
