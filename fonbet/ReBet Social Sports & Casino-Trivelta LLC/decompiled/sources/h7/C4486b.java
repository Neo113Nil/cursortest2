package h7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4486b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4486b f47823a = new C4486b();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadFactory f47824b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorService f47825c;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: h7.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread c10;
                c10 = C4486b.c(runnable);
                return c10;
            }
        };
        f47824b = threadFactory;
        f47825c = Executors.newCachedThreadPool(threadFactory);
    }

    public static final Thread c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void b(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f47825c.execute(task);
    }
}
