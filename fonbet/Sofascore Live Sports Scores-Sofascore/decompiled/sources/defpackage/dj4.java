package defpackage;

import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dj4 implements et8 {
    public final /* synthetic */ kg2 a;
    public final /* synthetic */ lg2 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ eg2 d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ gi4 f;
    public final /* synthetic */ di4 g;
    public final /* synthetic */ ci4 h;

    public dj4(kg2 kg2Var, lg2 lg2Var, Function1 function1, eg2 eg2Var, Long l, gi4 gi4Var, di4 di4Var, ci4 ci4Var) {
        this.a = kg2Var;
        this.b = lg2Var;
        this.c = function1;
        this.d = eg2Var;
        this.e = l;
        this.f = gi4Var;
        this.g = di4Var;
        this.h = ci4Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            kg2 kg2Var = this.a;
            kg2Var.getClass();
            lg2 lg2Var = this.b;
            if (intValue > 0) {
                lg2Var = kg2Var.c(Instant.ofEpochMilli(lg2Var.e).atZone(kg2.e).toLocalDate().plusMonths(intValue));
            }
            lg2 lg2Var2 = lg2Var;
            xtc b = xpa.b(xpaVar);
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b);
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
            oj4.i(lg2Var2, this.c, this.d.d, this.e, this.f, this.g, this.h, kg2Var.a, av8Var, 221184);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
