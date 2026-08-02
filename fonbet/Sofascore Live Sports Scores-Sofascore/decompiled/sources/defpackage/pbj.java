package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pbj implements b9j {
    public final /* synthetic */ tbj a;

    public pbj(tbj tbjVar) {
        this.a = tbjVar;
    }

    @Override // defpackage.b9j
    public final void a(long j, ilg ilgVar) {
        bej d;
        tbj tbjVar = this.a;
        long a = f3h.a(tbjVar.j(true));
        q5b q5bVar = tbjVar.d;
        if (q5bVar == null || (d = q5bVar.d()) == null) {
            return;
        }
        long e = d.e(a);
        tbjVar.n = e;
        tbjVar.p(new dnd(e));
        tbjVar.p = 0L;
        tbjVar.q(k69.a);
        tbjVar.u(false);
    }

    @Override // defpackage.b9j
    public final void c() {
        tbj tbjVar = this.a;
        tbjVar.q(null);
        tbjVar.p(null);
    }

    @Override // defpackage.b9j
    public final void d(long j) {
        bej d;
        z69 z69Var;
        tbj tbjVar = this.a;
        tbjVar.p = dnd.i(tbjVar.p, j);
        q5b q5bVar = tbjVar.d;
        if (q5bVar == null || (d = q5bVar.d()) == null) {
            return;
        }
        tbjVar.p(new dnd(dnd.i(tbjVar.n, tbjVar.p)));
        nnd nndVar = tbjVar.b;
        dnd g = tbjVar.g();
        g.getClass();
        int i = nndVar.i(d.b(g.a, true));
        long g2 = t6a.g(i, i);
        if (pej.c(g2, tbjVar.l().b)) {
            return;
        }
        q5b q5bVar2 = tbjVar.d;
        if ((q5bVar2 == null || ((Boolean) ((eoh) q5bVar2.q).getValue()).booleanValue()) && (z69Var = tbjVar.j) != null) {
            ((kie) z69Var).a(9);
        }
        tbjVar.c.invoke(tbj.b(tbjVar.l().a, g2));
        tbjVar.v = new pej(g2);
    }

    @Override // defpackage.b9j
    public final void onStop() {
        tbj tbjVar = this.a;
        tbjVar.q(null);
        tbjVar.p(null);
    }

    @Override // defpackage.b9j
    public final void b() {
    }

    @Override // defpackage.b9j
    public final void onCancel() {
    }
}
