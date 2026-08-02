package com.plaid.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* renamed from: com.plaid.internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3640h<T> {

    /* renamed from: a, reason: collision with root package name */
    public volatile T f40635a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Exception f40636b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f40637c = new CountDownLatch(1);

    public static <T> C3640h<T> a(T t10) {
        C3640h<T> c3640h = new C3640h<>();
        synchronized (c3640h.f40637c) {
            try {
                if (c3640h.f40637c.getCount() > 0) {
                    c3640h.f40635a = t10;
                    c3640h.f40637c.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3640h;
    }

    public static <T> C3640h<T> a(Exception exc) {
        C3640h<T> c3640h = new C3640h<>();
        synchronized (c3640h.f40637c) {
            try {
                if (c3640h.f40637c.getCount() > 0) {
                    c3640h.f40636b = exc;
                    c3640h.f40637c.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3640h;
    }

    public final T a() {
        this.f40637c.await();
        if (this.f40636b == null) {
            return this.f40635a;
        }
        throw new ExecutionException(this.f40636b);
    }
}
