package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class w9j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ caj b;

    public /* synthetic */ w9j(caj cajVar, int i) {
        this.a = i;
        this.b = cajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        rq3 rq3Var = null;
        caj cajVar = this.b;
        switch (i) {
            case 0:
                xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, i2), 3);
                break;
            case 1:
                cajVar.E = (s8l) tgj.x(cajVar, dh3.u);
                cajVar.s.d = cajVar.q1();
                if (cajVar.q1() && cajVar.F == null) {
                    cajVar.F = xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, 4), 3);
                } else if (!cajVar.q1()) {
                    g9i g9iVar = cajVar.F;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    cajVar.F = null;
                }
                break;
            case 2:
                c6o.Z(cajVar);
                break;
            case 3:
                c6o.Z(cajVar);
                break;
            case 4:
                upf.a(cajVar);
                break;
            case 5:
                upf.a(cajVar);
                break;
            case 6:
                xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, 2), 3);
                break;
            case 7:
                break;
            case 8:
                if (cajVar.q1()) {
                    ((lw4) cajVar.s1()).b();
                } else {
                    se8 se8Var = cajVar.A;
                    if (se8Var.n) {
                        ne8.s1(se8Var.v);
                    }
                }
                break;
            case 9:
                if (!cajVar.q1()) {
                    se8 se8Var2 = cajVar.A;
                    if (se8Var2.n) {
                        ne8.s1(se8Var2.v);
                    }
                }
                cajVar.s.x(gfj.c);
                break;
            case 10:
                xw3.L(cajVar.Y0(), null, null, new z9j(cajVar, rq3Var, 0), 3);
                break;
            case 11:
                if (cajVar.J != null) {
                    ((lw4) cajVar.s1()).b();
                } else {
                    cajVar.t1(true);
                }
                break;
            default:
                cajVar.s.x(gfj.c);
                break;
        }
        return Unit.a;
    }
}
