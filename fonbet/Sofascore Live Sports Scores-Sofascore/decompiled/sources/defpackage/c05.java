package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c05 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct8 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ c05(ct8 ct8Var, Object obj, int i, int i2) {
        this.a = i2;
        this.b = ct8Var;
        this.c = obj;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.c;
        ct8 ct8Var = this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ct8Var.invoke(obj3, av8Var, Integer.valueOf((i2 >> 3) & 8));
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    ct8Var.invoke(obj3, av8Var2, Integer.valueOf((i2 >> 3) & 8));
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
