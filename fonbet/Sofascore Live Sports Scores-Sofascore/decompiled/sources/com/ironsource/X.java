package com.ironsource;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface X {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements X {

        @NotNull
        private final JSONObject a;

        @NotNull
        private final InterfaceC4375w7 b;

        public a(@NotNull JSONObject jSONObject, @NotNull InterfaceC4375w7 interfaceC4375w7) {
            jSONObject.getClass();
            interfaceC4375w7.getClass();
            this.a = jSONObject;
            this.b = interfaceC4375w7;
        }

        @Override // com.ironsource.X
        @NotNull
        public String a() {
            String a = this.b.a();
            if (StringsKt.R(a)) {
                a = null;
            }
            if (a != null) {
                return a;
            }
            String optString = this.a.optString("controllerUrl");
            optString.getClass();
            String str = StringsKt.R(optString) ? null : optString;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
        @NotNull
        public JSONObject b() {
            JSONObject optJSONObject = this.a.optJSONObject("controllerConfig");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        @Override // com.ironsource.X
        public int c() {
            int optInt = this.a.optInt("debugMode", 0);
            if (this.a.optBoolean(b.e, false)) {
                return 3;
            }
            return optInt;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final String b = "controllerUrl";

        @NotNull
        public static final String c = "controllerConfig";

        @NotNull
        public static final String d = "debugMode";

        @NotNull
        public static final String e = "adptDebugMode";

        private b() {
        }
    }

    @NotNull
    String a();

    @NotNull
    JSONObject b();

    int c();
}
