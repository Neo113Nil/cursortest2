package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import defpackage.tub;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L3 {

    @NotNull
    private final C4331u a;

    @NotNull
    private final C4331u b;

    @NotNull
    private final R2 c;

    @NotNull
    private final Qb d;

    @NotNull
    private final C4423z1 e;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4331u> f;

    public L3(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        C4331u c4331u = new C4331u(a(jSONObject, "rewarded"));
        this.a = c4331u;
        C4331u c4331u2 = new C4331u(a(jSONObject, "interstitial"));
        this.b = c4331u2;
        this.c = new R2(a(jSONObject, "banner"));
        this.d = new Qb(a(jSONObject, "nativeAd"));
        JSONObject optJSONObject = jSONObject.optJSONObject("application");
        this.e = new C4423z1(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f = tub.h(new Pair(LevelPlay.AdFormat.INTERSTITIAL, c4331u2), new Pair(LevelPlay.AdFormat.REWARDED, c4331u));
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new JSONObject() : optJSONObject2;
    }

    @NotNull
    public final C4423z1 b() {
        return this.e;
    }

    @NotNull
    public final R2 c() {
        return this.c;
    }

    @NotNull
    public final Qb d() {
        return this.d;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4331u> a() {
        return this.f;
    }
}
