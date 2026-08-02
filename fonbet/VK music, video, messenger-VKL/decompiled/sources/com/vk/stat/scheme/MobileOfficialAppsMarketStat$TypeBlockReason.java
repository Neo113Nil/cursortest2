package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeBlockReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsMarketStat$TypeBlockReason[] $VALUES;

    @pmi0("community_items")
    public static final MobileOfficialAppsMarketStat$TypeBlockReason COMMUNITY_ITEMS;

    @pmi0("ml_recommendations")
    public static final MobileOfficialAppsMarketStat$TypeBlockReason ML_RECOMMENDATIONS;

    @pmi0("personal_recommendation")
    public static final MobileOfficialAppsMarketStat$TypeBlockReason PERSONAL_RECOMMENDATION;

    @pmi0("similar_recommendations")
    public static final MobileOfficialAppsMarketStat$TypeBlockReason SIMILAR_RECOMMENDATIONS;

    @pmi0("subscription")
    public static final MobileOfficialAppsMarketStat$TypeBlockReason SUBSCRIPTION;

    @pmi0("thematic_compilation")
    public static final MobileOfficialAppsMarketStat$TypeBlockReason THEMATIC_COMPILATION;

    static {
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason = new MobileOfficialAppsMarketStat$TypeBlockReason("SUBSCRIPTION", 0);
        SUBSCRIPTION = mobileOfficialAppsMarketStat$TypeBlockReason;
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason2 = new MobileOfficialAppsMarketStat$TypeBlockReason("ML_RECOMMENDATIONS", 1);
        ML_RECOMMENDATIONS = mobileOfficialAppsMarketStat$TypeBlockReason2;
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason3 = new MobileOfficialAppsMarketStat$TypeBlockReason("SIMILAR_RECOMMENDATIONS", 2);
        SIMILAR_RECOMMENDATIONS = mobileOfficialAppsMarketStat$TypeBlockReason3;
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason4 = new MobileOfficialAppsMarketStat$TypeBlockReason("PERSONAL_RECOMMENDATION", 3);
        PERSONAL_RECOMMENDATION = mobileOfficialAppsMarketStat$TypeBlockReason4;
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason5 = new MobileOfficialAppsMarketStat$TypeBlockReason("COMMUNITY_ITEMS", 4);
        COMMUNITY_ITEMS = mobileOfficialAppsMarketStat$TypeBlockReason5;
        MobileOfficialAppsMarketStat$TypeBlockReason mobileOfficialAppsMarketStat$TypeBlockReason6 = new MobileOfficialAppsMarketStat$TypeBlockReason("THEMATIC_COMPILATION", 5);
        THEMATIC_COMPILATION = mobileOfficialAppsMarketStat$TypeBlockReason6;
        MobileOfficialAppsMarketStat$TypeBlockReason[] mobileOfficialAppsMarketStat$TypeBlockReasonArr = {mobileOfficialAppsMarketStat$TypeBlockReason, mobileOfficialAppsMarketStat$TypeBlockReason2, mobileOfficialAppsMarketStat$TypeBlockReason3, mobileOfficialAppsMarketStat$TypeBlockReason4, mobileOfficialAppsMarketStat$TypeBlockReason5, mobileOfficialAppsMarketStat$TypeBlockReason6};
        $VALUES = mobileOfficialAppsMarketStat$TypeBlockReasonArr;
        $ENTRIES = new asp(mobileOfficialAppsMarketStat$TypeBlockReasonArr);
    }

    private MobileOfficialAppsMarketStat$TypeBlockReason(String str, int i) {
    }

    public static MobileOfficialAppsMarketStat$TypeBlockReason valueOf(String str) {
        return (MobileOfficialAppsMarketStat$TypeBlockReason) Enum.valueOf(MobileOfficialAppsMarketStat$TypeBlockReason.class, str);
    }

    public static MobileOfficialAppsMarketStat$TypeBlockReason[] values() {
        return (MobileOfficialAppsMarketStat$TypeBlockReason[]) $VALUES.clone();
    }
}
