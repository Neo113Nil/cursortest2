package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pk8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ sk8 c;

    public /* synthetic */ pk8(Function1 function1, sk8 sk8Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = sk8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        sk8 sk8Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new gw7(Integer.valueOf(sk8Var.n.a), sk8Var.m.a, 24, Integer.valueOf(sk8Var.k.a)));
                break;
            case 1:
                function1.invoke(new yv7(sk8Var));
                break;
            default:
                function1.invoke(new gw7(Integer.valueOf(sk8Var.n.a), sk8Var.m.a, 8, Integer.valueOf(sk8Var.k.a)));
                break;
        }
        return Unit.a;
    }
}
