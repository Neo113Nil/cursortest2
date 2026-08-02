package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vi4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ vi4(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        utc utcVar = utc.a;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    k1c c = e12.c(uxf.c, false);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, goaVar);
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
                    me4.l(0, function2, av8Var, true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    k1c c2 = e12.c(uxf.i, false);
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
                    waa.K(av8Var2, c2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    f50 f50Var2 = hf3.j;
                    if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G2))) {
                        mz1.t(G2, av8Var2, G2, f50Var2);
                    }
                    waa.K(av8Var2, C2, hf3.d);
                    me4.l(0, function2, av8Var2, true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Number) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xtc b = bkh.b(utcVar, wcb.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    k1c c3 = e12.c(uxf.c, false);
                    int G3 = z8e.G(av8Var3);
                    aee m3 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, b);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var3);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c3, hf3.g);
                    waa.K(av8Var3, m3, hf3.f);
                    f50 f50Var3 = hf3.j;
                    if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G3))) {
                        mz1.t(G3, av8Var3, G3, f50Var3);
                    }
                    waa.K(av8Var3, C3, hf3.d);
                    me4.l(0, function2, av8Var3, true);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Number) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    k1c c4 = e12.c(uxf.c, false);
                    int G4 = z8e.G(av8Var4);
                    aee m4 = av8Var4.m();
                    xtc C4 = fqj.C(av8Var4, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var4);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, c4, hf3.g);
                    waa.K(av8Var4, m4, hf3.f);
                    f50 f50Var4 = hf3.j;
                    if (av8Var4.S || !Intrinsics.c(av8Var4.O(), Integer.valueOf(G4))) {
                        mz1.t(G4, av8Var4, G4, f50Var4);
                    }
                    waa.K(av8Var4, C4, hf3.d);
                    me4.l(0, function2, av8Var4, true);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Number) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    k1c c5 = e12.c(uxf.c, false);
                    int G5 = z8e.G(av8Var5);
                    aee m5 = av8Var5.m();
                    xtc C5 = fqj.C(av8Var5, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var5);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, c5, hf3.g);
                    waa.K(av8Var5, m5, hf3.f);
                    f50 f50Var5 = hf3.j;
                    if (av8Var5.S || !Intrinsics.c(av8Var5.O(), Integer.valueOf(G5))) {
                        mz1.t(G5, av8Var5, G5, f50Var5);
                    }
                    waa.K(av8Var5, C5, hf3.d);
                    me4.l(0, function2, av8Var5, true);
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Number) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    k1c c6 = e12.c(uxf.c, false);
                    int G6 = z8e.G(av8Var6);
                    aee m6 = av8Var6.m();
                    xtc C6 = fqj.C(av8Var6, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var6 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var6);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, c6, hf3.g);
                    waa.K(av8Var6, m6, hf3.f);
                    f50 f50Var6 = hf3.j;
                    if (av8Var6.S || !Intrinsics.c(av8Var6.O(), Integer.valueOf(G6))) {
                        mz1.t(G6, av8Var6, G6, f50Var6);
                    }
                    waa.K(av8Var6, C6, hf3.d);
                    me4.l(0, function2, av8Var6, true);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Number) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    k1c c7 = e12.c(uxf.c, false);
                    int G7 = z8e.G(av8Var7);
                    aee m7 = av8Var7.m();
                    xtc C7 = fqj.C(av8Var7, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var7 = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var7);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, c7, hf3.g);
                    waa.K(av8Var7, m7, hf3.f);
                    f50 f50Var7 = hf3.j;
                    if (av8Var7.S || !Intrinsics.c(av8Var7.O(), Integer.valueOf(G7))) {
                        mz1.t(G7, av8Var7, G7, f50Var7);
                    }
                    waa.K(av8Var7, C7, hf3.d);
                    me4.l(0, function2, av8Var7, true);
                } else {
                    av8Var7.W();
                }
                break;
            default:
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Number) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    xtc D = ww9.D(utcVar, "Container");
                    k1c c8 = e12.c(uxf.c, true);
                    int G8 = z8e.G(av8Var8);
                    aee m8 = av8Var8.m();
                    xtc C8 = fqj.C(av8Var8, D);
                    if3.k7.getClass();
                    zg3 zg3Var8 = hf3.b;
                    av8Var8.h0();
                    if (av8Var8.S) {
                        av8Var8.l(zg3Var8);
                    } else {
                        av8Var8.q0();
                    }
                    waa.K(av8Var8, c8, hf3.g);
                    waa.K(av8Var8, m8, hf3.f);
                    f50 f50Var8 = hf3.j;
                    if (av8Var8.S || !Intrinsics.c(av8Var8.O(), Integer.valueOf(G8))) {
                        mz1.t(G8, av8Var8, G8, f50Var8);
                    }
                    waa.K(av8Var8, C8, hf3.d);
                    me4.l(0, function2, av8Var8, true);
                } else {
                    av8Var8.W();
                }
                break;
        }
        return Unit.a;
    }
}
