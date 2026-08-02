package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsCarouselItemStyleConfig.kt */
/* loaded from: classes6.dex */
public final class RecommendationsItemImageStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecommendationsItemImageStyle[] $VALUES;
    public static final RecommendationsItemImageStyle PORTRAIT;
    public static final RecommendationsItemImageStyle SQUARE;

    static {
        RecommendationsItemImageStyle recommendationsItemImageStyle = new RecommendationsItemImageStyle("SQUARE", 0);
        SQUARE = recommendationsItemImageStyle;
        RecommendationsItemImageStyle recommendationsItemImageStyle2 = new RecommendationsItemImageStyle("PORTRAIT", 1);
        PORTRAIT = recommendationsItemImageStyle2;
        RecommendationsItemImageStyle[] recommendationsItemImageStyleArr = {recommendationsItemImageStyle, recommendationsItemImageStyle2};
        $VALUES = recommendationsItemImageStyleArr;
        $ENTRIES = new asp(recommendationsItemImageStyleArr);
    }

    public RecommendationsItemImageStyle() {
        throw null;
    }

    public static RecommendationsItemImageStyle valueOf(String str) {
        return (RecommendationsItemImageStyle) Enum.valueOf(RecommendationsItemImageStyle.class, str);
    }

    public static RecommendationsItemImageStyle[] values() {
        return (RecommendationsItemImageStyle[]) $VALUES.clone();
    }
}
