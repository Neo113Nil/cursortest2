package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mch implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nch b;

    public /* synthetic */ mch(nch nchVar) {
        this.b = nchVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        nch nchVar = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    e1d x = rfo.x(nchVar.k, av8Var, 0);
                    e1d x2 = rfo.x(nchVar.l, av8Var, 0);
                    e1d x3 = rfo.x(nchVar.m, av8Var, 0);
                    c9b c9bVar = (c9b) x.getValue();
                    if (c9bVar == null) {
                        av8Var.d0(-1904562863);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1904562862);
                        r8b r8bVar = (r8b) x2.getValue();
                        bnf bnfVar = (bnf) x3.getValue();
                        Function0 function0 = nchVar.o;
                        xtc F = u0a.F(utc.a, icb.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 46);
                        boolean i2 = av8Var.i(nchVar);
                        Object O = av8Var.O();
                        if (i2 || O == nf3.a) {
                            O = new qfg(nchVar, 16);
                            av8Var.n0(O);
                        }
                        v9g.l(c9bVar, r8bVar, bnfVar, false, (Function1) O, function0, F, true, av8Var, 12585984);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nchVar.a(aba.K(1), (of3) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mch(nch nchVar, int i) {
        this.b = nchVar;
    }
}
