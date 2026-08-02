package com.playtika.pras.sdk.network;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ResponseDto {
    public ResponseDto(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new JSONException("passed response must be not null.");
        }
    }

    public JSONArray getJsonArray(JSONObject jSONObject, String str) {
        return jSONObject.isNull(str) ? new JSONArray() : jSONObject.getJSONArray(str);
    }

    public JSONObject getJsonObject(JSONObject jSONObject, String str) {
        return jSONObject.isNull(str) ? new JSONObject() : jSONObject.getJSONObject(str);
    }

    public String getJsonString(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public ArrayList<String> getStringArrayList(JSONObject jSONObject, String str) {
        ArrayList<String> optStringArrayList = optStringArrayList(jSONObject, str);
        if (optStringArrayList != null) {
            return optStringArrayList;
        }
        throw new JSONException("Key with value " + str + " is not exist.");
    }

    public ArrayList<String> optStringArrayList(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    public ResponseDto() {
    }
}
