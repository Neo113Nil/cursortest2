package Db;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Db.a f2660a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Db.a f2661b;

    /* renamed from: Db.b$b, reason: collision with other inner class name */
    public static class C0055b implements Db.a {
        public C0055b() {
        }

        @Override // Db.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0055b c0055b = new C0055b();
        f2660a = c0055b;
        f2661b = c0055b;
    }

    public static Db.a a() {
        return f2661b;
    }
}
