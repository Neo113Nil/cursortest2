package lm0;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class r<T> implements n<T>, jm0.i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73423a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73424b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f73425c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicReference<jm0.i> f73426d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull Function1<? super Throwable, Unit> onErrorCallback, @NotNull Function1<? super T, Unit> onSuccessCallback) {
        Intrinsics.checkNotNullParameter(onErrorCallback, "onErrorCallback");
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        this.f73423a = (AbstractC7737t) onErrorCallback;
        this.f73424b = (AbstractC7737t) onSuccessCallback;
        this.f73425c = new AtomicBoolean();
        this.f73426d = new AtomicReference<>(null);
    }

    @Override // lm0.n
    public final void a(@NotNull jm0.i d11) {
        jm0.i andSet;
        Intrinsics.checkNotNullParameter(d11, "d");
        AtomicReference<jm0.i> atomicReference = this.f73426d;
        while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
        }
        if (!this.f73425c.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // jm0.i
    public final void dispose() {
        jm0.i andSet;
        if (!this.f73425c.compareAndSet(false, true) || (andSet = this.f73426d.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // lm0.n
    public final void onError(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (this.f73425c.compareAndSet(false, true)) {
            this.f73423a.invoke(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // lm0.n
    public final void onSuccess(T t2) {
        if (this.f73425c.compareAndSet(false, true)) {
            this.f73424b.invoke(t2);
        }
    }
}
