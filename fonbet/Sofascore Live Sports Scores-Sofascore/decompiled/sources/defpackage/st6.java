package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class st6 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hu6 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ st6(hu6 hu6Var, Function1 function1) {
        this.b = hu6Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.c;
        hu6 hu6Var = this.b;
        switch (i) {
            case 0:
                function1.invoke(new ps6(hu6Var.c.a.a, hu6Var.f));
                break;
            default:
                if (!hu6Var.x.b) {
                    function1.invoke(js6.a);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ st6(Function1 function1, hu6 hu6Var) {
        this.c = function1;
        this.b = hu6Var;
    }
}
