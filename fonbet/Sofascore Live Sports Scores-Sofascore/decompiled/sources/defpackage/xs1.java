package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xs1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ bt1 c;

    public /* synthetic */ xs1(Function1 function1, bt1 bt1Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = bt1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        bt1 bt1Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new gw7(Integer.valueOf(bt1Var.n.a), bt1Var.m.a, 24, Integer.valueOf(bt1Var.l.a)));
                break;
            case 1:
                function1.invoke(new yv7(bt1Var));
                break;
            default:
                function1.invoke(new gw7(Integer.valueOf(bt1Var.n.a), bt1Var.m.a, 8, Integer.valueOf(bt1Var.l.a)));
                break;
        }
        return Unit.a;
    }
}
