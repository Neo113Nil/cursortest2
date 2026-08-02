package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class AFd1uSDK {
    public static final ExecutorService AFAdRevenueData() {
        return new AFd1qSDK(0, 5, 60L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
    }
}
