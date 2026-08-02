package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class odc implements edc, ec5 {
    public final sdc a;
    public final /* synthetic */ tdc b;

    public odc(tdc tdcVar, sdc sdcVar) {
        this.b = tdcVar;
        this.a = sdcVar;
    }

    @Override // defpackage.ec5
    public final void a(int i, scc sccVar, Exception exc) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new kdc(1, this, l, exc));
        }
    }

    @Override // defpackage.edc
    public final void b(int i, scc sccVar, m6c m6cVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new jdc(this, l, m6cVar, 0));
        }
    }

    @Override // defpackage.ec5
    public final void c(int i, scc sccVar, int i2) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new uu1(this, l, i2, 9));
        }
    }

    @Override // defpackage.edc
    public final void d(int i, scc sccVar, lfb lfbVar, m6c m6cVar, IOException iOException, boolean z) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new xcc(this, l, lfbVar, m6cVar, iOException, z, 1));
        }
    }

    @Override // defpackage.ec5
    public final void e(int i, scc sccVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new mdc(this, l, 1));
        }
    }

    @Override // defpackage.edc
    public final void f(int i, scc sccVar, final lfb lfbVar, final m6c m6cVar, final int i2) {
        final Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new Runnable() { // from class: ndc
                @Override // java.lang.Runnable
                public final void run() {
                    cn4 cn4Var = (cn4) odc.this.b.j;
                    Pair pair = l;
                    cn4Var.f(((Integer) pair.first).intValue(), (scc) pair.second, lfbVar, m6cVar, i2);
                }
            });
        }
    }

    @Override // defpackage.edc
    public final void g(int i, scc sccVar, m6c m6cVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new jdc(this, l, m6cVar, 1));
        }
    }

    @Override // defpackage.edc
    public final void h(int i, scc sccVar, lfb lfbVar, m6c m6cVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new ldc(this, l, lfbVar, m6cVar, 0));
        }
    }

    @Override // defpackage.edc
    public final void i(int i, scc sccVar, lfb lfbVar, m6c m6cVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new ldc(this, l, lfbVar, m6cVar, 1));
        }
    }

    @Override // defpackage.ec5
    public final void j(int i, scc sccVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new mdc(this, l, 0));
        }
    }

    @Override // defpackage.ec5
    public final void k(int i, scc sccVar, eja ejaVar) {
        Pair l = l(i, sccVar);
        if (l != null) {
            ((zqi) this.b.k).e(new kdc(0, this, l, ejaVar));
        }
    }

    public final Pair l(int i, scc sccVar) {
        scc sccVar2;
        sdc sdcVar = this.a;
        scc sccVar3 = null;
        if (sccVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= sdcVar.c.size()) {
                    sccVar2 = null;
                    break;
                }
                if (((scc) sdcVar.c.get(i2)).d == sccVar.d) {
                    Object obj = sccVar.a;
                    Object obj2 = sdcVar.b;
                    int i3 = sye.k;
                    sccVar2 = sccVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (sccVar2 == null) {
                return null;
            }
            sccVar3 = sccVar2;
        }
        return Pair.create(Integer.valueOf(i + sdcVar.d), sccVar3);
    }
}
