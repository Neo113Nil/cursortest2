package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vx6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ do7 c;

    public /* synthetic */ vx6(Function1 function1, do7 do7Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = do7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        do7 do7Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(do7Var);
                break;
            case 1:
                function1.invoke(do7Var);
                break;
            default:
                function1.invoke(do7Var);
                break;
        }
        return Unit.a;
    }
}
