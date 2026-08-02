package defpackage;

import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t81(float f, jxk jxkVar) {
        this.a = 3;
        this.b = f;
        this.c = jxkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v81.a((w81) obj3, f, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o02.s((ev6) obj3, f, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                o02.c((BrandingFantasyCompetition) obj3, f, (of3) obj, aba.K(1));
                break;
            default:
                ixk ixkVar = ((jxk) obj3).c;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc p = bkh.p(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, p);
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
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    hxk.c(true, ixkVar.c, Intrinsics.c(ixkVar.e, Boolean.TRUE), av8Var, 6);
                    hxk.c(false, ixkVar.d, Intrinsics.c(ixkVar.e, Boolean.FALSE), av8Var, 6);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t81(Object obj, float f, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = f;
    }
}
