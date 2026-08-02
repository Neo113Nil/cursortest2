package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g85 extends wtc implements jyj, h85, ula {
    public final Function1 o;
    public g85 p;
    public h85 q;
    public long r;

    public g85(i20 i20Var, int i) {
        this.o = (i & 2) != 0 ? null : i20Var;
        this.r = 0L;
    }

    @Override // defpackage.h85
    public final void G(a85 a85Var) {
        oo ooVar = new oo(a85Var, 17);
        if (ooVar.invoke(this) != iyj.a) {
            return;
        }
        jca.a0(this, ooVar);
    }

    @Override // defpackage.h85
    public final void I0(a85 a85Var) {
        h85 h85Var = this.q;
        if (h85Var != null) {
            h85Var.I0(a85Var);
        }
        g85 g85Var = this.p;
        if (g85Var != null) {
            g85Var.I0(a85Var);
        }
        this.p = null;
    }

    @Override // defpackage.h85
    public final void N0(a85 a85Var) {
        jyj jyjVar;
        g85 g85Var;
        g85 g85Var2 = this.p;
        if (g85Var2 == null || !s9a.q(g85Var2, gvd.A(a85Var))) {
            if (this.a.n) {
                fsf fsfVar = new fsf();
                jca.a0(this, new x40(3, fsfVar, this, a85Var));
                jyjVar = (jyj) fsfVar.a;
            } else {
                jyjVar = null;
            }
            g85Var = (g85) jyjVar;
        } else {
            g85Var = g85Var2;
        }
        if (g85Var != null && g85Var2 == null) {
            g85Var.w(a85Var);
            g85Var.N0(a85Var);
            h85 h85Var = this.q;
            if (h85Var != null) {
                h85Var.I0(a85Var);
            }
        } else if (g85Var == null && g85Var2 != null) {
            h85 h85Var2 = this.q;
            if (h85Var2 != null) {
                h85Var2.w(a85Var);
                h85Var2.N0(a85Var);
            }
            g85Var2.I0(a85Var);
        } else if (!Intrinsics.c(g85Var, g85Var2)) {
            if (g85Var != null) {
                g85Var.w(a85Var);
                g85Var.N0(a85Var);
            }
            if (g85Var2 != null) {
                g85Var2.I0(a85Var);
            }
        } else if (g85Var != null) {
            g85Var.N0(a85Var);
        } else {
            h85 h85Var3 = this.q;
            if (h85Var3 != null) {
                h85Var3.N0(a85Var);
            }
        }
        this.p = g85Var;
    }

    @Override // defpackage.h85
    public final void a0(a85 a85Var) {
        h85 h85Var = this.q;
        if (h85Var != null) {
            h85Var.a0(a85Var);
            return;
        }
        g85 g85Var = this.p;
        if (g85Var != null) {
            g85Var.a0(a85Var);
        }
    }

    @Override // defpackage.ula, defpackage.o1c
    public final void c(long j) {
        this.r = j;
    }

    @Override // defpackage.wtc
    public final void d1() {
        this.q = null;
        this.p = null;
    }

    @Override // defpackage.h85
    public final boolean i0(a85 a85Var) {
        g85 g85Var = this.p;
        if (g85Var != null) {
            return g85Var.i0(a85Var);
        }
        h85 h85Var = this.q;
        if (h85Var != null) {
            return h85Var.i0(a85Var);
        }
        return false;
    }

    @Override // defpackage.jyj
    public final Object s() {
        return hjg.c;
    }

    @Override // defpackage.h85
    public final void w(a85 a85Var) {
        h85 h85Var = this.q;
        if (h85Var != null) {
            h85Var.w(a85Var);
            return;
        }
        g85 g85Var = this.p;
        if (g85Var != null) {
            g85Var.w(a85Var);
        }
    }
}
