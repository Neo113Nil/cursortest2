package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uw5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p9b c;

    public /* synthetic */ uw5(Function1 function1, p9b p9bVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = p9bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        p9b p9bVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new qw5(p9bVar.a));
                break;
            case 1:
                function1.invoke(new tz5(p9bVar.a));
                break;
            default:
                function1.invoke(new f46(p9bVar.a));
                break;
        }
        return Unit.a;
    }
}
