package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class y72 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3e b;
    public final /* synthetic */ tc3 c;

    public /* synthetic */ y72(p3e p3eVar, tc3 tc3Var, int i) {
        this.a = i;
        this.b = p3eVar;
        this.c = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        tc3 tc3Var = this.c;
        p3e p3eVar = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    vdj.a(((b7k) av8Var.k(e7k.b)).k, yqo.H(165539859, av8Var, new y72(p3eVar, tc3Var, i2)), av8Var, 48);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc a0 = l98.a0(bkh.a(utc.a, r72.b, r72.c), p3eVar);
                    l8g a = k8g.a(ww9.f, uxf.m, av8Var2, 54);
                    int G = z8e.G(av8Var2);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, a0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    f50 f50Var = hf3.j;
                    if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var2, G, f50Var);
                    }
                    waa.K(av8Var2, C, hf3.d);
                    tc3Var.invoke(p8g.a, av8Var2, 6);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
