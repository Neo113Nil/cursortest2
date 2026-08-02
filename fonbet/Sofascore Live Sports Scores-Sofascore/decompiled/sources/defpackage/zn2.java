package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zn2 extends un2 {
    public final ct8 e;

    public zn2(ct8 ct8Var, z88 z88Var, CoroutineContext coroutineContext, int i, a62 a62Var) {
        super(i, a62Var, z88Var, coroutineContext);
        this.e = ct8Var;
    }

    @Override // defpackage.rn2
    public final rn2 h(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return new zn2(this.e, this.d, coroutineContext, i, a62Var);
    }

    @Override // defpackage.un2
    public final Object k(b98 b98Var, rq3 rq3Var) {
        Object r = s9a.r(new wn2(this, b98Var, null), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }
}
