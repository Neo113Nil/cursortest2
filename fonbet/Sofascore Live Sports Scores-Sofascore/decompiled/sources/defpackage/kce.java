package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kce implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zye b;

    public /* synthetic */ kce(zye zyeVar, int i) {
        this.a = 0;
        this.b = zyeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        byte b = 0;
        zye zyeVar = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                nce.e(zyeVar, of3Var, aba.K(1));
                break;
            case 1:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(761228947, av8Var, new kce(zyeVar, i2, b)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int intValue2 = num.intValue();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    nce.e(zyeVar, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kce(zye zyeVar, int i, byte b) {
        this.a = i;
        this.b = zyeVar;
    }
}
