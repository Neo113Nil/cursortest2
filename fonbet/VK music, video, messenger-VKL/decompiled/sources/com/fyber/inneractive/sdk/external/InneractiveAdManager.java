package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.config.m0;
import com.fyber.inneractive.sdk.config.p;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.ignite.l;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.o1;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.util.y;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.b1;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.vk.core.preference.Preference;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
import xsna.d4k;

/* loaded from: classes12.dex */
public final class InneractiveAdManager implements r {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";
    public static IAConfigManager.OnConfigurationReadyAndValidListener e;
    public static c f;
    public volatile Context a;
    public String b;
    public boolean c = false;
    public boolean d;

    public enum GdprConsentSource {
        Internal,
        External
    }

    public static void a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (d.a.a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        w wVar = new w(t.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        if (!TextUtils.isEmpty(str)) {
            wVar.a("message", str);
        }
        wVar.a("init_status", fyberInitStatus.name());
        wVar.a((String) null);
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar != null) {
            gVar.a();
        } else {
            IAlog.f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.N.z.a = null;
    }

    public static void clearLgpdConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar != null) {
            gVar.b();
        } else {
            IAlog.f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar != null) {
            gVar.c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar == null) {
            IAlog.f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (o.a == null) {
            IAlog.f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.j = Boolean.TRUE;
        }
    }

    public static void currentAudienceIsAChild() {
        d.a.c = true;
    }

