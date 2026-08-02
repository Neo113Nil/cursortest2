package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsCarouselItemStyleConfig.kt */
/* loaded from: classes6.dex */
public final class RecommendationsItemBackgroundStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecommendationsItemBackgroundStyle[] $VALUES;
    public static final RecommendationsItemBackgroundStyle GRAY;
    public static final RecommendationsItemBackgroundStyle TRANSPARENT;
    public static final RecommendationsItemBackgroundStyle TRANSPARENT_OUTLINED;

    static {
        RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle = new RecommendationsItemBackgroundStyle("GRAY", 0);
        GRAY = recommendationsItemBackgroundStyle;
        RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle2 = new RecommendationsItemBackgroundStyle("TRANSPARENT", 1);
        TRANSPARENT = recommendationsItemBackgroundStyle2;
        RecommendationsItemBackgroundStyle recommendationsItemBackgroundStyle3 = new RecommendationsItemBackgroundStyle("TRANSPARENT_OUTLINED", 2);
        TRANSPARENT_OUTLINED = recommendationsItemBackgroundStyle3;
        RecommendationsItemBackgroundStyle[] recommendationsItemBackgroundStyleArr = {recommendationsItemBackgroundStyle, recommendationsItemBackgroundStyle2, recommendationsItemBackgroundStyle3};
        $VALUES = recommendationsItemBackgroundStyleArr;
        $ENTRIES = new asp(recommendationsItemBackgroundStyleArr);
    }

    public RecommendationsItemBackgroundStyle() {
        throw null;
    }

    public static RecommendationsItemBackgroundStyle valueOf(String str) {
        return (RecommendationsItemBackgroundStyle) Enum.valueOf(RecommendationsItemBackgroundStyle.class, str);
    }

    public static RecommendationsItemBackgroundStyle[] values() {
        return (RecommendationsItemBackgroundStyle[]) $VALUES.clone();
    }
}
