package Q2;

import Ph.AbstractC1481v0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1492c {

    /* renamed from: Q2.c$a */
    public static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f9264a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f9265b;

        public a(boolean z10) {
            this.f9265b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            return new Thread(runnable, (this.f9265b ? "WM.task-" : "androidx.work-") + this.f9264a.incrementAndGet());
        }
    }

    /* renamed from: Q2.c$b */
    public static final class b implements H {
        @Override // Q2.H
        public void a(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            K2.a.c(label);
        }

        @Override // Q2.H
        public void b() {
            K2.a.f();
        }

        @Override // Q2.H
        public void c(String methodName, int i10) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            K2.a.d(methodName, i10);
        }

        @Override // Q2.H
        public void d(String methodName, int i10) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            K2.a.a(methodName, i10);
        }

        @Override // Q2.H
        public boolean isEnabled() {
            return K2.a.h();
        }
    }

    public static final Executor d(CoroutineContext coroutineContext) {
        ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE) : null;
        Ph.L l10 = continuationInterceptor instanceof Ph.L ? (Ph.L) continuationInterceptor : null;
        if (l10 != null) {
            return AbstractC1481v0.a(l10);
        }
        return null;
    }

    public static final Executor e(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static final H f() {
        return new b();
    }
}
