package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class V0<T, V extends AbstractC8015t> implements U0<T, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73612b;

    /* JADX WARN: Multi-variable type inference failed */
    public V0(@NotNull Function1<? super T, ? extends V> function1, @NotNull Function1<? super V, ? extends T> function12) {
        this.f73611a = (AbstractC7737t) function1;
        this.f73612b = (AbstractC7737t) function12;
    }

    @Override // m0.U0
    @NotNull
    public final Function1<T, V> a() {
        return (Function1<T, V>) this.f73611a;
    }

    @Override // m0.U0
    @NotNull
    public final Function1<V, T> b() {
        return (Function1<V, T>) this.f73612b;
    }
}
