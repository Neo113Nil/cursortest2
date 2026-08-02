package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1fSDK.AnonymousClass3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1uSDK {
    public DeepLinkListener AFInAppEventParameterName;
    public String AFInAppEventType;

    /* renamed from: d, reason: collision with root package name */
    public String[] f57382d;
    public long registerClient;
    public final AFd1mSDK unregisterClient;
    public Intent valueOf;
    public Map<String, String> values;

    @NonNull
    public List<List<String>> AFKeystoreWrapper = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final List<String> f57383e = new ArrayList();

    public AFc1uSDK(@NonNull AFd1mSDK aFd1mSDK) {
        this.unregisterClient = aFd1mSDK;
    }

    private static void AFInAppEventParameterName(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    private Uri values(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e11) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e11);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.AFInAppEventParameterName == null) {
            AFInAppEventParameterName(map);
            return;
        }
        try {
            try {
                DeepLink values = DeepLink.values(map);
                values.AFInAppEventType.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(values, null);
            } catch (JSONException e11) {
                AFLogger.INSTANCE.e(AFg1gSDK.DDL, "Error occurred", e11, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            valueOf(deepLinkResult);
        } catch (Throwable th2) {
            valueOf(new DeepLinkResult(null, null));
            throw th2;
        }
    }

    public final void AFKeystoreWrapper(AFc1pSDK aFc1pSDK, Intent intent, Context context) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) this.unregisterClient;
        if (context != null) {
            aFd1lSDK.AFInAppEventParameterName.valueOf = context.getApplicationContext();
        }
        if (!valueOf(intent, context, aFc1pSDK) && this.AFInAppEventParameterName != null && this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.AFInAppEventParameterName("appsFlyerCount", 0) == 0 && !this.unregisterClient.values().values("ddl_sent")) {
            AFc1kSDK aFc1kSDK = new AFc1kSDK();
            AFe1fSDK afInfoLog = this.unregisterClient.afInfoLog();
            afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(new AFf1nSDK(aFc1kSDK, this.unregisterClient)));
        }
        this.unregisterClient.values().values("ddl_sent", true);
    }

    public final void valueOf(Context context, AFc1pSDK aFc1pSDK, Uri uri) {
        AFf1mSDK aFf1mSDK = new AFf1mSDK(context, aFc1pSDK, uri, this.f57383e);
        AFe1fSDK afInfoLog = this.unregisterClient.afInfoLog();
        afInfoLog.AFKeystoreWrapper.execute(afInfoLog.new AnonymousClass3(aFf1mSDK));
        this.valueOf = null;
    }

    public final void valueOf(String str, DeepLinkResult.Error error) {
        if (this.AFInAppEventParameterName != null) {
            AFLogger.INSTANCE.d(AFg1gSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            valueOf(new DeepLinkResult(null, error));
        } else {
            values(str);
        }
    }

    private static void values(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void valueOf(DeepLinkResult deepLinkResult) {
        if (this.AFInAppEventParameterName != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1gSDK aFg1gSDK = AFg1gSDK.DDL;
            StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            aFLogger.d(aFg1gSDK, sb2.toString());
            try {
                this.AFInAppEventParameterName.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1gSDK.DDL, "skipping, no callback registered");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean valueOf(Intent intent, Context context, AFc1pSDK aFc1pSDK) {
        String string;
        Uri values;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.valueOf;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.AFKeystoreWrapper.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.AFKeystoreWrapper.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            values = values(string, it2);
                            if (values == null) {
                                StringBuilder sb2 = new StringBuilder("Found deeplink in push payload at ");
                                sb2.append(next.toString());
                                AFLogger.afDebugLog(sb2.toString());
                                List<List<String>> list = this.AFKeystoreWrapper;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> values2 = AFb1tSDK.values(aFc1pSDK.AFInAppEventParameterName);
                                Intrinsics.checkNotNullExpressionValue(values2, "");
                                values2.put("payloadKey", list);
                                AFc1oSDK aFc1oSDK = aFc1pSDK.AFInAppEventType;
                                if (aFc1oSDK != null) {
                                    aFc1oSDK.values(aFc1pSDK.AFInAppEventParameterName);
                                }
                                uri = values;
                            }
                        }
                    }
                    values = null;
                    if (values == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFi1aSDK aFi1aSDK = new AFi1aSDK(intent);
            if (!aFi1aSDK.AFInAppEventType("af_consumed")) {
                aFi1aSDK.AFInAppEventType("af_consumed", System.currentTimeMillis());
                valueOf(context, aFc1pSDK, data);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb3.append(data.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (data2 != null) {
            AFi1aSDK aFi1aSDK2 = new AFi1aSDK(this.valueOf);
            if (!aFi1aSDK2.AFInAppEventType("af_consumed")) {
                aFi1aSDK2.AFInAppEventType("af_consumed", System.currentTimeMillis());
                valueOf(context, aFc1pSDK, data2);
                return true;
            }
            StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb4.append(data2.toString());
            sb4.append(" w/af_consumed");
            AFLogger.afInfoLog(sb4.toString());
            return false;
        }
        if (uri != null) {
            AFi1aSDK aFi1aSDK3 = new AFi1aSDK(intent);
            if (!aFi1aSDK3.AFInAppEventType("af_consumed")) {
                aFi1aSDK3.AFInAppEventType("af_consumed", System.currentTimeMillis());
                valueOf(context, aFc1pSDK, uri);
                return true;
            }
            StringBuilder sb5 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
            sb5.append(uri.toString());
            sb5.append(" w/af_consumed");
            AFLogger.afInfoLog(sb5.toString());
            return false;
        }
        AFLogger.afDebugLog("No deep link detected");
        return false;
    }
}
