package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC4045e {
    private final String a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = "events";
    private final String e = "events";
    JSONObject f;
    int g;
    private String h;

    public abstract String a();

    public abstract String a(ArrayList<C4355v5> arrayList, JSONObject jSONObject);

    public JSONObject a(C4355v5 c4355v5) {
        try {
            String a = c4355v5.a();
            JSONObject jSONObject = !TextUtils.isEmpty(a) ? new JSONObject(a) : new JSONObject();
            jSONObject.put("eventId", c4355v5.c());
            jSONObject.put("timestamp", c4355v5.d());
            return jSONObject;
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    public String b() {
        return TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract String c();

    private String a(int i) {
        if (i != 2) {
            return "events";
        }
        return "InterstitialEvents";
    }

    public String a(JSONArray jSONArray) {
        try {
            if (this.f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f.toString());
            jSONObject.put("timestamp", IronSourceUtils.e());
            jSONObject.put(a(this.g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            C4157k4.d().a(e);
            return "";
        }
    }

    public void a(String str) {
        this.h = str;
    }
}
