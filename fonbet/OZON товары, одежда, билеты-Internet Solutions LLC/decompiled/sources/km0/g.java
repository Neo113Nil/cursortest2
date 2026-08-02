package km0;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jm0.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.g0;

/* loaded from: classes8.dex */
final class g<T> implements d<T>, i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f71683a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f71684b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g0 f71685c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f71686d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicReference<i> f71687e;

    public g(@NotNull Function1 onErrorCallback, @NotNull Function0 onCompleteCallback, @NotNull g0 onNextCallback) {
        Intrinsics.checkNotNullParameter(onErrorCallback, "onErrorCallback");
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(onNextCallback, "onNextCallback");
        this.f71683a = onErrorCallback;
        this.f71684b = onCompleteCallback;
        this.f71685c = onNextCallback;
        this.f71686d = new AtomicBoolean();
        this.f71687e = new AtomicReference<>(null);
    }

    @Override // km0.d
    public final void a(@NotNull i d11) {
        i andSet;
        Intrinsics.checkNotNullParameter(d11, "d");
        AtomicReference<i> atomicReference = this.f71687e;
        while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
        }
        if (!this.f71686d.get() || (andSet = atomicReference.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // jm0.i
    public final void dispose() {
        i andSet;
        if (!this.f71686d.compareAndSet(false, true) || (andSet = this.f71687e.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // km0.d
    public final void onComplete() {
        if (this.f71686d.compareAndSet(false, true)) {
            this.f71684b.invoke();
        }
    }

    @Override // km0.d
    public final void onError(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (this.f71686d.compareAndSet(false, true)) {
            this.f71683a.invoke(e11);
        }
    }

    @Override // km0.d
    public final void onNext(T t2) {
        if (this.f71686d.get()) {
            return;
        }
        this.f71685c.invoke(t2);
    }
}
