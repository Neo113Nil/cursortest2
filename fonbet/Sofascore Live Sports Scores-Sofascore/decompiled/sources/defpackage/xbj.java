package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xbj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku3 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ xbj(ku3 ku3Var, Function1 function1, int i) {
        this.a = i;
        this.b = ku3Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        rq3 rq3Var = null;
        Function1 function1 = this.c;
        ku3 ku3Var = this.b;
        switch (i) {
            case 0:
                xw3.L(ku3Var, null, nu3.d, new e7b(function1, rq3Var, 2), 1);
                break;
            default:
                xw3.L(ku3Var, null, nu3.d, new e7b(function1, rq3Var, 3), 1);
                break;
        }
        return Unit.a;
    }
}
