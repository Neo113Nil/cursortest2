package com.vk.catalog2.common.ui.holders.search;

import xsna.asp;
import xsna.zrp;

/* compiled from: SearchSpellcheckAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class SearchSpellcheckAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchSpellcheckAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget Tap;

        static {
            ClickTarget clickTarget = new ClickTarget("Tap", 0);
            Tap = clickTarget;
            ClickTarget[] clickTargetArr = {clickTarget};
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

    public SearchSpellcheckAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSpellcheckAnalyticsInfo) && this.a == ((SearchSpellcheckAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchSpellcheckAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
