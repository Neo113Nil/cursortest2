package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pr7 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb8 b;
    public final /* synthetic */ rr7 c;

    public /* synthetic */ pr7(nb8 nb8Var, rr7 rr7Var, int i) {
        this.a = i;
        this.b = nb8Var;
        this.c = rr7Var;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        rr7 rr7Var = this.c;
        nb8 nb8Var = this.b;
        switch (i) {
            case 0:
                Object collect = nb8Var.collect(new or7(b98Var, rr7Var, 0), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect2 = nb8Var.collect(new or7(b98Var, rr7Var, 1), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
