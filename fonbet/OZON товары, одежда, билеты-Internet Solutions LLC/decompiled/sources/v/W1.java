package v;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f101114a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f101115b;

    public W1(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f101114a = executor;
        this.f101115b = new AtomicInteger(0);
    }

    public static void a(W1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int decrementAndGet = this$0.f101115b.decrementAndGet();
        if (decrementAndGet >= 0) {
            C.S.a("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
        } else {
            C.S.k("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
        }
    }

    public static void b(W1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C.S.a("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.f101115b.incrementAndGet());
    }

    public final void c() {
        this.f101114a.execute(new Runnable() { // from class: v.V1
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(W1.this);
            }
        });
    }

    public final int d() {
        return this.f101115b.get();
    }

    public final void e() {
        this.f101114a.execute(new I.j(this, 3));
    }

    public final void f() {
        this.f101115b.set(0);
        C.S.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
