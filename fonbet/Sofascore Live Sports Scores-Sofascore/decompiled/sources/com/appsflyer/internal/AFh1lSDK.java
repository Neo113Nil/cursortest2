package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.ironsource.U3;
import com.unity3d.ads.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1lSDK {

    @Nullable
    public final AFh1rSDK AFKeystoreWrapper;
    private final boolean AFLogger;

    @NonNull
    public final String d;

    @NonNull
    public final String registerClient;

    @NonNull
    public final AFh1sSDK unregisterClient;

    public AFh1lSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.registerClient = string;
            this.AFLogger = jSONObject.optBoolean("test_mode");
            this.d = str;
            this.unregisterClient = string.startsWith(BuildConfig.FLAVOR) ? AFh1sSDK.DEFAULT : AFh1sSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject(U3.a.v);
            this.AFKeystoreWrapper = optJSONObject != null ? new AFh1rSDK(optJSONObject) : null;
        } catch (JSONException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Error parsing remote configuration JSON", e, false, false);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1lSDK.class != obj.getClass()) {
            return false;
        }
        AFh1lSDK aFh1lSDK = (AFh1lSDK) obj;
        if (this.AFLogger == aFh1lSDK.AFLogger && this.registerClient.equals(aFh1lSDK.registerClient)) {
            return this.d.equals(aFh1lSDK.d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() + ((this.registerClient.hashCode() + ((this.AFLogger ? 1 : 0) * 31)) * 31);
        AFh1rSDK aFh1rSDK = this.AFKeystoreWrapper;
        if (aFh1rSDK == null) {
            return hashCode;
        }
        return aFh1rSDK.hashCode() + (hashCode * 31);
    }
}
