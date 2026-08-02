package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class pj2 implements nj2 {
    public final wf2 a;

    public pj2(wf2 wf2Var) {
        this.a = wf2Var;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new vj0(b98Var, 2), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
