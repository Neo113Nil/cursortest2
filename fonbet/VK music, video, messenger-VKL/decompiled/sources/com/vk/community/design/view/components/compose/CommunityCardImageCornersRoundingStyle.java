package com.vk.community.design.view.components.compose;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public final class CommunityCardImageCornersRoundingStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityCardImageCornersRoundingStyle[] $VALUES;
    public static final CommunityCardImageCornersRoundingStyle ALL;
    public static final CommunityCardImageCornersRoundingStyle TOP;

    static {
        CommunityCardImageCornersRoundingStyle communityCardImageCornersRoundingStyle = new CommunityCardImageCornersRoundingStyle("ALL", 0);
        ALL = communityCardImageCornersRoundingStyle;
        CommunityCardImageCornersRoundingStyle communityCardImageCornersRoundingStyle2 = new CommunityCardImageCornersRoundingStyle("TOP", 1);
        TOP = communityCardImageCornersRoundingStyle2;
        CommunityCardImageCornersRoundingStyle[] communityCardImageCornersRoundingStyleArr = {communityCardImageCornersRoundingStyle, communityCardImageCornersRoundingStyle2};
        $VALUES = communityCardImageCornersRoundingStyleArr;
        $ENTRIES = new asp(communityCardImageCornersRoundingStyleArr);
    }

    public CommunityCardImageCornersRoundingStyle() {
        throw null;
    }

    public static CommunityCardImageCornersRoundingStyle valueOf(String str) {
        return (CommunityCardImageCornersRoundingStyle) Enum.valueOf(CommunityCardImageCornersRoundingStyle.class, str);
    }

    public static CommunityCardImageCornersRoundingStyle[] values() {
        return (CommunityCardImageCornersRoundingStyle[]) $VALUES.clone();
    }
}
