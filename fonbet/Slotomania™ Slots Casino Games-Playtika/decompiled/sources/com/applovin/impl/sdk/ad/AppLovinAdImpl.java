package com.applovin.impl.sdk.ad;

import com.applovin.impl.j5;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.u;
import com.applovin.impl.u1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, u1 {
    private u a;
    private boolean b;
    private c c;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, l lVar) {
        super(jSONObject, jSONObject2, lVar);
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(z4.g1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd c;
        if ((obj instanceof c) && (c = ((c) obj).c()) != null) {
            obj = c;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject(CreativeInfo.c, -1L);
    }

    public u getAdZone() {
        u uVar = this.a;
        if (uVar != null) {
            if (uVar.f() != null && this.a.g() != null) {
                return this.a;
            }
            if (getSize() == null && getType() == null) {
                return this.a;
            }
        }
        u a = u.a(getSize(), getType(), getStringFromFullResponse(BrandSafetyEvent.f, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.a = a;
        return a;
    }

    public c getDummyAd() {
        return this.c;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        j5 j5Var = this.synchronizedFullResponse;
        if (j5Var != null) {
            return j5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.u1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse(BrandSafetyEvent.f, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.Q();
        if (!p.a()) {
            return false;
        }
        this.sdk.Q().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.c = cVar;
    }

    @Override // com.applovin.impl.u1
    public void setExpired() {
        this.b = true;
    }

    public void setHasShown(boolean z) {
        try {
            j5 j5Var = this.synchronizedAdObject;
            if (j5Var != null) {
                j5Var.a("shown", (Object) Boolean.valueOf(z));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
