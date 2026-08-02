package com.ironsource;

import org.json.JSONObject;
import xsna.drm0;

/* loaded from: classes13.dex */
public interface X {

    public static final class a implements X {
        private final JSONObject a;
        private final A7 b;

        public a(JSONObject jSONObject, A7 a7) {
            this.a = jSONObject;
            this.b = a7;
        }

        @Override // com.ironsource.X
        public String a() {
            String a = this.b.a();
            if (drm0.N(a)) {
                a = null;
            }
            if (a != null) {
                return a;
            }
            String optString = this.a.optString("controllerUrl");
            String str = drm0.N(optString) ? null : optString;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
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

    public static final class b {
        public static final b a = new b();
        public static final String b = "controllerUrl";
        public static final String c = "controllerConfig";
        public static final String d = "debugMode";
        public static final String e = "adptDebugMode";

        private b() {
        }
    }

    String a();

    JSONObject b();

    int c();
}
