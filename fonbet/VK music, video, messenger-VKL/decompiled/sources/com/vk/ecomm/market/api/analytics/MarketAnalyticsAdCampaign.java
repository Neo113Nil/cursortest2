package com.vk.ecomm.market.api.analytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketAnalyticsAdCampaign.kt */
/* loaded from: classes18.dex */
public final class MarketAnalyticsAdCampaign {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketAnalyticsAdCampaign[] $VALUES;
    public static final MarketAnalyticsAdCampaign AFFILIATE_PROGRAM;
    private final String type = "affiliate_program";

    static {
        MarketAnalyticsAdCampaign marketAnalyticsAdCampaign = new MarketAnalyticsAdCampaign();
        AFFILIATE_PROGRAM = marketAnalyticsAdCampaign;
        MarketAnalyticsAdCampaign[] marketAnalyticsAdCampaignArr = {marketAnalyticsAdCampaign};
        $VALUES = marketAnalyticsAdCampaignArr;
        $ENTRIES = new asp(marketAnalyticsAdCampaignArr);
    }

    public static MarketAnalyticsAdCampaign valueOf(String str) {
        return (MarketAnalyticsAdCampaign) Enum.valueOf(MarketAnalyticsAdCampaign.class, str);
    }

    public static MarketAnalyticsAdCampaign[] values() {
        return (MarketAnalyticsAdCampaign[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
