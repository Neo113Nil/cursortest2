package com.ironsource;

import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Y6 implements U6 {
    private final JSONObject a;

    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;
        public static final a a = new a();
        private static final int c = Z6.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public Y6(JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.U6
    public long a() {
        return this.a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.S5
    public boolean b() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.j, false);
    }

    @Override // com.ironsource.U6
    public Z6 c() {
        return Z6.b.a(this.a.optInt(X3.f.e, a.a.a()));
    }
}
