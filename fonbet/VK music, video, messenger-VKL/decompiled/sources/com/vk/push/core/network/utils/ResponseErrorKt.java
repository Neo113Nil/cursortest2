package com.vk.push.core.network.utils;

import com.vk.push.core.network.model.ResponseError;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ResponseError.kt */
/* loaded from: classes5.dex */
public final class ResponseErrorKt {
    public static final boolean hasErrorBody(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).has("error");
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final ResponseError parseErrorResponse(String str) {
        JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
        return new ResponseError(jSONObject.getInt("code"), jSONObject.getString("message"), jSONObject.optString("status"));
    }
}
