package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o7a implements wuc {
    public final ku3 a;
    public final l52 b = new l52(new hv7(this, 10));
    public final Object c = new Object();
    public int d = 5;
    public long e;
    public lj2 f;

    public o7a(zij zijVar) {
        this.a = zijVar;
    }

    public final void a() {
        synchronized (this.c) {
            lj2 lj2Var = this.f;
            if (lj2Var != null) {
                lj2Var.a(null);
            }
        }
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
        return this.b.p(function1, rq3Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.d(this, coroutineContext);
    }
}
