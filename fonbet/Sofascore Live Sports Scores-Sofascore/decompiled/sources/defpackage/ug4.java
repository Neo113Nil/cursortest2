package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ug4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ ug4(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    if (StringsKt.R((CharSequence) e1dVar.getValue())) {
                        av8Var.d0(-1548950640);
                    } else {
                        av8Var.d0(-327061465);
                        udj.c((String) e1dVar.getValue(), null, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var, 0, 0, 262142);
                    }
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object O = av8Var2.O();
                    if (O == nf3.a) {
                        O = new clc(9);
                        av8Var2.n0(O);
                    }
                    xtc a = o3h.a(utc.a, false, (Function1) O);
                    k1c c = e12.c(uxf.c, false);
                    int G = z8e.G(av8Var2);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, a);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    f50 f50Var = hf3.j;
                    if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var2, G, f50Var);
                    }
                    waa.K(av8Var2, C, hf3.d);
                    me4.l(0, (Function2) e1dVar.getValue(), av8Var2, true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
