package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class u7 implements s4 {
    private int a;
    private int b;
    private Uri c;
    private z7 d;
    private final Set e = new HashSet();
    private final Map f = new HashMap();

    private u7() {
    }

    public static u7 a(q8 q8Var, u7 u7Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        q8 c;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (u7Var == null) {
            try {
                u7Var = new u7();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                lVar.E().a("VastCompanionAd", th);
                return null;
            }
        }
        if (u7Var.a == 0 && u7Var.b == 0) {
            int parseInt = StringUtils.parseInt((String) q8Var.a().get("width"));
            int parseInt2 = StringUtils.parseInt((String) q8Var.a().get("height"));
            if (parseInt > 0 && parseInt2 > 0) {
                u7Var.a = parseInt;
                u7Var.b = parseInt2;
            }
        }
        u7Var.d = z7.a(q8Var, u7Var.d, lVar);
        if (u7Var.c == null && (c = q8Var.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N)) != null) {
            String d = c.d();
            if (StringUtils.isValidString(d)) {
                u7Var.c = Uri.parse(d);
            }
        }
        d8.a(q8Var.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O), u7Var.e, v7Var, lVar);
        d8.a(q8Var, u7Var.f, v7Var, lVar);
        return u7Var;
    }

    public Set b() {
        return this.e;
    }

    public Uri c() {
        return this.c;
    }

    public Map d() {
        return this.f;
    }

    public z7 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        if (this.a != u7Var.a || this.b != u7Var.b) {
            return false;
        }
        Uri uri = this.c;
        if (uri == null ? u7Var.c != null : !uri.equals(u7Var.c)) {
            return false;
        }
        z7 z7Var = this.d;
        if (z7Var == null ? u7Var.d != null : !z7Var.equals(u7Var.d)) {
            return false;
        }
        Set set = this.e;
        if (set == null ? u7Var.e != null : !set.equals(u7Var.e)) {
            return false;
        }
        Map map = this.f;
        Map map2 = u7Var.f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        Uri uri = this.c;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        z7 z7Var = this.d;
        int hashCode2 = (hashCode + (z7Var != null ? z7Var.hashCode() : 0)) * 31;
        Set set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri parse = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        z7 a = z7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), lVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            b8 a2 = b8.a(JsonUtils.getJSONObject(jSONArray, i3, (JSONObject) null), lVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        u7 u7Var = new u7();
        u7Var.a = i;
        u7Var.b = i2;
        u7Var.c = parse;
        u7Var.d = a;
        u7Var.e.addAll(hashSet);
        return u7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.a);
        JsonUtils.putInt(jSONObject, "height", this.b);
        Uri uri = this.c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        z7 z7Var = this.d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", z7Var != null ? z7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((b8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
