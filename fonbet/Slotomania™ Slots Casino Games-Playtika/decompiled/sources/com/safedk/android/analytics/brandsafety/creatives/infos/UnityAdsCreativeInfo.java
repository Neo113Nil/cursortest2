package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.r;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@AdNetworkIdentifier(packageName = "com.unity3d.ads")
/* loaded from: classes3.dex */
public class UnityAdsCreativeInfo extends CreativeInfo {
    private static final String E = "UnityAdsCreativeInfo";
    private static final String Z = "playableUrl";
    private static final String[] ah = {h.h, "com.unity3d.ads"};
    private static final long serialVersionUID = 0;
    private String Y;
    private String a;
    private String ac;
    private String ae;
    private String af;
    private String ag;

    public UnityAdsCreativeInfo() {
        this.a = null;
    }

    public UnityAdsCreativeInfo(String id, String creativeId, String clickUrl, String videoUrl, String playableAd, String contentType, String adDomain, BrandSafetyEvent.AdFormatType adFormat, String placementId, String sdkVersion, String bundleId, String buyerId, String endCardUrl) {
        super(BrandSafetyUtils.a(adFormat), "com.unity3d.ads", id, creativeId, clickUrl, videoUrl, contentType, sdkVersion);
        this.a = null;
        this.ac = playableAd;
        this.aX = adDomain;
        a(adFormat);
        this.K = placementId;
        if (TextUtils.isEmpty(this.M)) {
            this.M = bundleId;
        }
        this.ar = buyerId;
        this.at = endCardUrl;
        this.W = !TextUtils.isEmpty(this.ac);
    }

    public String as() {
        return this.a;
    }

    public String at() {
        return this.ae;
    }

    public String au() {
        return this.af;
    }

    public String av() {
        return this.at;
    }

    public String aw() {
        return this.ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String o() {
        return this.aX;
    }

    public void c(String str, String str2) {
        this.ae = str;
        this.af = str2;
    }

    public void a(String str) {
        this.ag = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle b = super.b();
        if (N() == null || (this.I && !TextUtils.isEmpty(this.ae))) {
            b.putString("creative_id", this.ae);
        }
        if (TextUtils.isEmpty(this.J) || (this.I && !TextUtils.isEmpty(this.af))) {
            b.putString(CreativeInfo.e, this.af);
        }
        return b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean v(String str) {
        if (this.F.contains(r.b) || this.F.contains(r.c) || this.F.contains(r.d)) {
            return g.a(ah, str);
        }
        return super.v(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (this.F.contains(r.b) || this.F.contains(r.c) || this.F.contains(r.d)) {
            return AdMobCreativeInfo.a(str) || n.a(str, (Map<String, String>) null) || n.i(str);
        }
        return super.b(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String af() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(N());
        if (this.ae != null) {
            str = ", " + this.ae;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public void J(String str) {
        this.a = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(CreativeInfo creativeInfo) {
        Logger.d(E, "merge scar-admob CI started");
        n(creativeInfo.Q());
        c(new ArrayList(creativeInfo.r()));
        Iterator<String> it = creativeInfo.q().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        Iterator<String> it2 = creativeInfo.u().iterator();
        while (it2.hasNext()) {
            C(it2.next());
        }
        Logger.d(E, "merge scar-admob CI admob's click url is: ", creativeInfo.M());
        if (creativeInfo.M() != null) {
            a(creativeInfo.M(), creativeInfo.ap());
        }
        Logger.d(E, "merge scar-admob CI admob's video url is: ", creativeInfo.H());
        if (creativeInfo.H() != null) {
            p(creativeInfo.H());
        }
        if (creativeInfo.g()) {
            ae();
            F(creativeInfo.A());
        }
        if (creativeInfo.N() != null) {
            k(creativeInfo.N());
        }
        if (creativeInfo.W() != null) {
            u(creativeInfo.W());
        }
    }

    public String ax() {
        return this.Y;
    }

    public void K(String str) {
        this.Y = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject i = super.i();
        if (!TextUtils.isEmpty(this.ac)) {
            i.put(Z, this.ac);
        }
        if (!TextUtils.isEmpty(this.a)) {
            i.put("clickString", this.a);
        }
        if (!TextUtils.isEmpty(this.ae)) {
            i.put("portraitCreativeId", this.ae);
        }
        if (!TextUtils.isEmpty(this.af)) {
            i.put("portraitVideoUrl", this.af);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            i.put("streamVideoUrl", this.ag);
        }
        if (!TextUtils.isEmpty(this.Y)) {
            i.put("debugBundleId", this.Y);
        }
        return i;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.ac = jSONObject.optString(Z, "");
            this.a = jSONObject.optString("clickString", "");
            this.ae = jSONObject.optString("portraitCreativeId", "");
            this.af = jSONObject.optString("portraitVideoUrl", "");
            this.ag = jSONObject.optString("streamVideoUrl", "");
            this.Y = jSONObject.optString("debugBundleId", "");
        }
    }
}
