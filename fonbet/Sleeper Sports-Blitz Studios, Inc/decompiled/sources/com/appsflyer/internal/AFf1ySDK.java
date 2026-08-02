package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes6.dex */
public final class AFf1ySDK extends TimerTask {
    private final Thread AFAdRevenueData;

    public AFf1ySDK(Thread thread) {
        this.AFAdRevenueData = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFAdRevenueData.interrupt();
    }
}
