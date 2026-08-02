package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lfc implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public lfc(axj axjVar, tc3 tc3Var, xkj xkjVar) {
        this.a = 2;
        this.b = axjVar;
        this.d = tc3Var;
        this.c = xkjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc u0 = hkg.u0(fz8.d0(l98.d0((xtc) obj5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), n9a.b), (qug) obj3, false, 14);
                    tc3 tc3Var = (tc3) obj4;
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int G = z8e.G(av8Var);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, u0);
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
                    tc3Var.invoke(x23.a, av8Var, 6);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    hjg.h.k((wzc) obj5, (n9j) obj3, (uah) obj4, av8Var2, 114822144);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Number) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xtc q = fqj.q(utc.a, new g31((axj) obj5, 11));
                    tc3 tc3Var2 = (tc3) obj4;
                    xkj xkjVar = (xkj) obj3;
                    k1c c = e12.c(uxf.c, false);
                    int G2 = z8e.G(av8Var3);
                    aee m2 = av8Var3.m();
                    xtc C2 = fqj.C(av8Var3, q);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c, hf3.g);
                    waa.K(av8Var3, m2, hf3.f);
                    f50 f50Var2 = hf3.j;
                    if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G2))) {
                        mz1.t(G2, av8Var3, G2, f50Var2);
                    }
                    waa.K(av8Var3, C2, hf3.d);
                    tc3Var2.invoke(xkjVar, av8Var3, 6);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lfc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
