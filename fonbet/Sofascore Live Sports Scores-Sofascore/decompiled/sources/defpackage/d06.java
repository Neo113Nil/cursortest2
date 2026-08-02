package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d06 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9b b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ d06(h9b h9bVar, Function1 function1, int i) {
        this.a = i;
        this.b = h9bVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.c;
        h9b h9bVar = this.b;
        switch (i) {
            case 0:
                Integer num = h9bVar.a;
                if (num != null) {
                    function1.invoke(new sz5(num.intValue()));
                }
                break;
            default:
                Integer num2 = h9bVar.a;
                if (num2 != null) {
                    function1.invoke(new e46(num2.intValue()));
                }
                break;
        }
        return Unit.a;
    }
}
