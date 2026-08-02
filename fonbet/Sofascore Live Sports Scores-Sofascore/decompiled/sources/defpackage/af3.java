package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class af3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bnh b;

    public /* synthetic */ af3(bnh bnhVar) {
        this.b = bnhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        bnh bnhVar = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                l6g.f(bnhVar, of3Var, aba.K(1));
                break;
            default:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    l6g.f(bnhVar, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ af3(bnh bnhVar, int i) {
        this.b = bnhVar;
    }
}
