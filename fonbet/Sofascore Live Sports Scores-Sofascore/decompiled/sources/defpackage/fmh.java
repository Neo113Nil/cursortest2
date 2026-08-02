package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fmh implements ct8 {
    public final /* synthetic */ gmh a;
    public final /* synthetic */ gmh b;
    public final /* synthetic */ cn6 c;
    public final /* synthetic */ String d;

    public fmh(gmh gmhVar, gmh gmhVar2, cn6 cn6Var, String str) {
        this.a = gmhVar;
        this.b = gmhVar2;
        this.c = cn6Var;
        this.d = str;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).i(function2) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            gmh gmhVar = this.b;
            Object obj4 = this.a;
            boolean c = Intrinsics.c(obj4, gmhVar);
            g0i I = ufa.I(bwc.d, av8Var);
            boolean g = av8Var.g(obj4);
            Object obj5 = this.c;
            boolean i = g | av8Var.i(obj5);
            Object O = av8Var.O();
            Object obj6 = nf3.a;
            if (i || O == obj6) {
                O = new deh(5, obj4, obj5);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == obj6) {
                O2 = ml4.b(!c ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O2);
            }
            q50 q50Var = (q50) O2;
            Boolean valueOf = Boolean.valueOf(c);
            boolean i2 = av8Var.i(q50Var) | av8Var.h(c) | av8Var.i(I) | av8Var.g(function0);
            Object O3 = av8Var.O();
            if (i2 || O3 == obj6) {
                Object w21Var = new w21(q50Var, c, I, function0, (rq3) null);
                av8Var.n0(w21Var);
                O3 = w21Var;
            }
            hz8.o(av8Var, valueOf, (Function2) O3);
            d80 d80Var = q50Var.c;
            Object I2 = ufa.I(bwc.b, av8Var);
            Object O4 = av8Var.O();
            if (O4 == obj6) {
                O4 = ml4.b(c ? 0.8f : 1.0f);
                av8Var.n0(O4);
            }
            q50 q50Var2 = (q50) O4;
            Boolean valueOf2 = Boolean.valueOf(c);
            boolean i3 = av8Var.i(q50Var2) | av8Var.h(c) | av8Var.i(I2);
            Object O5 = av8Var.O();
            if (i3 || O5 == obj6) {
                Object t3Var = new t3(q50Var2, c, I2, (rq3) null, 12);
                av8Var.n0(t3Var);
                O5 = t3Var;
            }
            hz8.o(av8Var, valueOf2, (Function2) O5);
            d80 d80Var2 = q50Var2.c;
            xtc N = s02.N(utc.a, ((Number) ((eoh) d80Var2.b).getValue()).floatValue(), ((Number) ((eoh) d80Var2.b).getValue()).floatValue(), ((Number) ((eoh) d80Var.b).getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 131064);
            boolean h = av8Var.h(c) | av8Var.g(obj4);
            Object obj7 = this.d;
            boolean g2 = h | av8Var.g(obj7);
            Object O6 = av8Var.O();
            if (g2 || O6 == obj6) {
                O6 = new gk(c, obj7, obj4, 13);
                av8Var.n0(O6);
            }
            xtc a = o3h.a(N, false, (Function1) O6);
            k1c c2 = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function02);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            me4.l(intValue & 14, function2, av8Var, true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
