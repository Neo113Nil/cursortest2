package com.appsflyer.internal;

import B90.RunnableC2599a;
import Ij.C3261b;
import N3.C3660k;
import Oy.C3715a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;
import com.appsflyer.internal.AFf1lSDK;
import com.appsflyer.internal.AFg1zSDK;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String AFInAppEventParameterName;
    static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper = null;
    private static char[] afDebugLog = null;
    private static char afErrorLog = 0;
    private static int afRDLog = 1;
    private static int afWarnLog;

    /* renamed from: e, reason: collision with root package name */
    private static AFb1tSDK f57377e;
    public static final String valueOf;
    public static final String values;
    private Map<Long, String> AFLogger;

    @NonNull
    private final AFd1lSDK afInfoLog;
    private AFf1cSDK afVerboseLog;
    private boolean force;

    /* renamed from: v, reason: collision with root package name */
    private Application f57380v;

    /* renamed from: w, reason: collision with root package name */
    private SharedPreferences f57381w;
    public volatile AppsFlyerConversionListener AFInAppEventType = null;
    private long unregisterClient = -1;
    private long registerClient = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f57378d = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: i, reason: collision with root package name */
    private boolean f57379i = false;

    /* renamed from: com.appsflyer.internal.AFb1tSDK$4, reason: invalid class name */
    /* loaded from: classes8.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            values = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1tSDK implements Runnable {
        private final AFa1pSDK valueOf;

        /* synthetic */ AFa1tSDK(AFb1tSDK aFb1tSDK, AFa1pSDK aFa1pSDK, byte b11) {
            this(aFa1pSDK);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1tSDK.AFInAppEventParameterName(AFb1tSDK.this, this.valueOf);
        }

        private AFa1tSDK(AFa1pSDK aFa1pSDK) {
            this.valueOf = aFa1pSDK;
        }
    }

    class AFa1vSDK implements AFe1bSDK {
        private AFa1vSDK() {
        }

        private boolean valueOf() {
            return AFb1tSDK.this.AFInAppEventType != null;
        }

        @Override // com.appsflyer.internal.AFe1bSDK
        public final void AFInAppEventParameterName(AFe1eSDK<?> aFe1eSDK, AFe1dSDK aFe1dSDK) {
            JSONObject values;
            AFg1rSDK AFInAppEventParameterName;
            if (!(aFe1eSDK instanceof AFf1hSDK)) {
                if (!(aFe1eSDK instanceof AFg1mSDK) || aFe1dSDK == AFe1dSDK.SUCCESS) {
                    return;
                }
                AFg1iSDK aFg1iSDK = new AFg1iSDK(AFb1tSDK.this.values());
                AFe1fSDK afInfoLog = AFb1tSDK.this.values().afInfoLog();
                afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFg1iSDK));
                return;
            }
            AFf1hSDK aFf1hSDK = (AFf1hSDK) aFe1eSDK;
            boolean z11 = aFe1eSDK instanceof AFf1jSDK;
            if (z11 && valueOf()) {
                AFf1jSDK aFf1jSDK = (AFf1jSDK) aFe1eSDK;
                if (aFf1jSDK.AFInAppEventType == AFe1dSDK.SUCCESS || aFf1jSDK.values == 1) {
                    AFg1mSDK aFg1mSDK = new AFg1mSDK(aFf1jSDK, AFb1tSDK.this.values().values());
                    AFe1fSDK afInfoLog2 = AFb1tSDK.this.values().afInfoLog();
                    afInfoLog2.AFKeystoreWrapper.execute(afInfoLog2.new AnonymousClass3(aFg1mSDK));
                }
            }
            if (aFe1dSDK == AFe1dSDK.SUCCESS) {
                AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                aFb1tSDK.AFKeystoreWrapper(AFb1tSDK.AFKeystoreWrapper(aFb1tSDK)).valueOf("sentSuccessfully", "true");
                if (!(aFe1eSDK instanceof AFf1iSDK) && (AFInAppEventParameterName = new AFg1oSDK(AFb1tSDK.AFKeystoreWrapper(AFb1tSDK.this)).AFInAppEventParameterName()) != null && AFInAppEventParameterName.valueOf()) {
                    String str = AFInAppEventParameterName.AFInAppEventParameterName;
                    AFLogger.INSTANCE.d(AFg1gSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFg1oSDK.AFInAppEventParameterName(str);
                }
                ResponseNetwork responseNetwork = aFf1hSDK.AFLogger;
                if (responseNetwork != null && (values = AFc1vSDK.values((String) responseNetwork.getBody())) != null) {
                    AFb1tSDK.AFInAppEventParameterName(AFb1tSDK.this, values.optBoolean("send_background", false));
                }
                if (z11) {
                    AFb1tSDK.values(AFb1tSDK.this, System.currentTimeMillis());
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1bSDK
        public final void AFKeystoreWrapper(AFe1eSDK<?> aFe1eSDK) {
        }

        @Override // com.appsflyer.internal.AFe1bSDK
        public final void values(AFe1eSDK<?> aFe1eSDK) {
            if (aFe1eSDK instanceof AFf1jSDK) {
                AFb1tSDK.this.values().AFLogger().valueOf(((AFf1hSDK) aFe1eSDK).f57416e.registerClient);
            }
        }

        /* synthetic */ AFa1vSDK(AFb1tSDK aFb1tSDK, byte b11) {
            this();
        }
    }

    static {
        AFKeystoreWrapper();
        AFInAppEventParameterName = "286";
        values = "6.13";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("6.13");
        sb2.append("/androidevent?buildnumber=6.13.1&app_id=");
        valueOf = sb2.toString();
        AFKeystoreWrapper = null;
        f57377e = new AFb1tSDK();
        int i11 = afWarnLog + 87;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public AFb1tSDK() {
        AFVersionDeclaration.init();
        this.afInfoLog = new AFd1lSDK();
        values().afLogForce().valueOf();
        values().afLogForce().AFKeystoreWrapper();
        AFe1fSDK afInfoLog = values().afInfoLog();
        afInfoLog.valueOf.add(new AFa1vSDK(this, (byte) 0));
    }

    static /* synthetic */ void AFInAppEventParameterName(AFb1tSDK aFb1tSDK) {
        int i11 = afRDLog + 13;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        aFb1tSDK.registerClient();
        if (i12 != 0) {
            throw null;
        }
        int i13 = afWarnLog + 9;
        afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    static void AFKeystoreWrapper() {
        afDebugLog = new char[]{29480, 29493, 29489, 29497, 29483, 29447, 29502, 29501, 29484};
        afErrorLog = (char) 18113;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        AFKeystoreWrapper(new AFh1wSDK());
        afWarnLog = (afRDLog + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String registerClient(Context context) {
        afRDLog = (afWarnLog + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String attributionId = getAttributionId(context);
        int i11 = afWarnLog + 5;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return attributionId;
        }
        throw null;
    }

    private synchronized AFf1cSDK unregisterClient() {
        AFf1cSDK aFf1cSDK;
        try {
            if (this.afVerboseLog == null) {
                this.afVerboseLog = new c(this);
                afRDLog = (afWarnLog + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            aFf1cSDK = this.afVerboseLog;
            int i11 = afWarnLog + 23;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aFf1cSDK;
    }

    public static AFb1tSDK valueOf() {
        int i11 = afRDLog;
        int i12 = i11 + 39;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
        AFb1tSDK aFb1tSDK = f57377e;
        int i13 = i11 + 105;
        afWarnLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            return aFb1tSDK;
        }
        throw null;
    }

    static /* synthetic */ long values(AFb1tSDK aFb1tSDK, long j11) {
        int i11 = afRDLog;
        int i12 = i11 + 11;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i13 = i12 % 2;
        aFb1tSDK.registerClient = j11;
        if (i13 != 0) {
            int i14 = 64 / 0;
        }
        int i15 = i11 + 65;
        afWarnLog = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i15 % 2 == 0) {
            return j11;
        }
        throw null;
    }

    public final void AFInAppEventType(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        int i11 = afWarnLog + 83;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            try {
                if (i11 % 2 == 0) {
                    AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                    System.currentTimeMillis();
                    AFKeystoreWrapper(context).AFKeystoreWrapper("extraReferrers", (String) null);
                    throw null;
                }
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                long currentTimeMillis = System.currentTimeMillis();
                String AFKeystoreWrapper2 = AFKeystoreWrapper(context).AFKeystoreWrapper("extraReferrers", (String) null);
                if (AFKeystoreWrapper2 == null) {
                    jSONObject = new JSONObject();
                    jSONArray = new JSONArray();
                } else {
                    JSONObject jSONObject2 = new JSONObject(AFKeystoreWrapper2);
                    jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                    jSONObject = jSONObject2;
                }
                if (jSONArray.length() < 5) {
                    int i12 = afRDLog + 121;
                    afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i12 % 2 != 0) {
                        jSONArray.put(currentTimeMillis);
                        throw null;
                    }
                    jSONArray.put(currentTimeMillis);
                    afRDLog = (afWarnLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                if (jSONObject.length() >= 4) {
                    afWarnLog = (afRDLog + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFInAppEventParameterName(jSONObject);
                }
                jSONObject.put(str, jSONArray.toString());
                AFKeystoreWrapper(context).valueOf("extraReferrers", jSONObject.toString());
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
                sb2.append(str);
                sb2.append(": ");
                AFLogger.afErrorLog(sb2.toString(), th2);
            }
        } catch (JSONException e11) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e11);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = values().afWarnLog().AFKeystoreWrapper;
        if (list.contains(asList)) {
            return;
        }
        afWarnLog = (afRDLog + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
        list.add(asList);
        afWarnLog = (afRDLog + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z11) {
        int i11 = afRDLog + 21;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFb1bSDK i12 = values().i();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z11);
            i12.AFInAppEventParameterName("anonymizeUser", strArr);
        } else {
            values().i().AFInAppEventParameterName("anonymizeUser", String.valueOf(z11));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z11);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i11 = afRDLog + 107;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFc1uSDK afWarnLog2 = values().afWarnLog();
            afWarnLog2.AFInAppEventType = str;
            afWarnLog2.values = map;
            throw null;
        }
        AFc1uSDK afWarnLog3 = values().afWarnLog();
        afWarnLog3.AFInAppEventType = str;
        afWarnLog3.values = map;
        int i12 = afRDLog + 49;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z11) {
        int i11 = afRDLog + 109;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            values().afErrorLog().values(z11);
            int i12 = 42 / 0;
        } else {
            values().afErrorLog().values(z11);
        }
        int i13 = afWarnLog + 117;
        afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z11) {
        int i11 = afRDLog + 29;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        AFInAppEventType(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z11));
        if (i12 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(@NonNull Context context) {
        values().i().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
        if (context != null) {
            AFInAppEventParameterName(context);
            AFd1sSDK AFInAppEventType = values().AFInAppEventType();
            return AFb1kSDK.AFInAppEventType(AFInAppEventType.AFInAppEventParameterName, AFInAppEventType.AFKeystoreWrapper);
        }
        int i11 = (afWarnLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afRDLog = i11;
        afWarnLog = (i11 + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            String AFInAppEventType = new AFb1jSDK(context, values()).AFInAppEventType();
            afRDLog = (afWarnLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return AFInAppEventType;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th2);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        afWarnLog = (afRDLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFInAppEventType = values().afVerboseLog().AFInAppEventType();
        afRDLog = (afWarnLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventType;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        afRDLog = (afWarnLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFInAppEventParameterName2 = values().afVerboseLog().AFInAppEventParameterName();
        int i11 = afWarnLog + 47;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        int i11 = afWarnLog + 99;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i12 = 41 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        String values2 = values(context, "AF_STORE");
        if (values2 == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i13 = afRDLog + 31;
        afWarnLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            return values2;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        afRDLog = (afWarnLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("getSdkVersion", new String[0]);
        String e11 = AFd1sSDK.e();
        afWarnLog = (afRDLog + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return e11;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        long j11;
        if (!this.force) {
            this.force = true;
            values().force().registerClient = str;
            AFb1lSDK.valueOf(str);
            if (context != null) {
                int i11 = afRDLog + 37;
                afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    AFInAppEventParameterName(context);
                    AFb1uSDK.valueOf(context);
                    throw null;
                }
                AFInAppEventParameterName(context);
                Application valueOf2 = AFb1uSDK.valueOf(context);
                if (valueOf2 != null) {
                    this.f57380v = valueOf2;
                    values().afRDLog().values();
                    values().AFLogger().valueOf = System.currentTimeMillis();
                    AFe1fSDK afInfoLog = values().afInfoLog();
                    afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(new AFf1vSDK(values())));
                    AFh1aSDK level = values().getLevel();
                    level.values = Build.VERSION.SDK_INT >= 31 ? new AFi1uSDK(level.valueOf) : new AFi1vSDK(level.valueOf);
                    values().onAppOpenAttributionNative().valueOf(new C3715a(this));
                    values().d().values(unregisterClient());
                    AFi1iSDK v11 = values().v();
                    T10.b bVar = new T10.b(this, 1);
                    AFi1sSDK AFKeystoreWrapper2 = v11.AFKeystoreWrapper(bVar);
                    Runnable AFInAppEventType = v11.AFInAppEventType(AFKeystoreWrapper2, bVar);
                    v11.valueOf(AFKeystoreWrapper2);
                    v11.valueOf(new AFi1hSDK(v11.AFInAppEventType.AFInAppEventType(), AFInAppEventType));
                    v11.valueOf(new AFi1oSDK(AFInAppEventType, v11.AFInAppEventType));
                    v11.valueOf(new AFi1gSDK(AFInAppEventType, v11.AFInAppEventType));
                    v11.values(AFInAppEventType);
                    if (!v11.valueOf()) {
                        Context context2 = v11.AFInAppEventType.w().valueOf;
                        AFd1mSDK aFd1mSDK = v11.AFInAppEventType;
                        List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                            while (it.hasNext()) {
                                afRDLog = (afWarnLog + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                ProviderInfo providerInfo = it.next().providerInfo;
                                if (providerInfo != null) {
                                    arrayList.add(new AFi1lSDK(providerInfo, AFInAppEventType, aFd1mSDK));
                                } else {
                                    AFLogger.INSTANCE.w(AFg1gSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                v11.AFInAppEventParameterName.addAll(arrayList);
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1gSDK aFg1gSDK = AFg1gSDK.PREINSTALL;
                                StringBuilder sb2 = new StringBuilder("Detected ");
                                sb2.append(arrayList.size());
                                sb2.append(" valid preinstall provider(s)");
                                aFLogger.d(aFg1gSDK, sb2.toString());
                            }
                        }
                    }
                    for (AFi1jSDK aFi1jSDK : v11.AFKeystoreWrapper()) {
                        afWarnLog = (afRDLog + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        aFi1jSDK.valueOf(v11.AFInAppEventType.w().valueOf);
                    }
                    final AFg1xSDK force = this.afInfoLog.force();
                    AFd1sSDK AFInAppEventType2 = values().AFInAppEventType();
                    force.values = System.currentTimeMillis();
                    AFg1zSDK aFg1zSDK = force.valueOf;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(AFb1kSDK.AFInAppEventType(AFInAppEventType2.AFInAppEventParameterName, AFInAppEventType2.AFKeystoreWrapper));
                    sb3.append(force.values);
                    byte[] AFKeystoreWrapper3 = AFb1mSDK.AFKeystoreWrapper(sb3.toString());
                    if (AFKeystoreWrapper3 == null || AFKeystoreWrapper3.length <= 0) {
                        j11 = -1;
                    } else {
                        int i12 = afWarnLog + 73;
                        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i12 % 2 != 0 ? AFKeystoreWrapper3.length > 8 : AFKeystoreWrapper3.length > 108) {
                            AFKeystoreWrapper3 = Arrays.copyOfRange(AFKeystoreWrapper3, 0, 8);
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        allocate.put(AFKeystoreWrapper3);
                        allocate.flip();
                        j11 = allocate.getLong();
                    }
                    force.AFInAppEventParameterName = aFg1zSDK.AFInAppEventParameterName(j11, force.AFInAppEventType.valueOf, new AFg1zSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFg1xSDK.5
                        public AnonymousClass5() {
                        }

                        @Override // com.appsflyer.internal.AFg1zSDK.AFa1vSDK
                        public final void AFInAppEventParameterName(@NonNull String str2, @NonNull String str3) {
                            AFg1xSDK.this.AFKeystoreWrapper = new ConcurrentHashMap();
                            AFg1xSDK.this.AFKeystoreWrapper.put("signedData", str2);
                            AFg1xSDK.this.AFKeystoreWrapper.put("signature", str3);
                            AFg1xSDK.this.AFInAppEventParameterName();
                            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                        }

                        @Override // com.appsflyer.internal.AFg1zSDK.AFa1vSDK
                        public final void AFInAppEventType(String str2, Exception exc) {
                            AFg1xSDK.this.AFKeystoreWrapper = new ConcurrentHashMap();
                            String message = exc.getMessage();
                            if (message == null) {
                                message = "unknown";
                            }
                            AFg1xSDK.this.AFInAppEventParameterName();
                            AFg1xSDK.this.AFKeystoreWrapper.put("error", message);
                            AFLogger.afErrorLog(str2, exc, true, true, false);
                        }
                    });
                }
            } else {
                AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            }
            values().i().AFInAppEventParameterName("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
            AFLogger.INSTANCE.force(AFg1gSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.13.1." + AFInAppEventParameterName + ")");
            this.AFInAppEventType = appsFlyerConversionListener;
            return this;
        }
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        afRDLog = (afWarnLog + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                afWarnLog = (afRDLog + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return true;
            }
        } catch (PackageManager.NameNotFoundException e11) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e11);
        }
        int i11 = afWarnLog + 113;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 75 / 0;
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        afRDLog = (afWarnLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean AFKeystoreWrapper2 = values().force().AFKeystoreWrapper();
        afWarnLog = (afRDLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFKeystoreWrapper2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        afWarnLog = (afRDLog + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        logEvent(context, str, map, null);
        int i11 = afRDLog + 119;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d11, double d12) {
        values().i().AFInAppEventParameterName("logLocation", String.valueOf(d11), String.valueOf(d12));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d12));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d11));
        valueOf(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        int i11 = afWarnLog + 9;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        afRDLog = (afWarnLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("logSession", new String[0]);
        values().i().AFInAppEventParameterName();
        AFInAppEventParameterName(context, AFg1aSDK.logSession);
        valueOf(context, null, null);
        afWarnLog = (afRDLog + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        afWarnLog = (afRDLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().AFLogger$LogLevel().valueOf();
        int i11 = afRDLog + 113;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 42 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        int i11 = afWarnLog + 81;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (uri == null || uri.toString().isEmpty()) {
            AFc1uSDK afWarnLog2 = values().afWarnLog();
            StringBuilder sb2 = new StringBuilder("Link is \"");
            sb2.append(uri);
            sb2.append("\"");
            afWarnLog2.valueOf(sb2.toString(), DeepLinkResult.Error.NETWORK);
            int i12 = afWarnLog + 35;
            afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (context != null) {
            AFInAppEventParameterName(context);
            values().afWarnLog().valueOf(context, AFc1pSDK.valueOf(values().AppsFlyer2dXConversionCallback()), Uri.parse(uri.toString()));
            return;
        }
        AFc1uSDK afWarnLog3 = values().afWarnLog();
        StringBuilder sb3 = new StringBuilder("Context is \"");
        sb3.append(context);
        sb3.append("\"");
        afWarnLog3.valueOf(sb3.toString(), DeepLinkResult.Error.NETWORK);
        afWarnLog = (afRDLog + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        int i11 = afWarnLog;
        int i12 = i11 + 21;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (intent == null) {
            values().afWarnLog().valueOf("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            afRDLog = (i11 + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
            values().afWarnLog().valueOf("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            Context applicationContext = context.getApplicationContext();
            AFInAppEventParameterName(applicationContext);
            values().AFInAppEventParameterName().execute(new b(this, applicationContext, intent, 0));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i11 = afRDLog + 9;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            values().i().AFInAppEventParameterName("registerConversionListener", new String[0]);
        } else {
            values().i().AFInAppEventParameterName("registerConversionListener", new String[0]);
        }
        AFKeystoreWrapper(appsFlyerConversionListener);
        afWarnLog = (afRDLog + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        values().i().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFKeystoreWrapper = appsFlyerInAppPurchaseValidatorListener;
            afRDLog = (afWarnLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        afRDLog = (afWarnLog + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("registerValidatorListener null listener");
        int i11 = afWarnLog + 19;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 36 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int valueOf2 = valueOf(AFKeystoreWrapper(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adimpression_counter", Integer.valueOf(valueOf2));
        AFInAppEventParameterName(context, hashMap, new AFh1tSDK());
        afWarnLog = (afRDLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int AFInAppEventParameterName2 = AFInAppEventParameterName(AFKeystoreWrapper(context));
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", map);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFInAppEventParameterName2));
        AFInAppEventParameterName(context, hashMap, new AFh1vSDK());
        int i11 = afRDLog + 73;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 64 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r0 = new com.appsflyer.internal.AFf1oSDK(r4, r5, r3.AFKeystoreWrapper);
        r3 = r3.valueOf;
        r3.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFe1fSDK.AnonymousClass3(r3, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3.valueOf(r4, r5, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r3.valueOf(r4, r5, "purchases") != false) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler e11;
        int i11 = afRDLog + 27;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFInAppEventParameterName(context);
            e11 = values().e();
        } else {
            AFInAppEventParameterName(context);
            e11 = values().e();
        }
        int i12 = afWarnLog + 111;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            int i13 = 99 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r0 = new com.appsflyer.internal.AFf1xSDK(r4, r5, r3.AFKeystoreWrapper);
        r3 = r3.valueOf;
        r3.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFe1fSDK.AnonymousClass3(r3, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3.valueOf(r4, r5, "subscriptions") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r3.valueOf(r4, r5, "subscriptions") != false) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler e11;
        int i11 = afWarnLog + 55;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFInAppEventParameterName(context);
            e11 = values().e();
        } else {
            AFInAppEventParameterName(context);
            e11 = values().e();
        }
        int i12 = afRDLog + 55;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r20 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004d, code lost:
    
        if (r20 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        values().i().AFInAppEventParameterName("sendPushNotificationData", "activity_null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004f, code lost:
    
        com.appsflyer.internal.AFb1tSDK.afRDLog = (com.appsflyer.internal.AFb1tSDK.afWarnLog + 55) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("sendPushNotificationData", r20.getLocalClassName(), "activity_intent_null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0021, code lost:
    
        if (r20.getIntent() == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0023, code lost:
    
        r3 = values().i();
        r6 = r20.getLocalClassName();
        r7 = new java.lang.StringBuilder("activity_intent_");
        r7.append(r20.getIntent().toString());
        r3.AFInAppEventParameterName("sendPushNotificationData", r6, r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x001b, code lost:
    
        if (r20 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x019d  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        int i11;
        long j11;
        long j12;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i12 = afWarnLog + 65;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i13 = 2;
        if (i12 % 2 == 0) {
            int i14 = 35 / 0;
        }
        AFd1qSDK afErrorLogForExcManagerOnly = values().afErrorLogForExcManagerOnly();
        String values2 = values(activity);
        afErrorLogForExcManagerOnly.AFKeystoreWrapper = values2;
        if (values2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.AFLogger == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.AFLogger = new ConcurrentHashMap();
                i11 = 2;
                j12 = currentTimeMillis;
                j11 = j12;
            } else {
                try {
                    long j13 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    j12 = currentTimeMillis;
                    for (Long l11 : this.AFLogger.keySet()) {
                        try {
                            jSONObject = new JSONObject(afErrorLogForExcManagerOnly.AFKeystoreWrapper);
                            i11 = i13;
                            try {
                                jSONObject2 = new JSONObject(this.AFLogger.get(l11));
                                j11 = currentTimeMillis;
                            } catch (Throwable th2) {
                                th = th2;
                                j11 = currentTimeMillis;
                                AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                if (this.AFLogger.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i11)) {
                                }
                                this.AFLogger.put(Long.valueOf(j11), afErrorLogForExcManagerOnly.AFKeystoreWrapper);
                                start(activity);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            i11 = i13;
                        }
                        try {
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                                afWarnLog = (afRDLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                if (jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    StringBuilder sb2 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                    sb2.append(jSONObject2);
                                    sb2.append(", new: ");
                                    sb2.append(jSONObject);
                                    sb2.append(")");
                                    AFLogger.afInfoLog(sb2.toString());
                                    afErrorLogForExcManagerOnly.AFKeystoreWrapper = null;
                                    return;
                                }
                            }
                            if (j11 - l11.longValue() > j13) {
                                this.AFLogger.remove(l11);
                            }
                            if (l11.longValue() <= j12) {
                                int i15 = afWarnLog + 89;
                                afRDLog = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
                                if (i15 % 2 == 0) {
                                    j12 = l11.longValue();
                                    int i16 = 91 / 0;
                                } else {
                                    j12 = l11.longValue();
                                }
                            }
                            i13 = i11;
                            currentTimeMillis = j11;
                        } catch (Throwable th4) {
                            th = th4;
                            AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                            if (this.AFLogger.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i11)) {
                            }
                            this.AFLogger.put(Long.valueOf(j11), afErrorLogForExcManagerOnly.AFKeystoreWrapper);
                            start(activity);
                        }
                    }
                    i11 = i13;
                    j11 = currentTimeMillis;
                } catch (Throwable th5) {
                    th = th5;
                    i11 = 2;
                    j11 = currentTimeMillis;
                    j12 = j11;
                }
            }
            if (this.AFLogger.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i11)) {
                StringBuilder sb3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb3.append(j12);
                sb3.append(")");
                AFLogger.afInfoLog(sb3.toString());
                this.AFLogger.remove(Long.valueOf(j12));
            }
            this.AFLogger.put(Long.valueOf(j11), afErrorLogForExcManagerOnly.AFKeystoreWrapper);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        afWarnLog = (afRDLog + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (map != null) {
            values().i().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        afRDLog = (afWarnLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        afWarnLog = (afRDLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setAndroidIdData", str);
        values().afErrorLogForExcManagerOnly().values = str;
        int i11 = afWarnLog + 1;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        afRDLog = (afWarnLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setAppId", str);
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        int i11 = afRDLog + 77;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 83 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r4.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) != true) goto L6;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        values().i().AFInAppEventParameterName("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            afRDLog = (afWarnLog + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        afRDLog = (afWarnLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventType(AppsFlyerProperties.ONELINK_ID, str);
        int i11 = afWarnLog + 77;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z11) {
        int i11 = afRDLog + 5;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFb1bSDK i12 = values().i();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z11);
            i12.AFInAppEventParameterName("setCollectAndroidID", strArr);
        } else {
            values().i().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z11));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z11));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z11));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z11) {
        int i11 = afWarnLog + 35;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            values().i().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z11));
        } else {
            values().i().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z11));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z11));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z11));
        int i12 = afRDLog + 71;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z11) {
        int i11 = afWarnLog + 107;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFb1bSDK i12 = values().i();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z11);
            i12.AFInAppEventParameterName("setCollectOaid", strArr);
        } else {
            values().i().AFInAppEventParameterName("setCollectOaid", String.valueOf(z11));
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z11));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        int i11 = afRDLog + 49;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            values().afErrorLogForExcManagerOnly().f57392d = appsFlyerConsent;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            values().afErrorLogForExcManagerOnly().f57392d = appsFlyerConsent;
            int i12 = 22 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        afRDLog = (afWarnLog + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        afRDLog = (afWarnLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            afWarnLog = (afRDLog + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (!AFInAppEventParameterName()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
            sb2.append(str);
            sb2.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb2.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(values().values());
            AFInAppEventParameterName(context, AFg1aSDK.setCustomerIdAndLogSession);
            String str2 = values().force().registerClient;
            if (referrer == null) {
                int i11 = afRDLog + 19;
                afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    throw null;
                }
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
                afWarnLog = (afRDLog + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            valueOf(context, referrer);
            int i12 = afRDLog + 59;
            afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        afRDLog = (afWarnLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        afWarnLog = (afRDLog + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z11) {
        AFLogger.LogLevel logLevel;
        if (z11) {
            afRDLog = (afWarnLog + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            afWarnLog = (afRDLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z11) {
        boolean z12;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z11)));
        if (!(!z11)) {
            afWarnLog = (afRDLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z12 = false;
        } else {
            z12 = true;
        }
        AFb1rSDK.AFInAppEventParameterName = Boolean.valueOf(z12);
        AFd1mSDK values2 = values();
        values2.afErrorLogForExcManagerOnly().registerClient = z11;
        if (!z11) {
            AFe1fSDK afInfoLog = values2.afInfoLog();
            afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(new AFf1vSDK(values())));
        } else {
            int i11 = afRDLog + 39;
            afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                values2.afErrorLogForExcManagerOnly().f57393e = null;
            } else {
                values2.afErrorLogForExcManagerOnly().f57393e = null;
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z11) {
        afRDLog = (afWarnLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z11)));
        AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z11);
        int i11 = afWarnLog + 109;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        afRDLog = (afWarnLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        afWarnLog = (afRDLog + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        String str3;
        int i11 = afRDLog + 13;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFc1rSDK.AFKeystoreWrapper(str2);
            throw null;
        }
        if (AFc1rSDK.AFKeystoreWrapper(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            afRDLog = (afWarnLog + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        if (str != null) {
            str3 = str.trim();
        } else {
            afWarnLog = (afRDLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str3 = "";
        }
        AFe1gSDK.AFInAppEventParameterName(new AFe1kSDK(str3, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        afWarnLog = (afRDLog + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setImeiData", str);
        values().force().unregisterClient = str;
        afWarnLog = (afRDLog + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z11) {
        afRDLog = (afWarnLog + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setIsUpdate", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z11);
        int i11 = afRDLog + 61;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 27 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z11;
        afRDLog = (afWarnLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            afRDLog = (afWarnLog + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = true;
        } else {
            afRDLog = (afWarnLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = false;
        }
        values().i().AFInAppEventParameterName("log", String.valueOf(z11));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z11) {
            values().afLogForce().d();
        } else {
            values().afLogForce().AFKeystoreWrapper();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i11) {
        afRDLog = (afWarnLog + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f57378d = TimeUnit.SECONDS.toMillis(i11);
        afRDLog = (afWarnLog + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        afWarnLog = (afRDLog + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("setOaidData", str);
        AFb1rSDK.AFKeystoreWrapper = str;
        afRDLog = (afWarnLog + 91) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        afWarnLog = (afRDLog + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
        values().afWarnLog().f57382d = strArr;
        afRDLog = (afWarnLog + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i11 = afWarnLog;
        afRDLog = (i11 + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i12 = i11 + 33;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r5.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = new java.lang.StringBuilder("Setting partner data for ");
        r1.append(r4);
        r1.append(": ");
        r1.append(r5);
        com.appsflyer.AFLogger.afDebugLog(r1.toString());
        r1 = new org.json.JSONObject(r5).toString().length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (r1 <= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        com.appsflyer.AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        r5 = new java.util.HashMap();
        r5.put("error", "limit exceeded: ".concat(java.lang.String.valueOf(r1)));
        r0.valueOf.put(r4, r5);
        com.appsflyer.internal.AFb1tSDK.afRDLog = (com.appsflyer.internal.AFb1tSDK.afWarnLog + 21) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        r0.AFKeystoreWrapper.put(r4, r5);
        r0.valueOf.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r0.AFKeystoreWrapper.remove(r4) != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        com.appsflyer.internal.AFb1tSDK.afRDLog = (com.appsflyer.internal.AFb1tSDK.afWarnLog + 47) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r4 = "Partner data is missing or `null`";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        com.appsflyer.AFLogger.afWarnLog(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r4 = "Cleared partner data for ".concat(java.lang.String.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        if (r4.isEmpty() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r4.isEmpty() != false) goto L31;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        afRDLog = (afWarnLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1qSDK afErrorLogForExcManagerOnly = values().afErrorLogForExcManagerOnly();
        if (afErrorLogForExcManagerOnly.AFInAppEventParameterName == null) {
            afErrorLogForExcManagerOnly.AFInAppEventParameterName = new AFc1dSDK();
        }
        AFc1dSDK aFc1dSDK = afErrorLogForExcManagerOnly.AFInAppEventParameterName;
        if (str != null) {
            int i11 = afRDLog + 113;
            afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                int i12 = 20 / 0;
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i11 = afWarnLog + 71;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            values().afErrorLogForExcManagerOnly().valueOf = AFb1mSDK.valueOf(str);
        } else {
            values().afErrorLogForExcManagerOnly().valueOf = AFb1mSDK.valueOf(str);
            int i12 = 21 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i11 = afWarnLog + 33;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            values().afDebugLog().AFInAppEventType(pluginInfo);
        } else {
            Objects.requireNonNull(pluginInfo);
            values().afDebugLog().AFInAppEventType(pluginInfo);
            int i12 = 34 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                afRDLog = (afWarnLog + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } catch (JSONException e11) {
                AFLogger.afErrorLog(e11.getMessage(), e11);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
            afRDLog = (afWarnLog + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        } else {
            afWarnLog = (afRDLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFInAppEventType("preInstallName", jSONObject.toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        afWarnLog = (afRDLog + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFc1uSDK afWarnLog2 = values().afWarnLog();
        afWarnLog2.f57383e.clear();
        afWarnLog2.f57383e.addAll(Arrays.asList(strArr));
        afRDLog = (afWarnLog + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        int i11 = afRDLog + 51;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        setSharingFilterForPartners(strArr);
        if (i12 != 0) {
            int i13 = 8 / 0;
        }
        afWarnLog = (afRDLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i11 = afWarnLog + 15;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        int i12 = afWarnLog + 103;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        values().afErrorLogForExcManagerOnly().AFInAppEventType = new AFd1ySDK(strArr);
        int i11 = afRDLog + 61;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 84 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i11 = afRDLog + 3;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            values().i().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        } else {
            values().i().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i12 = 1 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        afRDLog = (afWarnLog + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        start(context, null);
        afRDLog = (afWarnLog + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        r5.values().values("is_stop_tracking_used", true);
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void stop(boolean z11, Context context) {
        AFd1mSDK values2;
        int i11 = afWarnLog + 47;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFInAppEventParameterName(context);
            values2 = values();
            values2.force().AFLogger = z11;
            values2.AFInAppEventParameterName().submit(new RunnableC2599a(values2, 5));
            int i12 = 40 / 0;
        } else {
            AFInAppEventParameterName(context);
            values2 = values();
            values2.force().AFLogger = z11;
            values2.AFInAppEventParameterName().submit(new RunnableC2599a(values2, 5));
        }
        afWarnLog = (afRDLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        afRDLog = (afWarnLog + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        afWarnLog = (afRDLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        afRDLog = (afWarnLog + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        values().i().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        this.AFInAppEventType = null;
        afRDLog = (afWarnLog + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFInAppEventParameterName(context);
        AFg1oSDK aFg1oSDK = new AFg1oSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1gSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1gSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1rSDK AFInAppEventParameterName2 = aFg1oSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName2 == null || !str.equals(AFInAppEventParameterName2.AFInAppEventParameterName)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z11 = AFInAppEventParameterName2 == null || currentTimeMillis - AFInAppEventParameterName2.values > TimeUnit.SECONDS.toMillis(2L);
            AFg1rSDK aFg1rSDK = new AFg1rSDK(str, currentTimeMillis, !z11);
            aFg1oSDK.values.valueOf("afUninstallToken", aFg1rSDK.AFInAppEventParameterName);
            aFg1oSDK.values.AFInAppEventParameterName("afUninstallToken_received_time", aFg1rSDK.values);
            aFg1oSDK.values.values("afUninstallToken_queued", aFg1rSDK.valueOf());
            if (z11) {
                AFg1oSDK.AFInAppEventParameterName(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r19 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        r2 = r19.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1bSDK i11;
        String[] strArr;
        char c11;
        String str6;
        int i12;
        int i13 = afWarnLog + 89;
        afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            i11 = values().i();
            strArr = new String[55];
            strArr[1] = str;
            strArr[1] = str2;
            strArr[4] = str3;
            strArr[2] = str4;
            strArr[3] = str5;
            c11 = 2;
        } else {
            i11 = values().i();
            strArr = new String[6];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
            strArr[3] = str4;
            strArr[4] = str5;
            c11 = 5;
        }
        strArr[c11] = str6;
        i11.AFInAppEventParameterName("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK aFg1gSDK = AFg1gSDK.PURCHASE_VALIDATION;
            StringBuilder d11 = C3660k.d("Validate in app called with parameters: ", str3, " ", str4, " ");
            d11.append(str5);
            aFLogger.i(aFg1gSDK, d11.toString());
        }
        if (str != null && str4 != null && str2 != null) {
            afRDLog = (afWarnLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str5 != null && str3 != null) {
                new Thread(new AFa1cSDK(context.getApplicationContext(), values().force().registerClient, values().AFInAppEventType(), str, str2, str3, str4, str5, map)).start();
                i12 = afWarnLog + 95;
                afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
            return;
        }
        i12 = afWarnLog + 95;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z11) {
        afWarnLog = (afRDLog + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z11)), true);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z11);
        int i11 = afRDLog + 53;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void AFInAppEventParameterName(AFb1tSDK aFb1tSDK, AFa1pSDK aFa1pSDK) {
        int i11 = afRDLog + 23;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        aFb1tSDK.AFKeystoreWrapper(aFa1pSDK);
        if (i12 != 0) {
            int i13 = 59 / 0;
        }
    }

    static /* synthetic */ Application AFKeystoreWrapper(AFb1tSDK aFb1tSDK) {
        int i11 = (afWarnLog + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afRDLog = i11;
        Application application = aFb1tSDK.f57380v;
        int i12 = i11 + 1;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            int i13 = 92 / 0;
        }
        return application;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r14 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0015, code lost:
    
        r14 = r14.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0013, code lost:
    
        if (r14 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b11, int i11, String str, Object[] objArr) {
        int i12;
        int i13 = $10 + 35;
        $11 = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        char[] cArr = str;
        if (i13 % 2 == 0) {
            int i14 = 51 / 0;
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFj1gSDK aFj1gSDK = new AFj1gSDK();
        char[] cArr3 = afDebugLog;
        if (cArr3 != null) {
            $10 = ($11 + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                int i16 = $11 + 123;
                $10 = i16 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i16 % 2 != 0) {
                    cArr4[i15] = (char) (cArr3[i15] - (-5398819829411789118L));
                } else {
                    cArr4[i15] = (char) (cArr3[i15] ^ (-5398819829411789118L));
                    i15++;
                }
            }
            cArr3 = cArr4;
        }
        char c11 = (char) ((-5398819829411789118L) ^ afErrorLog);
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            $10 = ($11 + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
            i12 = i11 - 1;
            cArr5[i12] = (char) (cArr2[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            $11 = ($10 + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFj1gSDK.AFInAppEventType = 0;
            while (true) {
                int i17 = aFj1gSDK.AFInAppEventType;
                if (i17 >= i12) {
                    break;
                }
                char c12 = cArr2[i17];
                aFj1gSDK.AFInAppEventParameterName = c12;
                char c13 = cArr2[i17 + 1];
                aFj1gSDK.values = c13;
                if (c12 == c13) {
                    cArr5[i17] = (char) (c12 - b11);
                    cArr5[i17 + 1] = (char) (c13 - b11);
                } else {
                    int i18 = c12 / c11;
                    aFj1gSDK.valueOf = i18;
                    int i19 = c12 % c11;
                    aFj1gSDK.f57492d = i19;
                    int i21 = c13 / c11;
                    aFj1gSDK.AFKeystoreWrapper = i21;
                    int i22 = c13 % c11;
                    aFj1gSDK.registerClient = i22;
                    if (i19 == i22) {
                        int i23 = ((i18 + c11) - 1) % c11;
                        aFj1gSDK.valueOf = i23;
                        int i24 = ((i21 + c11) - 1) % c11;
                        aFj1gSDK.AFKeystoreWrapper = i24;
                        cArr5[i17] = cArr3[(i23 * c11) + i19];
                        cArr5[i17 + 1] = cArr3[(i24 * c11) + i22];
                    } else if (i18 == i21) {
                        int i25 = ((i19 + c11) - 1) % c11;
                        aFj1gSDK.f57492d = i25;
                        int i26 = ((i22 + c11) - 1) % c11;
                        aFj1gSDK.registerClient = i26;
                        cArr5[i17] = cArr3[(i18 * c11) + i25];
                        cArr5[i17 + 1] = cArr3[(i21 * c11) + i26];
                    } else {
                        cArr5[i17] = cArr3[(i18 * c11) + i22];
                        cArr5[i17 + 1] = cArr3[(i21 * c11) + i19];
                    }
                }
                aFj1gSDK.AFInAppEventType = i17 + 2;
                $11 = ($10 + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        for (int i27 = 0; i27 < i11; i27++) {
            cArr5[i27] = (char) (cArr5[i27] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    @NonNull
    private AFi1jSDK[] d() {
        AFi1jSDK[] AFKeystoreWrapper2;
        int i11 = afRDLog + 91;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            AFKeystoreWrapper2 = values().v().AFKeystoreWrapper();
            int i12 = 53 / 0;
        } else {
            AFKeystoreWrapper2 = values().v().AFKeystoreWrapper();
        }
        int i13 = afWarnLog + 71;
        afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            int i14 = 95 / 0;
        }
        return AFKeystoreWrapper2;
    }

    private boolean e() {
        if (this.unregisterClient > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.unregisterClient;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String valueOf2 = valueOf(simpleDateFormat, this.unregisterClient);
            String valueOf3 = valueOf(simpleDateFormat, this.registerClient);
            if (currentTimeMillis < this.f57378d && !isStopped()) {
                int i11 = afRDLog + 45;
                afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    long j11 = this.f57378d;
                    StringBuilder d11 = C3660k.d("Last Launch attempt: ", valueOf2, ";\nLast successful Launch event: ", valueOf3, ";\nThis launch is blocked: ");
                    d11.append(j11);
                    d11.append(" ms < ");
                    d11.append(currentTimeMillis);
                    d11.append(" ms");
                    AFLogger.afInfoLog(d11.toString());
                    return false;
                }
                long j12 = this.f57378d;
                StringBuilder d12 = C3660k.d("Last Launch attempt: ", valueOf2, ";\nLast successful Launch event: ", valueOf3, ";\nThis launch is blocked: ");
                d12.append(currentTimeMillis);
                d12.append(" ms < ");
                d12.append(j12);
                d12.append(" ms");
                AFLogger.afInfoLog(d12.toString());
                return true;
            }
            if (!isStopped()) {
                StringBuilder d13 = C3660k.d("Last Launch attempt: ", valueOf2, ";\nLast successful Launch event: ", valueOf3, ";\nSending launch (+");
                d13.append(currentTimeMillis);
                d13.append(" ms)");
                AFLogger.afInfoLog(d13.toString());
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        afRDLog = (afWarnLog + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    private static void registerClient(String str) {
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i11 = afWarnLog + 117;
                afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 == 0) {
                    int i12 = 12 / 0;
                    return;
                }
                return;
            }
            int i13 = afRDLog + 35;
            afWarnLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 == 0) {
                AFInAppEventType("preInstallName", str);
            } else {
                AFInAppEventType("preInstallName", str);
                int i14 = 67 / 0;
            }
        } catch (JSONException e11) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e11);
        }
    }

    static /* synthetic */ AFf1cSDK values(AFb1tSDK aFb1tSDK) {
        int i11 = afWarnLog + 81;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return aFb1tSDK.unregisterClient();
        }
        aFb1tSDK.unregisterClient();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap = map == null ? null : new HashMap(map);
        AFInAppEventParameterName(context);
        AFh1pSDK aFh1pSDK = new AFh1pSDK();
        aFh1pSDK.AFLogger = str;
        aFh1pSDK.AFInAppEventType = appsFlyerRequestListener;
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
                AFLogger.INSTANCE.w(AFg1gSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1pSDK.AFInAppEventParameterName(singletonMap);
        }
        aFh1pSDK.AFKeystoreWrapper = hashMap;
        AFb1bSDK i11 = values().i();
        Map map2 = aFh1pSDK.AFKeystoreWrapper;
        if (map2 == null) {
            map2 = new HashMap();
        }
        i11.AFInAppEventParameterName("logEvent", str, new JSONObject(map2).toString());
        if (str == null) {
            AFInAppEventParameterName(context, AFg1aSDK.logEvent);
        }
        AFInAppEventParameterName(aFh1pSDK, unregisterClient(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        int i11 = afRDLog + 109;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        start(context, str, null);
        if (i12 != 0) {
            throw null;
        }
        afRDLog = (afWarnLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j11) {
        int i11 = afWarnLog + 79;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            values().afWarnLog().AFInAppEventParameterName = deepLinkListener;
            values().afWarnLog().registerClient = j11;
        } else {
            values().afWarnLog().AFInAppEventParameterName = deepLinkListener;
            values().afWarnLog().registerClient = j11;
            int i12 = 16 / 0;
        }
    }

    public final void valueOf(Context context, Intent intent) {
        AFi1aSDK aFi1aSDK = new AFi1aSDK(intent);
        if (aFi1aSDK.AFKeystoreWrapper("appsflyer_preinstall") != null) {
            afRDLog = (afWarnLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
            registerClient(aFi1aSDK.AFKeystoreWrapper("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String AFKeystoreWrapper2 = aFi1aSDK.AFKeystoreWrapper("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(AFKeystoreWrapper2)));
        if (AFKeystoreWrapper2 != null) {
            AFKeystoreWrapper(context).valueOf("referrer", AFKeystoreWrapper2);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", AFKeystoreWrapper2);
            appsFlyerProperties.AFInAppEventType = AFKeystoreWrapper2;
            if (AppsFlyerProperties.getInstance().AFInAppEventType()) {
                int i11 = afWarnLog + 47;
                afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFg1aSDK.onReceive);
                    AFKeystoreWrapper(AFKeystoreWrapper2);
                } else {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFg1aSDK.onReceive);
                    AFKeystoreWrapper(AFKeystoreWrapper2);
                    int i12 = 87 / 0;
                }
            }
        }
    }

    static /* synthetic */ boolean AFInAppEventParameterName(AFb1tSDK aFb1tSDK, boolean z11) {
        int i11 = afWarnLog;
        afRDLog = (i11 + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFb1tSDK.f57379i = z11;
        int i12 = i11 + 65;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(AFf1gSDK aFf1gSDK) {
        AFd1mSDK values2 = values();
        if (aFf1gSDK == AFf1gSDK.SUCCESS) {
            afWarnLog = (afRDLog + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
            values2.onAppOpenAttributionNative().AFInAppEventType();
        }
        if (!values2.i().values()) {
            afRDLog = (afWarnLog + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
            values2.afLogForce().values();
        } else {
            values2.afLogForce().valueOf();
            afRDLog = (afWarnLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (values().AFLogger$LogLevel().AFKeystoreWrapper()) {
            return;
        }
        if (!this.force) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    int i11 = afRDLog + 49;
                    afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 != 0) {
                        appsFlyerRequestListener.onError(37, "No dev key");
                        return;
                    } else {
                        appsFlyerRequestListener.onError(41, "No dev key");
                        return;
                    }
                }
                return;
            }
        }
        AFInAppEventParameterName(context);
        final AFg1cSDK AFLogger = values().AFLogger();
        AFLogger.values(AFa1qSDK.AFKeystoreWrapper(context));
        if (this.f57380v == null) {
            Application valueOf2 = AFb1uSDK.valueOf(context);
            if (valueOf2 == null) {
                return;
            }
            int i12 = afWarnLog + 69;
            afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                this.f57380v = valueOf2;
                throw null;
            }
            this.f57380v = valueOf2;
        }
        values().i().AFInAppEventParameterName("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.GENERAL;
        String str2 = AFInAppEventParameterName;
        aFLogger.i(aFg1gSDK, "Starting AppsFlyer: (v6.13.1." + str2 + ")");
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.i(aFg1gSDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(values().values());
        if (!TextUtils.isEmpty(str)) {
            int i13 = afWarnLog + 1;
            afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 == 0) {
                values().force().registerClient = str;
                AFb1lSDK.valueOf(str);
                int i14 = 23 / 0;
            } else {
                values().force().registerClient = str;
                AFb1lSDK.valueOf(str);
            }
        } else if (TextUtils.isEmpty(values().force().registerClient)) {
            int i15 = afRDLog + 43;
            afWarnLog = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i15 % 2 == 0) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
        values().d().values(unregisterClient());
        registerClient();
        values(this.f57380v.getBaseContext());
        values().afErrorLog().AFInAppEventType();
        this.afInfoLog.AFLogger$LogLevel().values(context, new AFd1xSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFb1tSDK.1
            @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
            public final void AFKeystoreWrapper(@NonNull AFh1uSDK aFh1uSDK) {
                AFLogger.AFKeystoreWrapper();
                AFd1mSDK values2 = AFb1tSDK.this.values();
                values2.d().values(AFb1tSDK.values(AFb1tSDK.this));
                AFb1tSDK.AFInAppEventParameterName(AFb1tSDK.this);
                int AFInAppEventParameterName2 = values2.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (AFInAppEventParameterName2 < 2) {
                    AFb1tSDK.this.values().registerClient().AFInAppEventParameterName();
                }
                AFh1sSDK aFh1sSDK = new AFh1sSDK();
                if (aFh1uSDK != null) {
                    AFb1tSDK.this.values().afWarnLog().AFKeystoreWrapper(AFc1pSDK.values(aFh1sSDK), aFh1uSDK.AFKeystoreWrapper, values2.w().valueOf);
                }
                AFb1tSDK aFb1tSDK = AFb1tSDK.this;
                aFh1sSDK.AFInAppEventType = appsFlyerRequestListener;
                aFb1tSDK.AFInAppEventParameterName(aFh1sSDK, aFh1uSDK);
            }

            @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
            public final void valueOf() {
                Context context2 = AFb1tSDK.this.values().w().valueOf;
                AFLogger.afInfoLog("onBecameBackground");
                AFg1cSDK aFg1cSDK = AFLogger;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = aFg1cSDK.f57459d;
                if (j11 != 0) {
                    long j12 = currentTimeMillis - j11;
                    if (j12 > 0 && j12 < 1000) {
                        j12 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j12);
                    aFg1cSDK.f57461i = seconds;
                    aFg1cSDK.AFInAppEventType.AFInAppEventParameterName("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1tSDK.this.values().onAppOpenAttributionNative().AFInAppEventParameterName();
                AFb1bSDK i16 = AFb1tSDK.this.values().i();
                if (i16.d()) {
                    i16.AFKeystoreWrapper();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        i16.valueOf(context2.getPackageName(), context2.getPackageManager());
                    }
                    i16.valueOf();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1tSDK.this.values().registerClient().values();
                AFb1tSDK.this.values().AppsFlyer2dXConversionCallback().values();
            }
        });
    }

    public final AFd1mSDK values() {
        int i11 = (afWarnLog + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afRDLog = i11;
        AFd1lSDK aFd1lSDK = this.afInfoLog;
        int i12 = i11 + 21;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            int i13 = 10 / 0;
        }
        return aFd1lSDK;
    }

    private static void AFInAppEventParameterName(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i11)));
                }
            } catch (JSONException e11) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e11);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext()) {
                afRDLog = (afWarnLog + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i12 = 0;
                    while (i12 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i12) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i12) == ((Long) arrayList.get(1)).longValue() || jSONArray2.getLong(i12) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            afWarnLog = (afRDLog + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        } else {
                            i12++;
                            str = next;
                        }
                    }
                } catch (JSONException e12) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e12);
                }
            }
            break loop2;
        }
        if (str != null) {
            jSONObject.remove(str);
            afWarnLog = (afRDLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
    }

    private AFh1uSDK unregisterClient(Context context) {
        int i11 = afWarnLog;
        afRDLog = (i11 + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (context instanceof Activity) {
            return new AFh1uSDK((Activity) context, values().AFVersionDeclaration());
        }
        afRDLog = (i11 + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(boolean z11) {
        int i11 = afWarnLog;
        afRDLog = (i11 + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (!z11) {
            values().afLogForce().AFInAppEventParameterName();
            afWarnLog = (afRDLog + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        }
        int i12 = i11 + 123;
        afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            values().afLogForce().AFInAppEventType();
        } else {
            values().afLogForce().AFInAppEventType();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        values().i().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i11 = 0;
        String str = null;
        while (i11 < length) {
            afWarnLog = (afRDLog + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
            String str2 = strArr[i11];
            if (AnonymousClass4.values[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1mSDK.valueOf(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
            i11++;
            afWarnLog = (afRDLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
        int i12 = afRDLog + 111;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    private static void values(Context context) {
        afWarnLog = (afRDLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                afRDLog = (afWarnLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    afWarnLog = (afRDLog + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    AFLogger.INSTANCE.i(AFg1gSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    int i11 = afWarnLog + 87;
                    afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i11 % 2 == 0) {
                        int i12 = 5 / 0;
                        return;
                    }
                    return;
                }
                AFLogger.INSTANCE.w(AFg1gSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
                afWarnLog = (afRDLog + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        } catch (Exception e11) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK aFg1gSDK = AFg1gSDK.GENERAL;
            aFLogger.e(aFg1gSDK, "checkBackupRules Exception", e11, false, false);
            aFLogger.v(aFg1gSDK, "checkBackupRules Exception: ".concat(String.valueOf(e11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r3 != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        com.appsflyer.internal.AFb1tSDK.afRDLog = (r6 + 49) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r0.valueOf("No direct deep link", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r3 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void AFKeystoreWrapper(Context context, Intent intent) {
        AFInAppEventParameterName(context);
        AFc1uSDK afWarnLog2 = values().afWarnLog();
        AFd1tSDK values2 = values().values();
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        boolean z11 = (data == null || data.toString().isEmpty()) ? false : true;
        if (!(!values2.values("ddl_sent"))) {
            int i11 = afRDLog + 13;
            int i12 = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            afWarnLog = i12;
            if (i11 % 2 != 0) {
                int i13 = 78 / 0;
            }
        }
        afWarnLog2.AFKeystoreWrapper(AFc1pSDK.valueOf(afWarnLog2.unregisterClient.AppsFlyer2dXConversionCallback()), intent, context);
    }

    private void registerClient() {
        afWarnLog = (afRDLog + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (AFf1qSDK.registerClient()) {
            return;
        }
        AFd1mSDK values2 = values();
        AFe1fSDK afInfoLog = values2.afInfoLog();
        afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(new AFf1qSDK(values2)));
        int i11 = afWarnLog + 115;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void values(AFa1pSDK aFa1pSDK) {
        boolean z11;
        int i11 = (afRDLog + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afWarnLog = i11;
        byte b11 = 0;
        if (aFa1pSDK.AFLogger == null) {
            z11 = true;
        } else {
            afRDLog = (i11 + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z11 = false;
        }
        if (AFInAppEventParameterName()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z11) {
            int i12 = afRDLog + 79;
            afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, false)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                afWarnLog = (afRDLog + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else if (e()) {
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1pSDK.AFInAppEventType;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                    return;
                }
                return;
            }
            this.unregisterClient = System.currentTimeMillis();
        }
        AFj1zSDK.AFKeystoreWrapper(values().valueOf(), new AFa1tSDK(this, aFa1pSDK, b11), 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(AFd1mSDK aFd1mSDK) {
        afWarnLog = (afRDLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFd1mSDK.afRDLog().AFKeystoreWrapper();
        afWarnLog = (afRDLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private void AFKeystoreWrapper(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            int i11 = afRDLog + 57;
            afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 != 0) {
                int i12 = 26 / 0;
                return;
            }
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i13 = afWarnLog + 25;
        afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    private void valueOf(Context context, String str, Map<String, Object> map) {
        AFh1pSDK aFh1pSDK = new AFh1pSDK();
        aFh1pSDK.AFLogger = str;
        aFh1pSDK.AFKeystoreWrapper = map;
        AFInAppEventParameterName(aFh1pSDK, unregisterClient(context));
        int i11 = afWarnLog + 107;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (values().v().AFInAppEventType(r0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        com.appsflyer.internal.AFj1zSDK.AFKeystoreWrapper(values().valueOf(), new com.appsflyer.internal.AFb1tSDK.AFa1tSDK(r6, r0, r3), 5, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (values().v().AFInAppEventType(r0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFKeystoreWrapper(String str) {
        byte b11 = 0;
        AFa1pSDK AFInAppEventType = new AFh1oSDK().AFInAppEventType(values().AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0));
        AFInAppEventType.f57364d = str;
        if (str != null) {
            int i11 = afRDLog + 125;
            afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0 ? str.length() > 5 : str.length() > 3) {
                int i12 = afWarnLog + 83;
                afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 == 0) {
                    int i13 = 48 / 0;
                }
            }
        }
        int i14 = afRDLog + 109;
        afWarnLog = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i14 % 2 != 0) {
            int i15 = 72 / 0;
        }
    }

    private static boolean AFInAppEventParameterName(String str) {
        AppsFlyerProperties appsFlyerProperties;
        boolean z11;
        int i11 = afRDLog + 75;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            z11 = true;
        } else {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            z11 = false;
        }
        return appsFlyerProperties.getBoolean(str, z11);
    }

    public final boolean AFInAppEventParameterName() {
        afRDLog = (afWarnLog + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            afWarnLog = (afRDLog + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (AFInAppEventType() == null) {
                int i11 = afRDLog + 75;
                afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                return i11 % 2 == 0;
            }
        }
        return false;
    }

    private void AFInAppEventParameterName(Context context, AFg1aSDK aFg1aSDK) {
        AFInAppEventParameterName(context);
        AFg1cSDK AFLogger = values().AFLogger();
        AFh1zSDK AFKeystoreWrapper2 = AFa1qSDK.AFKeystoreWrapper(context);
        if (AFLogger.values()) {
            afRDLog = (afWarnLog + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFLogger.AFInAppEventParameterName.put("api_name", aFg1aSDK.toString());
            AFLogger.values(AFKeystoreWrapper2);
            afWarnLog = (afRDLog + 15) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        AFLogger.AFKeystoreWrapper();
    }

    public static String valueOf(SimpleDateFormat simpleDateFormat, long j11) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j11));
        int i11 = afWarnLog + 9;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return format;
        }
        throw null;
    }

    private static void AFInAppEventType(String str, String str2) {
        afRDLog = (afWarnLog + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i11 = afRDLog + 77;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            int i12 = 32 / 0;
        }
    }

    private static void AFInAppEventType(String str, boolean z11) {
        int i11 = afWarnLog + 105;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z11);
            throw null;
        }
        AppsFlyerProperties.getInstance().set(str, z11);
        int i12 = afRDLog + 31;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i12 % 2 != 0) {
            int i13 = 11 / 0;
        }
    }

    private void valueOf(Context context, String str) {
        AFh1sSDK aFh1sSDK = new AFh1sSDK();
        AFInAppEventParameterName(context);
        aFh1sSDK.AFLogger = null;
        aFh1sSDK.AFKeystoreWrapper = null;
        aFh1sSDK.f57364d = str;
        aFh1sSDK.values = null;
        values(aFh1sSDK);
        afWarnLog = (afRDLog + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private static String AFInAppEventType(String str) {
        afRDLog = (afWarnLog + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i11 = afRDLog + 83;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static String AFInAppEventType() {
        afRDLog = (afWarnLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFInAppEventType = AFInAppEventType(AppsFlyerProperties.APP_USER_ID);
        afRDLog = (afWarnLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventType;
    }

    private AFf1lSDK.AFa1vSDK AFInAppEventType(final Map<String, String> map) {
        AFf1lSDK.AFa1vSDK aFa1vSDK = new AFf1lSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFb1tSDK.5
            @Override // com.appsflyer.internal.AFf1lSDK.AFa1vSDK
            public final void values(String str) {
                AFb1tSDK.this.values().afWarnLog().valueOf(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1lSDK.AFa1vSDK
            public final void values(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1tSDK.this.values().afWarnLog().AFInAppEventType(map);
            }
        };
        afWarnLog = (afRDLog + 111) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFa1vSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public static synchronized SharedPreferences AFInAppEventType(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (AFb1tSDK.class) {
            try {
                if (valueOf().f57381w == null) {
                    int i11 = afRDLog + 99;
                    afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    StrictMode.ThreadPolicy threadPolicy = i11 % 2;
                    try {
                        if (threadPolicy != 0) {
                            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            valueOf().f57381w = context.getApplicationContext().getSharedPreferences("appsflyer-data", 1);
                            threadPolicy = allowThreadDiskReads;
                        } else {
                            StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            valueOf().f57381w = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                            threadPolicy = allowThreadDiskReads2;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                }
                sharedPreferences = valueOf().f57381w;
                int i12 = afRDLog + 51;
                afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    private void AFInAppEventParameterName(Context context, Map<String, Object> map, AFa1pSDK aFa1pSDK) {
        int i11 = afWarnLog + 101;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            AFInAppEventParameterName(context);
            aFa1pSDK.AFInAppEventParameterName((Map<String, ?>) map);
            AFInAppEventParameterName(aFa1pSDK, unregisterClient(context));
            int i12 = 45 / 0;
        } else {
            AFInAppEventParameterName(context);
            aFa1pSDK.AFInAppEventParameterName((Map<String, ?>) map);
            AFInAppEventParameterName(aFa1pSDK, unregisterClient(context));
        }
        afRDLog = (afWarnLog + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r3.contains("android.permission.INTERNET") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(Context context) {
        List asList;
        int i11 = afRDLog + 97;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i11 % 2 != 0) {
                asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 205).requestedPermissions);
                if (!asList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1gSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    afWarnLog = (afRDLog + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    AFLogger.INSTANCE.w(AFg1gSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }
                if (Build.VERSION.SDK_INT <= 32 || asList.contains("com.google.android.gms.permission.AD_ID")) {
                    return;
                }
                AFLogger.INSTANCE.w(AFg1gSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                return;
            }
            asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
        } catch (Exception e11) {
            AFLogger.INSTANCE.e(AFg1gSDK.GENERAL, "Exception while validation permissions. ", e11);
        }
        AFLogger.INSTANCE.e(AFg1gSDK.GENERAL, "Exception while validation permissions. ", e11);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFKeystoreWrapper(AFa1pSDK aFa1pSDK) {
        String AFInAppEventType;
        Context context = values().w().valueOf;
        if (context == null) {
            afWarnLog = (afRDLog + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        String str = values().force().registerClient;
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1pSDK.AFInAppEventType;
        if (str != null && str.length() != 0) {
            AFd1tSDK AFKeystoreWrapper2 = AFKeystoreWrapper(context);
            AppsFlyerProperties.getInstance().saveProperties(AFKeystoreWrapper2);
            if (!values().force().AFKeystoreWrapper()) {
                AFLogger.afInfoLog("sendWithEvent from activity: ".concat(context.getClass().getName()));
                afRDLog = (afWarnLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            boolean values2 = aFa1pSDK.values();
            Map<String, ?> valueOf2 = valueOf(aFa1pSDK);
            if (!isStopped()) {
                int i11 = afRDLog + 41;
                afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                    throw null;
                }
                AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
            }
            int i12 = 0;
            int AFInAppEventType2 = AFInAppEventType(AFKeystoreWrapper2, false);
            AFi1eSDK aFi1eSDK = new AFi1eSDK(values().AFInAppEventType());
            Intrinsics.checkNotNullParameter(aFa1pSDK, "");
            boolean values3 = aFa1pSDK.values();
            boolean z11 = aFa1pSDK instanceof AFh1vSDK;
            boolean z12 = aFa1pSDK instanceof AFh1tSDK;
            boolean z13 = aFa1pSDK instanceof AFh1oSDK;
            if (!(aFa1pSDK instanceof AFh1wSDK)) {
                int i13 = (afRDLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
                afWarnLog = i13;
                if (!z13) {
                    if (z12) {
                        AFInAppEventType = aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.valueOf);
                    } else if (z11) {
                        int i14 = i13 + 13;
                        afRDLog = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i14 % 2 == 0) {
                            aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.AFInAppEventType);
                            throw null;
                        }
                        AFInAppEventType = aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.AFInAppEventType);
                    } else if (values3) {
                        if (aFi1eSDK.AFKeystoreWrapper.AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0) < 2) {
                            afRDLog = (afWarnLog + 17) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            AFInAppEventType = aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.AFLogger);
                        } else {
                            AFInAppEventType = aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.f57485d);
                        }
                    } else {
                        AFInAppEventType = aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.f57486e);
                    }
                    StringBuilder e11 = C3261b.e(AFInAppEventType);
                    e11.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
                    String valueOf3 = aFi1eSDK.valueOf(AFi1eSDK.AFInAppEventType(e11.toString(), z11));
                    AFInAppEventParameterName(valueOf2);
                    AFc1sSDK aFc1sSDK = new AFc1sSDK(values(), aFa1pSDK.AFInAppEventParameterName(valueOf3).AFInAppEventParameterName(valueOf2).AFInAppEventType(AFInAppEventType2), values().afErrorLog().valueOf());
                    if (values2) {
                        AFi1jSDK[] d11 = d();
                        int length = d11.length;
                        int i15 = 0;
                        while (i12 < length) {
                            AFi1jSDK aFi1jSDK = d11[i12];
                            if (aFi1jSDK.f57489d == AFi1jSDK.AFa1tSDK.STARTED) {
                                StringBuilder sb2 = new StringBuilder("Failed to get ");
                                sb2.append(aFi1jSDK.AFKeystoreWrapper);
                                sb2.append(" referrer, wait ...");
                                AFLogger.afDebugLog(sb2.toString());
                                afWarnLog = (afRDLog + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
                                i15 = 1;
                            }
                            i12++;
                            afWarnLog = (afRDLog + 99) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        if (values().afErrorLog().values()) {
                            afRDLog = (afWarnLog + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                            i12 = 1;
                        } else {
                            i12 = i15;
                        }
                        if (values().force().valueOf()) {
                            i12 = 1;
                        }
                    }
                    AFj1zSDK.AFKeystoreWrapper(values().valueOf(), aFc1sSDK, i12 == 0 ? 500L : 0L, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            AFInAppEventType = aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.AFInAppEventParameterName);
            StringBuilder e112 = C3261b.e(AFInAppEventType);
            e112.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
            String valueOf32 = aFi1eSDK.valueOf(AFi1eSDK.AFInAppEventType(e112.toString(), z11));
            AFInAppEventParameterName(valueOf2);
            AFc1sSDK aFc1sSDK2 = new AFc1sSDK(values(), aFa1pSDK.AFInAppEventParameterName(valueOf32).AFInAppEventParameterName(valueOf2).AFInAppEventType(AFInAppEventType2), values().afErrorLog().valueOf());
            if (values2) {
            }
            AFj1zSDK.AFKeystoreWrapper(values().valueOf(), aFc1sSDK2, i12 == 0 ? 500L : 0L, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
        AFLogger.afInfoLog("AppsFlyer will not track this event.");
        if (appsFlyerRequestListener != null) {
            int i16 = afRDLog + 31;
            afWarnLog = i16 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i16 % 2 != 0) {
                appsFlyerRequestListener.onError(61, "No dev key");
            } else {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
        }
    }

    @NonNull
    final Map<String, Object> valueOf(AFa1pSDK aFa1pSDK) {
        boolean z11;
        String str;
        final Context context = values().w().valueOf;
        AFd1tSDK AFKeystoreWrapper2 = AFKeystoreWrapper(context);
        AFg1qSDK unregisterClient = values().unregisterClient();
        boolean values2 = aFa1pSDK.values();
        Map<String, Object> map = aFa1pSDK.valueOf;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a((byte) (1 - TextUtils.lastIndexOf("", '0', 0, 0)), 12 - Color.blue(0), "\u0006\u0000\b\u0002\u0000\u0002\u0001\u0007\u0006\u0005\u0002\u0001", objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (values2) {
                    afRDLog = (afWarnLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    str = "Launch";
                } else {
                    str = aFa1pSDK.AFLogger;
                    afRDLog = (afWarnLog + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                sb2.append(str);
                AFLogger.afInfoLog(sb2.toString());
            } else {
                AFLogger.afInfoLog("Reporting has been stopped");
            }
            e(context);
            unregisterClient.AFKeystoreWrapper(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerClient;
                    registerClient = AFb1tSDK.this.registerClient(context);
                    return registerClient;
                }
            });
            int AFInAppEventType = AFInAppEventType(AFKeystoreWrapper2, values2);
            if (aFa1pSDK.AFLogger != null) {
                afRDLog = (afWarnLog + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
                z11 = true;
            } else {
                z11 = false;
            }
            int AFKeystoreWrapper3 = AFKeystoreWrapper(AFKeystoreWrapper2, z11);
            if (values2) {
                afRDLog = (afWarnLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (AFInAppEventType == 1) {
                    AppsFlyerProperties.getInstance().AFKeystoreWrapper = true;
                }
            }
            unregisterClient.AFInAppEventParameterName(map, AFInAppEventType, AFKeystoreWrapper3);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2, true);
        }
        int i11 = afWarnLog + 23;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            int i12 = 31 / 0;
        }
        return map;
    }

    public static Map<String, Object> values(Map<String, Object> map) {
        afRDLog = (afWarnLog + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (!map.containsKey("meta")) {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            afRDLog = (afWarnLog + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return hashMap;
        }
        int i11 = afRDLog + 43;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            throw null;
        }
        return (Map) map.get("meta");
    }

    final void AFInAppEventParameterName(@NonNull AFa1pSDK aFa1pSDK, AFh1uSDK aFh1uSDK) {
        afWarnLog = (afRDLog + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
        valueOf(aFa1pSDK, aFh1uSDK);
        if (values().force().registerClient == null) {
            int i11 = afRDLog + 87;
            afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1pSDK.AFInAppEventType;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener2 = aFa1pSDK.AFInAppEventType;
            throw null;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(values().values());
        if (referrer == null) {
            int i12 = afWarnLog + 1;
            afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                int i13 = 70 / 0;
            }
            referrer = "";
        }
        aFa1pSDK.f57364d = referrer;
        values(aFa1pSDK);
        int i14 = afWarnLog + 123;
        afRDLog = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String values(Activity activity) {
        Intent intent;
        int i11 = afRDLog;
        int i12 = i11 + 3;
        afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
        String str = null;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (activity != null) {
            int i13 = i11 + 17;
            afWarnLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 != 0) {
                intent = activity.getIntent();
                int i14 = 62 / 0;
            } else {
                intent = activity.getIntent();
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (str = extras.getString("af")) != null) {
                    AFLogger.INSTANCE.w(AFg1gSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                    afRDLog = (afWarnLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1gSDK.ENGAGEMENT, th2.getMessage(), th2);
            }
        }
        int i15 = afRDLog + 121;
        afWarnLog = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i15 % 2 != 0) {
            int i16 = 36 / 0;
        }
        return str;
    }

    public static int AFInAppEventType(AFd1tSDK aFd1tSDK, boolean z11) {
        int i11 = afWarnLog + 21;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 != 0) {
            return values(aFd1tSDK, "appsFlyerCount", z11);
        }
        values(aFd1tSDK, "appsFlyerCount", z11);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r4.remove("android_id") != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        com.appsflyer.internal.AFb1tSDK.afWarnLog = (com.appsflyer.internal.AFb1tSDK.afRDLog + 35) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r4.remove("android_id") != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r4.remove("imei") != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (r4.remove("imei") != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFInAppEventParameterName(Map<String, Object> map) {
        afWarnLog = (afRDLog + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) || map.get("advertiserId") == null) {
            return;
        }
        try {
        } catch (Exception e11) {
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e11);
            return;
        }
        if (AFc1rSDK.AFInAppEventType(values().afErrorLogForExcManagerOnly().values)) {
            int i11 = afWarnLog + 17;
            afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                int i12 = 33 / 0;
            }
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e11);
            return;
        }
        if (AFc1rSDK.AFInAppEventType(values().force().unregisterClient)) {
            int i13 = afWarnLog + 109;
            afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i13 % 2 == 0) {
                int i14 = 85 / 0;
            }
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e11);
            return;
        }
        afWarnLog = (afRDLog + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public final void values(Context context, AFc1pSDK aFc1pSDK, Uri uri, Uri uri2) {
        AFInAppEventParameterName(context);
        if (!aFc1pSDK.values("af_deeplink")) {
            String valueOf2 = valueOf(uri.toString());
            AFc1uSDK afWarnLog2 = values().afWarnLog();
            String str = afWarnLog2.AFInAppEventType;
            if (str != null) {
                int i11 = afWarnLog + 83;
                afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    if (afWarnLog2.values != null && valueOf2.contains(str)) {
                        Uri.Builder buildUpon = Uri.parse(valueOf2).buildUpon();
                        Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                        for (Map.Entry<String, String> entry : afWarnLog2.values.entrySet()) {
                            afWarnLog = (afRDLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
                            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                            buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                        valueOf2 = buildUpon.build().toString();
                        String encodedQuery = buildUpon2.build().getEncodedQuery();
                        Intrinsics.checkNotNullParameter("appended_query_params", "");
                        aFc1pSDK.AFInAppEventParameterName.put("appended_query_params", encodedQuery);
                        AFc1oSDK aFc1oSDK = aFc1pSDK.AFInAppEventType;
                        if (aFc1oSDK != null) {
                            aFc1oSDK.values(aFc1pSDK.AFInAppEventParameterName);
                        }
                    }
                } else {
                    throw null;
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1pSDK.AFInAppEventParameterName.put("af_deeplink", valueOf2);
            AFc1oSDK aFc1oSDK2 = aFc1pSDK.AFInAppEventType;
            if (aFc1oSDK2 != null) {
                afRDLog = (afWarnLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                aFc1oSDK2.values(aFc1pSDK.AFInAppEventParameterName);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            afWarnLog = (afRDLog + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
            hashMap.put("original_link", uri2.toString());
        }
        AFb1uSDK.values(context, hashMap, uri);
        AFf1lSDK aFf1lSDK = new AFf1lSDK(values(), UUID.randomUUID(), uri);
        if (aFf1lSDK.i()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1pSDK.AFInAppEventParameterName.put("isBrandedDomain", bool);
            AFc1oSDK aFc1oSDK3 = aFc1pSDK.AFInAppEventType;
            if (aFc1oSDK3 != null) {
                aFc1oSDK3.values(aFc1pSDK.AFInAppEventParameterName);
            }
        }
        if (aFf1lSDK.w()) {
            aFf1lSDK.f57423e = AFInAppEventType(hashMap);
            AFe1fSDK afInfoLog = values().afInfoLog();
            afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFf1lSDK));
            return;
        }
        values().afWarnLog().AFInAppEventType(hashMap);
    }

    private static int valueOf(AFd1tSDK aFd1tSDK) {
        int i11 = afWarnLog + 67;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        return values(aFd1tSDK, "appsFlyerAdImpressionCount", i11 % 2 != 0);
    }

    private static String valueOf(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        String values2 = values(str);
        if (values2.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (values2.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(values2.split("&")));
            afWarnLog = (afRDLog + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            arrayList.add(values2);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.contains("access_token")) {
                int i11 = afRDLog + 77;
                afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i11 % 2 != 0) {
                    it.remove();
                    throw null;
                }
                it.remove();
            } else {
                if (sb2.length() != 0) {
                    int i12 = afRDLog + 101;
                    afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i12 % 2 != 0) {
                        sb2.append("&");
                        throw null;
                    }
                    sb2.append("&");
                } else if (!str2.startsWith("?")) {
                    int i13 = afWarnLog + 29;
                    afRDLog = i13 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i13 % 2 == 0) {
                        sb2.append("?");
                        throw null;
                    }
                    sb2.append("?");
                }
                sb2.append(str2);
            }
        }
        return str.replace(values2, sb2.toString());
    }

    private static int AFInAppEventParameterName(AFd1tSDK aFd1tSDK) {
        int i11 = afWarnLog + 55;
        afRDLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i12 = i11 % 2;
        return values(aFd1tSDK, "appsFlyerAdRevenueCount", true);
    }

    public final void AFInAppEventParameterName(@NonNull Context context) {
        int i11 = afWarnLog;
        afRDLog = (i11 + 41) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1lSDK aFd1lSDK = this.afInfoLog;
        if (context != null) {
            int i12 = i11 + 111;
            afRDLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 != 0) {
                aFd1lSDK.AFInAppEventParameterName.valueOf = context.getApplicationContext();
            } else {
                AFd1kSDK aFd1kSDK = aFd1lSDK.AFInAppEventParameterName;
                throw null;
            }
        }
    }

    public static boolean valueOf(Context context) {
        afWarnLog = (afRDLog + 101) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                afWarnLog = (afRDLog + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return true;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            AFLogger.INSTANCE.e(AFg1gSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e11);
            return false;
        }
    }

    private static void valueOf(@NonNull AFa1pSDK aFa1pSDK, AFh1uSDK aFh1uSDK) {
        int i11 = (afWarnLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afRDLog = i11;
        if (aFh1uSDK != null) {
            int i12 = i11 + 125;
            afWarnLog = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                aFa1pSDK.values = aFh1uSDK.values;
                aFa1pSDK.f57365e = aFh1uSDK.valueOf;
                afWarnLog = (i11 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                aFa1pSDK.values = aFh1uSDK.values;
                aFa1pSDK.f57365e = aFh1uSDK.valueOf;
                throw null;
            }
        }
    }

    private static String values(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf == -1) {
            afRDLog = (afWarnLog + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return "";
        }
        String substring = str.substring(indexOf);
        afWarnLog = (afRDLog + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return substring;
    }

    private String values(Context context, String str) {
        if (context == null) {
            afRDLog = (afWarnLog + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        }
        AFInAppEventParameterName(context);
        String AFInAppEventParameterName2 = values().AFInAppEventType().AFInAppEventParameterName(str);
        afRDLog = (afWarnLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventParameterName2;
    }

    private static int values(AFd1tSDK aFd1tSDK, String str, boolean z11) {
        int AFInAppEventParameterName2 = aFd1tSDK.AFInAppEventParameterName(str, 0);
        if (!(!z11)) {
            afRDLog = (afWarnLog + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFInAppEventParameterName2++;
            aFd1tSDK.values(str, AFInAppEventParameterName2);
            afRDLog = (afWarnLog + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        afRDLog = (afWarnLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return AFInAppEventParameterName2;
    }

    public static String AFKeystoreWrapper(AFd1tSDK aFd1tSDK, String str) {
        afRDLog = (afWarnLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        String AFKeystoreWrapper2 = aFd1tSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (AFKeystoreWrapper2 != null) {
            return AFKeystoreWrapper2;
        }
        aFd1tSDK.valueOf("CACHED_CHANNEL", str);
        afWarnLog = (afRDLog + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return str;
    }

    public final AFd1tSDK AFKeystoreWrapper(Context context) {
        afWarnLog = (afRDLog + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFInAppEventParameterName(context);
        AFd1tSDK values2 = values().values();
        afRDLog = (afWarnLog + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return values2;
    }

    private static int AFKeystoreWrapper(AFd1tSDK aFd1tSDK, boolean z11) {
        int i11 = afRDLog + 31;
        afWarnLog = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            return values(aFd1tSDK, "appsFlyerInAppEventCount", z11);
        }
        values(aFd1tSDK, "appsFlyerInAppEventCount", z11);
        throw null;
    }
}
