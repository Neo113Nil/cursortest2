package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class B1 {
    private final Fb a;
    private final I1 b;
    private final boolean c;
    private final F1 d;
    private final M1 e;
    private final C2768z1 f;

    public B1(JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject optJSONObject = applicationConfigurations.optJSONObject(D1.a);
        this.a = new Fb(optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject);
        JSONObject optJSONObject2 = applicationConfigurations.optJSONObject("events");
        this.b = new I1(optJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject2);
        this.c = applicationConfigurations.optBoolean(D1.g, false);
        JSONObject optJSONObject3 = applicationConfigurations.optJSONObject(D1.h);
        this.d = new F1(optJSONObject3 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject3);
        JSONObject optJSONObject4 = applicationConfigurations.optJSONObject("settings");
        this.e = new M1(optJSONObject4 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject4);
        JSONObject optJSONObject5 = applicationConfigurations.optJSONObject(D1.f);
        this.f = new C2768z1(optJSONObject5 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject5);
    }

    public final C2768z1 a() {
        return this.f;
    }

    public final F1 b() {
        return this.d;
    }

    public final I1 c() {
        return this.b;
    }

    public final M1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final Fb f() {
        return this.a;
    }
}
