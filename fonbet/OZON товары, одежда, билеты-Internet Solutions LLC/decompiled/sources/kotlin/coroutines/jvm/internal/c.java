package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/c;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/coroutines/d;)V", "intercepted", "()Lkotlin/coroutines/d;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c extends a {
    private final CoroutineContext _context;
    private transient kotlin.coroutines.d<Object> intercepted;

    public c(kotlin.coroutines.d<Object> dVar, CoroutineContext coroutineContext) {
        super(dVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.f(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) getContext().get(kotlin.coroutines.e.INSTANCE);
            dVar = eVar != null ? eVar.b0(this) : this;
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kotlin.coroutines.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.e.INSTANCE);
            Intrinsics.f(element);
            ((kotlin.coroutines.e) element).m(dVar);
        }
        this.intercepted = b.f71775a;
    }

    public c(kotlin.coroutines.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
