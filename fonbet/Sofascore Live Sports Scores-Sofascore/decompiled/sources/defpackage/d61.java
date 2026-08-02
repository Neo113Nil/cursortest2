package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class d61 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ku3 b;
    public final /* synthetic */ pr4 c;

    public /* synthetic */ d61(ku3 ku3Var, pr4 pr4Var, int i) {
        this.a = i;
        this.b = ku3Var;
        this.c = pr4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        rq3 rq3Var = null;
        pr4 pr4Var = this.c;
        ku3 ku3Var = this.b;
        switch (i) {
            case 0:
                xw3.L(ku3Var, null, null, new e61(pr4Var, rq3Var, 0), 3);
                break;
            default:
                xw3.L(ku3Var, null, null, new e61(pr4Var, rq3Var, 1), 3);
                break;
        }
        return Unit.a;
    }
}
