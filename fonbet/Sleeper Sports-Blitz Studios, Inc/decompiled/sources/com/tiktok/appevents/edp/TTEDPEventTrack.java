package com.tiktok.appevents.edp;

import com.tiktok.TikTokBusinessSdk;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TTEDPEventTrack {
    public static long LAST_CLICK_TS = 0;
    private static boolean hasSendLaunch = false;
    public static volatile boolean isSending = false;
    public static volatile boolean pageShowIsSending = false;
    private static TTAppLaunchEvent ttAppLaunchEvent;

    public static void trackAppLaunch(String refer, String sourceUrl) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_REFER, refer);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_SOURCE_URL, sourceUrl);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("meta", jSONObject);
            if (TikTokBusinessSdk.isInitialized()) {
                TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_APP_LAUNCH, jSONObject2, null);
            } else {
                if (ttAppLaunchEvent != null || hasSendLaunch) {
                    return;
                }
                ttAppLaunchEvent = new TTAppLaunchEvent(jSONObject, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public static void trackFirstAppLaunch() {
        try {
            if (ttAppLaunchEvent != null) {
                hasSendLaunch = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("meta", ttAppLaunchEvent.getProp());
                TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_APP_LAUNCH, jSONObject, null);
                ttAppLaunchEvent = null;
            }
        } catch (Exception unused) {
        }
    }

    public static void trackWebviewRequest(String url) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", url);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("meta", jSONObject);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_WEBVIEW_REQUEST, jSONObject2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackPageShow(String pageName, int index, boolean isFromBackground, JSONObject components, int pageCount) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CURRENT_PAGE_NAME, pageName);
            jSONObject.put("index", index);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_FROM_BACKGROUND, isFromBackground);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_COMPONENTS, components);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_DEEP_COUNT, pageCount);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("meta", jSONObject);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_PAGE_SHOW, jSONObject2, null);
            pageShowIsSending = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void trackClick(String className, float x, float y, int width, int height, String text, String pageName, JSONObject components, int pageCount, long duration) {
        try {
            LAST_CLICK_TS = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_POSITON_X, x);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_POSITON_Y, y);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_SIZE_W, width);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_SIZE_H, height);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_BUTTON_TEXT, text);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CURRENT_PAGE_NAME, pageName);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_COMPONENTS, components);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAGE_DEEP_COUNT, pageCount);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_DURATION, duration);
            jSONObject.put("class_name", className);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("meta", jSONObject);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_CLICK, jSONObject2, null);
            isSending = false;
        } catch (Throwable unused) {
        }
    }

    public static void trackPayShow(int code, JSONArray skuInfo) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", code);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_SKU_INFO, skuInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("meta", jSONObject);
            TikTokBusinessSdk.getAppEventLogger().trackEdp(TTEDPEventConstants.EDP_EVENT_NAME_PAY_SHOW, jSONObject2, null);
        } catch (Throwable unused) {
        }
    }

    public static void trackUnityEvent(String name, JSONObject meta) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("meta", meta);
            jSONObject.put("api_platform", meta.remove("api_platform"));
            TikTokBusinessSdk.getAppEventLogger().trackEdp(name, jSONObject, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean checkUpload() {
        return new Random().nextDouble() <= EDPConfig.report_frequency_control;
    }
}
