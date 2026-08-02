package com.vk.catalog2.common.ui.core.analytics.tracking;

import xsna.asp;
import xsna.zrp;

/* compiled from: SearchAuthorAnalyticsInfo.kt */
/* loaded from: classes16.dex */
public final class SearchAuthorAnalyticsInfo {
    public final ClickTarget a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchAuthorAnalyticsInfo.kt */
    public static final class ClickTarget {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget CancelUnsubscribe;
        public static final ClickTarget Open;
        public static final ClickTarget SendMessage;
        public static final ClickTarget SetNotificationAll;
        public static final ClickTarget SetNotificationNone;
        public static final ClickTarget SetNotificationPreferred;
        public static final ClickTarget Subscribe;
        public static final ClickTarget Unsubscribe;

        static {
            ClickTarget clickTarget = new ClickTarget("Subscribe", 0);
            Subscribe = clickTarget;
            ClickTarget clickTarget2 = new ClickTarget("Unsubscribe", 1);
            Unsubscribe = clickTarget2;
            ClickTarget clickTarget3 = new ClickTarget("Open", 2);
            Open = clickTarget3;
            ClickTarget clickTarget4 = new ClickTarget("SendMessage", 3);
            SendMessage = clickTarget4;
            ClickTarget clickTarget5 = new ClickTarget("SetNotificationAll", 4);
            SetNotificationAll = clickTarget5;
            ClickTarget clickTarget6 = new ClickTarget("SetNotificationPreferred", 5);
            SetNotificationPreferred = clickTarget6;
            ClickTarget clickTarget7 = new ClickTarget("SetNotificationNone", 6);
            SetNotificationNone = clickTarget7;
            ClickTarget clickTarget8 = new ClickTarget("CancelUnsubscribe", 7);
            CancelUnsubscribe = clickTarget8;
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

    public SearchAuthorAnalyticsInfo(ClickTarget clickTarget) {
        this.a = clickTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchAuthorAnalyticsInfo) && this.a == ((SearchAuthorAnalyticsInfo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchAuthorAnalyticsInfo(clickTarget=" + this.a + ')';
    }
}
