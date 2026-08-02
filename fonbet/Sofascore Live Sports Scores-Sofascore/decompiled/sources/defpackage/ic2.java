package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ic2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va2 b;

    public /* synthetic */ ic2(va2 va2Var, int i) {
        this.a = i;
        this.b = va2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        va2 va2Var = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null && va2Var._closedCause == null) {
                    va2Var.a(th);
                }
                break;
            default:
                if (th != null && !va2Var.h()) {
                    va2Var.a(th);
                }
                break;
        }
        return Unit.a;
    }
}
