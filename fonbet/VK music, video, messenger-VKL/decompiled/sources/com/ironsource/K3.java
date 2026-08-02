package com.ironsource;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class K3 implements U5 {
    private final JSONObject a;

    public static final class a {
        public static final a a = new a();
        public static final boolean b = false;

        private a() {
        }
    }

    public K3(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.a.optBoolean("clickCheck", false);
    }
}
