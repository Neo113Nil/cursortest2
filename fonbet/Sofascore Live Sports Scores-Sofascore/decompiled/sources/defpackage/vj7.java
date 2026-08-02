package defpackage;

import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.a;
import com.sofascore.results.main.fantasy.bottomsheet.FantasySectionedBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vj7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;
    public final /* synthetic */ FantasySectionedBottomSheetFragment c;

    public /* synthetic */ vj7(c51 c51Var, FantasySectionedBottomSheetFragment fantasySectionedBottomSheetFragment, int i) {
        this.a = i;
        this.b = c51Var;
        this.c = fantasySectionedBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasySectionedBottomSheetFragment fantasySectionedBottomSheetFragment = this.c;
        c51 c51Var = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1925382418, av8Var, new vj7(c51Var, fantasySectionedBottomSheetFragment, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc J = lz.J(bkh.d(utc.a, 1.0f), jaa.L(av8Var2), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    qug o0 = hkg.o0(av8Var2);
                    Integer valueOf = Integer.valueOf(o0.a.h());
                    boolean g = av8Var2.g(c51Var) | av8Var2.g(o0);
                    Object O = av8Var2.O();
                    if (g || O == nf3.a) {
                        O = new iv6(c51Var, o0, null, 4);
                        av8Var2.n0(O);
                    }
                    hz8.o(av8Var2, valueOf, (Function2) O);
                    a.a((FantasySectionedInfoType) fantasySectionedBottomSheetFragment.w.getValue(), null, o0, av8Var2, 0, 2);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
