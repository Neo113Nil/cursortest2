package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n4h implements b98 {
    public final l4h a;

    public n4h(k8f k8fVar) {
        this.a = k8fVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        Object q = this.a.q(rq3Var, obj);
        return q == lu3.a ? q : Unit.a;
    }
}
