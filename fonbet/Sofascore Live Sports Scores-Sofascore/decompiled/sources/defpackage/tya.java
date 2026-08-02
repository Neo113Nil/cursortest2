package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class tya implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ u2f c;

    public /* synthetic */ tya(Function1 function1, u2f u2fVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = u2fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        u2f u2fVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Integer.valueOf(u2fVar.a));
                break;
            default:
                function1.invoke(Integer.valueOf(u2fVar.a));
                break;
        }
        return Unit.a;
    }
}
