package h3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.E0;
import xe.M;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6788a implements AutoCloseable, M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f64734a;

    public C6788a(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f64734a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        E0.b(this.f64734a, null);
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f64734a;
    }
}
