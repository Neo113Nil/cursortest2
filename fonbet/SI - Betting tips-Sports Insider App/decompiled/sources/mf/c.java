package mf;

import eg.l;
import eg.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient Continuation<Object> intercepted;

    public c(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null) {
            return continuation;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().r(kotlin.coroutines.d.f19226f0);
        Continuation<Object> gVar = dVar != null ? new jg.g((w) dVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // mf.a
    public void releaseIntercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element r5 = getContext().r(kotlin.coroutines.d.f19226f0);
            Intrinsics.checkNotNull(r5);
            ((w) ((kotlin.coroutines.d) r5)).getClass();
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            jg.g gVar = (jg.g) continuation;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jg.g.f18497h;
            while (atomicReferenceFieldUpdater.get(gVar) == jg.h.f18503b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            l lVar = obj instanceof l ? (l) obj : null;
            if (lVar != null) {
                lVar.o();
            }
        }
        this.intercepted = b.f20703a;
    }

    public c(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
