package com.ironsource;

import com.ironsource.sdk.controller.f;
import defpackage.dmi;
import defpackage.mz1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Lb {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private final JSONObject c;

    public Lb(@NotNull String str, @NotNull String str2, @Nullable JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public static /* synthetic */ Lb a(Lb lb, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lb.a;
        }
        if ((i & 2) != 0) {
            str2 = lb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = lb.c;
        }
        return lb.a(str, str2, jSONObject);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @Nullable
    public final JSONObject c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lb)) {
            return false;
        }
        Lb lb = (Lb) obj;
        return Intrinsics.c(this.a, lb.a) && Intrinsics.c(this.b, lb.b) && Intrinsics.c(this.c, lb.c);
    }

    @Nullable
    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int c = dmi.c(this.a.hashCode() * 31, 31, this.b);
        JSONObject jSONObject = this.c;
        return c + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        JSONObject jSONObject = this.c;
        StringBuilder s = mz1.s("MessageToNative(adId=", str, ", command=", str2, ", params=");
        s.append(jSONObject);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Lb a(@NotNull String str) throws JSONException {
            str.getClass();
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(f.b.c);
            String string2 = jSONObject.getString(f.b.g);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            string.getClass();
            string2.getClass();
            return new Lb(string, string2, optJSONObject);
        }

        private a() {
        }
    }

    @NotNull
    public final Lb a(@NotNull String str, @NotNull String str2, @Nullable JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        return new Lb(str, str2, jSONObject);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public static final Lb a(@NotNull String str) throws JSONException {
        return d.a(str);
    }
}
