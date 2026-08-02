package defpackage;

import defpackage.acm;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ktl implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;

    public ktl(List list, Function1 function1) {
        this.a = list;
        this.b = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        ((xpa) obj).getClass();
        if ((intValue2 & 48) == 0) {
            intValue2 |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        if ((intValue2 & 145) == 144) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        acm acmVar = (acm) this.a.get(intValue);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-264032772);
        Function1 function1 = this.b;
        boolean g = av8Var2.g(function1) | av8Var2.i(acmVar);
        Object O = av8Var2.O();
        if (g || O == nf3.a) {
            O = new ufl(6, function1, acmVar);
            av8Var2.n0(O);
        }
        av8Var2.s(false);
        s7m.e(acmVar, (Function0) O, av8Var2, 0);
        if (((acmVar instanceof acm.b) || (acmVar instanceof acm.c)) && intValue != r8.size() - 1) {
            td4.w(bkh.d(utc.a, 1.0f), 1.0f, kam.g, av8Var2, 438, 0);
        }
        return Unit.a;
    }
}
