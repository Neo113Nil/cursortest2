package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface AFd1mSDK {
    @NonNull
    ExecutorService AFInAppEventParameterName();

    @NonNull
    AFd1sSDK AFInAppEventType();

    @NonNull
    AFe1wSDK AFKeystoreWrapper();

    @NonNull
    AFg1cSDK AFLogger();

    @NonNull
    AFd1xSDK AFLogger$LogLevel();

    @NonNull
    AFi1ySDK AFVersionDeclaration();

    @NonNull
    AFc1oSDK AppsFlyer2dXConversionCallback();

    @NonNull
    AFi1qSDK afDebugLog();

    @NonNull
    AFc1hSDK afErrorLog();

    @NonNull
    AFd1qSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFe1fSDK afInfoLog();

    @NonNull
    AFg1fSDK afLogForce();

    @NonNull
    AFb1vSDK afRDLog();

    @NonNull
    AFe1gSDK afVerboseLog();

    @NonNull
    AFc1uSDK afWarnLog();

    @NonNull
    AFf1bSDK d();

    @NonNull
    PurchaseHandler e();

    @NonNull
    AFg1xSDK force();

    @NonNull
    AFh1aSDK getLevel();

    @NonNull
    AFb1bSDK i();

    @NonNull
    AFd1iSDK onAppOpenAttributionNative();

    @NonNull
    AFg1vSDK onInstallConversionFailureNative();

    @NonNull
    AFi1dSDK registerClient();

    @NonNull
    AFg1qSDK unregisterClient();

    @NonNull
    AFi1iSDK v();

    @NonNull
    ScheduledExecutorService valueOf();

    @NonNull
    AFd1tSDK values();

    @NonNull
    AFd1kSDK w();
}
