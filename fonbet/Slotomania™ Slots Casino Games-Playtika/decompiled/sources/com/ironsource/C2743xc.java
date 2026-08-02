package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2743xc {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final JSONObject f;
    private final Map<String, JSONObject> g;
    private final String h;
    private final String i;
    private final boolean j;
    private C2743xc k;
    private final Lazy l;

    /* renamed from: com.ironsource.xc$a */
    static final class a extends Lambda implements Function0<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String j = C2743xc.this.j();
            String l = C2743xc.this.l();
            String h = C2743xc.this.h();
            String k = C2743xc.this.k();
            JSONObject c = C2743xc.this.c();
            C2743xc c2743xc = C2743xc.this.k;
            JSONObject b = IronSourceUtils.b(c, c2743xc != null ? c2743xc.c() : null);
            JSONObject m = C2743xc.this.m();
            C2743xc c2743xc2 = C2743xc.this.k;
            JSONObject b2 = IronSourceUtils.b(m, c2743xc2 != null ? c2743xc2.m() : null);
            JSONObject e = C2743xc.this.e();
            C2743xc c2743xc3 = C2743xc.this.k;
            JSONObject b3 = IronSourceUtils.b(e, c2743xc3 != null ? c2743xc3.e() : null);
            JSONObject d = C2743xc.this.d();
            C2743xc c2743xc4 = C2743xc.this.k;
            JSONObject b4 = IronSourceUtils.b(d, c2743xc4 != null ? c2743xc4.d() : null);
            JSONObject g = C2743xc.this.g();
            C2743xc c2743xc5 = C2743xc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(j, l, h, k, b, b2, b3, b4, IronSourceUtils.b(g, c2743xc5 != null ? c2743xc5.g() : null));
            networkSettings.setIsMultipleInstances(C2743xc.this.o());
            networkSettings.setSubProviderId(C2743xc.this.n());
            networkSettings.setAdSourceNameForEvents(C2743xc.this.b());
            return networkSettings;
        }
    }

    public C2743xc(String providerName, JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.a = providerName;
        this.b = providerName;
        String optString = networkSettings.optString(C2761yc.d, providerName);
        Intrinsics.checkNotNullExpressionValue(optString, "networkSettings.optStrin…,\n          providerName)");
        this.c = optString;
        String optString2 = networkSettings.optString(C2761yc.f, optString);
        Intrinsics.checkNotNullExpressionValue(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.d = optString2;
        Object opt = networkSettings.opt("providerNetworkKey");
        this.e = opt instanceof String ? (String) opt : null;
        this.f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(Ff.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = IronSourceNetworkBridge.jsonObjectInit();
            }
            linkedHashMap.put(obj, optJSONObject2);
        }
        this.g = linkedHashMap;
        String optString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.h = optString3;
        String optString4 = networkSettings.optString(C2761yc.a);
        Intrinsics.checkNotNullExpressionValue(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.i = optString4;
        this.j = networkSettings.optBoolean(C2761yc.c, false);
        this.l = LazyKt.lazy(new a());
    }

    public final String b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.f;
    }

    public final JSONObject d() {
        JSONObject b = IronSourceUtils.b(this.g.get("banner"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final JSONObject e() {
        JSONObject b = IronSourceUtils.b(this.g.get("interstitial"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    public final JSONObject g() {
        JSONObject b = IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final String h() {
        return this.d;
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.c;
    }

    public final JSONObject m() {
        JSONObject b = IronSourceUtils.b(this.g.get("rewarded"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …     applicationSettings)");
        return b;
    }

    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    public final Map<String, JSONObject> a() {
        return this.g;
    }

    public final void b(C2743xc c2743xc) {
        this.k = c2743xc;
    }
}
