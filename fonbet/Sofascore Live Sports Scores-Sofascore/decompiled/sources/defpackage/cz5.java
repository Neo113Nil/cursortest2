package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cz5 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf4 b;

    public /* synthetic */ cz5(yf4 yf4Var, int i) {
        this.a = i;
        this.b = yf4Var;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        yf4 yf4Var = this.b;
        switch (i) {
            case 0:
                Object collect = yf4Var.collect(new vj0(b98Var, 11), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = yf4Var.collect(new vj0(b98Var, 23), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect3 = yf4Var.collect(new k2e(b98Var, 7), rq3Var);
                if (collect3 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
