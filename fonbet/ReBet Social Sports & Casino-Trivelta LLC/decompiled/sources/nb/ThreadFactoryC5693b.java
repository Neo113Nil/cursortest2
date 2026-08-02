package nb;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ThreadFactoryC5693b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f57174e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f57175a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f57176b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57177c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f57178d;

    public ThreadFactoryC5693b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f57176b = str;
        this.f57177c = i10;
        this.f57178d = threadPolicy;
    }

    public static /* synthetic */ void a(ThreadFactoryC5693b threadFactoryC5693b, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC5693b.f57177c);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC5693b.f57178d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f57174e.newThread(new Runnable() { // from class: nb.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC5693b.a(ThreadFactoryC5693b.this, runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f57176b, Long.valueOf(this.f57175a.getAndIncrement())));
        return newThread;
    }
}
