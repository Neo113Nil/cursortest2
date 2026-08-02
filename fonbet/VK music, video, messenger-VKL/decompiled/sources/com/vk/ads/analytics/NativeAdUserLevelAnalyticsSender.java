package com.vk.ads.analytics;

import xsna.asp;
import xsna.av50;
import xsna.fv50;
import xsna.zrp;

/* compiled from: NativeAdUserLevelAnalyticsSender.kt */
/* loaded from: classes14.dex */
public interface NativeAdUserLevelAnalyticsSender {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NativeAdUserLevelAnalyticsSender.kt */
    public static final class ShowAttributionCondition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShowAttributionCondition[] $VALUES;
        public static final ShowAttributionCondition PAYED;
        public static final ShowAttributionCondition PLATFORM;

        static {
            ShowAttributionCondition showAttributionCondition = new ShowAttributionCondition("PAYED", 0);
            PAYED = showAttributionCondition;
            ShowAttributionCondition showAttributionCondition2 = new ShowAttributionCondition("PLATFORM", 1);
            PLATFORM = showAttributionCondition2;
            ShowAttributionCondition[] showAttributionConditionArr = {showAttributionCondition, showAttributionCondition2};
            $VALUES = showAttributionConditionArr;
            $ENTRIES = new asp(showAttributionConditionArr);
        }

        public ShowAttributionCondition() {
            throw null;
        }

        public static ShowAttributionCondition valueOf(String str) {
            return (ShowAttributionCondition) Enum.valueOf(ShowAttributionCondition.class, str);
        }

        public static ShowAttributionCondition[] values() {
            return (ShowAttributionCondition[]) $VALUES.clone();
        }
    }

    void a(fv50 fv50Var, av50 av50Var, boolean z, long j);

    void b(fv50 fv50Var, av50 av50Var, ShowAttributionCondition showAttributionCondition);

    void c(fv50 fv50Var, av50 av50Var);
}
