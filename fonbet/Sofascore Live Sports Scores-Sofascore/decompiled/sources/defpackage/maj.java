package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class maj implements ct8 {
    public final /* synthetic */ cdi a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dfj c;
    public final /* synthetic */ Function2 d;

    public maj(vwj vwjVar, long j, dfj dfjVar, Function2 function2) {
        this.a = vwjVar;
        this.b = j;
        this.c = dfjVar;
        this.d = function2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            cdi cdiVar = this.a;
            boolean g = av8Var.g(cdiVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new cl1(cdiVar, 15);
                av8Var.n0(O);
            }
            xtc M = s02.M(xtcVar, (Function1) O);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, M);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            qha.b(this.b, this.c, this.d, av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
