package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dzh implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb8 b;
    public final /* synthetic */ gzh c;

    public /* synthetic */ dzh(nb8 nb8Var, gzh gzhVar, int i) {
        this.a = i;
        this.b = nb8Var;
        this.c = gzhVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        gzh gzhVar = this.c;
        nb8 nb8Var = this.b;
        switch (i) {
            case 0:
                Object collect = nb8Var.collect(new k2e(b98Var, gzhVar), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect2 = nb8Var.collect(new usf(6, b98Var, gzhVar), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
