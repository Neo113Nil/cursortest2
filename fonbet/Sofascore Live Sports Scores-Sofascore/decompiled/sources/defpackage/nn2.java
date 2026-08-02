package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class nn2 extends rn2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(nn2.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final ln2 d;
    public final boolean e;

    public /* synthetic */ nn2(ln2 ln2Var, boolean z) {
        this(ln2Var, z, g.a, -3, a62.a);
    }

    @Override // defpackage.rn2, defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        if (this.b != -3) {
            Object collect = super.collect(b98Var, rq3Var);
            return collect == lu3.a ? collect : Unit.a;
        }
        boolean z = this.e;
        if (z && f.getAndSet(this, 1) == 1) {
            a70.r("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object y = f5p.y(b98Var, this.d, z, rq3Var);
        return y == lu3.a ? y : Unit.a;
    }

    @Override // defpackage.rn2
    public final String f() {
        return "channel=" + this.d;
    }

    @Override // defpackage.rn2
    public final Object g(k8f k8fVar, rq3 rq3Var) {
        Object y = f5p.y(new n4h(k8fVar), this.d, this.e, rq3Var);
        return y == lu3.a ? y : Unit.a;
    }

    @Override // defpackage.rn2
    public final rn2 h(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return new nn2(this.d, this.e, coroutineContext, i, a62Var);
    }

    @Override // defpackage.rn2
    public final z88 i() {
        return new nn2(this.d, this.e);
    }

    @Override // defpackage.rn2
    public final ln2 j(ku3 ku3Var) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.j(ku3Var);
        }
        a70.r("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public nn2(ln2 ln2Var, boolean z, CoroutineContext coroutineContext, int i, a62 a62Var) {
        super(coroutineContext, i, a62Var);
        this.d = ln2Var;
        this.e = z;
    }
}
