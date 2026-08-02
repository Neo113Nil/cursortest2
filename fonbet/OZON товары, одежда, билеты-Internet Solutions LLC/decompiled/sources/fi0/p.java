package fi0;

import fi0.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
final class p<T> implements o<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o<T> f63501a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f63502b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull o<T> holder, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(condition, "condition");
        this.f63501a = holder;
        this.f63502b = condition;
    }

    @Override // fi0.o
    public final void a(kotlin.time.b bVar) {
        if (((Boolean) ((w.a) this.f63502b).invoke(bVar)).booleanValue()) {
            ((r) this.f63501a).a(bVar);
        }
    }

    @Override // fi0.q
    public final T getValue() {
        return (T) ((r) this.f63501a).getValue();
    }
}
