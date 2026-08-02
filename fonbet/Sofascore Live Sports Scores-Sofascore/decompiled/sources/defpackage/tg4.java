package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tg4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ tg4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = new q73(23);
                        av8Var.n0(O);
                    }
                    AtomicInteger atomicInteger = o3h.a;
                    udj.c(this.b, new ew2((Function1) O), 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var, 0, 0, 262140);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Number) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    udj.c(this.b, null, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var2, 0, 0, 262142);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Number) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    udj.c(this.b, null, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var3, 0, 0, 262142);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
