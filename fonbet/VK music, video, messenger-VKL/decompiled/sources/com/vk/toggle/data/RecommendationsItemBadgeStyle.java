package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsCarouselItemStyleConfig.kt */
/* loaded from: classes6.dex */
public final class RecommendationsItemBadgeStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecommendationsItemBadgeStyle[] $VALUES;
    public static final RecommendationsItemBadgeStyle DARKBLUR;
    public static final RecommendationsItemBadgeStyle WHITE;

    static {
        RecommendationsItemBadgeStyle recommendationsItemBadgeStyle = new RecommendationsItemBadgeStyle("DARKBLUR", 0);
        DARKBLUR = recommendationsItemBadgeStyle;
        RecommendationsItemBadgeStyle recommendationsItemBadgeStyle2 = new RecommendationsItemBadgeStyle("WHITE", 1);
        WHITE = recommendationsItemBadgeStyle2;
        RecommendationsItemBadgeStyle[] recommendationsItemBadgeStyleArr = {recommendationsItemBadgeStyle, recommendationsItemBadgeStyle2};
        $VALUES = recommendationsItemBadgeStyleArr;
        $ENTRIES = new asp(recommendationsItemBadgeStyleArr);
    }

    public RecommendationsItemBadgeStyle() {
        throw null;
    }

    public static RecommendationsItemBadgeStyle valueOf(String str) {
        return (RecommendationsItemBadgeStyle) Enum.valueOf(RecommendationsItemBadgeStyle.class, str);
    }

    public static RecommendationsItemBadgeStyle[] values() {
        return (RecommendationsItemBadgeStyle[]) $VALUES.clone();
    }
}
