package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ m6j c;

    public /* synthetic */ j6j(int i, m6j m6jVar, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = m6jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        m6j m6jVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new aw7(m6jVar.l.a, 30));
                break;
            case 1:
                function1.invoke(new yv7(m6jVar));
                break;
            case 2:
                function1.invoke(new aw7(m6jVar.l.a, 30));
                break;
            case 3:
                function1.invoke(new aw7(m6jVar.l.a, 26));
                break;
            default:
                function1.invoke(new aw7(m6jVar.l.a, 26));
                break;
        }
        return Unit.a;
    }
}
