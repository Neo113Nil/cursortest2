package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketTransitionToWishlists implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("ad_campaign")
    private final CommonMarketStat$TypeAdCampaign adCampaign;

    @pmi0("traffic_source")
    private final String trafficSource;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketTransitionToWishlists() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketTransitionToWishlists)) {
            return false;
        }
        CommonMarketStat$TypeMarketTransitionToWishlists commonMarketStat$TypeMarketTransitionToWishlists = (CommonMarketStat$TypeMarketTransitionToWishlists) obj;
        return epx.f(this.adCampaign, commonMarketStat$TypeMarketTransitionToWishlists.adCampaign) && epx.f(this.trafficSource, commonMarketStat$TypeMarketTransitionToWishlists.trafficSource);
    }

    public final int hashCode() {
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = this.adCampaign;
        int hashCode = (commonMarketStat$TypeAdCampaign == null ? 0 : commonMarketStat$TypeAdCampaign.hashCode()) * 31;
        String str = this.trafficSource;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketTransitionToWishlists(adCampaign=");
        sb.append(this.adCampaign);
        sb.append(", trafficSource=");
        return ho8.a(sb, this.trafficSource, ')');
    }

    public CommonMarketStat$TypeMarketTransitionToWishlists(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, String str) {
        this.adCampaign = commonMarketStat$TypeAdCampaign;
        this.trafficSource = str;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketTransitionToWishlists(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeAdCampaign, (i & 2) != 0 ? null : str);
    }
}
