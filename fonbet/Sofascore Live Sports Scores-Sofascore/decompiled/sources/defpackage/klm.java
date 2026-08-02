package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class klm implements z88 {
    public final /* synthetic */ z88 a;
    public final /* synthetic */ lom b;

    public klm(z88 z88Var, lom lomVar) {
        this.a = z88Var;
        this.b = lomVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new mjm(b98Var, this.b), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
