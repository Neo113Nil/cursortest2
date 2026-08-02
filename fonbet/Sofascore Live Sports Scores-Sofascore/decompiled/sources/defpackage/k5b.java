package defpackage;

import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k5b extends wtc implements oje, ug3, a09 {
    public i10 o;
    public q5b p;
    public tbj q;
    public final e1d r = e.f(null);

    public k5b(i10 i10Var, q5b q5bVar, tbj tbjVar) {
        this.o = i10Var;
        this.p = q5bVar;
        this.q = tbjVar;
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        ((eoh) this.r).setValue(dmaVar);
    }

    @Override // defpackage.wtc
    public final void c1() {
        i10 i10Var = this.o;
        if (i10Var.a != null) {
            u3a.c("Expected textInputModifierNode to be null");
        }
        i10Var.a = this;
    }

    @Override // defpackage.wtc
    public final void d1() {
        this.o.k(this);
    }
}
