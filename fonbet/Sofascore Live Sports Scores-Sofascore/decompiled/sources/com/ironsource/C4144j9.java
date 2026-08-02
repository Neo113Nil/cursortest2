package com.ironsource;

import defpackage.dmi;
import defpackage.mz1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4144j9 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final EnumC4180l9 c;

    @Nullable
    private final JSONObject d;

    public C4144j9(@NotNull String str, @NotNull String str2, @NotNull EnumC4180l9 enumC4180l9, @Nullable JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        enumC4180l9.getClass();
        this.a = str;
        this.b = str2;
        this.c = enumC4180l9;
        this.d = jSONObject;
    }

    public static /* synthetic */ C4144j9 a(C4144j9 c4144j9, String str, String str2, EnumC4180l9 enumC4180l9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4144j9.a;
        }
        if ((i & 2) != 0) {
            str2 = c4144j9.b;
        }
        if ((i & 4) != 0) {
            enumC4180l9 = c4144j9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c4144j9.d;
        }
        return c4144j9.a(str, str2, enumC4180l9, jSONObject);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final EnumC4180l9 c() {
        return this.c;
    }

    @Nullable
    public final JSONObject d() {
        return this.d;
    }

    @Nullable
    public final JSONObject e() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4144j9)) {
            return false;
        }
        C4144j9 c4144j9 = (C4144j9) obj;
        return Intrinsics.c(this.a, c4144j9.a) && Intrinsics.c(this.b, c4144j9.b) && this.c == c4144j9.c && Intrinsics.c(this.d, c4144j9.d);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final EnumC4180l9 g() {
        return this.c;
    }

    @NotNull
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        JSONObject jSONObject = this.d;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        EnumC4180l9 enumC4180l9 = this.c;
        JSONObject jSONObject = this.d;
        StringBuilder s = mz1.s("InlineStoreRequest(url=", str, ", storePackage=", str2, ", strategy=");
        s.append(enumC4180l9);
        s.append(", extras=");
        s.append(jSONObject);
        s.append(")");
        return s.toString();
    }

    public /* synthetic */ C4144j9(String str, String str2, EnumC4180l9 enumC4180l9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC4180l9.APP_ACTIVITY : enumC4180l9, (i & 8) != 0 ? null : jSONObject);
    }

    @NotNull
    public final C4144j9 a(@NotNull String str, @NotNull String str2, @NotNull EnumC4180l9 enumC4180l9, @Nullable JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        enumC4180l9.getClass();
        return new C4144j9(str, str2, enumC4180l9, jSONObject);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
