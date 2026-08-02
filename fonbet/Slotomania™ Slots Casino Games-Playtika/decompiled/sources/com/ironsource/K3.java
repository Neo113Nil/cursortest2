package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class K3 implements S5 {
    private final JSONObject a;

    public static final class a {
        public static final a a = new a();
        public static final boolean b = false;

        private a() {
        }
    }

    public K3(JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.S5
    public boolean b() {
        return this.a.optBoolean("clickCheck", false);
    }
}
