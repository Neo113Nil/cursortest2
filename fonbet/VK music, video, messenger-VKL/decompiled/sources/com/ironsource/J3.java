package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class J3 implements U5 {
    private final JSONObject a;

    public static final class a {
        public static final a a = new a();
        public static final boolean b = false;
        public static final String c = "curlError";

        private a() {
        }
    }

    public J3(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U5
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
