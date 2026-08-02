package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rcj extends wtc implements ug3, oma {
    public final dfj o;
    public i6k p;
    public pcj q;

    public rcj(dfj dfjVar) {
        this.o = dfjVar;
    }

    @Override // defpackage.xv4
    public final void S() {
        pcj pcjVar = this.q;
        if (pcjVar != null) {
            pcj.a(pcjVar, c6o.c0(this).z, null, null, 30);
        }
        y6a.E(this);
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void c1() {
        dfj C = g7a.C(this.o, c6o.c0(this).z);
        sf8 sf8Var = (sf8) tgj.x(this, dh3.k);
        k1(C, sf8Var);
        ema emaVar = c6o.c0(this).z;
        kx4 kx4Var = c6o.c0(this).y;
        i6k i6kVar = this.p;
        if (i6kVar == null) {
            throw wv8.d("Font resolution state is not set.");
        }
        this.q = new pcj(emaVar, kx4Var, sf8Var, C, i6kVar.getValue());
    }

    @Override // defpackage.wtc
    public final void d1() {
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long a;
        pcj pcjVar = this.q;
        if (pcjVar == null) {
            throw wv8.d("Min size state is not set.");
        }
        e1d e1dVar = (e1d) pcjVar.g;
        i6k i6kVar = this.p;
        if (i6kVar == null) {
            throw wv8.d("Font resolution state is not set.");
        }
        Object value = i6kVar.getValue();
        if (!Intrinsics.c(value, pcjVar.f)) {
            pcjVar.f = value;
            ((eoh) e1dVar).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
            a = faj.a((dfj) pcjVar.e, (kx4) pcjVar.c, (sf8) pcjVar.d, faj.a, 1);
            pcjVar.a = a;
            ((eoh) e1dVar).setValue(Boolean.FALSE);
        }
        long j2 = pcjVar.a;
        qhe J = g1cVar.J(cn3.e(j, cn3.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 18));
    }

    public final void k1(dfj dfjVar, sf8 sf8Var) {
        pwh pwhVar = dfjVar.a;
        tf8 tf8Var = pwhVar.f;
        wg8 wg8Var = pwhVar.c;
        if (wg8Var == null) {
            wg8Var = wg8.g;
        }
        rg8 rg8Var = pwhVar.d;
        int i = rg8Var != null ? rg8Var.a : 0;
        sg8 sg8Var = pwhVar.e;
        this.p = ((vf8) sf8Var).c(tf8Var, wg8Var, i, sg8Var != null ? sg8Var.a : 65535);
        y6a.E(this);
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        pcj pcjVar = this.q;
        if (pcjVar != null) {
            pcj.a(pcjVar, null, c6o.c0(this).y, null, 29);
        }
        y6a.E(this);
    }
}
