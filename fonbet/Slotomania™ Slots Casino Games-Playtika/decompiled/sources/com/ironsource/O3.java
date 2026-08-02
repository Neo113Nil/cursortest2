package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class O3 {
    private final C2676u a;
    private final C2676u b;
    private final T2 c;
    private final Qb d;
    private final B1 e;
    private final Map<LevelPlay.AdFormat, C2676u> f;

    public O3(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C2676u c2676u = new C2676u(a(configurations, "rewarded"));
        this.a = c2676u;
        C2676u c2676u2 = new C2676u(a(configurations, "interstitial"));
        this.b = c2676u2;
        this.c = new T2(a(configurations, "banner"));
        this.d = new Qb(a(configurations, "nativeAd"));
        JSONObject optJSONObject = configurations.optJSONObject("application");
        this.e = new B1(optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject);
        this.f = MapsKt.mapOf(TuplesKt.to(LevelPlay.AdFormat.INTERSTITIAL, c2676u2), TuplesKt.to(LevelPlay.AdFormat.REWARDED, c2676u));
    }

    public final Map<LevelPlay.AdFormat, C2676u> a() {
        return this.f;
    }

    public final B1 b() {
        return this.e;
    }

    public final T2 c() {
        return this.c;
    }

    public final Qb d() {
        return this.d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject2;
    }
}
