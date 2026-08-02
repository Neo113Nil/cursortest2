package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: FriendsAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class FriendsAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget AddToFriends;
        public static final ClickTarget Call;
        public static final ClickTarget Follow;
        public static final ClickTarget Open;
        public static final ClickTarget RemoveFromFollowers;
        public static final ClickTarget RemoveFromFriends;
        public static final ClickTarget SendMessage;
        public static final ClickTarget ShowStory;
        public static final ClickTarget Unfollow;

        static {
            ClickTarget clickTarget = new ClickTarget("SendMessage", 0);
            SendMessage = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("AddToFriends", 1);
            AddToFriends = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("RemoveFromFriends", 2);
            RemoveFromFriends = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("RemoveFromFollowers", 3);
            RemoveFromFollowers = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("Follow", 4);
            Follow = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("Unfollow", 5);
            Unfollow = clickTarget6;
            ClickTarget clickTarget7 = new ClickTarget("Open", 6);
            Open = clickTarget7;
            ClickTarget clickTarget8 = new ClickTarget("ShowStory", 7);
            ShowStory = clickTarget8;
            ClickTarget clickTarget9 = new ClickTarget("Call", 8);
            Call = clickTarget9;
            ClickTarget[] clickTargetArr = {clickTarget, clickTarget2, clickTarget3, clickTarget4, clickTarget5, clickTarget6, clickTarget7, clickTarget8, clickTarget9};
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

    public FriendsAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FriendsAnalyticsInfo) && this.a == ((FriendsAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FriendsAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
