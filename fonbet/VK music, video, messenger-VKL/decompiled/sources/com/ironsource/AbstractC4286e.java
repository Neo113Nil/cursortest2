package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
abstract class AbstractC4286e {
    private final String a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = "events";
    private final String e = "events";
    JSONObject f;
    int g;
    private String h;

    private String a(int i) {
        return i != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<C4632x5> arrayList, JSONObject jSONObject);

    public String b() {
        return TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public abstract String c();

    public JSONObject a(C4632x5 c4632x5) {
        JSONObject jSONObject;
        try {
            String a = c4632x5.a();
            if (!TextUtils.isEmpty(a)) {
                jSONObject = new JSONObject(a);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("eventId", c4632x5.c());
            jSONObject.put("timestamp", c4632x5.d());
            return jSONObject;
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
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
            C4452n4.d().a(e);
            return "";
        }
    }

    public void a(String str) {
        this.h = str;
    }
}
