package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k {
    private final com.applovin.impl.sdk.l a;
    private final String b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");

        private final String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public k(String str, com.applovin.impl.sdk.l lVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = str;
        this.a = lVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(AppLovinNetworkBridge.stringInit(Base64.decode(this.b.substring(d().length()), 0), C.UTF8_NAME));
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().a("AdToken", "Unable to decode token '" + this.b + "' into JSON", e);
                }
                this.a.E().a("AdToken", "decodeFullAdResponseStr", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("AdToken", "Unable to process ad response from token '" + this.b + "'", e2);
            }
            this.a.E().a("AdToken", "decodeFullAdResponse", e2);
            return null;
        }
    }

    public String b() {
        return this.b;
    }

    public a c() {
        return a(z4.x0) != null ? a.REGULAR : a(z4.y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String a2 = a(z4.x0);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = a(z4.y0);
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        return a3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        String str = this.b;
        String str2 = ((k) obj).b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdToken{id=" + StringUtils.prefixToIndex(32, this.b) + ", type=" + c() + AbstractJsonLexerKt.END_OBJ;
    }

    private String a(z4 z4Var) {
        for (String str : this.a.c(z4Var)) {
            if (this.b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
