package com.android.billingclient.api;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4012a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f4013b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f4014c;

    public e0() {
        this.f4012a = 0;
        this.f4013b = Executors.defaultThreadFactory();
        this.f4014c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4012a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f4014c;
                Thread newThread = this.f4013b.newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = this.f4013b.newThread(new e5.o(runnable, 2));
                newThread2.setName((String) this.f4014c);
                return newThread2;
        }
    }

    public e0(String str) {
        this.f4012a = 1;
        this.f4013b = Executors.defaultThreadFactory();
        this.f4014c = str;
    }
}
