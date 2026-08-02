package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l2e implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn2 b;

    public /* synthetic */ l2e(zn2 zn2Var, int i) {
        this.a = i;
        this.b = zn2Var;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        zn2 zn2Var = this.b;
        switch (i) {
            case 0:
                Object collect = zn2Var.collect(new k2e(b98Var, 0), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect2 = zn2Var.collect(new k2e(b98Var, 8), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
