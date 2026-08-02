package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ow4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qw4 b;

    public /* synthetic */ ow4(qw4 qw4Var, int i) {
        this.a = i;
        this.b = qw4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        qw4 qw4Var = this.b;
        switch (i) {
            case 0:
                i5g i5gVar = (i5g) tgj.x(qw4Var, o5g.a);
                y20 y20Var = qw4Var.u;
                if (i5gVar == null) {
                    if (y20Var != null) {
                        qw4Var.l1(y20Var);
                    }
                    qw4Var.u = null;
                } else if (y20Var == null) {
                    pw4 pw4Var = new pw4(qw4Var, 1);
                    ow4 ow4Var = new ow4(qw4Var, 1);
                    wzc wzcVar = qw4Var.r;
                    boolean z = qw4Var.s;
                    float f = qw4Var.t;
                    i4k i4kVar = m5g.a;
                    y20 y20Var2 = new y20(wzcVar, z, f, pw4Var, ow4Var);
                    qw4Var.k1(y20Var2);
                    qw4Var.u = y20Var2;
                }
                return Unit.a;
            default:
                return ((p23) tgj.x(qw4Var, q23.a)).d() ? ((double) hkg.e0(((r13) tgj.x(qw4Var, mo3.a)).a)) > 0.5d ? o5g.c : o5g.d : o5g.e;
        }
    }
}
