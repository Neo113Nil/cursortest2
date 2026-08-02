package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nji extends bw4 implements pze, nd8, ee8 {
    public Function0 q;
    public boolean r;
    public final ooi s;

    public nji(Function0 function0) {
        this.q = function0;
        m00 m00Var = new m00(this, 5);
        fze fzeVar = koi.a;
        ooi ooiVar = new ooi(null, null, m00Var);
        k1(ooiVar);
        this.s = ooiVar;
    }

    @Override // defpackage.pze
    public final void B(fze fzeVar, gze gzeVar, long j) {
        this.s.B(fzeVar, gzeVar, j);
    }

    @Override // defpackage.nd8
    public final void J(ie8 ie8Var) {
        this.r = ie8Var.g();
    }

    @Override // defpackage.pze
    public final long r0() {
        t75 t75Var = iz8.j;
        kx4 kx4Var = c6o.c0(this).y;
        t75Var.getClass();
        int i = sqj.b;
        return x2a.H(kx4Var.e0(10.0f), kx4Var.e0(40.0f), kx4Var.e0(10.0f), kx4Var.e0(40.0f));
    }

    @Override // defpackage.pze
    public final void y0() {
        this.s.y0();
    }
}
