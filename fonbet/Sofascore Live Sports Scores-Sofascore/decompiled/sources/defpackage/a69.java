package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class a69 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wh b;

    public /* synthetic */ a69(wh whVar, int i) {
        this.a = i;
        this.b = whVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wh whVar = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-852983489, av8Var, new a69(whVar, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    h43 h43Var = (h43) ((eoh) ((e1d) whVar.d)).getValue();
                    if (h43Var == null) {
                        av8Var2.d0(2090397534);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(2090397535);
                        v9g.o(h43Var.a, null, av8Var2, 0);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
