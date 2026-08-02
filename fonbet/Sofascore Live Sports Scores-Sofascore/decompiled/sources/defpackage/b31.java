package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b31 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f31 b;

    public /* synthetic */ b31(f31 f31Var) {
        this.b = f31Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        f31 f31Var = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    f31Var.a(0, av8Var);
                } else {
                    av8Var.W();
                }
                break;
            default:
                num.getClass();
                f31Var.a(aba.K(1), of3Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b31(f31 f31Var, int i) {
        this.b = f31Var;
    }
}
