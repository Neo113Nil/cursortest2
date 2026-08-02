package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class te3 extends r9 {
    public final ku3 c;
    public Function2 d;
    public g62 e;
    public g9i f;
    public boolean g;

    public te3(ku3 ku3Var, h4f h4fVar) {
        super(h4fVar);
        this.c = ku3Var;
        this.d = new i40(2, null, 3);
    }

    public final void G(boolean z) {
        g9i g9iVar;
        if (!z && super.s() && (g9iVar = this.f) != null && !g9iVar.isActive()) {
            t();
        }
        ((px0) this.a).f(z);
        ((ox0) this.b).g(z);
    }

    @Override // defpackage.r9
    public final void t() {
        g62 g62Var = this.e;
        if (g62Var != null) {
            g62Var.c(new CancellationException("onBack cancelled"), true);
        }
        g9i g9iVar = this.f;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.r9
    public final void u() {
        if (this.e != null && !this.g) {
            t();
        }
        rq3 rq3Var = null;
        if (this.e == null) {
            this.g = false;
            this.e = ml4.g(-2, 4, a62.a);
            this.f = xw3.L(this.c, null, null, new hy1(this, rq3Var, 15), 3);
        }
        g62 g62Var = this.e;
        if (g62Var != null) {
            g62Var.r(null);
        }
        this.g = false;
    }

    @Override // defpackage.r9
    public final void v(nx0 nx0Var) {
        g62 g62Var = this.e;
        if (g62Var != null) {
            g62Var.d(nx0Var);
        }
    }

    @Override // defpackage.r9
    public final void w() {
        t();
        if (super.s()) {
            this.g = true;
            this.e = ml4.g(-2, 4, a62.a);
            this.f = xw3.L(this.c, null, null, new hy1(this, (rq3) null, 15), 3);
        }
    }
}
