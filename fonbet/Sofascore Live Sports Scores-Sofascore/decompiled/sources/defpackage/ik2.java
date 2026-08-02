package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ik2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc3 b;

    public /* synthetic */ ik2(tc3 tc3Var, int i) {
        this.a = i;
        this.b = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        x23 x23Var = x23.a;
        utc utcVar = utc.a;
        tc3 tc3Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    f50 f50Var = hf3.j;
                    if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var);
                    }
                    waa.K(av8Var, C, hf3.d);
                    tc3Var.invoke(x23Var, av8Var, 6);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int G2 = z8e.G(av8Var2);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    f50 f50Var2 = hf3.j;
                    if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G2))) {
                        mz1.t(G2, av8Var2, G2, f50Var2);
                    }
                    waa.K(av8Var2, C2, hf3.d);
                    tc3Var.invoke(x23Var, av8Var2, 6);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
