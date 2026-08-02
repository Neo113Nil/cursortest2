package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class re2 extends wtc implements tkd, r62, ga5 {
    public final te2 o;
    public boolean p;
    public Function1 q;

    public re2(te2 te2Var, Function1 function1) {
        this.o = te2Var;
        this.q = function1;
        te2Var.a = this;
    }

    @Override // defpackage.ga5
    public final void B0() {
        k1();
    }

    @Override // defpackage.xv4
    public final void S() {
        k1();
    }

    @Override // defpackage.tkd
    public final void Z() {
        k1();
    }

    @Override // defpackage.wtc
    public final void e1() {
        k1();
    }

    @Override // defpackage.r62
    public final ema getLayoutDirection() {
        return c6o.c0(this).z;
    }

    @Override // defpackage.r62
    public final kx4 j() {
        return c6o.c0(this).y;
    }

    public final void k1() {
        this.p = false;
        this.o.b = null;
        n9e.E(this);
    }

    @Override // defpackage.xv4, defpackage.pze
    public final void l() {
        k1();
    }

    @Override // defpackage.r62
    public final long n() {
        return d7a.I(c6o.a0(this, 4).c);
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        boolean z = this.p;
        te2 te2Var = this.o;
        if (!z) {
            te2Var.b = null;
            z1a.R(this, new y1(14, this, te2Var));
            if (te2Var.b == null) {
                throw wt3.j("DrawResult not defined, did you forget to call onDraw?");
            }
            this.p = true;
        }
        j0l j0lVar = te2Var.b;
        j0lVar.getClass();
        ((Function1) j0lVar.b).invoke(ymaVar);
    }

    @Override // defpackage.wtc
    public final void d1() {
    }
}
