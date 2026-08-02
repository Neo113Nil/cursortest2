package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: SearchEntityAnswerAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class SearchEntityAnswerAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchEntityAnswerAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget Follow;
        public static final ClickTarget Join;
        public static final ClickTarget Leave;
        public static final ClickTarget Pause;
        public static final ClickTarget PlayAll;
        public static final ClickTarget ShowStory;
        public static final ClickTarget Tap;
        public static final ClickTarget Unfollow;

        static {
            ClickTarget clickTarget = new ClickTarget("Tap", 0);
            Tap = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("Join", 1);
            Join = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("Leave", 2);
            Leave = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("Follow", 3);
            Follow = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("Unfollow", 4);
            Unfollow = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("ShowStory", 5);
            ShowStory = clickTarget6;
            ClickTarget clickTarget7 = new ClickTarget("PlayAll", 6);
            PlayAll = clickTarget7;
            ClickTarget clickTarget8 = new ClickTarget("Pause", 7);
            Pause = clickTarget8;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2, clickTarget3, clickTarget4, clickTarget5, clickTarget6, clickTarget7, clickTarget8};
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

    public SearchEntityAnswerAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchEntityAnswerAnalyticsInfo) && this.a == ((SearchEntityAnswerAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchEntityAnswerAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
