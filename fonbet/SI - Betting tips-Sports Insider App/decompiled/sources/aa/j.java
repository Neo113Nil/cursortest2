package aa;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f107a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f108b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final ThreadGroup f109c;

    public j(String str) {
        this.f107a = str;
        SecurityManager securityManager = System.getSecurityManager();
        this.f109c = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    public static ScheduledExecutorService a(String str) {
        return Executors.newSingleThreadScheduledExecutor(new j(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f108b.getAndIncrement();
        String str = this.f107a;
        if (andIncrement > 1) {
            str = str + "-" + andIncrement;
        }
        Thread thread = new Thread(this.f109c, runnable, str, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
