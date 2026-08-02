package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2472i9 {
    private final String a;
    private final String b;
    private final EnumC2507k9 c;
    private final JSONObject d;

    public C2472i9(String url, String storePackage, EnumC2507k9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = url;
        this.b = storePackage;
        this.c = strategy;
        this.d = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final EnumC2507k9 c() {
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
        if (!(obj instanceof C2472i9)) {
            return false;
        }
        C2472i9 c2472i9 = (C2472i9) obj;
        return Intrinsics.areEqual(this.a, c2472i9.a) && Intrinsics.areEqual(this.b, c2472i9.b) && this.c == c2472i9.c && Intrinsics.areEqual(this.d, c2472i9.d);
    }

    public final String f() {
        return this.b;
    }

    public final EnumC2507k9 g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        JSONObject jSONObject = this.d;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "InlineStoreRequest(url=" + this.a + ", storePackage=" + this.b + ", strategy=" + this.c + ", extras=" + this.d + ")";
    }

    public final C2472i9 a(String url, String storePackage, EnumC2507k9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C2472i9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C2472i9 a(C2472i9 c2472i9, String str, String str2, EnumC2507k9 enumC2507k9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2472i9.a;
        }
        if ((i & 2) != 0) {
            str2 = c2472i9.b;
        }
        if ((i & 4) != 0) {
            enumC2507k9 = c2472i9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c2472i9.d;
        }
        return c2472i9.a(str, str2, enumC2507k9, jSONObject);
    }

    public /* synthetic */ C2472i9(String str, String str2, EnumC2507k9 enumC2507k9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC2507k9.APP_ACTIVITY : enumC2507k9, (i & 8) != 0 ? null : jSONObject);
    }
}
