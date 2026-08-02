package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.share.AppsFlyerConsent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1gSDK {

    @Nullable
    public AFb1vSDK AFKeystoreWrapper;

    @Nullable
    public String AFLogger;

    @Nullable
    public String AFLoggerLogLevel;

    @Nullable
    public String afDebugLog;

    @Nullable
    public String afErrorLog;

    @Nullable
    public String afInfoLog;
    public boolean afWarnLog;

    @Nullable
    public String d;
    public boolean e;

    @Nullable
    public String force;

    @Nullable
    public AFg1cSDK getInstance;

    @Nullable
    public String getLevel;
    public boolean i;

    @Nullable
    public AppsFlyerConsent onPause;

    @Nullable
    public AFb1qSDK registerClient;
    public boolean setAndroidIdData;

    @Nullable
    public String setCustomerUserId;
    public boolean setDebugLog;

    @Nullable
    public AFc1rSDK setImeiData;
    public boolean setOaidData;

    @Nullable
    public String setOutOfStore;

    @Nullable
    public String setPhoneNumber;

    @Nullable
    public AFd1kSDK stop;

    @Nullable
    public String unregisterClient;
    public boolean updateServerUninstallToken;
    public boolean v;

    @Nullable
    public String valueOf;

    @Nullable
    public String values;

    @Nullable
    public Boolean w;

    @NotNull
    public AFLogger.LogLevel getEntries = AFLogger.LogLevel.NONE;
    public long AppsFlyerLib = -1;
    public long enableTCFDataCollection = -1;
    public long getSdkVersion = 5000;

    public final synchronized void d(@Nullable AFd1kSDK aFd1kSDK) {
        this.stop = aFd1kSDK;
    }
}
