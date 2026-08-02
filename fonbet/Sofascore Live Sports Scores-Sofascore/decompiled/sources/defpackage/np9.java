package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class np9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;

    public /* synthetic */ np9(int i, int i2, gv9 gv9Var) {
        this.a = i2;
        this.b = gv9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gv9 gv9Var = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                fz8.r(gv9Var, of3Var, aba.K(1));
                break;
            case 1:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ml4.c(gv9Var, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                int intValue2 = num.intValue();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    haa.f(yqo.H(-2062691229, av8Var2, new np9(i2, gv9Var)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            case 3:
                num.getClass();
                g6j.b(gv9Var, of3Var, aba.K(1));
                break;
            default:
                num.getClass();
                g6j.b(gv9Var, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ np9(int i, gv9 gv9Var) {
        this.a = i;
        this.b = gv9Var;
    }
}
