package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t8b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ u8b c;

    public /* synthetic */ t8b(u8b u8bVar, Function1 function1) {
        this.a = 2;
        this.c = u8bVar;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        u8b u8bVar = this.c;
        switch (i) {
            case 0:
                function1.invoke(new bw7(u8bVar.l.a));
                break;
            case 1:
                function1.invoke(new yv7(u8bVar));
                break;
            default:
                function1.invoke(new bw7(u8bVar.l.a));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t8b(Function1 function1, u8b u8bVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = u8bVar;
    }
}
