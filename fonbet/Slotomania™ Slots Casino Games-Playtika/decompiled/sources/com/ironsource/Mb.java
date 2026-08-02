package com.ironsource;

import com.ironsource.sdk.controller.f;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Mb {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final JSONObject c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Mb a(String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jsonStr);
            String adId = jsonObjectInit.getString("adId");
            String command = jsonObjectInit.getString(f.b.g);
            JSONObject optJSONObject = jsonObjectInit.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new Mb(adId, command, optJSONObject);
        }

        private a() {
        }
    }

    public Mb(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.a = adId;
        this.b = command;
        this.c = jSONObject;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mb)) {
            return false;
        }
        Mb mb = (Mb) obj;
        return Intrinsics.areEqual(this.a, mb.a) && Intrinsics.areEqual(this.b, mb.b) && Intrinsics.areEqual(this.c, mb.c);
    }

    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        JSONObject jSONObject = this.c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.a + ", command=" + this.b + ", params=" + this.c + ")";
    }

    public final Mb a(String adId, String command, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new Mb(adId, command, jSONObject);
    }

    public static /* synthetic */ Mb a(Mb mb, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mb.a;
        }
        if ((i & 2) != 0) {
            str2 = mb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = mb.c;
        }
        return mb.a(str, str2, jSONObject);
    }

    @JvmStatic
    public static final Mb a(String str) throws JSONException {
        return d.a(str);
    }
}
