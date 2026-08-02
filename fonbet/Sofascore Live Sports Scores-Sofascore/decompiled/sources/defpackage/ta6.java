package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ta6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ wa6 c;

    public /* synthetic */ ta6(Function1 function1, wa6 wa6Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = wa6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        wa6 wa6Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new cw7(wa6Var.l.a, false));
                break;
            case 1:
                function1.invoke(new yv7(wa6Var));
                break;
            default:
                function1.invoke(new cw7(wa6Var.l.a, true));
                break;
        }
        return Unit.a;
    }
}
