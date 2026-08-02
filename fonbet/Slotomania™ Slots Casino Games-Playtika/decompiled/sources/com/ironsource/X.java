package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface X {

    public static final class a implements X {
        private final JSONObject a;
        private final InterfaceC2774z7 b;

        public a(JSONObject applicationConfig, InterfaceC2774z7 epService) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            Intrinsics.checkNotNullParameter(epService, "epService");
            this.a = applicationConfig;
            this.b = epService;
        }

        @Override // com.ironsource.X
        public String a() {
            String a = this.b.a();
            if (StringsKt.isBlank(a)) {
                a = null;
            }
            if (a != null) {
                return a;
            }
            String it = this.a.optString("controllerUrl");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            String str = StringsKt.isBlank(it) ? null : it;
            return str == null ? "" : str;
        }

        @Override // com.ironsource.X
        public JSONObject b() {
            JSONObject optJSONObject = this.a.optJSONObject("controllerConfig");
            return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
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
