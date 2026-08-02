package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uy2 extends cml {
    public final long l;
    public final boolean m;
    public final ArrayList n;
    public final kij o;
    public qy2 p;
    public sy2 q;
    public long r;
    public long s;

    public uy2(oy2 oy2Var) {
        super(oy2Var.a);
        this.l = oy2Var.b;
        this.m = oy2Var.c;
        this.n = new ArrayList();
        this.o = new kij();
    }

    public final void B(mij mijVar) {
        long j;
        kij kijVar = this.o;
        mijVar.n(0, kijVar);
        long j2 = kijVar.o;
        qy2 qy2Var = this.p;
        long j3 = this.l;
        ArrayList arrayList = this.n;
        if (qy2Var == null || arrayList.isEmpty()) {
            this.r = j2;
            this.s = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ny2 ny2Var = (ny2) arrayList.get(i);
                long j4 = this.r;
                long j5 = this.s;
                ny2Var.f = j4;
                ny2Var.g = j5;
            }
            j = 0;
        } else {
            j = this.r - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.s - j2;
        }
        try {
            qy2 qy2Var2 = new qy2(mijVar, j, j3);
            this.p = qy2Var2;
            n(qy2Var2);
        } catch (sy2 e) {
            this.q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ny2) arrayList.get(i2)).h = this.q;
            }
        }
    }

    @Override // defpackage.vcc
    public final w6c c(scc sccVar, l2a l2aVar, long j) {
        ny2 ny2Var = new ny2(this.k.c(sccVar, l2aVar, j), this.m, this.r, this.s, 0);
        this.n.add(ny2Var);
        return ny2Var;
    }

    @Override // defpackage.vcc
    public final void f(w6c w6cVar) {
        ArrayList arrayList = this.n;
        z1a.E(arrayList.remove(w6cVar));
        this.k.f(((ny2) w6cVar).a);
        if (arrayList.isEmpty()) {
            qy2 qy2Var = this.p;
            qy2Var.getClass();
            B(qy2Var.b);
        }
    }

    @Override // defpackage.fg3, defpackage.vcc
    public final void maybeThrowSourceInfoRefreshError() {
        sy2 sy2Var = this.q;
        if (sy2Var != null) {
            throw sy2Var;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // defpackage.fg3, defpackage.b51
    public final void p() {
        super.p();
        this.q = null;
        this.p = null;
    }

    @Override // defpackage.cml
    public final void y(mij mijVar) {
        if (this.q != null) {
            return;
        }
        B(mijVar);
    }
}
