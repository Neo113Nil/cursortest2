package com.ironsource;

import org.json.JSONObject;
import xsna.epx;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4385j9 {
    private final String a;
    private final String b;
    private final EnumC4421l9 c;
    private final JSONObject d;

    public C4385j9(String str, String str2, EnumC4421l9 enumC4421l9, JSONObject jSONObject) {
        this.a = str;
        this.b = str2;
        this.c = enumC4421l9;
        this.d = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final EnumC4421l9 c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final JSONObject e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4385j9)) {
            return false;
        }
        C4385j9 c4385j9 = (C4385j9) obj;
        return epx.f(this.a, c4385j9.a) && epx.f(this.b, c4385j9.b) && this.c == c4385j9.c && epx.f(this.d, c4385j9.d);
    }

    public final String f() {
        return this.b;
    }

    public final EnumC4421l9 g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        JSONObject jSONObject = this.d;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        EnumC4421l9 enumC4421l9 = this.c;
        JSONObject jSONObject = this.d;
        StringBuilder a = xe9.a("InlineStoreRequest(url=", str, ", storePackage=", str2, ", strategy=");
        a.append(enumC4421l9);
        a.append(", extras=");
        a.append(jSONObject);
        a.append(")");
        return a.toString();
    }

    public final C4385j9 a(String str, String str2, EnumC4421l9 enumC4421l9, JSONObject jSONObject) {
        return new C4385j9(str, str2, enumC4421l9, jSONObject);
    }

    public static /* synthetic */ C4385j9 a(C4385j9 c4385j9, String str, String str2, EnumC4421l9 enumC4421l9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4385j9.a;
        }
        if ((i & 2) != 0) {
            str2 = c4385j9.b;
        }
        if ((i & 4) != 0) {
            enumC4421l9 = c4385j9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c4385j9.d;
        }
        return c4385j9.a(str, str2, enumC4421l9, jSONObject);
    }

    public /* synthetic */ C4385j9(String str, String str2, EnumC4421l9 enumC4421l9, JSONObject jSONObject, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? EnumC4421l9.APP_ACTIVITY : enumC4421l9, (i & 8) != 0 ? null : jSONObject);
    }
}
