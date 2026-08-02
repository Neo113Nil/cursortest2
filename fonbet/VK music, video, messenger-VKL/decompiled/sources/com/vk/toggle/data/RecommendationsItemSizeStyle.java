package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsCarouselItemStyleConfig.kt */
/* loaded from: classes6.dex */
public final class RecommendationsItemSizeStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecommendationsItemSizeStyle[] $VALUES;
    public static final RecommendationsItemSizeStyle LARGE;
    public static final RecommendationsItemSizeStyle NORMAL;
    public static final RecommendationsItemSizeStyle SMALL;

    static {
        RecommendationsItemSizeStyle recommendationsItemSizeStyle = new RecommendationsItemSizeStyle("NORMAL", 0);
        NORMAL = recommendationsItemSizeStyle;
        RecommendationsItemSizeStyle recommendationsItemSizeStyle2 = new RecommendationsItemSizeStyle("SMALL", 1);
        SMALL = recommendationsItemSizeStyle2;
        RecommendationsItemSizeStyle recommendationsItemSizeStyle3 = new RecommendationsItemSizeStyle("LARGE", 2);
        LARGE = recommendationsItemSizeStyle3;
        RecommendationsItemSizeStyle[] recommendationsItemSizeStyleArr = {recommendationsItemSizeStyle, recommendationsItemSizeStyle2, recommendationsItemSizeStyle3};
        $VALUES = recommendationsItemSizeStyleArr;
        $ENTRIES = new asp(recommendationsItemSizeStyleArr);
    }

    public RecommendationsItemSizeStyle() {
        throw null;
    }

    public static RecommendationsItemSizeStyle valueOf(String str) {
        return (RecommendationsItemSizeStyle) Enum.valueOf(RecommendationsItemSizeStyle.class, str);
    }

    public static RecommendationsItemSizeStyle[] values() {
        return (RecommendationsItemSizeStyle[]) $VALUES.clone();
    }
}
