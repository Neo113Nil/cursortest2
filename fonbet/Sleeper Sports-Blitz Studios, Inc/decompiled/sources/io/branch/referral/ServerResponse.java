package io.branch.referral;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ServerResponse {
    private Object post_;
    private int statusCode_;
    private String tag_;

    public ServerResponse(String str, int i) {
        this.tag_ = str;
        this.statusCode_ = i;
    }

    public String getTag() {
        return this.tag_;
    }

    public int getStatusCode() {
        return this.statusCode_;
    }

    public void setPost(Object obj) {
        this.post_ = obj;
    }

    public JSONObject getObject() {
        Object obj = this.post_;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return new JSONObject();
    }

    public JSONArray getArray() {
        Object obj = this.post_;
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        return null;
    }

    public String getFailReason() {
        String str = "";
        try {
            JSONObject object = getObject();
            if (object != null && object.has("error") && object.getJSONObject("error").has("message") && (str = object.getJSONObject("error").getString("message")) != null && str.trim().length() > 0) {
                return str + ".";
            }
        } catch (Exception unused) {
        }
        return str;
    }
}
