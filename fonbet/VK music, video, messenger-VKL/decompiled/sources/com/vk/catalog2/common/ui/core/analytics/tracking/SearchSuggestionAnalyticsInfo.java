package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: SearchSuggestionAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class SearchSuggestionAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchSuggestionAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget Open;
        public static final ClickTarget Remove;

        static {
            ClickTarget clickTarget = new ClickTarget("Open", 0);
            Open = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("Remove", 1);
            Remove = clickTarget2;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2};
            $VALUES = clickTargetArr;
            $ENTRIES = new asp(clickTargetArr);
        }

        public ClickTarget() {
            throw null;
        }

        public static ClickTarget valueOf(String str) {
            return (ClickTarget) Enum.valueOf(ClickTarget.class, str);
        }

        public static ClickTarget[] values() {
            return (ClickTarget[]) $VALUES.clone();
        }
    }

    public SearchSuggestionAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuggestionAnalyticsInfo) && this.a == ((SearchSuggestionAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchSuggestionAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
