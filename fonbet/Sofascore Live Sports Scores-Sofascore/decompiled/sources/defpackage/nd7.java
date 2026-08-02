package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nd7 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jof b;

    public /* synthetic */ nd7(jof jofVar, int i) {
        this.a = i;
        this.b = jofVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        jof jofVar = this.b;
        switch (i) {
            case 0:
                Object collect = jofVar.a.collect(new vj0(b98Var, 15), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect2 = jofVar.a.collect(new vj0(b98Var, 21), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
