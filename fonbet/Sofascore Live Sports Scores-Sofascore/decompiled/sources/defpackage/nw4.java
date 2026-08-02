package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nw4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qw4 b;

    public /* synthetic */ nw4(qw4 qw4Var, int i) {
        this.a = i;
        this.b = qw4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qw4 qw4Var = this.b;
        switch (i) {
            case 0:
                h5g h5gVar = (h5g) tgj.x(qw4Var, n5g.a);
                y20 y20Var = qw4Var.u;
                if (h5gVar == null) {
                    if (y20Var != null) {
                        qw4Var.l1(y20Var);
                    }
                    qw4Var.u = null;
                } else if (y20Var == null) {
                    pw4 pw4Var = new pw4(qw4Var, 0);
                    nw4 nw4Var = new nw4(qw4Var, 1);
                    wzc wzcVar = qw4Var.r;
                    boolean z = qw4Var.s;
                    float f = qw4Var.t;
                    i4k i4kVar = m5g.a;
                    y20 y20Var2 = new y20(wzcVar, z, f, pw4Var, nw4Var);
                    qw4Var.k1(y20Var2);
                    qw4Var.u = y20Var2;
                }
                return Unit.a;
            default:
                return pco.i;
        }
    }
}
