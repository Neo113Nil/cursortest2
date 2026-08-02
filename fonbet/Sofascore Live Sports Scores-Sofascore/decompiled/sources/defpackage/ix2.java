package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ix2 extends c5n {
    public final fx2 h;
    public Object i;
    public boolean j = false;

    public ix2(fx2 fx2Var) {
        this.h = fx2Var;
    }

    @Override // defpackage.c5n
    public final void J(xei xeiVar, qic qicVar) {
        boolean f = xeiVar.f();
        fx2 fx2Var = this.h;
        if (!f) {
            fx2Var.m(new dfi(xeiVar, qicVar));
            return;
        }
        if (!this.j) {
            fx2Var.m(new dfi(xei.l.h("No value received for unary call"), qicVar));
        }
        fx2Var.l(this.i);
    }

    @Override // defpackage.c5n
    public final void L(Object obj) {
        if (this.j) {
            throw xei.l.h("More than one value received for unary call").a();
        }
        this.i = obj;
        this.j = true;
    }

    @Override // defpackage.c5n
    public final void K(qic qicVar) {
    }
}
