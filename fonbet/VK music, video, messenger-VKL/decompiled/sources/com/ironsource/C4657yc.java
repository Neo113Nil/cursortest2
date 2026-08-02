package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.c5g;
import xsna.gzs;
import xsna.on00;

/* renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4657yc {
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
    private C4657yc k;
    private final Lazy l;

    /* renamed from: com.ironsource.yc$a */
    public static final class a extends Lambda implements gzs<NetworkSettings> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String j = C4657yc.this.j();
            String l = C4657yc.this.l();
            String h = C4657yc.this.h();
            String k = C4657yc.this.k();
            JSONObject c = C4657yc.this.c();
            C4657yc c4657yc = C4657yc.this.k;
            JSONObject b = IronSourceUtils.b(c, c4657yc != null ? c4657yc.c() : null);
            JSONObject m = C4657yc.this.m();
            C4657yc c4657yc2 = C4657yc.this.k;
            JSONObject b2 = IronSourceUtils.b(m, c4657yc2 != null ? c4657yc2.m() : null);
            JSONObject e = C4657yc.this.e();
            C4657yc c4657yc3 = C4657yc.this.k;
            JSONObject b3 = IronSourceUtils.b(e, c4657yc3 != null ? c4657yc3.e() : null);
            JSONObject d = C4657yc.this.d();
            C4657yc c4657yc4 = C4657yc.this.k;
            JSONObject b4 = IronSourceUtils.b(d, c4657yc4 != null ? c4657yc4.d() : null);
            JSONObject g = C4657yc.this.g();
            C4657yc c4657yc5 = C4657yc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(j, l, h, k, b, b2, b3, b4, IronSourceUtils.b(g, c4657yc5 != null ? c4657yc5.g() : null));
            networkSettings.setIsMultipleInstances(C4657yc.this.o());
            networkSettings.setSubProviderId(C4657yc.this.n());
            networkSettings.setAdSourceNameForEvents(C4657yc.this.b());
            return networkSettings;
        }
    }

    public C4657yc(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = str;
        String optString = jSONObject.optString(C4675zc.d, str);
        this.c = optString;
        this.d = jSONObject.optString(C4675zc.f, optString);
        Object opt = jSONObject.opt("providerNetworkKey");
        this.e = opt instanceof String ? (String) opt : null;
        this.f = jSONObject.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(If.a(adFormat));
        }
        int e = on00.e(c5g.u(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
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
        this.h = jSONObject.optString("spId", "0");
        this.i = jSONObject.optString(C4675zc.a);
        this.j = jSONObject.optBoolean(C4675zc.c, false);
        this.l = new bpn0(new a());
    }

    public final String b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.f;
    }

    public final JSONObject d() {
        return IronSourceUtils.b(this.g.get("banner"), this.f);
    }

    public final JSONObject e() {
        return IronSourceUtils.b(this.g.get("interstitial"), this.f);
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    public final JSONObject g() {
        return IronSourceUtils.b(this.g.get("nativeAd"), this.f);
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
        return IronSourceUtils.b(this.g.get("rewarded"), this.f);
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

    public final void b(C4657yc c4657yc) {
        this.k = c4657yc;
    }
}
