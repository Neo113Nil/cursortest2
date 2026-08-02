package lm0;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.U;

/* loaded from: classes8.dex */
public final class f<T> implements e<T>, jm0.i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n<T> f73393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f73394b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Function0<Unit>> f73395c;

    public f(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73393a = downstream;
        this.f73394b = new AtomicBoolean();
        this.f73395c = new AtomicReference<>(null);
    }

    @Override // lm0.e
    public final void a(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f73394b.compareAndSet(false, true)) {
            Function0<Unit> function0 = this.f73395c.get();
            if (function0 != null) {
                function0.invoke();
            }
            this.f73393a.onError(error);
        }
    }

    @Override // lm0.e
    public final void b(T t2) {
        if (this.f73394b.compareAndSet(false, true)) {
            Function0<Unit> function0 = this.f73395c.get();
            if (function0 != null) {
                function0.invoke();
            }
            this.f73393a.onSuccess(t2);
        }
    }

    @Override // lm0.e
    public final void c(@NotNull U block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.f73394b.get()) {
            block.invoke();
        } else {
            this.f73395c.set(block);
        }
    }

    @Override // jm0.i
    public final void dispose() {
        Function0<Unit> function0;
        if (!this.f73394b.compareAndSet(false, true) || (function0 = this.f73395c.get()) == null) {
            return;
        }
        function0.invoke();
    }
}
