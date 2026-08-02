package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketTransitionToCategoriesMenu implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("ad_campaign")
    private final CommonMarketStat$TypeAdCampaign adCampaign;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("traffic_source")
    private final String trafficSource;

    public CommonMarketStat$TypeMarketTransitionToCategoriesMenu() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketTransitionToCategoriesMenu)) {
            return false;
        }
        CommonMarketStat$TypeMarketTransitionToCategoriesMenu commonMarketStat$TypeMarketTransitionToCategoriesMenu = (CommonMarketStat$TypeMarketTransitionToCategoriesMenu) obj;
        return epx.f(this.adCampaign, commonMarketStat$TypeMarketTransitionToCategoriesMenu.adCampaign) && epx.f(this.categoryId, commonMarketStat$TypeMarketTransitionToCategoriesMenu.categoryId) && epx.f(this.trafficSource, commonMarketStat$TypeMarketTransitionToCategoriesMenu.trafficSource);
    }

    public final int hashCode() {
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = this.adCampaign;
        int hashCode = (commonMarketStat$TypeAdCampaign == null ? 0 : commonMarketStat$TypeAdCampaign.hashCode()) * 31;
        Integer num = this.categoryId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.trafficSource;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketTransitionToCategoriesMenu(adCampaign=");
        sb.append(this.adCampaign);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", trafficSource=");
        return ho8.a(sb, this.trafficSource, ')');
    }

    public CommonMarketStat$TypeMarketTransitionToCategoriesMenu(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, Integer num, String str) {
        this.adCampaign = commonMarketStat$TypeAdCampaign;
        this.categoryId = num;
        this.trafficSource = str;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketTransitionToCategoriesMenu(CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign, Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$TypeAdCampaign, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
