package com.tiktok.unity;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public class TTUnityBridge {
    public static void setConfigCallback(JSONObject config) {
        if (config == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
            cls.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(cls, "TikTokInnerManager", "UpdateConfigFromNative", config.toString());
        } catch (Throwable unused) {
        }
    }
}
