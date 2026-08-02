package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xq2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ uv3 c;

    public /* synthetic */ xq2(Function1 function1, uv3 uv3Var, int i) {
        this.a = i;
        this.b = function1;
        this.c = uv3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        uv3 uv3Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(uv3Var.b);
                break;
            default:
                function1.invoke(uv3Var);
                break;
        }
        return Unit.a;
    }
}
