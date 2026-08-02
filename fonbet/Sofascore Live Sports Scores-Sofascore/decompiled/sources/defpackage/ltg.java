package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ltg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ otg c;

    public /* synthetic */ ltg(Function1 function1, otg otgVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = otgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        otg otgVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new aw7(otgVar.k.a, 30));
                break;
            case 1:
                function1.invoke(new yv7(otgVar));
                break;
            default:
                function1.invoke(new aw7(otgVar.k.a, 26));
                break;
        }
        return Unit.a;
    }
}
