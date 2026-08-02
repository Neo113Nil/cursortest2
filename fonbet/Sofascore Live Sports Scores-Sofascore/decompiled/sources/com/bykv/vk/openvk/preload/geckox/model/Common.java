package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.C4324ta;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class Common {
    public String ac;
    public long aid;
    public String appName;
    public String appVersion;
    public String deviceId;
    public String deviceModel;
    public String devicePlatform;
    public int os = 0;
    public String osVersion;
    public String region;
    public String sdkVersion;
    public String uid;

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
        this.uid = str5;
        this.region = str6;
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4324ta.b, this.aid);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put(L6.F, this.os);
            jSONObject.put("device_id", this.deviceId);
            jSONObject.put("app_name", this.appName);
            jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, this.ac);
            jSONObject.put("os_version", this.osVersion);
            jSONObject.put(Payload.DEVICE_MODEL, this.deviceModel);
            jSONObject.put("device_platform", this.devicePlatform);
            jSONObject.put("sdk_version", this.sdkVersion);
            jSONObject.put(TtmlNode.TAG_REGION, this.region);
            jSONObject.put("uid", this.uid);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Common(long j, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }

    public Common() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
    }
}
