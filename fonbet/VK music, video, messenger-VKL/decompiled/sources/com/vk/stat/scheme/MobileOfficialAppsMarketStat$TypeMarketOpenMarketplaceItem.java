package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem implements MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("ad_campaign")
    private final String adCampaign;

    @pmi0("ad_campaign_content")
    private final String adCampaignContent;

    @pmi0("ad_campaign_id")
    private final Integer adCampaignId;

    @pmi0("ad_campaign_medium")
    private final String adCampaignMedium;

    @pmi0("ad_campaign_source")
    private final String adCampaignSource;

    @pmi0("ad_campaign_term")
    private final String adCampaignTerm;

    @pmi0("ref_source")
    private final String refSource;

    @pmi0("traffic_source")
    private final String trafficSource;

    public MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem = (MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem) obj;
        return epx.f(this.refSource, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.refSource) && epx.f(this.trafficSource, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.trafficSource) && epx.f(this.adCampaignId, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.adCampaignId) && epx.f(this.adCampaign, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.adCampaign) && epx.f(this.adCampaignSource, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.adCampaignSource) && epx.f(this.adCampaignMedium, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.adCampaignMedium) && epx.f(this.adCampaignTerm, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.adCampaignTerm) && epx.f(this.adCampaignContent, mobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem.adCampaignContent);
    }

    public final int hashCode() {
        String str = this.refSource;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trafficSource;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.adCampaignId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.adCampaign;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adCampaignSource;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.adCampaignMedium;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adCampaignTerm;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.adCampaignContent;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketOpenMarketplaceItem(refSource=");
        sb.append(this.refSource);
        sb.append(", trafficSource=");
        sb.append(this.trafficSource);
        sb.append(", adCampaignId=");
        sb.append(this.adCampaignId);
        sb.append(", adCampaign=");
        sb.append(this.adCampaign);
        sb.append(", adCampaignSource=");
        sb.append(this.adCampaignSource);
        sb.append(", adCampaignMedium=");
        sb.append(this.adCampaignMedium);
        sb.append(", adCampaignTerm=");
        sb.append(this.adCampaignTerm);
        sb.append(", adCampaignContent=");
        return ho8.a(sb, this.adCampaignContent, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7) {
        this.refSource = str;
        this.trafficSource = str2;
        this.adCampaignId = num;
        this.adCampaign = str3;
        this.adCampaignSource = str4;
        this.adCampaignMedium = str5;
        this.adCampaignTerm = str6;
        this.adCampaignContent = str7;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketOpenMarketplaceItem(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7);
    }
}
