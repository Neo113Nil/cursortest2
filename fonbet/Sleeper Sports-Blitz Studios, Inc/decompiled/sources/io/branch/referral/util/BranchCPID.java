package io.branch.referral.util;

import android.text.TextUtils;
import io.branch.referral.Defines;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class BranchCPID {
    private static final String key_cross_platform_id = "cross_platform_id";
    private static final String key_developer_identity = "developer_identity";
    private static final String key_past_cross_platform_id = "past_cross_platform_ids";
    private static final String key_prob_cross_platform_ids = "prob_cross_platform_ids";
    JSONObject cpidData;

    public BranchCPID() {
    }

    public BranchCPID(JSONObject jSONObject) {
        this.cpidData = jSONObject;
    }

    public String getCrossPlatformID() {
        JSONObject jSONObject = this.cpidData;
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        try {
            return this.cpidData.getJSONObject(Defines.Jsonkey.UserData.getKey()).getString(key_cross_platform_id);
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONArray getPastCrossPlatformIds() {
        JSONObject jSONObject = this.cpidData;
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        try {
            return this.cpidData.getJSONObject(Defines.Jsonkey.UserData.getKey()).getJSONArray(key_past_cross_platform_id);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONArray getProbabilisticCrossPlatformIds() {
        JSONObject jSONObject = this.cpidData;
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        try {
            JSONArray jSONArray = this.cpidData.getJSONObject(Defines.Jsonkey.UserData.getKey()).getJSONArray(key_prob_cross_platform_ids);
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(new ProbabilisticCPID(jSONArray.getString(i), Double.valueOf(jSONArray.getDouble(i))));
            }
            return jSONArray2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getDeveloperIdentity() {
        JSONObject jSONObject = this.cpidData;
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        try {
            return this.cpidData.getJSONObject(Defines.Jsonkey.UserData.getKey()).getString(key_developer_identity);
        } catch (JSONException unused) {
            return null;
        }
    }

    public class ProbabilisticCPID {
        public String id;
        public Double probability;

        public ProbabilisticCPID(String str, Double d) {
            this.id = str;
            this.probability = d;
        }

        public String getCPID() {
            if (TextUtils.isEmpty(this.id)) {
                return null;
            }
            return this.id;
        }

        public Double getCPIDProbablity() {
            Double d = this.probability;
            if (d != null) {
                return d;
            }
            return null;
        }
    }
}
