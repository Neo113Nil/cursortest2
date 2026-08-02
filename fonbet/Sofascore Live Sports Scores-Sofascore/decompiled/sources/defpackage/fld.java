package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fld implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ dld c;

    public /* synthetic */ fld(Function1 function1, dld dldVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = dldVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        dld dldVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(dldVar.e);
                break;
            default:
                function1.invoke(dldVar.e);
                break;
        }
        return Unit.a;
    }
}
