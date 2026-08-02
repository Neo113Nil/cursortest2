package com.ironsource;

import com.ironsource.InterfaceC2542m8;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2560n8 implements InterfaceC2542m8, InterfaceC2542m8.a {
    private JSONObject a = IronSourceNetworkBridge.jsonObjectInit();
    private JSONObject b = IronSourceNetworkBridge.jsonObjectInit();
    private JSONObject c = IronSourceNetworkBridge.jsonObjectInit();

    private final Object e(String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.a.has(str)) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2542m8
    public JSONObject a(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof JSONObject) {
            return (JSONObject) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2542m8
    public Integer b(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof Integer) {
            return (Integer) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2542m8
    public Boolean c(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof Boolean) {
            return (Boolean) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2542m8
    public String d(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof String) {
            return (String) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC2542m8.a
    public void a(JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.a = controllerConfig;
        JSONObject optJSONObject = controllerConfig.optJSONObject(X3.a.b);
        if (optJSONObject == null) {
            optJSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        this.b = optJSONObject;
        JSONObject optJSONObject2 = this.a.optJSONObject(X3.a.c);
        if (optJSONObject2 == null) {
            optJSONObject2 = IronSourceNetworkBridge.jsonObjectInit();
        }
        this.c = optJSONObject2;
    }
}
