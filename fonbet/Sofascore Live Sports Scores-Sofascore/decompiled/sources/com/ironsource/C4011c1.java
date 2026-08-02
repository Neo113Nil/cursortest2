package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4011c1 {
    private NetworkSettings a;
    private JSONObject b;
    private IronSource.a c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public C4011c1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.a = networkSettings;
        this.b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f = optInt;
        this.d = optInt == 2;
        this.e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = aVar;
    }

    public String a() {
        return this.a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.c;
    }

    public JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.a.getProviderName();
    }

    public String g() {
        return this.a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.a;
    }

    public String i() {
        return this.a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
