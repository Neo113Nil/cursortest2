package com.ironsource;

import com.ironsource.U3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class V6 implements R6 {

    @NotNull
    private final JSONObject a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;

        @NotNull
        public static final a a = new a();
        private static final int c = W6.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public V6(@Nullable JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.R6
    public long a() {
        return this.a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.R5
    public boolean b() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.k, false);
    }

    @Override // com.ironsource.R6
    @NotNull
    public W6 c() {
        return W6.b.a(this.a.optInt(U3.f.e, a.a.a()));
    }
}
