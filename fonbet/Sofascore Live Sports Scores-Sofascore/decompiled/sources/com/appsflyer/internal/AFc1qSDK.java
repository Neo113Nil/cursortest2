package com.appsflyer.internal;

import defpackage.joa;
import defpackage.ypa;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1qSDK {

    @NotNull
    private static final joa registerClient = ypa.b(new com.appsflyer.c(3));

    @NotNull
    public static final ScheduledExecutorService AFKeystoreWrapper() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.getClass();
        return newSingleThreadScheduledExecutor;
    }

    @NotNull
    public static final ScheduledExecutorService AFLogger() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        newScheduledThreadPool.getClass();
        return newScheduledThreadPool;
    }

    @NotNull
    public static final ExecutorService d() {
        AFc1jSDK aFc1jSDK = new AFc1jSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1jSDK.allowCoreThreadTimeOut(true);
        return aFc1jSDK;
    }

    @NotNull
    public static final ExecutorService registerClient() {
        Object value = registerClient.getValue();
        value.getClass();
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService unregisterClient() {
        return Executors.newSingleThreadExecutor();
    }
}
