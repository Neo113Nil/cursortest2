package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a<T> {
    private final CountDownLatch a = new CountDownLatch(1);
    private final AtomicReference<T> b = new AtomicReference<>();
    private final AtomicBoolean c = new AtomicBoolean(false);

    public boolean a(T t) {
        if (!this.c.compareAndSet(false, true)) {
            return false;
        }
        this.b.set(t);
        this.a.countDown();
        return true;
    }

    public T a(long j) throws InterruptedException {
        if (this.a.await(j, TimeUnit.MILLISECONDS)) {
            return this.b.get();
        }
        return null;
    }
}
