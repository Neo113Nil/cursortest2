package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Dg {
    public static final String a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("errMsg", str);
            jsonObjectInit.put("adViewId", str2);
            return jsonObjectInit;
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jsonObjectInit;
        }
    }
}
