package zh;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import uh.InterfaceC6579c;

/* renamed from: zh.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC7006n implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f69209a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f69210b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f69211c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69212d;

    public ThreadFactoryC7006n(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadFactory threadFactory = this.f69211c;
        if (this.f69212d) {
            runnable = InterfaceC6579c.current().e(runnable);
        }
        Thread newThread = threadFactory.newThread(runnable);
        try {
            newThread.setDaemon(true);
            newThread.setName(this.f69209a + "-" + this.f69210b.incrementAndGet());
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    public ThreadFactoryC7006n(String str, boolean z10) {
        this.f69210b = new AtomicInteger();
        this.f69211c = Executors.defaultThreadFactory();
        this.f69209a = str;
        this.f69212d = z10;
    }
}
