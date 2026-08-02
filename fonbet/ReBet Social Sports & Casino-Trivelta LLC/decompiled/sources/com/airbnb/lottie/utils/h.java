package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f29111d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f29112a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f29113b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f29114c;

    public h() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f29112a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f29114c = "lottie-" + f29111d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f29112a, runnable, this.f29114c + this.f29113b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
