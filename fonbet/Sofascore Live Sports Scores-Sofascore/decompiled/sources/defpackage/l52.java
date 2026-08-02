package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l52 implements wuc {
    public final Function0 a;
    public final p03 b = new p03(3);

    public l52(Function0 function0) {
        this.a = function0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.c(this, fVar);
    }

    @Override // defpackage.wuc
    public final Object p(Function1 function1, rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        k52 k52Var = new k52();
        k52Var.a = lj2Var;
        k52Var.b = function1;
        lj2Var.v(new oi(this.b.f(k52Var, this.a), 2));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
