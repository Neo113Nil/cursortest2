package defpackage;

import com.sofascore.results.mvvm.base.AbstractComposeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractComposeFragment b;

    public /* synthetic */ x2(AbstractComposeFragment abstractComposeFragment, int i) {
        this.a = i;
        this.b = abstractComposeFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        AbstractComposeFragment abstractComposeFragment = this.b;
        int i2 = 2;
        int i3 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    tol.b(khb.a.a(abstractComposeFragment), yqo.H(1399954720, av8Var, new x2(abstractComposeFragment, i3)), av8Var, 56);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(723590853, av8Var2, new x2(abstractComposeFragment, i2)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc J = lz.J(utc.a, jaa.L(av8Var3), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    fc6.v(0, abstractComposeFragment.getU(), av8Var3, true);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
