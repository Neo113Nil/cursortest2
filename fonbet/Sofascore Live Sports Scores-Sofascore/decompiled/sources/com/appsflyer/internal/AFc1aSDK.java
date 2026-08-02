package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.sdk_base.logger.LoggerDelegate;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFc1aSDK {
    @NonNull
    AFc1hSDK AFKeystoreWrapper();

    @NonNull
    AppsFlyerProperties AFLogger();

    void AFLogger(@Nullable AppsFlyerConversionListener appsFlyerConversionListener);

    @NonNull
    AFd1ySDK AFLoggerLogLevel();

    @NonNull
    AFd1hSDK AppsFlyerLib();

    @NonNull
    AFi1lSDK afDebugLog();

    @NonNull
    AFi1jSDK afErrorLog();

    @NonNull
    LoggerDelegate afInfoLog();

    @NonNull
    AFe1ySDK afWarnLog();

    @NonNull
    AFd1tSDK d();

    @NonNull
    PurchaseHandler e();

    @NonNull
    AFh1fSDK enableTCFDataCollection();

    @NonNull
    AFg1fSDK force();

    @NonNull
    AFc1sSDK getEntries();

    @NonNull
    AFj1mSDK getInstance();

    @Nullable
    ExceptionManager getLevel();

    @NonNull
    AFa1kSDK getOutOfStore();

    @NonNull
    AFi1zSDK getSdkVersion();

    @NonNull
    AFf1bSDK i();

    @NonNull
    AFa1mSDK onPause();

    @NonNull
    AFc1pSDK registerClient();

    @NonNull
    AFg1dSDK setAndroidIdData();

    @Nullable
    AFg1aSDK setAppInviteOneLink();

    @NonNull
    AFe1xSDK setCustomerUserId();

    @Nullable
    AFi1wSDK setDebugLog();

    @NonNull
    AFc1gSDK setImeiData();

    @NonNull
    AFb1gSDK setOaidData();

    @Nullable
    AppsFlyerConversionListener setOutOfStore();

    @NonNull
    AFb1cSDK setPhoneNumber();

    @NonNull
    AFi1hSDK setUserEmails();

    @NonNull
    AFa1aSDK stop();

    @NonNull
    ExecutorService unregisterClient();

    @NonNull
    AFf1qSDK updateServerUninstallToken();

    @NonNull
    AFf1cSDK v();

    @NonNull
    AFc1cSDK valueOf();

    @NonNull
    AFf1oSDK values();

    @NonNull
    AFf1uSDK w();
}
