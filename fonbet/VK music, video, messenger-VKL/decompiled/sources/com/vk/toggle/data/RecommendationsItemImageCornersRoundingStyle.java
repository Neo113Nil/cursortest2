package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsCarouselItemStyleConfig.kt */
/* loaded from: classes6.dex */
public final class RecommendationsItemImageCornersRoundingStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecommendationsItemImageCornersRoundingStyle[] $VALUES;
    public static final RecommendationsItemImageCornersRoundingStyle ALL;
    public static final RecommendationsItemImageCornersRoundingStyle TOP;

    static {
        RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle = new RecommendationsItemImageCornersRoundingStyle("ALL", 0);
        ALL = recommendationsItemImageCornersRoundingStyle;
        RecommendationsItemImageCornersRoundingStyle recommendationsItemImageCornersRoundingStyle2 = new RecommendationsItemImageCornersRoundingStyle("TOP", 1);
        TOP = recommendationsItemImageCornersRoundingStyle2;
        RecommendationsItemImageCornersRoundingStyle[] recommendationsItemImageCornersRoundingStyleArr = {recommendationsItemImageCornersRoundingStyle, recommendationsItemImageCornersRoundingStyle2};
        $VALUES = recommendationsItemImageCornersRoundingStyleArr;
        $ENTRIES = new asp(recommendationsItemImageCornersRoundingStyleArr);
    }

    public RecommendationsItemImageCornersRoundingStyle() {
        throw null;
    }

    public static RecommendationsItemImageCornersRoundingStyle valueOf(String str) {
        return (RecommendationsItemImageCornersRoundingStyle) Enum.valueOf(RecommendationsItemImageCornersRoundingStyle.class, str);
    }

    public static RecommendationsItemImageCornersRoundingStyle[] values() {
        return (RecommendationsItemImageCornersRoundingStyle[]) $VALUES.clone();
    }
}
