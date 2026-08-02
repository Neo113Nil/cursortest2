package com.applovin.impl;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class b8 implements s4 {
    private String a;
    private String b;
    private String c;
    private boolean d;
    private long e = -1;
    private int f = -1;

    private b8() {
    }

    public static b8 a(q8 q8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List<String> explode;
        int size;
        long seconds;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String d = q8Var.d();
            if (TextUtils.isEmpty(d)) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            b8 b8Var = new b8();
            b8Var.c = d;
            b8Var.a = (String) q8Var.a().get("id");
            b8Var.b = (String) q8Var.a().get("event");
            b8Var.d = ((Boolean) lVar.a(z4.o5)).booleanValue();
            if (v7Var != null) {
                b8Var.d = JsonUtils.getBoolean(v7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(b8Var.d)).booleanValue();
            }
            b8Var.f = a(b8Var.b(), v7Var);
            String str = (String) q8Var.a().get(TypedValues.CycleType.S_WAVE_OFFSET);
            if (StringUtils.isValidString(str)) {
                String trim = str.trim();
                if (trim.contains("%")) {
                    b8Var.f = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                    return b8Var;
                }
                if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                    int i = size - 1;
                    long j = 0;
                    for (int i2 = i; i2 >= 0; i2--) {
                        String str2 = explode.get(i2);
                        if (StringUtils.isNumeric(str2)) {
                            int parseInt = Integer.parseInt(str2);
                            if (i2 == i) {
                                seconds = parseInt;
                            } else if (i2 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(parseInt);
                            } else if (i2 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(parseInt);
                            }
                            j += seconds;
                        }
                    }
                    b8Var.e = j;
                    b8Var.f = -1;
                }
            }
            return b8Var;
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastTracker", "Error occurred while initializing", th);
            }
            lVar.E().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.e != b8Var.e || this.f != b8Var.f) {
            return false;
        }
        String str = this.a;
        if (str == null ? b8Var.a != null : !str.equals(b8Var.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? b8Var.b == null : str2.equals(b8Var.b)) {
            return this.c.equals(b8Var.c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31;
        long j = this.e;
        return ((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.a + "', event='" + this.b + "', uriString='" + this.c + "', offsetSeconds=" + this.e + ", offsetPercent=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean a(long j, int i) {
        long j2 = this.e;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.f;
        return (z && z2) || ((i2 >= 0) && (i >= i2));
    }

    private static int a(String str, v7 v7Var) {
        if (TtmlNode.START.equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (v7Var != null) {
            return v7Var.g();
        }
        return 95;
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        b8Var.c = string;
        b8Var.a = JsonUtils.getString(jSONObject, ViewHierarchyNode.JsonKeys.IDENTIFIER, "");
        b8Var.b = JsonUtils.getString(jSONObject, "event", "");
        b8Var.e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        b8Var.f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return b8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, ViewHierarchyNode.JsonKeys.IDENTIFIER, this.a);
        JsonUtils.putString(jSONObject, "event", this.b);
        JsonUtils.putString(jSONObject, "uri_string", this.c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f);
        return jSONObject;
    }
}
