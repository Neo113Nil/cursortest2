package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: GroupAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class GroupAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget Join;
        public static final ClickTarget Leave;
        public static final ClickTarget Open;
        public static final ClickTarget OpenOwner;
        public static final ClickTarget SendMessage;
        public static final ClickTarget ShowStory;

        static {
            ClickTarget clickTarget = new ClickTarget("Join", 0);
            Join = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("Leave", 1);
            Leave = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("Open", 2);
            Open = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("ShowStory", 3);
            ShowStory = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("SendMessage", 4);
            SendMessage = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("OpenOwner", 5);
            OpenOwner = clickTarget6;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2, clickTarget3, clickTarget4, clickTarget5, clickTarget6};
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

    public GroupAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupAnalyticsInfo) && this.a == ((GroupAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
