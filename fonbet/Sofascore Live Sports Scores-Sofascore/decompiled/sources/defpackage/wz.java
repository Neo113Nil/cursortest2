package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wz implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ xtc c;

    public /* synthetic */ wz(long j, xtc xtcVar) {
        this.a = 0;
        this.b = j;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.c;
        long j = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc xtcVar2 = this.c;
                    if (j != 9205357640488583168L) {
                        av8Var.d0(-1244013944);
                        xtc k = bkh.k(xtcVar2, s75.b(j), s75.a(j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        k1c c = e12.c(uxf.d, false);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, k);
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
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        a00.b(0, 1, av8Var, null);
                        av8Var.s(true);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1243644858);
                        a00.b(0, 0, av8Var, xtcVar2);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                num.getClass();
                un0.h(j, xtcVar, of3Var, aba.K(1));
                break;
            case 2:
                num.getClass();
                v9g.o(j, xtcVar, of3Var, aba.K(1));
                break;
            default:
                num.getClass();
                v9g.p(j, xtcVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wz(int i, int i2, long j, xtc xtcVar) {
        this.a = i2;
        this.b = j;
        this.c = xtcVar;
    }
}
