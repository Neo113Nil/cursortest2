package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class un2 extends rn2 {
    public final z88 d;

    public un2(int i, a62 a62Var, z88 z88Var, CoroutineContext coroutineContext) {
        super(coroutineContext, i, a62Var);
        this.d = z88Var;
    }

    @Override // defpackage.rn2, defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        if (this.b == -3) {
            CoroutineContext context = rq3Var.getContext();
            Boolean bool = Boolean.FALSE;
            xt3 xt3Var = new xt3(1);
            CoroutineContext coroutineContext = this.a;
            CoroutineContext plus = !((Boolean) coroutineContext.fold(bool, xt3Var)).booleanValue() ? context.plus(coroutineContext) : yt3.a(context, coroutineContext, false);
            if (Intrinsics.c(plus, context)) {
                Object k = k(b98Var, rq3Var);
                return k == lu3.a ? k : Unit.a;
            }
            tq3 tq3Var = d.Q7;
            if (Intrinsics.c(plus.get(tq3Var), context.get(tq3Var))) {
                CoroutineContext context2 = rq3Var.getContext();
                if (!(b98Var instanceof n4h) && !(b98Var instanceof med)) {
                    b98Var = new m70(b98Var, context2);
                }
                Object B0 = td4.B0(plus, b98Var, yfj.b(plus), new hy1(this, (rq3) null, 6), rq3Var);
                return B0 == lu3.a ? B0 : Unit.a;
            }
        }
        Object collect = super.collect(b98Var, rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }

    @Override // defpackage.rn2
    public final Object g(k8f k8fVar, rq3 rq3Var) {
        Object k = k(new n4h(k8fVar), rq3Var);
        return k == lu3.a ? k : Unit.a;
    }

    public abstract Object k(b98 b98Var, rq3 rq3Var);

    @Override // defpackage.rn2
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
