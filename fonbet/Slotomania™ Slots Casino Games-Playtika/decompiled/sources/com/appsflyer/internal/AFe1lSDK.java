package com.appsflyer.internal;

import java.util.TimerTask;

/* loaded from: classes7.dex */
public final class AFe1lSDK extends TimerTask {
    private final Thread getMonetizationNetwork;

    public AFe1lSDK(Thread thread) {
        this.getMonetizationNetwork = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getMonetizationNetwork.interrupt();
    }
}
