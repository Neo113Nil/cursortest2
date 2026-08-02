package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.pn00;

/* loaded from: classes13.dex */
public final class O3 {
    private final C4572u a;
    private final C4572u b;
    private final T2 c;
    private final Rb d;
    private final B1 e;
    private final Map<LevelPlay.AdFormat, C4572u> f;

    public O3(JSONObject jSONObject) {
        C4572u c4572u = new C4572u(a(jSONObject, "rewarded"));
        this.a = c4572u;
        C4572u c4572u2 = new C4572u(a(jSONObject, "interstitial"));
        this.b = c4572u2;
        this.c = new T2(a(jSONObject, "banner"));
        this.d = new Rb(a(jSONObject, "nativeAd"));
        JSONObject optJSONObject = jSONObject.optJSONObject("application");
        this.e = new B1(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f = pn00.k(new Pair(LevelPlay.AdFormat.INTERSTITIAL, c4572u2), new Pair(LevelPlay.AdFormat.REWARDED, c4572u));
    }

    public final Map<LevelPlay.AdFormat, C4572u> a() {
        return this.f;
    }

    public final B1 b() {
        return this.e;
    }

    public final T2 c() {
        return this.c;
    }

    public final Rb d() {
        return this.d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new JSONObject() : optJSONObject2;
    }
}
