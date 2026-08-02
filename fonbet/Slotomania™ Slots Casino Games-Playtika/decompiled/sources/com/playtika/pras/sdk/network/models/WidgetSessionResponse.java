package com.playtika.pras.sdk.network.models;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class WidgetSessionResponse {
    private final String sessionId;
    private final String sessionToken;

    public WidgetSessionResponse(JSONObject jSONObject) {
        this.sessionId = jSONObject.getString(JsonStorageKeyNames.SESSION_ID_KEY);
        this.sessionToken = jSONObject.getString("sessionToken");
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }
}
