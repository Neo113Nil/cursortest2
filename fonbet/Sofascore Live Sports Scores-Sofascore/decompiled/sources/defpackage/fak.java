package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fak implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc3 b;

    public /* synthetic */ fak(tc3 tc3Var, int i) {
        this.a = i;
        this.b = tc3Var;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        tc3 tc3Var = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj2;
                num.getClass();
                of3 of3Var = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((u5e) obj).getClass();
                g28 g28Var = bkh.c;
                k1c c = e12.c(uxf.g, false);
                av8 av8Var = (av8) of3Var;
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(of3Var, g28Var);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var2 = (av8) of3Var;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(of3Var, c, hf3.g);
                waa.K(of3Var, m, hf3.f);
                waa.K(of3Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(of3Var, hf3.k);
                waa.K(of3Var, C, hf3.d);
                tc3Var.invoke(num, of3Var, Integer.valueOf((intValue >> 3) & 14));
                av8Var2.s(true);
                break;
            default:
                bpa bpaVar = (bpa) obj;
                ((Integer) obj2).getClass();
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(bpaVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    tc3Var.invoke(bpaVar, av8Var3, Integer.valueOf(intValue2 & 14));
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
