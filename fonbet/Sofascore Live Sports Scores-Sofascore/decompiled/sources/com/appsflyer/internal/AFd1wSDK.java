package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFd1wSDK {
    final ExecutorService registerClient;
    final AFd1nSDK unregisterClient;

    public AFd1wSDK(AFd1nSDK aFd1nSDK, ExecutorService executorService) {
        this.unregisterClient = aFd1nSDK;
        this.registerClient = executorService;
    }
}
