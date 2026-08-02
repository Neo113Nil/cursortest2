package xe;

import De.C2866i;
import De.C2869l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class I extends kotlin.coroutines.a implements kotlin.coroutines.e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f105397a = new a(kotlin.coroutines.e.INSTANCE, new H());

    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.e, I> {
    }

    public I() {
        super(kotlin.coroutines.e.INSTANCE);
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public final C2866i b0(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return new C2866i(this, cVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> key) {
        E e11;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (kotlin.coroutines.e.INSTANCE == key) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        if (!bVar.a(getKey()) || (e11 = (E) bVar.b(this)) == null) {
            return null;
        }
        return e11;
    }

    @Override // kotlin.coroutines.e
    public final void m(@NotNull kotlin.coroutines.d<?> dVar) {
        Intrinsics.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2866i) dVar).k();
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (bVar.a(getKey()) && bVar.b(this) != null) {
                return kotlin.coroutines.g.f71771a;
            }
        } else if (kotlin.coroutines.e.INSTANCE == key) {
            return kotlin.coroutines.g.f71771a;
        }
        return this;
    }

    public abstract void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable);

    public void r(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        q(coroutineContext, runnable);
    }

    public boolean t(@NotNull CoroutineContext coroutineContext) {
        return !(this instanceof g1);
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + Q.a(this);
    }

    @NotNull
    public I w(int i11) {
        Bl0.c0.b(i11);
        return new C2869l(this, i11);
    }
}
