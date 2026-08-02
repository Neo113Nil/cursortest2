package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements ThreadFactory {
    public final String a;
    public final ThreadFactory b;
    public final AtomicInteger c;

    public c(String str) {
        str.getClass();
        this.a = str;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        Thread newThread = this.b.newThread(runnable);
        newThread.setName(this.a + "-th-" + this.c.incrementAndGet());
        return newThread;
    }
}
