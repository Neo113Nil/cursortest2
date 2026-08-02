package com.tiktok.appevents;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTIdentifierFactory;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTConst;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import com.tiktok.util.TimeUtil;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class TTRequest {
    public static String LIBRARY_NAME = null;
    private static final int MAX_EVENT_SIZE = 50;
    private static final String TAG = "com.tiktok.appevents.TTRequest";
    private static final Map<String, String> getHeadParamMap;
    private static final Map<String, String> headParamMap;
    private static final TTLogger logger = new TTLogger(TTRequest.class.getCanonicalName(), TikTokBusinessSdk.getLogLevel());
    private static int toBeSentRequests = 0;
    private static int failedRequests = 0;
    private static int successfulRequests = 0;
    private static final TreeSet<Long> allRequestIds = new TreeSet<>();
    private static final List<TTAppEvent> successfullySentRequests = new ArrayList();

    TTRequest() {
    }

    static {
        HashMap hashMap = new HashMap();
        headParamMap = hashMap;
        getHeadParamMap = new HashMap();
        LIBRARY_NAME = "tiktok-business-android-sdk";
        hashMap.put("Content-Type", "application/json");
        hashMap.put(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            LIBRARY_NAME = "tiktok-business-unity-android-sdk";
        } catch (Throwable unused) {
        }
        String format = String.format("tiktok-business-android-sdk/%s/%s", "1.5.0", TikTokBusinessSdk.getApiAvailableVersion());
        headParamMap.put("User-Agent", format);
        Map<String, String> map = getHeadParamMap;
        map.put(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        map.put("User-Agent", format);
        map.put("Content-Type", "application/json");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject getBusinessSDKConfig() {
        JSONObject jSONObject;
        long currentTimeMillis = System.currentTimeMillis();
        logger.info("Try to fetch global configs", new Object[0]);
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", TikTokBusinessSdk.getAppId());
            jSONObject3.put("tiktok_app_id", TikTokBusinessSdk.getTTAppId());
            jSONObject3.put("version", SystemInfoUtil.getAppVersionName());
            jSONObject2.put(App.TYPE, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("platform", "Android");
            TTIdentifierFactory.AdIdInfo googleAdIdInfo = TikTokBusinessSdk.isGaidCollectionEnabled() ? TTIdentifierFactory.getGoogleAdIdInfo(TikTokBusinessSdk.getApplicationContext()) : null;
            if (googleAdIdInfo != null) {
                jSONObject4.put("gaid", googleAdIdInfo.getAdId());
            }
            jSONObject4.put("version", SystemInfoUtil.getAndroidVersion());
            jSONObject2.put("device", jSONObject4);
            if (TikTokBusinessSdk.isInSdkDebugMode().booleanValue()) {
                jSONObject2.put("debug", "true");
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("name", "tiktok/" + LIBRARY_NAME);
            jSONObject5.put("version", SystemInfoUtil.getSDKVersion());
            jSONObject5.put("smart_sdk_client_flag", TikTokBusinessSdk.isEdpEnable());
            jSONObject2.put("library", jSONObject5);
        } catch (Exception e) {
            logger.error(e, e.getMessage(), new Object[0]);
        }
        TTLogger tTLogger = logger;
        tTLogger.debug("https://analytics.us.tiktok.com/api/v1/app_sdk/config", new Object[0]);
        if (TextUtils.isEmpty(TikTokBusinessSdk.getTTAppId()) || TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
            try {
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("config_api", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)).put("latency", System.currentTimeMillis() - currentTimeMillis).put("success", false).put("log_id", ""), null);
            } catch (Exception unused) {
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.optBoolean(EDPConfig.ConfigConst.ENABLE_SDK, false);
            return jSONObject6;
        }
        String doPost = HttpRequestUtil.doPost("https://analytics.us.tiktok.com/api/v1/app_sdk/config", getHeadParamMap, jSONObject2.toString(), false);
        tTLogger.debug(doPost, new Object[0]);
        if (doPost != null) {
            try {
                JSONObject jSONObject7 = new JSONObject(doPost);
                jSONObject = ((Integer) jSONObject7.get("code")).intValue() == 0 ? (JSONObject) jSONObject7.get("data") : null;
            } catch (Exception e2) {
                e = e2;
                jSONObject = null;
            }
            try {
                tTLogger.info("Global config fetched: " + TTUtil.ppStr(jSONObject), new Object[0]);
            } catch (Exception e3) {
                e = e3;
                TTCrashHandler.handleCrash(TAG, e, 2);
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("config_api", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)).put("latency", System.currentTimeMillis() - currentTimeMillis).put("success", jSONObject != null).put("log_id", HttpRequestUtil.getLogIDFromApi(doPost)), null);
                return jSONObject;
            }
        } else {
            jSONObject = null;
        }
        try {
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("config_api", TTUtil.getMetaWithTS(Long.valueOf(currentTimeMillis)).put("latency", System.currentTimeMillis() - currentTimeMillis).put("success", jSONObject != null).put("log_id", HttpRequestUtil.getLogIDFromApi(doPost)), null);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static synchronized List<TTAppEvent> getSuccessfullySentRequests() {
        List<TTAppEvent> list;
        synchronized (TTRequest.class) {
            list = successfullySentRequests;
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        r4 = r4 + r5.size();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized List<TTAppEvent> reportAppEvent(JSONObject basePayload, List<TTAppEvent> appEventList, boolean isEdp) {
        String doPost;
        int i;
        synchronized (TTRequest.class) {
            TTUtil.checkThread(TAG);
            if (appEventList != null && appEventList.size() != 0) {
                toBeSentRequests = appEventList.size();
                Iterator<TTAppEvent> it = appEventList.iterator();
                while (it.hasNext()) {
                    allRequestIds.add(it.next().getUniqueId());
                }
                failedRequests = 0;
                successfulRequests = 0;
                notifyChange();
                String str = "https://" + TikTokBusinessSdk.getApiTrackDomain() + "/api/v1/app_sdk/batch";
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (List list : averageAssign(appEventList, 50)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        JSONObject transferJson = transferJson((TTAppEvent) it2.next());
                        if (transferJson != null) {
                            arrayList2.add(transferJson);
                        }
                    }
                    try {
                        basePayload.put("batch", new JSONArray((Collection) arrayList2));
                        doPost = HttpRequestUtil.doPost(str, headParamMap, basePayload.toString());
                    } catch (Throwable th) {
                        if (!isEdp) {
                            arrayList.addAll(list);
                        }
                        TTCrashHandler.handleCrash(TAG, th, 2);
                    }
                    if (isEdp) {
                        return null;
                    }
                    if (doPost == null) {
                        arrayList.addAll(list);
                        failedRequests += list.size();
                    } else {
                        try {
                            i = new JSONObject(doPost).getInt("code");
                        } catch (JSONException e) {
                            failedRequests += list.size();
                            arrayList.addAll(list);
                            TTCrashHandler.handleCrash(TAG, e, 2);
                        }
                        if (!TikTokBusinessSdk.isInSdkDebugMode().booleanValue() && i != TTConst.ApiErrorCodes.API_ERROR.code.intValue() && i != TTConst.ApiErrorCodes.PARTIAL_SUCCESS.code.intValue()) {
                            if (i != 0) {
                                arrayList.addAll(list);
                                failedRequests += list.size();
                            } else {
                                successfulRequests += list.size();
                                successfullySentRequests.addAll(list);
                            }
                            logger.debug(TTUtil.ppStr(doPost), new Object[0]);
                        }
                        failedRequests += list.size();
                        logger.debug(TTUtil.ppStr(doPost), new Object[0]);
                    }
                    notifyChange();
                }
                TTLogger tTLogger = logger;
                tTLogger.debug("Flushed %d events successfully", Integer.valueOf(successfulRequests));
                if (arrayList.size() != 0) {
                    tTLogger.debug("Failed to flush %d events, will save them to disk", Integer.valueOf(arrayList.size()));
                }
                if (i2 != 0) {
                    tTLogger.debug("Failed to flush " + i2 + " events, will discard them", new Object[0]);
                    TTAppEventLogger.totalDumped = TTAppEventLogger.totalDumped + i2;
                    if (TikTokBusinessSdk.diskListener != null) {
                        TikTokBusinessSdk.diskListener.onDumped(TTAppEventLogger.totalDumped);
                    }
                }
                tTLogger.debug("Failed to flush %d events in total", Integer.valueOf(failedRequests));
                toBeSentRequests = 0;
                failedRequests = 0;
                successfulRequests = 0;
                notifyChange();
                return arrayList;
            }
            return new ArrayList();
        }
    }

    private static void notifyChange() {
        if (TikTokBusinessSdk.networkListener != null) {
            TikTokBusinessSdk.networkListener.onNetworkChange(toBeSentRequests, successfulRequests, failedRequests, TTAppEventsQueue.size() + allRequestIds.size(), successfullySentRequests.size());
        }
    }

    private static JSONObject transferJson(TTAppEvent event) {
        if (event == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", event.getType());
            if (event.getEventName() != null) {
                jSONObject.put("event", event.getEventName());
            }
            if (!TextUtils.isEmpty(event.getEventId())) {
                jSONObject.put("event_id", event.getEventId());
            }
            jSONObject.put("timestamp", TimeUtil.getISO8601Timestamp(event.getTimeStamp()));
            if (TikTokBusinessSdk.isInSdkLDUMode().booleanValue()) {
                jSONObject.put("limited_data_use", true);
            }
            JSONObject jSONObject2 = new JSONObject(event.getPropertiesJson());
            if (jSONObject2.length() != 0) {
                jSONObject.put("properties", jSONObject2);
            }
            jSONObject.put("context", TTRequestBuilder.getContextForApi(event));
            if (SystemInfoUtil.getInstallReferrer() != null) {
                jSONObject.put("gp_referrer_install_ts", SystemInfoUtil.getInstallReferrer().getGpReferrerInstallTs());
                jSONObject.put("gp_referrer_click_ts", SystemInfoUtil.getInstallReferrer().getGpReferrerClickTs());
            }
            if (event.getScreenShot() != null) {
                jSONObject.put("screenshot", event.getScreenShot());
            }
            return jSONObject;
        } catch (JSONException e) {
            TTCrashHandler.handleCrash(TAG, e, 2);
            return null;
        }
    }

    public static <T> List<List<T>> averageAssign(List<T> sourceList, int splitNum) {
        ArrayList arrayList = new ArrayList();
        int size = sourceList.size();
        int i = size % splitNum == 0 ? size / splitNum : (size / splitNum) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * splitNum;
            arrayList.add(new ArrayList(sourceList.subList(i3, Math.min(size, i3 + splitNum))));
        }
        return arrayList;
    }

    public static String reportMonitorEvent(JSONObject stat) {
        return HttpRequestUtil.doPost("https://" + TikTokBusinessSdk.getApiTrackDomain() + "/api/v1/app_sdk/monitor", headParamMap, stat.toString());
    }

    public static String fetchDeferredDeeplinkWithCompletion() {
        return HttpRequestUtil.doPost("https://" + TikTokBusinessSdk.getApiTrackDomain() + "/api/v1/app_sdk/ddl", headParamMap, TTRequestBuilder.ddlJson().toString(), false);
    }
}
