package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import defpackage.joa;
import defpackage.k13;
import defpackage.sub;
import defpackage.xka;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4398xc {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    @Nullable
    private final String e;

    @Nullable
    private final JSONObject f;

    @NotNull
    private final Map<String, JSONObject> g;

    @NotNull
    private final String h;

    @NotNull
    private final String i;
    private final boolean j;

    @Nullable
    private C4398xc k;

    @NotNull
    private final joa l;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.xc$a */
    public static final class a extends xka implements Function0<NetworkSettings> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String j = C4398xc.this.j();
            String l = C4398xc.this.l();
            String h = C4398xc.this.h();
            String k = C4398xc.this.k();
            JSONObject c = C4398xc.this.c();
            C4398xc c4398xc = C4398xc.this.k;
            JSONObject b = IronSourceUtils.b(c, c4398xc != null ? c4398xc.c() : null);
            JSONObject m = C4398xc.this.m();
            C4398xc c4398xc2 = C4398xc.this.k;
            JSONObject b2 = IronSourceUtils.b(m, c4398xc2 != null ? c4398xc2.m() : null);
            JSONObject e = C4398xc.this.e();
            C4398xc c4398xc3 = C4398xc.this.k;
            JSONObject b3 = IronSourceUtils.b(e, c4398xc3 != null ? c4398xc3.e() : null);
            JSONObject d = C4398xc.this.d();
            C4398xc c4398xc4 = C4398xc.this.k;
            JSONObject b4 = IronSourceUtils.b(d, c4398xc4 != null ? c4398xc4.d() : null);
            JSONObject g = C4398xc.this.g();
            C4398xc c4398xc5 = C4398xc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(j, l, h, k, b, b2, b3, b4, IronSourceUtils.b(g, c4398xc5 != null ? c4398xc5.g() : null));
            networkSettings.setIsMultipleInstances(C4398xc.this.o());
            networkSettings.setSubProviderId(C4398xc.this.n());
            networkSettings.setAdSourceNameForEvents(C4398xc.this.b());
            return networkSettings;
        }
    }

    public C4398xc(@NotNull String str, @NotNull JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        this.a = str;
        this.b = str;
        String optString = jSONObject.optString(C4416yc.d, str);
        optString.getClass();
        this.c = optString;
        String optString2 = jSONObject.optString(C4416yc.f, optString);
        optString2.getClass();
        this.d = optString2;
        Object opt = jSONObject.opt("providerNetworkKey");
        this.e = opt instanceof String ? (String) opt : null;
        this.f = jSONObject.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(Gf.a(adFormat));
        }
        int c = sub.c(k13.r(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str2) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(next, optJSONObject2);
        }
        this.g = linkedHashMap;
        String optString3 = jSONObject.optString("spId", "0");
        optString3.getClass();
        this.h = optString3;
        String optString4 = jSONObject.optString(C4416yc.a);
        optString4.getClass();
        this.i = optString4;
        this.j = jSONObject.optBoolean(C4416yc.c, false);
        this.l = ypa.b(new a());
    }

    @NotNull
    public final String b() {
        return this.i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f;
    }

    @NotNull
    public final JSONObject d() {
        JSONObject b = IronSourceUtils.b(this.g.get("banner"), this.f);
        b.getClass();
        return b;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject b = IronSourceUtils.b(this.g.get("interstitial"), this.f);
        b.getClass();
        return b;
    }

    @NotNull
    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    @NotNull
    public final JSONObject g() {
        JSONObject b = IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        b.getClass();
        return b;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    @NotNull
    public final String i() {
        return this.b;
    }

    @NotNull
    public final String j() {
        return this.a;
    }

    @Nullable
    public final String k() {
        return this.e;
    }

    @NotNull
    public final String l() {
        return this.c;
    }

    @NotNull
    public final JSONObject m() {
        JSONObject b = IronSourceUtils.b(this.g.get("rewarded"), this.f);
        b.getClass();
        return b;
    }

    @NotNull
    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    @NotNull
    public final Map<String, JSONObject> a() {
        return this.g;
    }

    public final void b(@Nullable C4398xc c4398xc) {
        this.k = c4398xc;
    }
}
