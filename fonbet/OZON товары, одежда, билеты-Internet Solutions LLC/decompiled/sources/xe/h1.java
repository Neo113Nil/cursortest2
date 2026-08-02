package xe;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h1<T> extends De.w<T> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<Pair<CoroutineContext, Object>> f105465e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h1(@NotNull kotlin.coroutines.d dVar, @NotNull CoroutineContext coroutineContext) {
        super(dVar, coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext);
        i1 i1Var = i1.f105467a;
        this.f105465e = new ThreadLocal<>();
        if (dVar.getContext().get(kotlin.coroutines.e.INSTANCE) instanceof I) {
            return;
        }
        Object c11 = De.G.c(coroutineContext, null);
        De.G.a(coroutineContext, c11);
        A0(coroutineContext, c11);
    }

    public final void A0(@NotNull CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f105465e.set(new Pair<>(coroutineContext, obj));
    }

    @Override // De.w, xe.H0
    protected final void t(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.f105465e.get();
            if (pair != null) {
                De.G.a(pair.a(), pair.b());
            }
            this.f105465e.remove();
        }
        Object a11 = C10710B.a(obj);
        kotlin.coroutines.d<T> dVar = this.f6652d;
        CoroutineContext context = dVar.getContext();
        Object c11 = De.G.c(context, null);
        h1<?> d11 = c11 != De.G.f6602a ? G.d(dVar, context, c11) : null;
        try {
            this.f6652d.resumeWith(a11);
            Unit unit = Unit.f71690a;
            if (d11 == null || d11.z0()) {
                De.G.a(context, c11);
            }
        } catch (Throwable th2) {
            if (d11 == null || d11.z0()) {
                De.G.a(context, c11);
            }
            throw th2;
        }
    }

    public final boolean z0() {
        boolean z11 = this.threadLocalIsSet && this.f105465e.get() == null;
        this.f105465e.remove();
        return !z11;
    }
}
