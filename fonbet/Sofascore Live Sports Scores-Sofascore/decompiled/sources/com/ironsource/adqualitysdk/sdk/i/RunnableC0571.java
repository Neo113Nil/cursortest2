package com.ironsource.adqualitysdk.sdk.i;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ถ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC0571 implements Runnable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ CountDownLatch f1862;

    public RunnableC0571(CountDownLatch countDownLatch) {
        this.f1862 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1862.countDown();
    }
}
