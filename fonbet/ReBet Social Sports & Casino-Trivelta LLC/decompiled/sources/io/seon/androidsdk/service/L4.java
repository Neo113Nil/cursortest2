package io.seon.androidsdk.service;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class L4 {

    /* renamed from: c, reason: collision with root package name */
    public final long f53026c;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f53024a = null;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f53025b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f53027d = new ReentrantLock();

    public L4(long j10) {
        this.f53026c = j10;
    }

    public final Object a(N4 n42) {
        this.f53027d.lock();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (System.currentTimeMillis() - this.f53025b >= this.f53026c || this.f53025b == -1) {
                this.f53024a = n42.a();
                this.f53025b = currentTimeMillis;
            }
        } catch (Throwable unused) {
        }
        this.f53027d.unlock();
        return this.f53024a;
    }
}
