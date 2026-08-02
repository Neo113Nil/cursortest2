package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fzj implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ azj b;

    public /* synthetic */ fzj(azj azjVar) {
        this.b = azjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        azj azjVar = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    f5p.l(azjVar, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                num.getClass();
                f5p.l(azjVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fzj(azj azjVar, int i) {
        this.b = azjVar;
    }
}
