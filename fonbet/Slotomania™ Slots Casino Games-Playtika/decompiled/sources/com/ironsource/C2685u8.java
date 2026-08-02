package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2685u8 implements F7 {
    @Override // com.ironsource.F7
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(IronSourceNetworkBridge.jsonObjectInit().put(B5.R, B5.S).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
