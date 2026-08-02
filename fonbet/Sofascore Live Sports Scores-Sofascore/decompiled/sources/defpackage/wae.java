package defpackage;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wae {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public wae(JSONObject jSONObject) {
        jSONObject.getClass();
        String string = jSONObject.getString("class_name");
        string.getClass();
        this.a = string;
        this.b = jSONObject.optInt("index", -1);
        this.c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        optString.getClass();
        this.d = optString;
        String optString2 = jSONObject.optString("tag");
        optString2.getClass();
        this.e = optString2;
        String optString3 = jSONObject.optString("description");
        optString3.getClass();
        this.f = optString3;
        String optString4 = jSONObject.optString("hint");
        optString4.getClass();
        this.g = optString4;
        this.h = jSONObject.optInt("match_bitmask");
    }
}
