package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.I;

/* loaded from: classes.dex */
public abstract class b<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.a<E> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<CoroutineContext.Element, E> f71759a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext.a<?> f71760b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$a<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public b(@NotNull CoroutineContext.a<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f71759a = safeCast;
        this.f71760b = baseKey instanceof b ? (CoroutineContext.a<B>) ((b) baseKey).f71760b : baseKey;
    }

    public final boolean a(@NotNull CoroutineContext.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f71760b == key;
    }

    public final CoroutineContext.Element b(@NotNull I element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f71759a.invoke(element);
    }
}
