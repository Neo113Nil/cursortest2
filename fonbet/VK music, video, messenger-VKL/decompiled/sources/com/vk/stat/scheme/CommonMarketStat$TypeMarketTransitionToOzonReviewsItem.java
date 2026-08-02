package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketTransitionToOzonReviewsItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("ad_campaign")
    private final CommonMarketStat$TypeAdCampaign adCampaign;

    @pmi0("ozon_click")
    private final CommonMarketStat$TypeOzonClick ozonClick;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonMarketStat$TypeMarketTransitionToOzonReviewsItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketTransitionToOzonReviewsItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketTransitionToOzonReviewsItem commonMarketStat$TypeMarketTransitionToOzonReviewsItem = (CommonMarketStat$TypeMarketTransitionToOzonReviewsItem) obj;
        return epx.f(this.adCampaign, commonMarketStat$TypeMarketTransitionToOzonReviewsItem.adCampaign) && epx.f(this.ozonClick, commonMarketStat$TypeMarketTransitionToOzonReviewsItem.ozonClick);
    }

    public final int hashCode() {
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = this.adCampaign;
        int hashCode = (commonMarketStat$TypeAdCampaign == null ? 0 : commonMarketStat$TypeAdCampaign.hashCode()) * 31;
        CommonMarketStat$TypeOzonClick commonMarketStat$TypeOzonClick = this.ozonClick;
        return hashCode + (commonMarketStat$TypeOzonClick != null ? commonMarketStat$TypeOzonClick.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketTransitionToOzonReviewsItem(adCampaign=" + this.adCampaign + ", ozonClick=" + this.ozonClick + ')';
    }

    public CommonMarketStat$TypeMarketTransitionToOzonReviewsItem(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, CommonMarketStat$TypeOzonClick commonMarketStat$TypeOzonClick) {
        this.adCampaign = commonMarketStat$TypeAdCampaign;
        this.ozonClick = commonMarketStat$TypeOzonClick;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketTransitionToOzonReviewsItem(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, CommonMarketStat$TypeOzonClick commonMarketStat$TypeOzonClick, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeAdCampaign, (i & 2) != 0 ? null : commonMarketStat$TypeOzonClick);
    }
}
