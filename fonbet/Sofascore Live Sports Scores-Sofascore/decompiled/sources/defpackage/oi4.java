package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class oi4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ long c;

    public /* synthetic */ oi4(int i, long j, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        long j = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Long.valueOf(j));
                break;
            default:
                function1.invoke(Long.valueOf(j));
                break;
        }
        return Unit.a;
    }
}
