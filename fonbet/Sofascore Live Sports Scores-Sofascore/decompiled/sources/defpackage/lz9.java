package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lz9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rz9 b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        rz9 rz9Var = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    nz9.b(rz9Var, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                num.getClass();
                nz9.b(rz9Var, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
