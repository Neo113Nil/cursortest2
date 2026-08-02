package com.tiktok.appevents;

import android.os.Build;
import android.os.SystemClock;
import com.amplitude.api.Constants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTIdentifierFactory;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTUtil;
import com.tiktok.util.TimeUtil;
import io.intercom.android.sdk.identity.UserIdentity;
import io.sentry.Session;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class TTRequestBuilder {
    private static final String TAG = "com.tiktok.appevents.TTRequestBuilder";
    private static JSONObject basePayloadCache = null;
    private static boolean containTestCode = false;
    private static JSONObject contextForApiCache;
    private static JSONObject healthBasePayloadCache;

    TTRequestBuilder() {
    }

    public static JSONObject getBasePayloadWithTs() {
        JSONObject basePayload = getBasePayload();
        try {
            basePayload.put("timestamp", TimeUtil.getISO8601Timestamp(new Date()));
        } catch (Exception unused) {
        }
        return basePayload;
    }

    public static JSONObject getBasePayload() {
        TTUtil.checkThread(TAG);
        boolean z = TikTokBusinessSdk.isInSdkDebugMode().booleanValue() || TikTokBusinessSdk.isEnableDebugMode().booleanValue();
        try {
            JSONObject jSONObject = basePayloadCache;
            if (jSONObject != null) {
                if (z != containTestCode) {
                    if (z) {
                        jSONObject.put("test_event_code", String.valueOf(TikTokBusinessSdk.getTTAppId()));
                        containTestCode = true;
                    } else {
                        jSONObject.remove("test_event_code");
                        containTestCode = false;
                    }
                }
                return basePayloadCache;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (TikTokBusinessSdk.onlyAppIdProvided()) {
                jSONObject2.put("app_id", TikTokBusinessSdk.getAppId());
            } else {
                jSONObject2.put("tiktok_app_id", TikTokBusinessSdk.getFirstTTAppIds());
            }
            if (z) {
                jSONObject2.put("test_event_code", String.valueOf(TikTokBusinessSdk.getTTAppId()));
                containTestCode = true;
            }
            jSONObject2.put("event_source", "APP_EVENTS_SDK");
            basePayloadCache = jSONObject2;
            return jSONObject2;
        } catch (Exception e) {
            TTCrashHandler.handleCrash(TAG, e, 2);
            JSONObject jSONObject3 = new JSONObject();
            basePayloadCache = jSONObject3;
            return jSONObject3;
        }
    }

    private static JSONObject getImmutableContextForApi(TTAppEvent event) throws JSONException {
        TTIdentifierFactory.AdIdInfo adIdInfo;
        JSONObject jSONObject = contextForApiCache;
        if (jSONObject != null) {
            freshOsVersion(jSONObject, event);
            return contextForApiCache;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TTIdentifierFactory.AdIdInfo adIdInfo2 = null;
        try {
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("did_start", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)), null);
            adIdInfo = TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null;
        } catch (Exception unused) {
        }
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("did_end", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis2)).put("latency", currentTimeMillis2 - currentTimeMillis).put("success", (adIdInfo.getAdId() == null || adIdInfo.getAdId() == "") ? false : true), null);
        } catch (Exception unused2) {
            adIdInfo2 = adIdInfo;
            adIdInfo = adIdInfo2;
            JSONObject contextBuilderWithLocalAndLibrary = contextBuilderWithLocalAndLibrary(adIdInfo);
            contextForApiCache = contextBuilderWithLocalAndLibrary;
            freshOsVersion(contextBuilderWithLocalAndLibrary, event);
            return contextForApiCache;
        }
        JSONObject contextBuilderWithLocalAndLibrary2 = contextBuilderWithLocalAndLibrary(adIdInfo);
        contextForApiCache = contextBuilderWithLocalAndLibrary2;
        freshOsVersion(contextBuilderWithLocalAndLibrary2, event);
        return contextForApiCache;
    }

    public static JSONObject ddlJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject contextBuilder = contextBuilder(TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null, true);
            contextBuilder.put("user", TTUserInfo.sharedInstance.toJsonObject());
            jSONObject.put("tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            jSONObject.put("context", contextBuilder);
            jSONObject.put("timestamp", TimeUtil.getISO8601Timestamp(new Date(System.currentTimeMillis())));
            jSONObject.put("ip", SystemInfoUtil.getLocalIpAddress());
            String userAgent = SystemInfoUtil.getUserAgent();
            if (userAgent != null) {
                jSONObject.put(Session.JsonKeys.USER_AGENT, userAgent);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void freshOsVersion(JSONObject contextForApiCache2, TTAppEvent event) {
        try {
            JSONObject jSONObject = contextForApiCache2.getJSONObject("device");
            if (event != null && jSONObject != null) {
                jSONObject.put(Constants.AMP_TRACKING_OPTION_OS_VERSION, SystemInfoUtil.getAndroidVersion());
                jSONObject.remove("version");
            } else {
                jSONObject.put("version", SystemInfoUtil.getAndroidVersion());
                jSONObject.remove(Constants.AMP_TRACKING_OPTION_OS_VERSION);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static JSONObject getContextForApi(TTAppEvent event) throws JSONException {
        JSONObject jSONObject = new JSONObject(getImmutableContextForApi(event).toString());
        jSONObject.put("user", event.getUserInfo().toJsonObject());
        return jSONObject;
    }

    private static Locale getCurrentLocale() {
        return TikTokBusinessSdk.getApplicationContext().getResources().getConfiguration().getLocales().get(0);
    }

    static String getBcp47Language() {
        return getCurrentLocale().toLanguageTag();
    }

    private static JSONObject contextBuilderWithLocalAndLibrary(TTIdentifierFactory.AdIdInfo adIdInfo) throws JSONException {
        JSONObject contextBuilder = contextBuilder(adIdInfo, false);
        contextBuilder.put("locale", getBcp47Language());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "tiktok/" + TTRequest.LIBRARY_NAME);
        jSONObject.put("version", SystemInfoUtil.getSDKVersion());
        contextBuilder.put("library", jSONObject);
        return contextBuilder;
    }

    private static JSONObject contextBuilder(TTIdentifierFactory.AdIdInfo adIdInfo, boolean isDDL) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TikTokBusinessSdk.bothIdsProvided()) {
            jSONObject.put("id", TikTokBusinessSdk.getAppId());
        }
        jSONObject.put("name", SystemInfoUtil.getAppName());
        jSONObject.put("namespace", SystemInfoUtil.getPackageName());
        jSONObject.put("version", SystemInfoUtil.getAppVersionName());
        jSONObject.put("build", SystemInfoUtil.getAppVersionCode() + "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("platform", "Android");
        jSONObject2.put(Constants.AMP_TRACKING_OPTION_OS_VERSION, SystemInfoUtil.getAndroidVersion());
        if (adIdInfo != null) {
            jSONObject2.put("gaid", adIdInfo.getAdId());
        }
        addDeviceInfo(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put("tiktok_app_id", TikTokBusinessSdk.getTTAppId());
        jSONObject.put("app_session_id", SystemInfoUtil.getAppSessionId());
        jSONObject.put(UserIdentity.ANONYMOUS_ID, TTUserInfo.sharedInstance.anonymousId);
        jSONObject3.put(App.TYPE, jSONObject);
        jSONObject3.put("device", jSONObject2);
        if (SystemInfoUtil.getInstallReferrer() != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("gp_referrer", SystemInfoUtil.getInstallReferrer().getGoogleInstallReferrer());
            jSONObject3.put("ad", jSONObject4);
        }
        if (!isDDL) {
            jSONObject3.put("ip", SystemInfoUtil.getLocalIpAddress());
            String userAgent = SystemInfoUtil.getUserAgent();
            if (userAgent != null) {
                jSONObject3.put(Session.JsonKeys.USER_AGENT, userAgent);
            }
        }
        return jSONObject3;
    }

    private static JSONObject enrichDeviceBase(JSONObject d) throws JSONException {
        JSONObject jSONObject = new JSONObject(d.toString());
        jSONObject.put("id", TTUtil.getOrGenAnoId(TikTokBusinessSdk.getApplicationContext(), false));
        jSONObject.put(Session.JsonKeys.USER_AGENT, SystemInfoUtil.getUserAgent());
        jSONObject.put("ip", SystemInfoUtil.getLocalIpAddress());
        jSONObject.put("network", SystemInfoUtil.getNetworkClass(TikTokBusinessSdk.getApplicationContext()));
        jSONObject.put(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, TikTokBusinessSdk.getSessionID());
        jSONObject.put("locale", getBcp47Language());
        jSONObject.put("ts", System.currentTimeMillis() - SystemClock.elapsedRealtime());
        addDeviceInfo(jSONObject);
        return jSONObject;
    }

    private static void addDeviceInfo(JSONObject device) {
        try {
            device.put("locale", getBcp47Language());
            int[] screenWidthAndHeight = SystemInfoUtil.getScreenWidthAndHeight();
            device.put("screen_width", screenWidthAndHeight[0]);
            device.put("screen_height", screenWidthAndHeight[1]);
            device.put("model", Build.MODEL);
            device.put("version", Build.VERSION.RELEASE);
            device.put("scale", TikTokBusinessSdk.getApplicationContext().getResources().getDisplayMetrics().density);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject getHealthMonitorBase() throws JSONException {
        JSONObject jSONObject = healthBasePayloadCache;
        if (jSONObject != null) {
            jSONObject.put("device", enrichDeviceBase(jSONObject.getJSONObject("device")));
            healthBasePayloadCache.put("timestamp", TimeUtil.getISO8601Timestamp(new Date()));
            return healthBasePayloadCache;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject(getImmutableContextForApi(null).getJSONObject(App.TYPE).toString());
        jSONObject3.put("app_namespace", SystemInfoUtil.getPackageName());
        jSONObject2.put(App.TYPE, jSONObject3);
        jSONObject2.put("library", getImmutableContextForApi(null).get("library"));
        jSONObject2.put("device", enrichDeviceBase(getImmutableContextForApi(null).getJSONObject("device")));
        jSONObject2.put("log_extra", (Object) null);
        healthBasePayloadCache = jSONObject2;
        jSONObject2.put("timestamp", TimeUtil.getISO8601Timestamp(new Date()));
        return healthBasePayloadCache;
    }
}
