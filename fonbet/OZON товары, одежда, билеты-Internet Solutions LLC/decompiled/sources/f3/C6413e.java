package f3;

import androidx.lifecycle.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6413e<T extends w0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<T> f62499a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<AbstractC6409a, T> f62500b;

    /* JADX WARN: Multi-variable type inference failed */
    public C6413e(@NotNull kotlin.reflect.d<T> clazz, @NotNull Function1<? super AbstractC6409a, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f62499a = clazz;
        this.f62500b = initializer;
    }

    @NotNull
    public final kotlin.reflect.d<T> a() {
        return this.f62499a;
    }

    @NotNull
    public final Function1<AbstractC6409a, T> b() {
        return this.f62500b;
    }
}
