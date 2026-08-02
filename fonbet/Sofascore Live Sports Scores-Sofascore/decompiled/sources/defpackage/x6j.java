package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ z6j c;

    public /* synthetic */ x6j(Function1 function1, z6j z6jVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = z6jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        z6j z6jVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new jw7(z6jVar.m.a, false));
                break;
            case 1:
                function1.invoke(new yv7(z6jVar));
                break;
            default:
                function1.invoke(new jw7(z6jVar.m.a, true));
                break;
        }
        return Unit.a;
    }
}
