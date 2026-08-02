package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class rwe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ c56 c;

    public /* synthetic */ rwe(Function1 function1, c56 c56Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = c56Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        c56 c56Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new gw7(Integer.valueOf(c56Var.n.a), c56Var.m.a, 8, Integer.valueOf(c56Var.l.a)));
                break;
            case 1:
                function1.invoke(new gw7(Integer.valueOf(c56Var.n.a), c56Var.m.a, 24, Integer.valueOf(c56Var.l.a)));
                break;
            default:
                function1.invoke(new yv7(c56Var));
                break;
        }
        return Unit.a;
    }
}
