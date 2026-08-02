package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: StickerAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class StickerAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickerAnalyticsInfo.kt */
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

    public StickerAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerAnalyticsInfo) && this.a == ((StickerAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StickerAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
