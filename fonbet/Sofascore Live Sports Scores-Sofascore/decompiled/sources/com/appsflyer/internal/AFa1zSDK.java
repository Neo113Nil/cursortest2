package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;
import com.appsflyer.sdk_base.referrer.ReferrerKt;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.share.AFAdRevenueData;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AFInAppEventType;
import com.appsflyer.share.AFPurchaseDetails;
import com.appsflyer.share.AFPushData;
import com.appsflyer.share.AppsFlyerConsent;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.share.EmailsCryptType;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.appsflyer.share.platform_extension.PluginInfo;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1zSDK extends AppsFlyerLib {
    public static final String d = "7.0";
    public static final String registerClient = "384";
    private static AFa1zSDK unregisterClient = new AFa1zSDK();

    @NonNull
    public final AFc1dSDK AFKeystoreWrapper;

    @Nullable
    private AFb1hSDK AFLogger;
    private AFe1aSDK e;
    private Map<Long, String> w;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.appsflyer.internal.AFa1zSDK$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[EmailsCryptType.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFa1zSDK() {
        AFc1dSDK aFc1dSDK = new AFc1dSDK();
        this.AFKeystoreWrapper = aFc1dSDK;
        aFc1dSDK.setAndroidIdData().d();
        aFc1dSDK.setAndroidIdData().AFLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit AFKeystoreWrapper() {
        if (!this.AFKeystoreWrapper.setImeiData().setOaidData) {
            unregisterClient("finishSdkSession");
        } else if (this.AFKeystoreWrapper.setImeiData().setDebugLog) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            aFLogger.i(LogTag.SDK_LIFECYCLE, "Finishing AppsFlyer session");
            this.AFKeystoreWrapper.getOutOfStore().d();
            this.AFKeystoreWrapper.afErrorLog().unregisterClient();
            if (this.AFKeystoreWrapper.getLevel() != null) {
                this.AFKeystoreWrapper.getLevel().sendExceptionsToServerIfNeeded();
            }
            if (this.AFKeystoreWrapper.AFLoggerLogLevel().e()) {
                this.AFKeystoreWrapper.AFLoggerLogLevel().d();
                Context context = this.AFKeystoreWrapper.valueOf().d;
                if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                    this.AFKeystoreWrapper.AFLoggerLogLevel().v_(context.getPackageName(), context.getPackageManager());
                }
                this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper();
            } else {
                aFLogger.d(LogTag.PROXY, "RD status is OFF");
            }
            AFg1aSDK appInviteOneLink = this.AFKeystoreWrapper.setAppInviteOneLink();
            if (appInviteOneLink != null) {
                appInviteOneLink.AFKeystoreWrapper();
            }
            this.AFKeystoreWrapper.setImeiData().setDebugLog = false;
        } else {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK session not started. Skipping session finish.");
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        if (this.AFKeystoreWrapper.setPhoneNumber().d()) {
            this.AFKeystoreWrapper.setPhoneNumber().unregisterClient();
        }
        AFh1fSDK enableTCFDataCollection = this.AFKeystoreWrapper.enableTCFDataCollection();
        enableTCFDataCollection.d = Build.VERSION.SDK_INT >= 31 ? new AFh1cSDK(enableTCFDataCollection.AFLogger) : new AFh1hSDK(enableTCFDataCollection.AFLogger);
        this.AFKeystoreWrapper.values().unregisterClient(this.AFKeystoreWrapper.AFKeystoreWrapper());
        AFg1fSDK force = this.AFKeystoreWrapper.force();
        force.e = System.currentTimeMillis();
        int d2 = force.d.AFKeystoreWrapper.d("appsFlyerCount", 0);
        if (d2 == 1 && force.AFLogger.AFKeystoreWrapper("first_launch")) {
            force.registerClient.putAll(force.AFLogger("first_launch"));
        }
        if (d2 > 0 && force.AFLogger.AFKeystoreWrapper("gcd")) {
            force.AFKeystoreWrapper.putAll(force.AFLogger("gcd"));
        }
        force.afWarnLog = force.AFLogger.AFKeystoreWrapper("prev_session_dur", 0L);
        this.AFKeystoreWrapper.w().registerClient(unregisterClient());
        try {
            final AFi1wSDK debugLog = this.AFKeystoreWrapper.setDebugLog();
            if (debugLog != null) {
                if (debugLog.AFLogger()) {
                    debugLog.unregisterClient(new AFi1uSDK() { // from class: com.appsflyer.internal.b
                        @Override // com.appsflyer.internal.AFi1uSDK
                        public final void onRequestFinished() {
                            AFa1zSDK.this.AFKeystoreWrapper(debugLog);
                        }
                    });
                } else if (!debugLog.AFKeystoreWrapper()) {
                    AFKeystoreWrapper(debugLog);
                }
            }
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.PLAY_INTEGRITY_API;
            aFLogger.e(logTag, "Failed to request Play Integrity API token", th, false, false);
            aFLogger.v(logTag, "Play Integrity API token request exception: ".concat(String.valueOf(th)));
        }
        this.AFKeystoreWrapper.getEntries().d();
    }

    public static String d(AFc1pSDK aFc1pSDK, String str) {
        String d2 = aFc1pSDK.d("CACHED_CHANNEL");
        if (d2 != null) {
            return d2;
        }
        aFc1pSDK.d("CACHED_CHANNEL", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(AFf1zSDK aFf1zSDK) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (aFf1zSDK == AFf1zSDK.SUCCESS && aFc1dSDK.getLevel() != null) {
            aFc1dSDK.getLevel().updateExceptionManagerConfiguration();
        }
        if (aFc1dSDK.AFLoggerLogLevel().AFLogger()) {
            aFc1dSDK.setAndroidIdData().d();
        } else {
            aFc1dSDK.setAndroidIdData().unregisterClient();
        }
    }

    private void unregisterClient(@Nullable AppsFlyerRequestListener appsFlyerRequestListener) {
        if (!this.AFKeystoreWrapper.setImeiData().setOaidData) {
            unregisterClient("start");
            return;
        }
        if (!this.AFKeystoreWrapper.setUserEmails().registerClient()) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "WARNING: SessionReadyListener is not registered! You must call 'registerSessionReadyListener(SessionReadyListener)' before calling 'start()'. The listener ensures that all required data (e.g., deeplink parameters) is available before session initialization.");
            return;
        }
        if (this.AFKeystoreWrapper.setImeiData().setDebugLog) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "AppsFlyer SDK session already started. Skipping duplicate start call.");
            return;
        }
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("start", new String[0]);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SDK_LIFECYCLE;
        Locale locale = Locale.US;
        String str = registerClient;
        aFLogger.i(logTag, "Starting AppsFlyer: (v7.0.0." + str + ")");
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str);
        aFLogger.i(logTag, sb.toString());
        this.AFKeystoreWrapper.stop().AFKeystoreWrapper();
        AFg1aSDK appInviteOneLink = this.AFKeystoreWrapper.setAppInviteOneLink();
        if (appInviteOneLink != null) {
            appInviteOneLink.registerClient();
        }
        this.AFKeystoreWrapper.setImeiData().setDebugLog = true;
        AFLogger(appsFlyerRequestListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = this.AFKeystoreWrapper.onPause().unregisterClient;
        if (list.contains(asList)) {
            return;
        }
        list.add(asList);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("anonymizeUser", String.valueOf(z));
        this.AFKeystoreWrapper.setImeiData().v = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        AFa1mSDK onPause = this.AFKeystoreWrapper.onPause();
        onPause.d = str;
        onPause.registerClient = map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void collectDataFromLauncherActivity(Activity activity) {
        AFi1zSDK sdkVersion = this.AFKeystoreWrapper.getSdkVersion();
        this.AFKeystoreWrapper.setImeiData().setOutOfStore = sdkVersion.AFKeystoreWrapper(activity);
        this.AFKeystoreWrapper.setImeiData().setPhoneNumber = sdkVersion.registerClient(activity);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        this.AFKeystoreWrapper.setImeiData().updateServerUninstallToken = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        this.AFKeystoreWrapper.stop().d(z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        this.AFKeystoreWrapper.setImeiData().w = Boolean.valueOf(z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        if (context == null) {
            return null;
        }
        this.AFKeystoreWrapper.registerClient.d = context.getApplicationContext();
        return AFb1mSDK.unregisterClient(this.AFKeystoreWrapper.AFKeystoreWrapper().AFKeystoreWrapper);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        return this.AFKeystoreWrapper.AFKeystoreWrapper().unregisterClient(context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        return this.AFKeystoreWrapper.AppsFlyerLib().registerClient();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return this.AFKeystoreWrapper.AppsFlyerLib().AFKeystoreWrapper();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String AFLogger;
        String str = this.AFKeystoreWrapper.setImeiData().afInfoLog;
        if (str != null) {
            return str;
        }
        if (context == null) {
            AFLogger = null;
        } else {
            this.AFKeystoreWrapper.registerClient.d = context.getApplicationContext();
            AFLogger = this.AFKeystoreWrapper.AFKeystoreWrapper().AFLogger("AF_STORE");
        }
        if (AFLogger != null) {
            return AFLogger;
        }
        AFLogger.INSTANCE.i(LogTag.GENERAL, "Out-of-store value not configured via API or manifest");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("getSdkVersion", new String[0]);
        return AFc1hSDK.AFLogger();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        if (!this.AFKeystoreWrapper.setImeiData().setOaidData) {
            if (TextUtils.isEmpty(str)) {
                AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the 'init' API method (should be called on Application's onCreate)");
                return this;
            }
            if (context == null) {
                AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK requires a valid Context! Ensure 'init' is called with a non-null Context, typically from Application's onCreate.");
                return this;
            }
            this.AFKeystoreWrapper.values().unregisterClient(str);
            this.AFKeystoreWrapper.registerClient.d = context.getApplicationContext();
            final int i = 1;
            this.AFKeystoreWrapper.setImeiData().setOaidData = true;
            Application T_ = AFi1cSDK.T_(context);
            if (T_ != null) {
                AFa1ySDK.INSTANCE.registerClient(context);
                final int i2 = 0;
                this.AFKeystoreWrapper.unregisterClient().execute(new Runnable(this) { // from class: com.appsflyer.internal.c
                    public final /* synthetic */ AFa1zSDK b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        AFa1zSDK aFa1zSDK = this.b;
                        switch (i3) {
                            case 0:
                                aFa1zSDK.AFLogger();
                                break;
                            default:
                                aFa1zSDK.registerClient();
                                break;
                        }
                    }
                });
                this.AFKeystoreWrapper.afWarnLog().d.add(this.AFKeystoreWrapper.setCustomerUserId());
                AFe1ySDK afWarnLog = this.AFKeystoreWrapper.afWarnLog();
                afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(new AFe1lSDK(this.AFKeystoreWrapper)));
                if (this.AFKeystoreWrapper.getLevel() != null) {
                    this.AFKeystoreWrapper.getLevel().init(new d());
                }
                AFi1lSDK afDebugLog = this.AFKeystoreWrapper.afDebugLog();
                Runnable runnable = new Runnable(this) { // from class: com.appsflyer.internal.c
                    public final /* synthetic */ AFa1zSDK b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        AFa1zSDK aFa1zSDK = this.b;
                        switch (i3) {
                            case 0:
                                aFa1zSDK.AFLogger();
                                break;
                            default:
                                aFa1zSDK.registerClient();
                                break;
                        }
                    }
                };
                if (afDebugLog.registerClient.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0) > 0) {
                    AFLogger.INSTANCE.d(LogTag.REFERRER, "Referrers collection disallowed by counter.");
                } else {
                    AFi1sSDK registerClient2 = afDebugLog.registerClient(runnable);
                    ReferrerProp referrerProp = new ReferrerProp(afDebugLog.registerClient(registerClient2, runnable), afDebugLog.registerClient.afInfoLog(), afDebugLog.registerClient.unregisterClient());
                    afDebugLog.unregisterClient.add(registerClient2);
                    afDebugLog.unregisterClient.add(new AFi1mSDK(referrerProp));
                    afDebugLog.registerClient(referrerProp);
                    afDebugLog.unregisterClient.addAll(afDebugLog.AFKeystoreWrapper.registerClient(referrerProp));
                    Iterator<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> it = Referrer.getExternalReferrers().iterator();
                    while (it.hasNext()) {
                        ReferrerKt.disableInitProvider((Class) it.next().b, afDebugLog.registerClient.valueOf().d, afDebugLog.registerClient.afInfoLog());
                    }
                    for (Referrer referrer : (Referrer[]) afDebugLog.unregisterClient.toArray(new Referrer[0])) {
                        referrer.start(afDebugLog.registerClient.valueOf().d);
                    }
                    String AFLogger = afDebugLog.registerClient.AFKeystoreWrapper().AFLogger("AF_PREINSTALL_DISABLED");
                    if (!(AFLogger != null ? Boolean.parseBoolean(AFLogger) : false)) {
                        afDebugLog.d(afDebugLog.registerClient.valueOf().d, referrerProp, afDebugLog.registerClient);
                    }
                }
                if (this.AFLogger == null) {
                    this.AFLogger = new AFb1hSDK(this.AFKeystoreWrapper, new e(this, i2), unregisterClient(), this.AFKeystoreWrapper.setAppInviteOneLink());
                    this.AFKeystoreWrapper.setOaidData().unregisterClient(context, this.AFLogger);
                }
                Context baseContext = T_.getBaseContext();
                try {
                    ApplicationInfo applicationInfo = this.AFKeystoreWrapper.AFKeystoreWrapper().r_().applicationInfo;
                    if (applicationInfo != null && (applicationInfo.flags & 32768) != 0) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            if (baseContext.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", baseContext.getPackageName()) != 0) {
                                AFLogger.INSTANCE.i(LogTag.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data");
                            } else {
                                AFLogger.INSTANCE.w(LogTag.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>");
                            }
                        } else if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                            AFLogger.INSTANCE.i(LogTag.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data");
                        } else {
                            AFLogger.INSTANCE.w(LogTag.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>");
                        }
                    }
                } catch (Throwable th) {
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "Exception while checking BackupRules: ", th);
                }
                this.AFKeystoreWrapper.AFLogger().loadProperties();
                this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GENERAL;
                Locale locale = Locale.US;
                aFLogger.force(logTag, "Initializing AppsFlyer SDK: (v7.0.0." + registerClient + ")");
                this.AFKeystoreWrapper.AFLogger(appsFlyerConversionListener);
                return this;
            }
        }
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        return this.AFKeystoreWrapper.AFKeystoreWrapper().registerClient(context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isSessionReady() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("isSessionReady", new String[0]);
        return this.AFKeystoreWrapper.setUserEmails().d();
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return this.AFKeystoreWrapper.values().AFLogger();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        if (!this.AFKeystoreWrapper.setImeiData().setOaidData) {
            unregisterClient("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger.INSTANCE.w(LogTag.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (this.AFKeystoreWrapper.values().AFLogger()) {
            AFLogger.INSTANCE.w(LogTag.AD_REVENUE, "SDK is stopped");
            return;
        }
        AFf1oSDK values = this.AFKeystoreWrapper.values();
        String str = (String) AFf1oSDK.AFLogger(new Object[]{values}, 343398987, -343398985, System.identityHashCode(values));
        if (str == null || str.length() == 0) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the 'init' API method (should be called on Application's onCreate)");
        } else {
            this.AFKeystoreWrapper.v().AFLogger(new AFh1uSDK(aFAdRevenueData, map));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        AFh1wSDK aFh1wSDK = new AFh1wSDK();
        aFh1wSDK.v = str;
        aFh1wSDK.unregisterClient = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(LogTag.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1wSDK.AFLogger(singletonMap);
        }
        aFh1wSDK.d = hashMap;
        AFd1ySDK AFLoggerLogLevel = this.AFKeystoreWrapper.AFLoggerLogLevel();
        Map map2 = aFh1wSDK.d;
        if (map2 == null) {
            map2 = new HashMap();
        }
        AFLoggerLogLevel.AFKeystoreWrapper("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            AFg1hSDK aFg1hSDK = AFg1hSDK.logEvent;
            AFc1dSDK aFc1dSDK2 = this.AFKeystoreWrapper;
            if (context != null) {
                aFc1dSDK2.registerClient.d = context.getApplicationContext();
            }
            AFg1fSDK force = this.AFKeystoreWrapper.force();
            force.d(aFg1hSDK);
            force.unregisterClient();
        }
        this.AFKeystoreWrapper.v().AFLogger(aFh1wSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d3));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        AFh1wSDK aFh1wSDK = new AFh1wSDK();
        aFh1wSDK.v = AFInAppEventType.LOCATION_COORDINATES;
        aFh1wSDK.d = hashMap;
        this.AFKeystoreWrapper.v().AFLogger(aFh1wSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("logSession", new String[0]);
        this.AFKeystoreWrapper.AFLoggerLogLevel().unregisterClient();
        AFg1hSDK aFg1hSDK = AFg1hSDK.logSession;
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        AFg1fSDK force = this.AFKeystoreWrapper.force();
        force.d(aFg1hSDK);
        force.unregisterClient();
        AFh1wSDK aFh1wSDK = new AFh1wSDK();
        aFh1wSDK.v = null;
        aFh1wSDK.d = null;
        this.AFKeystoreWrapper.v().AFLogger(aFh1wSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        this.AFKeystoreWrapper.setOaidData().unregisterClient();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performDeepLinking(@NonNull String str, boolean z) {
        AFa1hSDK AFLogger;
        if (str == null || str.length() == 0) {
            this.AFKeystoreWrapper.onPause().registerClient("performDeepLinking was called with null or empty url", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (!this.AFKeystoreWrapper.setImeiData().setOaidData) {
            unregisterClient("performDeepLinking");
            return;
        }
        if (z) {
            this.AFKeystoreWrapper.getOutOfStore().d();
            AFLogger = AFa1hSDK.unregisterClient(this.AFKeystoreWrapper.getOutOfStore());
        } else {
            AFLogger = AFa1hSDK.AFLogger(new HashMap());
        }
        this.AFKeystoreWrapper.onPause().c_(AFLogger, Uri.parse(str));
        if (z) {
            this.AFKeystoreWrapper.v().AFLogger(new AFh1qSDK().AFKeystoreWrapper());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(@NonNull AppsFlyerConversionListener appsFlyerConversionListener) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("registerConversionListener", new String[0]);
        this.AFKeystoreWrapper.AFLogger(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerSessionReadyListener(@NonNull SessionReadyListener sessionReadyListener) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("registerSessionReadyListener", "listener");
        this.AFKeystoreWrapper.setUserEmails().d(sessionReadyListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        PurchaseHandler e = this.AFKeystoreWrapper.e();
        if (e.d(map, purchaseValidationCallback, "purchases")) {
            AFe1iSDK aFe1iSDK = new AFe1iSDK(map, purchaseValidationCallback, e.d);
            AFe1ySDK aFe1ySDK = e.AFLogger;
            aFe1ySDK.unregisterClient.execute(aFe1ySDK.new AnonymousClass1(aFe1iSDK));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        PurchaseHandler e = this.AFKeystoreWrapper.e();
        if (e.d(map, purchaseValidationCallback, BillingClient.FeatureType.SUBSCRIPTIONS)) {
            AFe1sSDK aFe1sSDK = new AFe1sSDK(map, purchaseValidationCallback, e.d);
            AFe1ySDK aFe1ySDK = e.AFLogger;
            aFe1ySDK.unregisterClient.execute(aFe1ySDK.new AnonymousClass1(aFe1sSDK));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x015f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(@Nullable Activity activity) {
        long j;
        long j2;
        if (activity == null || activity.getIntent() == null) {
            AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
            if (activity != null) {
                aFc1dSDK.AFLoggerLogLevel().AFKeystoreWrapper("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            } else {
                aFc1dSDK.AFLoggerLogLevel().AFKeystoreWrapper("sendPushNotificationData", "activity_null");
            }
        } else {
            AFd1ySDK AFLoggerLogLevel = this.AFKeystoreWrapper.AFLoggerLogLevel();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            AFLoggerLogLevel.AFKeystoreWrapper("sendPushNotificationData", localClassName, sb.toString());
        }
        AFc1gSDK imeiData = this.AFKeystoreWrapper.setImeiData();
        String unregisterClient2 = unregisterClient(activity);
        imeiData.unregisterClient = unregisterClient2;
        if (unregisterClient2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.w == null) {
                AFLogger.INSTANCE.i(LogTag.ENGAGEMENT, "Initializing push notification history cache");
                this.w = new ConcurrentHashMap();
                j2 = currentTimeMillis;
                j = j2;
            } else {
                try {
                    long registerClient2 = this.AFKeystoreWrapper.AFKeystoreWrapper().registerClient("AF_PUSH_PAYLOAD_MAX_AGING_MILLIS", 1800000L);
                    j2 = currentTimeMillis;
                    for (Long l : this.w.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(imeiData.unregisterClient);
                            JSONObject jSONObject2 = new JSONObject(this.w.get(l));
                            j = currentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt(com.mbridge.msdk.foundation.controller.a.q).equals(jSONObject2.opt(com.mbridge.msdk.foundation.controller.a.q))) {
                                    AFLogger aFLogger = AFLogger.INSTANCE;
                                    LogTag logTag = LogTag.ENGAGEMENT;
                                    StringBuilder sb2 = new StringBuilder("Push notification already processed: duplicate PID and campaign detected (old: ");
                                    sb2.append(jSONObject2);
                                    sb2.append(", new: ");
                                    sb2.append(jSONObject);
                                    sb2.append(")");
                                    aFLogger.i(logTag, sb2.toString());
                                    imeiData.unregisterClient = null;
                                    return;
                                }
                                if (j - l.longValue() > registerClient2) {
                                    this.w.remove(l);
                                }
                                if (l.longValue() <= j2) {
                                    j2 = l.longValue();
                                }
                                currentTimeMillis = j;
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.INSTANCE.e(LogTag.ENGAGEMENT, "Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                if (this.w.size() == this.AFKeystoreWrapper.AFKeystoreWrapper().registerClient("AF_PUSH_PAYLOAD_HISTORY_SIZE", 2L)) {
                                }
                                this.w.put(Long.valueOf(j), imeiData.unregisterClient);
                                start();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j = currentTimeMillis;
                        }
                    }
                    j = currentTimeMillis;
                } catch (Throwable th3) {
                    th = th3;
                    j = currentTimeMillis;
                    j2 = j;
                }
            }
            if (this.w.size() == this.AFKeystoreWrapper.AFKeystoreWrapper().registerClient("AF_PUSH_PAYLOAD_HISTORY_SIZE", 2L)) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.ENGAGEMENT;
                StringBuilder sb3 = new StringBuilder("Push history limit reached, removing oldest entry (timestamp: ");
                sb3.append(j2);
                sb3.append(")");
                aFLogger2.i(logTag2, sb3.toString());
                this.w.remove(Long.valueOf(j2));
            }
            this.w.put(Long.valueOf(j), imeiData.unregisterClient);
            start();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        if (map != null) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setAdditionalData", map.toString());
            JSONObject jSONObject = new JSONObject(map);
            this.AFKeystoreWrapper.setImeiData().values = jSONObject.toString();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setAndroidIdData", str);
        this.AFKeystoreWrapper.setImeiData().AFLogger = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setAppId", str);
        this.AFKeystoreWrapper.setImeiData().afErrorLog = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setAppInviteOneLink", str);
        AFLogger.INSTANCE.i(LogTag.SDK_SETTERS, "setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(this.AFKeystoreWrapper.setImeiData().AFLoggerLogLevel)) {
            AppsFlyerProperties AFLogger = this.AFKeystoreWrapper.AFLogger();
            AFLogger.remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AFLogger.remove(AppsFlyerProperties.ONELINK_VERSION);
            AFLogger.remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        this.AFKeystoreWrapper.setImeiData().AFLoggerLogLevel = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z));
        this.AFKeystoreWrapper.setImeiData().e = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        Objects.requireNonNull(appsFlyerConsent);
        this.AFKeystoreWrapper.setImeiData().onPause = appsFlyerConsent;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setCurrencyCode", str);
        this.AFKeystoreWrapper.setImeiData().getLevel = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setCustomerUserId = ".concat(String.valueOf(str)));
        this.AFKeystoreWrapper.setImeiData().afDebugLog = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDeepLinkTimeout(long j) {
        if (j <= 0) {
            AFLogger.INSTANCE.d(LogTag.DDL, "Invalid timeout value. Using default value of 3000 milliseconds");
            j = Ua.C;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        StringBuilder sb = new StringBuilder("Setting DeepLink timeout to  ");
        sb.append(j);
        sb.append(" milliseconds");
        aFLogger.d(logTag, sb.toString());
        this.AFKeystoreWrapper.onPause().AFKeystoreWrapper = j;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        AFLogger.INSTANCE.d(LogTag.SDK_SETTERS, "setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        AFb1jSDK.registerClient = Boolean.valueOf(!z);
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        aFc1dSDK.setImeiData().setAndroidIdData = z;
        if (z) {
            aFc1dSDK.setImeiData().getInstance = null;
            return;
        }
        AFe1ySDK afWarnLog = aFc1dSDK.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(new AFe1lSDK(this.AFKeystoreWrapper)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        AFLogger.INSTANCE.d(LogTag.SDK_SETTERS, "setDisableNetworkData: ".concat(String.valueOf(z)));
        this.AFKeystoreWrapper.setImeiData().i = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        if (str2 == null || str2.trim().length() == 0) {
            AFLogger.INSTANCE.w(LogTag.HTTP_CLIENT, "setHost call ignored: hostname parameter is empty or null");
        } else {
            AFd1hSDK.AFKeystoreWrapper(new AFd1gSDK(str != null ? str.trim() : "", str2.trim()));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setImeiData", str);
        this.AFKeystoreWrapper.setImeiData().force = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setInstallId", new String[0]);
        if (!this.AFKeystoreWrapper.setImeiData().setOaidData) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        String AFLogger = this.AFKeystoreWrapper.AFKeystoreWrapper().AFLogger("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID");
        if (!(AFLogger != null ? Boolean.parseBoolean(AFLogger) : false)) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
        } else if (str == null) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "AppsFlyer installId can't be null");
        } else {
            AFb1mSDK.unregisterClient(str, this.AFKeystoreWrapper.registerClient());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setIsUpdate", String.valueOf(z));
        this.AFKeystoreWrapper.setImeiData().afWarnLog = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("log", String.valueOf(z));
        this.AFKeystoreWrapper.setImeiData().getEntries = logLevel;
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (z) {
            aFc1dSDK.setAndroidIdData().e();
        } else {
            aFc1dSDK.setAndroidIdData().AFLogger();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        this.AFKeystoreWrapper.setImeiData().getSdkVersion = TimeUnit.SECONDS.toMillis(i);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setOaidData", str);
        AFb1jSDK.d = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        Locale locale = Locale.US;
        aFLogger.d(logTag, "setOneLinkCustomDomain " + Arrays.toString(strArr));
        this.AFKeystoreWrapper.onPause().force = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.INSTANCE.w(LogTag.GENERAL, "Cannot set setOutOfStore with null");
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        this.AFKeystoreWrapper.setImeiData().afInfoLog = lowerCase;
        AFLogger.INSTANCE.i(LogTag.SDK_SETTERS, "Store API set with value: ".concat(String.valueOf(lowerCase)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        AFc1gSDK imeiData = this.AFKeystoreWrapper.setImeiData();
        AFb1vSDK aFb1vSDK = imeiData.AFKeystoreWrapper;
        if (aFb1vSDK == null) {
            aFb1vSDK = new AFb1vSDK();
            imeiData.AFKeystoreWrapper = aFb1vSDK;
        }
        if (str == null || str.isEmpty()) {
            AFLogger.INSTANCE.w(LogTag.PUBLIC_API, "Partner ID is missing or null");
            return;
        }
        if (map == null || map.isEmpty()) {
            AFLogger.INSTANCE.w(LogTag.PUBLIC_API, aFb1vSDK.d.remove(str) == null ? "Partner data is missing or null" : "Cleared partner data for ".concat(str));
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.PUBLIC_API;
        StringBuilder sb = new StringBuilder("Setting partner data for ");
        sb.append(str);
        sb.append(": ");
        sb.append(map);
        aFLogger.d(logTag, sb.toString());
        int length = new JSONObject(map).toString().length();
        if (length <= 1000) {
            aFb1vSDK.d.put(str, map);
            aFb1vSDK.AFKeystoreWrapper.remove(str);
        } else {
            aFLogger.w(logTag, "Partner data 1000 characters limit exceeded");
            HashMap hashMap = new HashMap();
            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
            aFb1vSDK.AFKeystoreWrapper.put(str, hashMap);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        this.AFKeystoreWrapper.setImeiData().d = AFj1xSDK.AFLogger(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        Objects.requireNonNull(pluginInfo);
        this.AFKeystoreWrapper.getInstance().unregisterClient(pluginInfo);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.PREINSTALL;
        aFLogger.d(logTag, "setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                aFLogger = AFLogger.INSTANCE;
                logTag = LogTag.PREINSTALL;
                aFLogger.e(logTag, e.getMessage() != null ? e.getMessage() : "Failed to serialize preinstall attribution parameters", e);
            }
        }
        if (str2 != null) {
            jSONObject.put(com.mbridge.msdk.foundation.controller.a.q, str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            this.AFKeystoreWrapper.AFLogger().set("preInstallName", jSONObject.toString());
        } else {
            aFLogger.w(logTag, "Preinstall attribution rejected: media source parameter is required");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        Locale locale = Locale.US;
        aFLogger.d(logTag, "setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFa1mSDK onPause = this.AFKeystoreWrapper.onPause();
        onPause.v.clear();
        onPause.v.addAll(Arrays.asList(strArr));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.AFKeystoreWrapper.setImeiData().registerClient = new AFb1qSDK(strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        this.AFKeystoreWrapper.setImeiData();
        emailsCryptType.getValue();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            if (AnonymousClass4.AFKeystoreWrapper[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1xSDK.AFLogger(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        this.AFKeystoreWrapper.setImeiData().valueOf = new JSONObject(hashMap).toString();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start() {
        unregisterClient((AppsFlyerRequestListener) null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        AFc1dSDK aFc1dSDK2 = this.AFKeystoreWrapper;
        aFc1dSDK2.values().unregisterClient(z);
        aFc1dSDK2.unregisterClient().submit(new h(aFc1dSDK2, 1));
        if (z) {
            aFc1dSDK2.registerClient().unregisterClient("is_stop_tracking_used", true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        this.AFKeystoreWrapper.onPause().AFLogger = deepLinkListener;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        this.AFKeystoreWrapper.AFLogger(null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterSessionReadyListener() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("unregisterSessionReadyListener", new String[0]);
        this.AFKeystoreWrapper.setUserEmails().d(null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        AFf1fSDK aFf1fSDK = new AFf1fSDK();
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(LogTag.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(LogTag.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFf1eSDK AFLogger = aFf1fSDK.AFLogger();
        if (AFLogger == null || !str.equals(AFLogger.unregisterClient)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = AFLogger == null || currentTimeMillis - AFLogger.registerClient > 2000;
            AFf1eSDK aFf1eSDK = new AFf1eSDK(str, currentTimeMillis, !z);
            aFf1fSDK.AFKeystoreWrapper.d("afUninstallToken", aFf1eSDK.unregisterClient);
            aFf1fSDK.AFKeystoreWrapper.AFLogger("afUninstallToken_received_time", aFf1eSDK.registerClient);
            aFf1fSDK.AFKeystoreWrapper.unregisterClient("afUninstallToken_queued", aFf1eSDK.d);
            if (z) {
                AFc1dSDK aFc1dSDK2 = unregisterClient.AFKeystoreWrapper;
                AFf1xSDK aFf1xSDK = new AFf1xSDK(str, aFc1dSDK2);
                AFe1ySDK afWarnLog = aFc1dSDK2.afWarnLog();
                afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFf1xSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1ySDK afWarnLog = this.AFKeystoreWrapper.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(new AFe1kSDK(this.AFKeystoreWrapper, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(AppsFlyerRequestListener appsFlyerRequestListener) {
        unregisterClient(appsFlyerRequestListener);
    }

    public static AFa1zSDK d() {
        return unregisterClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient() {
        this.AFKeystoreWrapper.v().AFLogger(new AFh1vSDK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void registerClient(AFc1aSDK aFc1aSDK) {
        aFc1aSDK.getEntries().registerClient();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("setUserEmails", strArr);
        setUserEmails(EmailsCryptType.NONE, strArr);
    }

    private static String unregisterClient(Activity activity) {
        Intent intent;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    str = extras.getString("af");
                    if (str == null) {
                        return str;
                    }
                    AFLogger.INSTANCE.w(LogTag.ENGAGEMENT, "Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                    return str;
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(LogTag.ENGAGEMENT, th.getMessage(), th);
            }
        }
        return str;
    }

    private static void unregisterClient(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("WARNING: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(logTag, sb.toString());
    }

    private synchronized AFe1aSDK unregisterClient() {
        AFe1aSDK aFe1aSDK;
        aFe1aSDK = this.e;
        if (aFe1aSDK == null) {
            aFe1aSDK = new f(this);
            this.e = aFe1aSDK;
        }
        return aFe1aSDK;
    }

    private /* synthetic */ void unregisterClient(boolean z) {
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        if (z) {
            aFc1dSDK.setAndroidIdData().registerClient();
        } else {
            aFc1dSDK.setAndroidIdData().AFKeystoreWrapper();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        logEvent(context, str, map, null);
    }

    private void AFLogger(@Nullable AppsFlyerRequestListener appsFlyerRequestListener) {
        AFh1qSDK aFh1qSDK = new AFh1qSDK();
        AFc1gSDK imeiData = this.AFKeystoreWrapper.setImeiData();
        aFh1qSDK.i = imeiData.setOutOfStore;
        aFh1qSDK.afDebugLog = imeiData.setPhoneNumber;
        aFh1qSDK.unregisterClient = appsFlyerRequestListener;
        this.AFKeystoreWrapper.v().AFLogger(aFh1qSDK);
        imeiData.setOutOfStore = null;
        imeiData.setPhoneNumber = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public void AFKeystoreWrapper(AFi1wSDK aFi1wSDK) {
        AFc1hSDK AFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper();
        AFc1dSDK aFc1dSDK = this.AFKeystoreWrapper;
        AFe1gSDK aFe1gSDK = new AFe1gSDK(aFi1wSDK, AFKeystoreWrapper, aFc1dSDK, aFc1dSDK.i(), this.AFKeystoreWrapper.valueOf());
        AFe1ySDK afWarnLog = this.AFKeystoreWrapper.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFe1gSDK));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@NonNull AFPushData aFPushData) {
        if (this.AFKeystoreWrapper.setImeiData().setOaidData) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper("sendPushNotificationData", "push_data:".concat(String.valueOf(aFPushData)));
            AFLogger.INSTANCE.i(LogTag.ATTRIBUTION, "Received campaign details from push");
            this.AFKeystoreWrapper.getOutOfStore().d();
            this.AFKeystoreWrapper.setImeiData().unregisterClient = aFPushData.toJson().toString();
            this.AFKeystoreWrapper.v().AFLogger(new AFh1qSDK().AFKeystoreWrapper());
            return;
        }
        unregisterClient("sendPushNotificationData");
    }
}
