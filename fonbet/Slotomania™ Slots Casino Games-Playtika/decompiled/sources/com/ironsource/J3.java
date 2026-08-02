package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class J3 implements S5 {
    private final JSONObject a;

    public static final class a {
        public static final a a = new a();
        public static final boolean b = false;
        public static final String c = "curlError";

        private a() {
        }
    }

    public J3(JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.S5
    public boolean b() {
        return this.a.optBoolean("enabled", false);
    }

    public final boolean d() {
        return this.a.optBoolean("closeActivity", true);
    }

    public final boolean e() {
        return this.a.optBoolean("reportController", true);
    }
}
