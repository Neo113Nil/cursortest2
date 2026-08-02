package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bg3 implements edc, ec5 {
    public final Object a;
    public b10 b;
    public cc5 c;
    public final /* synthetic */ fg3 d;

    public bg3(fg3 fg3Var, Object obj) {
        this.d = fg3Var;
        this.b = fg3Var.g(null);
        this.c = new cc5(fg3Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.ec5
    public final void a(int i, scc sccVar, Exception exc) {
        if (l(i, sccVar)) {
            this.c.d(exc);
        }
    }

    @Override // defpackage.edc
    public final void b(int i, scc sccVar, m6c m6cVar) {
        if (l(i, sccVar)) {
            b10 b10Var = this.b;
            m6c m = m(m6cVar, sccVar);
            scc sccVar2 = (scc) b10Var.c;
            sccVar2.getClass();
            b10Var.h(new li3(9, b10Var, sccVar2, m));
        }
    }

    @Override // defpackage.ec5
    public final void c(int i, scc sccVar, int i2) {
        if (l(i, sccVar)) {
            this.c.c(i2);
        }
    }

    @Override // defpackage.edc
    public final void d(int i, scc sccVar, lfb lfbVar, m6c m6cVar, IOException iOException, boolean z) {
        if (l(i, sccVar)) {
            b10 b10Var = this.b;
            b10Var.h(new adc(b10Var, lfbVar, m(m6cVar, sccVar), iOException, z));
        }
    }

    @Override // defpackage.ec5
    public final void e(int i, scc sccVar) {
        if (l(i, sccVar)) {
            this.c.b();
        }
    }

    @Override // defpackage.edc
    public final void f(int i, scc sccVar, lfb lfbVar, m6c m6cVar, int i2) {
        if (l(i, sccVar)) {
            b10 b10Var = this.b;
            b10Var.h(new ycc(b10Var, lfbVar, m(m6cVar, sccVar), i2));
        }
    }

    @Override // defpackage.edc
    public final void g(int i, scc sccVar, m6c m6cVar) {
        if (l(i, sccVar)) {
            b10 b10Var = this.b;
            b10Var.h(new ow9(3, b10Var, m(m6cVar, sccVar)));
        }
    }

    @Override // defpackage.edc
    public final void h(int i, scc sccVar, lfb lfbVar, m6c m6cVar) {
        if (l(i, sccVar)) {
            b10 b10Var = this.b;
            b10Var.h(new zcc(b10Var, lfbVar, m(m6cVar, sccVar), 1));
        }
    }

    @Override // defpackage.edc
    public final void i(int i, scc sccVar, lfb lfbVar, m6c m6cVar) {
        if (l(i, sccVar)) {
            b10 b10Var = this.b;
            b10Var.h(new zcc(b10Var, lfbVar, m(m6cVar, sccVar), 0));
        }
    }

    @Override // defpackage.ec5
    public final void j(int i, scc sccVar) {
        if (l(i, sccVar)) {
            this.c.e();
        }
    }

    @Override // defpackage.ec5
    public final void k(int i, scc sccVar, eja ejaVar) {
        if (l(i, sccVar)) {
            this.c.a(ejaVar);
        }
    }

    public final boolean l(int i, scc sccVar) {
        scc sccVar2;
        Object obj = this.a;
        fg3 fg3Var = this.d;
        if (sccVar != null) {
            sccVar2 = fg3Var.s(obj, sccVar);
            if (sccVar2 == null) {
                return false;
            }
        } else {
            sccVar2 = null;
        }
        int u = fg3Var.u(obj, i);
        b10 b10Var = this.b;
        if (b10Var.b != u || !Objects.equals((scc) b10Var.c, sccVar2)) {
            this.b = new b10((CopyOnWriteArrayList) fg3Var.c.d, u, sccVar2);
        }
        cc5 cc5Var = this.c;
        if (cc5Var.a == u && Objects.equals(cc5Var.b, sccVar2)) {
            return true;
        }
        this.c = new cc5(fg3Var.d.c, u, sccVar2);
        return true;
    }

    public final m6c m(m6c m6cVar, scc sccVar) {
        long j = m6cVar.f;
        fg3 fg3Var = this.d;
        Object obj = this.a;
        long t = fg3Var.t(obj, j);
        long j2 = m6cVar.g;
        long t2 = fg3Var.t(obj, j2);
        return (t == j && t2 == j2) ? m6cVar : new m6c(m6cVar.a, m6cVar.b, m6cVar.c, m6cVar.d, m6cVar.e, t, t2);
    }
}
