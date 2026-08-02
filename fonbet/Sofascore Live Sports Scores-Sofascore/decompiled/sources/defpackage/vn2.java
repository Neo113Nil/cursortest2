package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vn2 extends un2 {
    public vn2(z88 z88Var, CoroutineContext coroutineContext, int i, a62 a62Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? a62.a : a62Var, z88Var, (i2 & 2) != 0 ? g.a : coroutineContext);
    }

    @Override // defpackage.rn2
    public final rn2 h(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return new vn2(i, a62Var, this.d, coroutineContext);
    }

    @Override // defpackage.rn2
    public final z88 i() {
        return this.d;
    }

    @Override // defpackage.un2
    public final Object k(b98 b98Var, rq3 rq3Var) {
        Object collect = this.d.collect(b98Var, rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
