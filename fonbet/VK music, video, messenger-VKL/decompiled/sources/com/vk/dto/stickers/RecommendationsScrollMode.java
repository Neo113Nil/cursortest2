package com.vk.dto.stickers;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecommendationsScrollMode.kt */
/* loaded from: classes18.dex */
public final class RecommendationsScrollMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RecommendationsScrollMode[] $VALUES;
    public static final a Companion;
    public static final RecommendationsScrollMode NO_SCROLL;
    public static final RecommendationsScrollMode SCROLL_LAST_ROW;
    public static final RecommendationsScrollMode SCROLL_RECOMMENDATION;
    private final String value;

    /* compiled from: RecommendationsScrollMode.kt */
    public static final class a {
        public static RecommendationsScrollMode a(String str) {
            Object obj;
            Iterator<E> it = RecommendationsScrollMode.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((RecommendationsScrollMode) obj).i(), str)) {
                    break;
                }
            }
            RecommendationsScrollMode recommendationsScrollMode = (RecommendationsScrollMode) obj;
            return recommendationsScrollMode == null ? RecommendationsScrollMode.NO_SCROLL : recommendationsScrollMode;
        }
    }

    static {
        RecommendationsScrollMode recommendationsScrollMode = new RecommendationsScrollMode("NO_SCROLL", 0, "no_scroll");
        NO_SCROLL = recommendationsScrollMode;
        RecommendationsScrollMode recommendationsScrollMode2 = new RecommendationsScrollMode("SCROLL_RECOMMENDATION", 1, "scroll_recommendation");
        SCROLL_RECOMMENDATION = recommendationsScrollMode2;
        RecommendationsScrollMode recommendationsScrollMode3 = new RecommendationsScrollMode("SCROLL_LAST_ROW", 2, "scroll_last_row");
        SCROLL_LAST_ROW = recommendationsScrollMode3;
        RecommendationsScrollMode[] recommendationsScrollModeArr = {recommendationsScrollMode, recommendationsScrollMode2, recommendationsScrollMode3};
        $VALUES = recommendationsScrollModeArr;
        $ENTRIES = new asp(recommendationsScrollModeArr);
        Companion = new a();
    }

    public RecommendationsScrollMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<RecommendationsScrollMode> h() {
        return $ENTRIES;
    }

    public static RecommendationsScrollMode valueOf(String str) {
        return (RecommendationsScrollMode) Enum.valueOf(RecommendationsScrollMode.class, str);
    }

    public static RecommendationsScrollMode[] values() {
        return (RecommendationsScrollMode[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
