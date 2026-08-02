package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4304s8 implements C7 {
    @Override // com.ironsource.C7
    public String a(Map<String, Object> map) {
        try {
            return "data=" + Base64.encodeToString(new JSONObject().put(C4427z5.R, C4427z5.S).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
