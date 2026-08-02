package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class z7 implements s4 {
    private a a;
    private Uri b;
    private String c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private z7() {
    }

    static z7 a(q8 q8Var, z7 z7Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (z7Var == null) {
            try {
                z7Var = new z7();
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                lVar.E().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (z7Var.b == null && !StringUtils.isValidString(z7Var.c)) {
            String a2 = a(q8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D);
            if (URLUtil.isValidUrl(a2)) {
                z7Var.b = Uri.parse(a2);
                z7Var.a = a.STATIC;
                return z7Var;
            }
            String a3 = a(q8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.E);
            if (StringUtils.isValidString(a3)) {
                z7Var.a = a.IFRAME;
                if (URLUtil.isValidUrl(a3)) {
                    z7Var.b = Uri.parse(a3);
                    return z7Var;
                }
                z7Var.c = a3;
                return z7Var;
            }
            String a4 = a(q8Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F);
            if (StringUtils.isValidString(a4)) {
                z7Var.a = a.HTML;
                if (URLUtil.isValidUrl(a4)) {
                    z7Var.b = Uri.parse(a4);
                    return z7Var;
                }
                z7Var.c = a4;
            }
        }
        return z7Var;
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.b;
    }

    public a d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (this.a != z7Var.a) {
            return false;
        }
        Uri uri = this.b;
        if (uri == null ? z7Var.b != null : !uri.equals(z7Var.b)) {
            return false;
        }
        String str = this.c;
        String str2 = z7Var.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + "'}";
    }

    private static String a(q8 q8Var, String str) {
        q8 c = q8Var.c(str);
        if (c != null) {
            return c.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    public void a(String str) {
        this.c = str;
    }

    public static z7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a valueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri parse = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        z7 z7Var = new z7();
        z7Var.a = valueOf;
        z7Var.b = parse;
        z7Var.c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return z7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.c);
        return jSONObject;
    }
}
