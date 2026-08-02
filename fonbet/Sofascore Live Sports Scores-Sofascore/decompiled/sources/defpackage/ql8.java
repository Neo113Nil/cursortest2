package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ql8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ tl8 c;

    public /* synthetic */ ql8(Function1 function1, tl8 tl8Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = tl8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        tl8 tl8Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new aw7(tl8Var.k.a, 30));
                break;
            case 1:
                function1.invoke(new yv7(tl8Var));
                break;
            default:
                function1.invoke(new aw7(tl8Var.k.a, 26));
                break;
        }
        return Unit.a;
    }
}
