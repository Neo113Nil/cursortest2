package com.appsflyer.internal;

import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1wSDK extends TimerTask {
    private final Thread AFLogger;

    public AFe1wSDK(Thread thread) {
        this.AFLogger = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.AFLogger.interrupt();
    }
}
