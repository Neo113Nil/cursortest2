package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f2e implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d2e b;
    public final /* synthetic */ d2e c;
    public final /* synthetic */ d2e d;
    public final /* synthetic */ xtc e;

    public /* synthetic */ f2e(xtc xtcVar, d2e d2eVar, d2e d2eVar2, d2e d2eVar3) {
        this.e = xtcVar;
        this.b = d2eVar;
        this.c = d2eVar2;
        this.d = d2eVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc q = bkh.q(this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 390.0f, 1);
                    l8g a = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.n, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, q);
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
                    u0a.e(this.b, k2f.d, av8Var, 390);
                    u0a.e(this.c, k2f.c, av8Var, 390);
                    u0a.e(this.d, k2f.e, av8Var, 390);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                u0a.c(this.b, this.c, this.d, this.e, (of3) obj, aba.K(3073));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f2e(d2e d2eVar, d2e d2eVar2, d2e d2eVar3, xtc xtcVar, int i) {
        this.b = d2eVar;
        this.c = d2eVar2;
        this.d = d2eVar3;
        this.e = xtcVar;
    }
}
