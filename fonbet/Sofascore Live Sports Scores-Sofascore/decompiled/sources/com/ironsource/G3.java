package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class G3 implements R5 {

    @NotNull
    private final JSONObject a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final boolean b = false;

        @NotNull
        public static final String c = "curlError";

        private a() {
        }
    }

    public G3(@Nullable JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.R5
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
