package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lmk extends d7e {
    public final e1d f = e.f(new njh(0));
    public final e1d g = e.f(Boolean.FALSE);
    public final wlk h;
    public final e1d i;
    public float j;
    public ay1 k;

    public lmk(u39 u39Var) {
        wlk wlkVar = new wlk(u39Var);
        wlkVar.f = new s2j(this, 17);
        this.h = wlkVar;
        this.i = e.e(Unit.a, f7a.k);
        this.j = 1.0f;
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        this.j = f;
        return true;
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        this.k = ay1Var;
        return true;
    }

    @Override // defpackage.d7e
    public final long i() {
        return ((njh) ((eoh) this.f).getValue()).a;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        ay1 ay1Var = this.k;
        wlk wlkVar = this.h;
        if (ay1Var == null) {
            ay1Var = (ay1) ((eoh) wlkVar.g).getValue();
        }
        if (((Boolean) ((eoh) this.g).getValue()).booleanValue() && ha5Var.getLayoutDirection() == ema.b) {
            long O0 = ha5Var.O0();
            sx2 L0 = ha5Var.L0();
            long D = L0.D();
            L0.t().o();
            try {
                ((hpo) L0.a).G(-1.0f, 1.0f, O0);
                wlkVar.e(ha5Var, this.j, ay1Var);
            } finally {
                mz1.v(L0, D);
            }
        } else {
            wlkVar.e(ha5Var, this.j, ay1Var);
        }
        ((eoh) this.i).getValue();
        Unit unit = Unit.a;
    }
}
