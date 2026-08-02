package com.vk.push.core.base;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import xsna.gzs;
import xsna.zcl;

/* compiled from: SdkInitAwaiter.kt */
/* loaded from: classes.dex */
public final class SdkInitAwaiter {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TIMEOUT_MS = 5000;
    public final gzs<Boolean> a;
    public final CountDownLatch b = new CountDownLatch(1);

    /* compiled from: SdkInitAwaiter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    public SdkInitAwaiter(String str, gzs<Boolean> gzsVar) {
        this.a = gzsVar;
    }

    public static /* synthetic */ boolean awaitInitialization$default(SdkInitAwaiter sdkInitAwaiter, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5000;
        }
        return sdkInitAwaiter.awaitInitialization(j);
    }

    public final boolean awaitInitialization(long j) {
        CountDownLatch countDownLatch = this.b;
        long count = countDownLatch.getCount();
        gzs<Boolean> gzsVar = this.a;
        if (count == 0) {
            return gzsVar.invoke().booleanValue();
        }
        try {
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                return gzsVar.invoke().booleanValue();
            }
            return false;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return gzsVar.invoke().booleanValue();
        }
    }

    public final void signalInitialized() {
        this.b.countDown();
    }
}
