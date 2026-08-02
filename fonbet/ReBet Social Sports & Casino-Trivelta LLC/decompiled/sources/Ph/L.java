package Ph;

import Ph.L;
import Sh.AbstractC1572j;
import Sh.AbstractC1576n;
import Sh.C1571i;
import Sh.C1575m;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class L extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9039a = new a(null);

    public static final class a extends AbstractCoroutineContextKey {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final L b(CoroutineContext.Element element) {
            if (element instanceof L) {
                return (L) element;
            }
            return null;
        }

        public a() {
            super(ContinuationInterceptor.INSTANCE, new Function1() { // from class: Ph.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    L b10;
                    b10 = L.a.b((CoroutineContext.Element) obj);
                    return b10;
                }
            });
        }
    }

    public L() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public static /* synthetic */ L d2(L l10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return l10.c2(i10, str);
    }

    public abstract void Y1(CoroutineContext coroutineContext, Runnable runnable);

    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        AbstractC1572j.c(this, coroutineContext, runnable);
    }

    public boolean a2(CoroutineContext coroutineContext) {
        return true;
    }

    public /* synthetic */ L b2(int i10) {
        return c2(i10, null);
    }

    public L c2(int i10, String str) {
        AbstractC1576n.a(i10);
        return new C1575m(this, i10, str);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final Continuation interceptContinuation(Continuation continuation) {
        return new C1571i(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C1571i) continuation).v();
    }

    public String toString() {
        return U.a(this) + '@' + U.b(this);
    }
}
