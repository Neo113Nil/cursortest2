package eg;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d2 extends jg.t {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f9165e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d2(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation, coroutineContext.r(r0) == null ? coroutineContext.t(r0) : coroutineContext);
        e2 e2Var = e2.f9169a;
        this.f9165e = new ThreadLocal();
        if (continuation.getContext().r(kotlin.coroutines.d.f19226f0) instanceof w) {
            return;
        }
        Object c2 = jg.y.c(coroutineContext, null);
        jg.y.a(coroutineContext, c2);
        n0(coroutineContext, c2);
    }

    @Override // jg.t
    public final void k0() {
        m0();
    }

    @Override // jg.t, eg.m1
    public final void l(Object obj) {
        m0();
        Object u10 = c0.u(obj);
        Continuation continuation = this.f18525d;
        CoroutineContext context = continuation.getContext();
        Object c2 = jg.y.c(context, null);
        d2 c8 = c2 != jg.y.f18531a ? u.c(continuation, context, c2) : null;
        try {
            continuation.resumeWith(u10);
            Unit unit = Unit.f19194a;
            if (c8 == null || c8.l0()) {
                jg.y.a(context, c2);
            }
        } catch (Throwable th2) {
            if (c8 == null || c8.l0()) {
                jg.y.a(context, c2);
            }
            throw th2;
        }
    }

    public final boolean l0() {
        boolean z5 = this.threadLocalIsSet && this.f9165e.get() == null;
        this.f9165e.remove();
        return !z5;
    }

    public final void m0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f9165e.get();
            if (pair != null) {
                jg.y.a((CoroutineContext) pair.f19192a, pair.f19193b);
            }
            this.f9165e.remove();
        }
    }

    public final void n0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f9165e.set(new Pair(coroutineContext, obj));
    }
}
