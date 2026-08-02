package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4599v8 implements G7 {
    @Override // com.ironsource.G7
    public String a(Map<String, Object> map) {
        try {
            return "data=" + Base64.encodeToString(new JSONObject().put(B5.R, B5.S).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
