package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pc3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc3 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ pc3(tc3 tc3Var, Object obj, int i, int i2) {
        this.a = i2;
        this.b = tc3Var;
        this.c = obj;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.c;
        tc3 tc3Var = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                tc3Var.e(obj3, of3Var, aba.K(i2) | 1);
                break;
            default:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    tc3Var.invoke(obj3, av8Var, Integer.valueOf((i2 >> 3) & 8));
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }
}
