package Ph;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class j1 extends Sh.C {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f9101e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j1(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext, continuation);
        k1 k1Var = k1.f9103a;
        this.f9101e = new ThreadLocal();
        if (continuation.get$context().get(ContinuationInterceptor.INSTANCE) instanceof L) {
            return;
        }
        Object i10 = Sh.N.i(coroutineContext, null);
        Sh.N.f(coroutineContext, i10);
        R0(coroutineContext, i10);
    }

    @Override // Sh.C, Ph.AbstractC1439a
    public void K0(Object obj) {
        Q0();
        Object a10 = E.a(obj, this.f10761d);
        Continuation continuation = this.f10761d;
        CoroutineContext coroutineContext = continuation.get$context();
        Object i10 = Sh.N.i(coroutineContext, null);
        j1 m10 = i10 != Sh.N.f10769a ? J.m(continuation, coroutineContext, i10) : null;
        try {
            this.f10761d.resumeWith(a10);
            Unit unit = Unit.INSTANCE;
            if (m10 == null || m10.P0()) {
                Sh.N.f(coroutineContext, i10);
            }
        } catch (Throwable th2) {
            if (m10 == null || m10.P0()) {
                Sh.N.f(coroutineContext, i10);
            }
            throw th2;
        }
    }

    @Override // Sh.C
    public void O0() {
        Q0();
    }

    public final boolean P0() {
        boolean z10 = this.threadLocalIsSet && this.f9101e.get() == null;
        this.f9101e.remove();
        return !z10;
    }

    public final void Q0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f9101e.get();
            if (pair != null) {
                Sh.N.f((CoroutineContext) pair.component1(), pair.component2());
            }
            this.f9101e.remove();
        }
    }

    public final void R0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f9101e.set(TuplesKt.to(coroutineContext, obj));
    }
}
