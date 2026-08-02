package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xzh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ hzh c;

    public /* synthetic */ xzh(Function1 function1, hzh hzhVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = hzhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c.a);
                break;
            default:
                this.b.invoke(this.c.a);
                break;
        }
        return Unit.a;
    }
}
