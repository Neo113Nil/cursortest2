package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class TopBarSubscriptionManageType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TopBarSubscriptionManageType[] $VALUES;
    public static final TopBarSubscriptionManageType None;
    public static final TopBarSubscriptionManageType WithTooltip;
    public static final TopBarSubscriptionManageType WithoutTooltip;

    static {
        TopBarSubscriptionManageType topBarSubscriptionManageType = new TopBarSubscriptionManageType("WithTooltip", 0);
        WithTooltip = topBarSubscriptionManageType;
        TopBarSubscriptionManageType topBarSubscriptionManageType2 = new TopBarSubscriptionManageType("WithoutTooltip", 1);
        WithoutTooltip = topBarSubscriptionManageType2;
        TopBarSubscriptionManageType topBarSubscriptionManageType3 = new TopBarSubscriptionManageType("None", 2);
        None = topBarSubscriptionManageType3;
        TopBarSubscriptionManageType[] topBarSubscriptionManageTypeArr = {topBarSubscriptionManageType, topBarSubscriptionManageType2, topBarSubscriptionManageType3};
        $VALUES = topBarSubscriptionManageTypeArr;
        $ENTRIES = new asp(topBarSubscriptionManageTypeArr);
    }

    public TopBarSubscriptionManageType() {
        throw null;
    }

    public static TopBarSubscriptionManageType valueOf(String str) {
        return (TopBarSubscriptionManageType) Enum.valueOf(TopBarSubscriptionManageType.class, str);
    }

    public static TopBarSubscriptionManageType[] values() {
        return (TopBarSubscriptionManageType[]) $VALUES.clone();
    }
}
