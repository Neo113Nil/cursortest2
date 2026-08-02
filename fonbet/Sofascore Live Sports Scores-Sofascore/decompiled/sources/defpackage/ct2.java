package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ct2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ct2(Function1 function1, boolean z, int i) {
        this.a = i;
        this.b = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Boolean.valueOf(!z));
                break;
            case 1:
                function1.invoke(Boolean.valueOf(z));
                break;
            case 2:
                function1.invoke(new ngl(!z));
                break;
            case 3:
                function1.invoke(new ogl(!z));
                break;
            default:
                function1.invoke(new ogl(!z));
                break;
        }
        return Unit.a;
    }
}
