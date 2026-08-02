package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C2676u;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f8 implements s4 {
    private Uri a;
    private Uri b;
    private a c;
    private String d;
    private int e;
    private int f;
    private long g;

    public enum a {
        Progressive,
        Streaming
    }

    private f8() {
    }

    public static f8 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String d = q8Var.d();
            if (!URLUtil.isValidUrl(d)) {
                lVar.Q();
                if (!com.applovin.impl.sdk.p.a()) {
                    return null;
                }
                lVar.Q().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri parse = Uri.parse(d);
            f8 f8Var = new f8();
            f8Var.a = parse;
            f8Var.b = parse;
            f8Var.g = a(q8Var);
            f8Var.c = a((String) q8Var.a().get(C2676u.g));
            f8Var.f = StringUtils.parseInt((String) q8Var.a().get("height"));
            f8Var.e = StringUtils.parseInt((String) q8Var.a().get("width"));
            f8Var.d = ((String) q8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return f8Var;
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastVideoFile", "Error occurred while initializing", th);
            }
            lVar.E().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.g;
    }

    public String c() {
        return this.d;
    }

    public Uri d() {
        return this.a;
    }

    public Uri e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        if (this.e != f8Var.e || this.f != f8Var.f || this.g != f8Var.g) {
            return false;
        }
        Uri uri = this.a;
        if (uri == null ? f8Var.a != null : !uri.equals(f8Var.a)) {
            return false;
        }
        Uri uri2 = this.b;
        if (uri2 == null ? f8Var.b != null : !uri2.equals(f8Var.b)) {
            return false;
        }
        if (this.c != f8Var.c) {
            return false;
        }
        String str = this.d;
        String str2 = f8Var.d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + Long.valueOf(this.g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(q8 q8Var) {
        Map a2 = q8Var.a();
        long parseLong = StringUtils.parseLong((String) a2.get("bitrate"), 0L);
        return parseLong != 0 ? parseLong : (StringUtils.parseLong((String) a2.get("minBitrate"), 0L) + StringUtils.parseLong((String) a2.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public static f8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri parse = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri parse2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a valueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        int i3 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        f8 f8Var = new f8();
        f8Var.a = parse;
        f8Var.b = parse2;
        f8Var.c = valueOf;
        f8Var.d = string2;
        f8Var.e = i;
        f8Var.f = i2;
        f8Var.g = i3;
        return f8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.d);
        JsonUtils.putInt(jSONObject, "width", this.e);
        JsonUtils.putInt(jSONObject, "height", this.f);
        JsonUtils.putLong(jSONObject, "bitrate", this.g);
        return jSONObject;
    }
}
