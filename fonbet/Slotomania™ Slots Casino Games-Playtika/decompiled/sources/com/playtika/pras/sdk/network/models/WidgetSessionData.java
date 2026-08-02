package com.playtika.pras.sdk.network.models;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.protocol.Device;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class WidgetSessionData {
    private final Boolean accessibilityEnabled;
    private final String apiHost;
    private final String batteryStatus;
    private final Integer deviceMemory;
    private final String envName;
    private final String locale;
    private final String osVersion;
    private final String platform;
    private final String productTitle;
    private final String redirectPMOpenMode;
    private final Integer refreshRate;
    private final boolean responseCodePendingAllowed;
    private final String screenSizeInches;
    private final String sessionId;
    private final String sessionToken;
    private final Boolean settingsMode;
    private final String uiMode;

    public WidgetSessionData(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, Integer num, Integer num2, String str11, String str12, Boolean bool2) {
        this.sessionId = str;
        this.sessionToken = str2;
        this.apiHost = str3;
        this.envName = str4;
        this.responseCodePendingAllowed = z;
        this.redirectPMOpenMode = str5;
        this.locale = str6;
        this.productTitle = str7;
        this.settingsMode = bool;
        this.platform = str8;
        this.screenSizeInches = str9;
        this.uiMode = str10;
        this.deviceMemory = num;
        this.refreshRate = num2;
        this.osVersion = str11;
        this.batteryStatus = str12;
        this.accessibilityEnabled = bool2;
    }

    public String getApiHost() {
        return this.apiHost;
    }

    public String getEnvName() {
        return this.envName;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    public Boolean getSettingsMode() {
        return this.settingsMode;
    }

    public boolean isResponseCodePendingAllowed() {
        return this.responseCodePendingAllowed;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JsonStorageKeyNames.SESSION_ID_KEY, this.sessionId);
        jSONObject.put("sessionToken", this.sessionToken);
        jSONObject.put("apiHost", this.apiHost);
        jSONObject.put("envName", this.envName);
        jSONObject.put("responseCodePendingAllowed", this.responseCodePendingAllowed);
        jSONObject.put("redirectPMOpenMode", this.redirectPMOpenMode);
        String str = this.locale;
        if (str != null) {
            jSONObject.put(Device.JsonKeys.LOCALE, str);
        }
        String str2 = this.productTitle;
        if (str2 != null) {
            jSONObject.put("productTitle", str2);
        }
        Boolean bool = this.settingsMode;
        if (bool != null) {
            jSONObject.put("settingsMode", bool);
        }
        String str3 = this.platform;
        if (str3 != null) {
            jSONObject.put("platform", str3);
        }
        String str4 = this.screenSizeInches;
        if (str4 != null) {
            jSONObject.put("screenSizeInches", str4);
        }
        String str5 = this.uiMode;
        if (str5 != null) {
            jSONObject.put("uiMode", str5);
        }
        Integer num = this.deviceMemory;
        if (num != null) {
            jSONObject.put("deviceMemory", num);
        }
        Integer num2 = this.refreshRate;
        if (num2 != null) {
            jSONObject.put("refreshRate", num2);
        }
        String str6 = this.osVersion;
        if (str6 != null) {
            jSONObject.put("osVersion", str6);
        }
        String str7 = this.batteryStatus;
        if (str7 != null) {
            jSONObject.put("batteryStatus", str7);
        }
        Boolean bool2 = this.accessibilityEnabled;
        if (bool2 != null) {
            jSONObject.put("accessibilityEnabled", bool2);
        }
        return jSONObject.toString();
    }
}
