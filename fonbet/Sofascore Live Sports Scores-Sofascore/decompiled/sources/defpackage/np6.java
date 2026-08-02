package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class np6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ev6 c;

    public /* synthetic */ np6(Function1 function1, ev6 ev6Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = ev6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ev6 ev6Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(ev6Var);
                break;
            default:
                function1.invoke(new x87(ev6Var.c, ev6Var.d));
                break;
        }
        return Unit.a;
    }
}
