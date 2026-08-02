package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1hSDK {
    private final boolean AFInAppEventParameterName;
    public final AFh1gSDK AFInAppEventType;

    @NonNull
    public final String AFKeystoreWrapper;

    @NonNull
    public final AFh1mSDK valueOf;

    @NonNull
    public final String values;

    public AFh1hSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.values = string;
            this.AFInAppEventParameterName = jSONObject.optBoolean("test_mode");
            this.AFKeystoreWrapper = str;
            this.valueOf = string.startsWith("default") ? AFh1mSDK.DEFAULT : AFh1mSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventType = optJSONObject != null ? new AFh1gSDK(optJSONObject) : null;
        } catch (JSONException e11) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e11);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1hSDK.class != obj.getClass()) {
            return false;
        }
        AFh1hSDK aFh1hSDK = (AFh1hSDK) obj;
        if (this.AFInAppEventParameterName == aFh1hSDK.AFInAppEventParameterName && this.values.equals(aFh1hSDK.values)) {
            return this.AFKeystoreWrapper.equals(aFh1hSDK.AFKeystoreWrapper);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.AFKeystoreWrapper.hashCode() + ((this.values.hashCode() + ((this.AFInAppEventParameterName ? 1 : 0) * 31)) * 31);
        AFh1gSDK aFh1gSDK = this.AFInAppEventType;
        if (aFh1gSDK == null) {
            return hashCode;
        }
        return aFh1gSDK.hashCode() + (hashCode * 31);
    }
}
