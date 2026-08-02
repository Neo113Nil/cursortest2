package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aa8 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ z88 c;

    public /* synthetic */ aa8(z88 z88Var, int i, int i2) {
        this.a = i2;
        this.c = z88Var;
        this.b = i;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        int i2 = this.b;
        z88 z88Var = this.c;
        switch (i) {
            case 0:
                Object collect = z88Var.collect(new ca8(new dsf(), i2, b98Var, 0), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect2 = ((aa8) z88Var).collect(new os2(b98Var, i2, 3), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
