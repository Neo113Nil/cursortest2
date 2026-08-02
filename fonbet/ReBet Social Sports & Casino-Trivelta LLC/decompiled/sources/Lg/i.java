package Lg;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static i f7185b = new i();

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f7186a;

    public i() {
        try {
            this.f7186a = new JSONObject("{}");
        } catch (JSONException unused) {
        }
    }

    public static i g() {
        return f7185b;
    }

    public boolean a(String str) {
        JSONObject jSONObject = this.f7186a;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        JSONArray names = this.f7186a.names();
        for (int i10 = 0; i10 < names.length(); i10++) {
            try {
                String string = names.getString(i10);
                m.g(string, this.f7186a.get(string), createMap);
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    public ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f7186a;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList.add(optJSONArray.getString(i10));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public int d(String str, int i10) {
        JSONObject jSONObject = this.f7186a;
        return jSONObject == null ? i10 : jSONObject.optInt(str, i10);
    }

    public long e(String str, long j10) {
        JSONObject jSONObject = this.f7186a;
        return jSONObject == null ? j10 : jSONObject.optLong(str, j10);
    }

    public String f() {
        return "{}";
    }
}
