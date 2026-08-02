package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qbj implements b9j {
    public final /* synthetic */ tbj a;
    public final /* synthetic */ boolean b;

    public qbj(tbj tbjVar, boolean z) {
        this.a = tbjVar;
        this.b = z;
    }

    @Override // defpackage.b9j
    public final void b() {
        bej d;
        boolean z = this.b;
        k69 k69Var = z ? k69.b : k69.c;
        tbj tbjVar = this.a;
        tbjVar.q(k69Var);
        long a = f3h.a(tbjVar.j(z));
        q5b q5bVar = tbjVar.d;
        if (q5bVar == null || (d = q5bVar.d()) == null) {
            return;
        }
        long e = d.e(a);
        tbjVar.n = e;
        tbjVar.p(new dnd(e));
        tbjVar.p = 0L;
        tbjVar.s = -1;
        q5b q5bVar2 = tbjVar.d;
        if (q5bVar2 != null) {
            ((eoh) q5bVar2.q).setValue(Boolean.TRUE);
        }
        tbjVar.u(false);
    }

    @Override // defpackage.b9j
    public final void c() {
        tbj tbjVar = this.a;
        tbjVar.q(null);
        tbjVar.p(null);
        tbjVar.u(true);
    }

    @Override // defpackage.b9j
    public final void d(long j) {
        tbj tbjVar = this.a;
        long i = dnd.i(tbjVar.p, j);
        tbjVar.p = i;
        tbjVar.p(new dnd(dnd.i(tbjVar.n, i)));
        wcj l = tbjVar.l();
        dnd g = tbjVar.g();
        g.getClass();
        tbjVar.v(l, g.a, false, this.b, k03.j, true, new a79(9));
        tbjVar.u(false);
    }

    @Override // defpackage.b9j
    public final void onStop() {
        tbj tbjVar = this.a;
        tbjVar.q(null);
        tbjVar.p(null);
        tbjVar.u(true);
    }

    @Override // defpackage.b9j
    public final void onCancel() {
    }

    @Override // defpackage.b9j
    public final void a(long j, ilg ilgVar) {
    }
}
