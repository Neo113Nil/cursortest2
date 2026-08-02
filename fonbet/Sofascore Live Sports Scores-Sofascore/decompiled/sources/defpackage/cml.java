package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cml extends fg3 {
    public final vcc k;

    public cml(vcc vccVar) {
        this.k = vccVar;
    }

    public void A() {
        z();
    }

    @Override // defpackage.vcc
    public final h6c a() {
        return this.k.a();
    }

    @Override // defpackage.vcc
    public void b(h6c h6cVar) {
        this.k.b(h6cVar);
    }

    @Override // defpackage.vcc
    public final boolean d() {
        return this.k.d();
    }

    @Override // defpackage.vcc
    public final mij e() {
        return this.k.e();
    }

    @Override // defpackage.b51
    public final void m(tn4 tn4Var) {
        this.j = tn4Var;
        this.i = nik.q(null);
        A();
    }

    @Override // defpackage.fg3
    public final scc s(Object obj, scc sccVar) {
        return x(sccVar);
    }

    @Override // defpackage.fg3
    public final long t(Object obj, long j) {
        return j;
    }

    @Override // defpackage.fg3
    public final int u(Object obj, int i) {
        return i;
    }

    @Override // defpackage.fg3
    public final void v(Object obj, b51 b51Var, mij mijVar) {
        y(mijVar);
    }

    public abstract void y(mij mijVar);

    public final void z() {
        w(null, this.k);
    }

    public scc x(scc sccVar) {
        return sccVar;
    }
}
