package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rbj implements b9j {
    public pej b;
    public final /* synthetic */ tbj d;
    public boolean a = true;
    public ilg c = k03.f;

    public rbj(tbj tbjVar) {
        this.d = tbjVar;
    }

    @Override // defpackage.b9j
    public final void a(long j, ilg ilgVar) {
        long j2;
        bej d;
        bej d2;
        tbj tbjVar = this.d;
        if (tbjVar.i() && ((k69) ((eoh) tbjVar.q).getValue()) == null) {
            tbjVar.q(k69.c);
            tbjVar.s = -1;
            this.a = true;
            this.c = ilgVar;
            tbjVar.m();
            q5b q5bVar = tbjVar.d;
            if (q5bVar == null || (d2 = q5bVar.d()) == null || !d2.c(j)) {
                j2 = j;
                q5b q5bVar2 = tbjVar.d;
                if (q5bVar2 != null && (d = q5bVar2.d()) != null) {
                    int i = tbjVar.b.i(d.b(j2, true));
                    wcj b = tbj.b(tbjVar.l().a, t6a.g(i, i));
                    tbjVar.e(false);
                    z69 z69Var = tbjVar.j;
                    if (z69Var != null) {
                        ((kie) z69Var).a(0);
                    }
                    tbjVar.c.invoke(b);
                    tbjVar.v = new pej(b.b);
                }
                this.a = false;
            } else {
                if (tbjVar.l().a.b.length() == 0) {
                    return;
                }
                tbjVar.e(false);
                long v = tbjVar.v(wcj.a(tbjVar.l(), null, pej.b, 5), j, true, false, this.c, true, new a79(0));
                j2 = j;
                tbjVar.o = new pej(v);
                this.b = new pej(v);
            }
            tbjVar.r(p69.a);
            tbjVar.n = j2;
            tbjVar.p(new dnd(j2));
            tbjVar.p = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // defpackage.b9j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
        bej d;
        long v;
        tbj tbjVar = this.d;
        if (!tbjVar.i() || tbjVar.l().a.b.length() == 0) {
            return;
        }
        tbjVar.p = dnd.i(tbjVar.p, j);
        q5b q5bVar = tbjVar.d;
        if (q5bVar != null && (d = q5bVar.d()) != null) {
            tbjVar.p(new dnd(dnd.i(tbjVar.n, tbjVar.p)));
            if (tbjVar.o == null) {
                dnd g = tbjVar.g();
                g.getClass();
                if (!d.c(g.a)) {
                    int i = tbjVar.b.i(d.b(tbjVar.n, true));
                    nnd nndVar = tbjVar.b;
                    dnd g2 = tbjVar.g();
                    g2.getClass();
                    ilg ilgVar = i == nndVar.i(d.b(g2.a, true)) ? k03.f : k03.h;
                    wcj l = tbjVar.l();
                    dnd g3 = tbjVar.g();
                    g3.getClass();
                    v = tbjVar.v(l, g3.a, false, false, ilgVar, true, new a79(9));
                    this.b = new pej(v);
                    if (!pej.b(tbjVar.o, v)) {
                        this.a = false;
                    }
                }
            }
            pej pejVar = tbjVar.o;
            int b = pejVar != null ? (int) (pejVar.a >> 32) : d.b(tbjVar.n, false);
            dnd g4 = tbjVar.g();
            g4.getClass();
            int b2 = d.b(g4.a, false);
            if (tbjVar.o == null && b == b2) {
                return;
            }
            wcj l2 = tbjVar.l();
            dnd g5 = tbjVar.g();
            g5.getClass();
            v = tbjVar.v(l2, g5.a, false, false, this.c, true, new a79(9));
            this.b = new pej(v);
            if (!pej.b(tbjVar.o, v)) {
            }
        }
        tbjVar.u(false);
    }

    public final void e() {
        tbj tbjVar = this.d;
        tbjVar.q(null);
        tbjVar.p(null);
        this.c = k03.f;
        tbjVar.u(true);
        pej pejVar = this.b;
        boolean d = pej.d(pejVar != null ? pejVar.a : tbjVar.l().b);
        tbjVar.r(d ? p69.c : p69.b);
        q5b q5bVar = tbjVar.d;
        if (q5bVar != null) {
            ((eoh) q5bVar.m).setValue(Boolean.valueOf(!d && u0a.E(tbjVar, true)));
        }
        q5b q5bVar2 = tbjVar.d;
        if (q5bVar2 != null) {
            ((eoh) q5bVar2.n).setValue(Boolean.valueOf(!d && u0a.E(tbjVar, false)));
        }
        q5b q5bVar3 = tbjVar.d;
        if (q5bVar3 != null) {
            ((eoh) q5bVar3.o).setValue(Boolean.valueOf(d && u0a.E(tbjVar, true)));
        }
        if (this.a) {
            tbjVar.n(tbjVar.o);
        }
        tbjVar.o = null;
    }

    @Override // defpackage.b9j
    public final void onCancel() {
        e();
    }

    @Override // defpackage.b9j
    public final void onStop() {
        e();
    }

    @Override // defpackage.b9j
    public final void b() {
    }

    @Override // defpackage.b9j
    public final void c() {
    }
}
