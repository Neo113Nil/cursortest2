package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uvb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ en1 b;

    public /* synthetic */ uvb(en1 en1Var, int i) {
        this.a = i;
        this.b = en1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        en1 en1Var = this.b;
        int i2 = 0;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    l98.d(en1Var, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1841759005, av8Var2, new uvb(en1Var, i2)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
