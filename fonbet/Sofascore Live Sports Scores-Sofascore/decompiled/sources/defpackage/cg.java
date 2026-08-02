package defpackage;

import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cg {
    public final bg a;
    public final AdType.RewardedInterstitial b;

    public cg(bg bgVar, AdType.RewardedInterstitial rewardedInterstitial) {
        bgVar.getClass();
        this.a = bgVar;
        this.b = rewardedInterstitial;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return this.a == cgVar.a && this.b == cgVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AdType.RewardedInterstitial rewardedInterstitial = this.b;
        return hashCode + (rewardedInterstitial == null ? 0 : rewardedInterstitial.hashCode());
    }

    public final String toString() {
        return "AdLoadingState(adLoaderState=" + this.a + ", rewardedAdsType=" + this.b + ")";
    }
}
