package com.ironsource;

import com.ironsource.X3;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Z6 implements V6 {
    private final JSONObject a;

    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;
        public static final a a = new a();
        private static final int c = EnumC4222a7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public Z6(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.V6
    public long a() {
        return this.a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.j, false);
    }

    @Override // com.ironsource.V6
    public EnumC4222a7 c() {
        return EnumC4222a7.b.a(this.a.optInt(X3.f.e, a.a.a()));
    }
}
