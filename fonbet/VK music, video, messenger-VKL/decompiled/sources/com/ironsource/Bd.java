package com.ironsource;

import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Bd {
    private final JSONObject a;
    private final JSONObject b;
    private final JSONObject c;
    private final JSONObject d;

    public Bd() {
        this(null, null, null, null, 15, null);
    }

    public final JSONObject a() {
        return this.a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final JSONObject e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bd)) {
            return false;
        }
        Bd bd = (Bd) obj;
        return epx.f(this.a, bd.a) && epx.f(this.b, bd.b) && epx.f(this.c, bd.c) && epx.f(this.d, bd.d);
    }

    public final JSONObject f() {
        return this.b;
    }

    public final JSONObject g() {
        return this.d;
    }

    public final JSONObject h() {
        return this.a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.a;
        int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.b;
        int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.c;
        int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.d;
        return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    public Bd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.a = jSONObject;
        this.b = jSONObject2;
        this.c = jSONObject3;
        this.d = jSONObject4;
    }

    public final Bd a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        return new Bd(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ Bd a(Bd bd, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = bd.a;
        }
        if ((i & 2) != 0) {
            jSONObject2 = bd.b;
        }
        if ((i & 4) != 0) {
            jSONObject3 = bd.c;
        }
        if ((i & 8) != 0) {
            jSONObject4 = bd.d;
        }
        return bd.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ Bd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
    }
}
