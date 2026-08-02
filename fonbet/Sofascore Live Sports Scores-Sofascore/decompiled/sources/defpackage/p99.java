package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p99 extends wtc implements ug3, oma, tkd {
    public dfj o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public dfj u;
    public i6k v;

    @Override // defpackage.xv4
    public final void S() {
        this.u = g7a.C(this.o, c6o.c0(this).z);
        this.r = true;
        y6a.E(this);
    }

    @Override // defpackage.tkd
    public final void Z() {
        if (this.v != null) {
            z1a.R(this, new o99(this, 1));
        }
        this.r = true;
        y6a.E(this);
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void c1() {
        sf8 sf8Var = (sf8) tgj.x(this, dh3.k);
        this.u = g7a.C(this.o, c6o.c0(this).z);
        tf8 tf8Var = k1().a.f;
        wg8 wg8Var = k1().a.c;
        if (wg8Var == null) {
            wg8Var = wg8.g;
        }
        rg8 rg8Var = k1().a.d;
        int i = rg8Var != null ? rg8Var.a : 0;
        sg8 sg8Var = k1().a.e;
        this.v = ((vf8) sf8Var).c(tf8Var, wg8Var, i, sg8Var != null ? sg8Var.a : 65535);
        z1a.R(this, new o99(this, 0));
        this.r = true;
    }

    @Override // defpackage.wtc
    public final void d1() {
        this.u = null;
        this.v = null;
        this.r = false;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        if (this.r) {
            dfj k1 = k1();
            sf8 sf8Var = (sf8) tgj.x(this, dh3.k);
            String str = faj.a;
            int a = (int) (faj.a(k1, m1cVar, sf8Var, str, 1) & 4294967295L);
            int a2 = ((int) (faj.a(k1, m1cVar, sf8Var, str + '\n' + str, 2) & 4294967295L)) - a;
            int i = this.p;
            this.s = i == 1 ? -1 : ((i - 1) * a2) + a;
            int i2 = this.q;
            this.t = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * a2) + a;
            this.r = false;
        }
        int i3 = this.s;
        int c = i3 != -1 ? llf.c(i3, an3.i(j), an3.g(j)) : an3.i(j);
        int i4 = this.t;
        qhe J = g1cVar.J(an3.a(j, 0, 0, c, i4 != -1 ? llf.c(i4, an3.i(j), an3.g(j)) : an3.g(j), 3));
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 8));
    }

    public final dfj k1() {
        dfj dfjVar = this.u;
        if (dfjVar != null) {
            return dfjVar;
        }
        throw wv8.d("Resolved style is not set.");
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        this.r = true;
        y6a.E(this);
    }
}
