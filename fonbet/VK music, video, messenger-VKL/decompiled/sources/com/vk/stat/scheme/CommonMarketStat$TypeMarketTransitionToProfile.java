package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketTransitionToProfile implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("ad_campaign")
    private final CommonMarketStat$TypeAdCampaign adCampaign;

    @pmi0("traffic_source")
    private final String trafficSource;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketTransitionToProfile() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketTransitionToProfile)) {
            return false;
        }
        CommonMarketStat$TypeMarketTransitionToProfile commonMarketStat$TypeMarketTransitionToProfile = (CommonMarketStat$TypeMarketTransitionToProfile) obj;
        return epx.f(this.adCampaign, commonMarketStat$TypeMarketTransitionToProfile.adCampaign) && epx.f(this.trafficSource, commonMarketStat$TypeMarketTransitionToProfile.trafficSource);
    }

    public final int hashCode() {
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = this.adCampaign;
        int hashCode = (commonMarketStat$TypeAdCampaign == null ? 0 : commonMarketStat$TypeAdCampaign.hashCode()) * 31;
        String str = this.trafficSource;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketTransitionToProfile(adCampaign=");
        sb.append(this.adCampaign);
        sb.append(", trafficSource=");
        return ho8.a(sb, this.trafficSource, ')');
    }

    public CommonMarketStat$TypeMarketTransitionToProfile(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, String str) {
        this.adCampaign = commonMarketStat$TypeAdCampaign;
        this.trafficSource = str;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketTransitionToProfile(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeAdCampaign, (i & 2) != 0 ? null : str);
    }
}