    public static void destroy() {
        l lVar;
        IAlog.a("InneractiveAdManager:destroy called", new Object[0]);
        if (d.a.a == null) {
            IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        d.a.a = null;
        IAConfigManager.removeListener(e);
        e = null;
        IAConfigManager iAConfigManager = IAConfigManager.N;
        iAConfigManager.z.a = null;
        iAConfigManager.h = false;
        try {
            com.fyber.inneractive.sdk.config.cellular.a aVar = iAConfigManager.M;
            if (aVar != null && aVar.a != null) {
                aVar.c.clear();
                aVar.a.a((com.fyber.inneractive.sdk.config.cellular.h) aVar);
                aVar.a.a();
            }
        } catch (Throwable th) {
            IAlog.a("failed to destroy network watchdog", th, new Object[0]);
        }
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.H;
        dVar.d.clear();
        dVar.f = null;
        com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager.D;
        if (!TextUtils.isEmpty(hVar.l) && (lVar = hVar.p) != null) {
            lVar.destroy();
            hVar.p = null;
        }
        l0.a.a();
        b0 b0Var = z.a;
        synchronized (b0Var) {
            if (b0Var.c != null) {
                IAlog.a("%sremoving screen state receiver and destroying singleton", IAlog.a(b0Var));
                try {
                    b0Var.c.unregisterReceiver(b0Var.d);
                } catch (Exception unused) {
                }
                b0Var.c = null;
                b0Var.d = null;
                b0Var.a.clear();
            }
        }
        com.fyber.inneractive.sdk.factories.d.a.a.clear();
        com.fyber.inneractive.sdk.factories.b.a.a.clear();
        com.fyber.inneractive.sdk.factories.h.a.a.clear();
        InneractiveAdSpotManager.destroy();
        n.a.clear();
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.h;
        com.fyber.inneractive.sdk.bidder.f fVar = bVar.d;
        if (fVar != null) {
            try {
                o.a.unregisterReceiver(fVar);
            } catch (Exception unused2) {
            }
        }
        bVar.d = null;
        com.fyber.inneractive.sdk.config.cellular.a aVar2 = IAConfigManager.N.M;
        if (aVar2 != null) {
            try {
                aVar2.c.remove(bVar);
            } catch (Throwable th2) {
                IAlog.a("failed to remove network observer", th2, new Object[0]);
            }
        }
        com.fyber.inneractive.sdk.nativead.b.f.a();
    }

    public static String getAppId() {
        return IAConfigManager.N.c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return d.a.b;
    }

    public static Boolean getGdprConsent() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public static GdprConsentSource getGdprStatusSource() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar != null) {
            return gVar.f;
        }
        IAlog.f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.N.k;
    }

    public static String getUserId() {
        return IAConfigManager.N.C.g;
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.N.j;
    }

    public static String getVersion() {
        return "8.4.5";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static boolean isCurrentUserAChild() {
        return d.a.c;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        d.a.b = str;
    }

    public static void setExtraData(String str, String str2) {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = IAConfigManager.N.H;
        dVar.getClass();
        if (!v.a(str)) {
            IAlog.a("%sCould not set extra data, key can't be null or empty", "UserExtraDataManager");
            return;
        }
        if (!v.a(str2)) {
            dVar.d.remove(str.trim());
            IAlog.a("%sCleared extra data successfully for key: %s", "UserExtraDataManager", str);
        } else {
            String trim = str.trim();
            String trim2 = str2.trim();
            dVar.d.put(trim, trim2);
            IAlog.a("%sSet extra data successfully for key: %s, value: %s", "UserExtraDataManager", trim, trim2);
        }
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar == null) {
            IAlog.f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.a == null) {
            IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.d = str;
            if (!gVar.a("IAGdprConsentData", str)) {
                IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            }
        }
        a("GDPR", str);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.N.z.a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar == null) {
            IAlog.f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.a == null) {
            IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.i = Boolean.valueOf(z);
            if (!gVar.a(z, "IALgpdConsentStatus")) {
                IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
        }
        a("LGPD", String.valueOf(z));
    }

    public static void setLogLevel(int i) {
        IAlog.a = i;
    }

    public static void setMediationName(String str) {
        IAConfigManager.N.l = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.N.n = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        IAConfigManager.N.k = z;
    }

    public static void setUSPrivacyString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar == null) {
            IAlog.f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.a == null) {
            IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.h = str;
            if (!gVar.a("IACCPAConsentData", str)) {
                IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            }
        }
        a("CCPA", str);
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.N.getClass();
    }

    public static void setUserId(String str) {
        if (o.a != null) {
            IAConfigManager.N.C.a(str);
        } else {
            IAConfigManager iAConfigManager = IAConfigManager.N;
            IAlog.f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.N.j = inneractiveUserConfig;
        IAlog.a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.N.q = z;
        IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (s.a() || z) {
            return;
        }
        IAlog.f("************************************************************************************************************************", new Object[0]);
        IAlog.f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.f("***  The traffic will be Secured  ", new Object[0]);
        IAlog.f("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return d.a.a != null;
    }

    public Context getAppContext() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public void onGlobalConfigChanged(com.fyber.inneractive.sdk.config.s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        if (oVar == null || !oVar.a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        com.fyber.inneractive.sdk.util.r.b.post(new b());
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        String str2;
        List<ResolveInfo> queryIntentServices;
        if (context == null || str == null) {
            IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            a(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? HiAnalyticsConstant.HaKey.BI_KEY_APPID : "context").concat(" is null"));
            return;
        }
        String str3 = IAConfigManager.N.c;
        boolean z = (str3 == null || str3.equalsIgnoreCase(str)) ? false : true;
        if (d.a.a != null && !z) {
            IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.c.retainAll(Collections.singleton(IAlog.b));
        int i = k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (String str4 : property.split(StringUtils.COMMA)) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str4).newInstance();
                    fMPLogger.initialize(context);
                    IAlog.c.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
        o.a = (Application) context.getApplicationContext();
        SharedPreferences h = Preference.h(context, 0, "Fyber_Shared_File");
        String string = h.getString("FyberExceptionKey", "empty");
        String string2 = h.getString("FyberDescriptionKey", "empty");
        String string3 = h.getString("FyberNameKey", "empty");
        String string4 = h.getString("FyberVersionKey", getVersion());
        boolean z2 = z;
        IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            IAlog.a("Firing Event 999 for %s", string);
            w wVar = new w(u.IA_UNCAUGHT_EXCEPTION);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(CrashHianalyticsData.EXCEPTION_NAME, string3);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", CrashHianalyticsData.EXCEPTION_NAME, string3);
            }
            try {
                jSONObject.put("description", string2);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "description", string2);
            }
            try {
                jSONObject.put(CrashHianalyticsData.STACK_TRACE, string);
            } catch (Exception unused4) {
                IAlog.f("Got exception adding param to json object: %s, %s", CrashHianalyticsData.STACK_TRACE, string);
            }
            wVar.f.put(jSONObject);
            wVar.a(string4);
            h.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
        if (f == null) {
            f = new c();
        }
        c cVar = f;
        cVar.a = h;
        d4k.a(cVar);
        b0 b0Var = z.a;
        Context applicationContext = context.getApplicationContext();
        b0Var.getClass();
        IAlog.a("%sinit called", IAlog.a(b0Var));
        b0Var.c = applicationContext;
        b0Var.d = new y(b0Var);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b0Var.c.registerReceiver(b0Var.d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(o.a.getPackageName());
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<BroadcastReceiver> asList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new com.fyber.inneractive.sdk.nativead.e());
        for (BroadcastReceiver broadcastReceiver : asList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (Throwable unused5) {
                IAlog.f("%sCould not trigger receiver for %s", IAlog.a(com.fyber.inneractive.sdk.a.class), broadcastReceiver);
            }
        }
        if (com.fyber.inneractive.sdk.factories.d.a.a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (asList.size() == 0) {
            IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        a aVar = new a(context, onFyberMarketplaceInitializedListener);
        e = aVar;
        IAConfigManager.addListener(aVar);
        if (z2) {
            IAConfigManager iAConfigManager = IAConfigManager.N;
            iAConfigManager.c = str;
            HashMap hashMap = iAConfigManager.a;
            if (hashMap != null) {
                hashMap.clear();
            }
            HashMap hashMap2 = iAConfigManager.b;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            iAConfigManager.e = null;
            iAConfigManager.d = "";
            IAConfigManager.a();
        } else {
            Context applicationContext3 = context.getApplicationContext();
            IAConfigManager iAConfigManager2 = IAConfigManager.N;
            if (!iAConfigManager2.h) {
                iAConfigManager2.I.set(Preference.h(o.a, 0, "IAConfigurationPreferences").contains("privacy_api_usage_reported"));
                iAConfigManager2.u = new i(context, applicationContext3);
                s1 s1Var = new s1();
                iAConfigManager2.x = s1Var;
                s1Var.c = applicationContext3.getApplicationContext();
                com.fyber.inneractive.sdk.util.r.a.execute(new o1(s1Var));
                com.fyber.inneractive.sdk.network.l0 l0Var = iAConfigManager2.r;
                if (!l0Var.b) {
                    l0Var.b = true;
                    for (int i2 = 0; i2 < 6; i2++) {
                        l0Var.d.submit(l0Var.e);
                    }
                }
                b1.c.getClass();
                iAConfigManager2.C = new com.fyber.inneractive.sdk.config.g();
                com.fyber.inneractive.sdk.config.s sVar = new com.fyber.inneractive.sdk.config.s(applicationContext3);
                iAConfigManager2.t = sVar;
                iAConfigManager2.v = new com.fyber.inneractive.sdk.config.t(sVar);
                iAConfigManager2.F.a((Application) applicationContext3.getApplicationContext());
                iAConfigManager2.t.c.add(new x(iAConfigManager2));
                com.fyber.inneractive.sdk.config.s sVar2 = iAConfigManager2.t;
                sVar2.getClass();
                IAConfigManager.N.r.a(new v0(new p(sVar2), sVar2.a, sVar2.e));
                iAConfigManager2.y = new com.fyber.inneractive.sdk.config.global.a();
                IAlog.a("Initializing config manager", new Object[0]);
                IAlog.a("Config manager: lib name = %s", X3.d);
                IAlog.a("Config manager: app version = %s", "8.4.5");
                com.fyber.inneractive.sdk.config.w wVar2 = com.fyber.inneractive.sdk.config.u.a;
                if (wVar2.a == null) {
                    wVar2.a = applicationContext3;
                    new Thread(new m0(applicationContext3, wVar2)).start();
                }
                if (!str.matches("[0-9]+")) {
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                    IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                    IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                }
                iAConfigManager2.f = applicationContext3;
                iAConfigManager2.c = str;
                iAConfigManager2.j = new InneractiveUserConfig();
                iAConfigManager2.h = true;
                x0 x0Var = iAConfigManager2.w;
                x0Var.getClass();
                com.fyber.inneractive.sdk.config.e eVar = new com.fyber.inneractive.sdk.config.e(x0Var);
                x0Var.b = eVar;
                eVar.a();
                x0Var.d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                com.fyber.inneractive.sdk.cache.session.e eVar2 = new com.fyber.inneractive.sdk.cache.session.e();
                x0Var.a = eVar2;
                com.fyber.inneractive.sdk.cache.session.c cVar2 = new com.fyber.inneractive.sdk.cache.session.c(eVar2);
                ThreadPoolExecutor threadPoolExecutor = com.fyber.inneractive.sdk.util.r.a;
                threadPoolExecutor.execute(cVar2);
                iAConfigManager2.A = new v0(new com.fyber.inneractive.sdk.config.b0(iAConfigManager2), iAConfigManager2.f, new com.fyber.inneractive.sdk.config.f());
                threadPoolExecutor.execute(new d0(iAConfigManager2));
                try {
                    str2 = Locale.getDefault().getLanguage();
                    try {
                        IAlog.a("Available device language: %s", str2);
                    } catch (Exception unused6) {
                    }
                } catch (Exception unused7) {
                    str2 = null;
                }
                iAConfigManager2.o = str2;
                com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager2.D;
                hVar.a = applicationContext3;
                Intent intent2 = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context2 = hVar.a;
                hVar.l = (context2 == null || (queryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) == null || queryIntentServices.size() <= 0) ? null : queryIntentServices.get(0).serviceInfo.packageName;
                com.fyber.inneractive.sdk.config.cellular.a aVar2 = new com.fyber.inneractive.sdk.config.cellular.a(iAConfigManager2.f);
                iAConfigManager2.M = aVar2;
                com.fyber.inneractive.sdk.config.cellular.d dVar = aVar2.a;
                if (dVar != null) {
                    try {
                        dVar.a(aVar2);
                    } catch (Throwable th) {
                        IAlog.a("failed to register network detector", th, new Object[0]);
                    }
                }
            }
        }
        d.a.a = context.getApplicationContext();
        IAConfigManager iAConfigManager3 = IAConfigManager.N;
        iAConfigManager3.t.c.remove(d.a);
        iAConfigManager3.t.c.add(d.a);
    }

    public static void setGdprConsent(boolean z, GdprConsentSource gdprConsentSource) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.N.C;
        if (gVar == null) {
            IAlog.f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.a == null) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.a = Boolean.valueOf(z);
            if (!gVar.a(z, "IAGDPRBool")) {
                IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
            gVar.f = gdprConsentSource;
            if (!gVar.a("IAGdprSource", gdprConsentSource.name())) {
                IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
        }
        a("GDPR", String.valueOf(z));
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.N;
            iAConfigManager.m = inneractiveMediationName;
            iAConfigManager.l = inneractiveMediationName.getKey();
        }
    }

    public static void a(String str, String str2) {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (InneractiveMediationNameConsts.MAX.equalsIgnoreCase(iAConfigManager.l)) {
            IAlog.a("%s Mediation is MAX, not reporting publisher privacy api usage", "InneractiveAdManager");
            return;
        }
        if (iAConfigManager.I.get()) {
            IAlog.a("%s Already reported publisher privacy api usage", "InneractiveAdManager");
            return;
        }
        IAConfigManager.e();
        w wVar = new w(u.PUBLISHER_PRIVACY_API_USAGE);
        if (str2 == null) {
            str2 = "";
        }
        wVar.a(str, str2).a((String) null);
    }
}
