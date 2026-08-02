package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("items_count")
    private final int itemsCount;

    @pmi0("reason")
    private final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;

        @pmi0("empty_next_from")
        public static final Reason EMPTY_NEXT_FROM;

        @pmi0("empty_page")
        public static final Reason EMPTY_PAGE;

        @pmi0("unknown_reason")
        public static final Reason UNKNOWN_REASON;

        static {
            Reason reason = new Reason("EMPTY_NEXT_FROM", 0);
            EMPTY_NEXT_FROM = reason;
            Reason reason2 = new Reason("EMPTY_PAGE", 1);
            EMPTY_PAGE = reason2;
            Reason reason3 = new Reason("UNKNOWN_REASON", 2);
            UNKNOWN_REASON = reason3;
            Reason[] reasonArr = {reason, reason2, reason3};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
        }

        private Reason(String str, int i) {
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded(int i, Reason reason) {
        this.itemsCount = i;
        this.reason = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded = (MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded) obj;
        return this.itemsCount == mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.itemsCount && this.reason == mobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.reason;
    }

    public final int hashCode() {
        return this.reason.hashCode() + (Integer.hashCode(this.itemsCount) * 31);
    }

    public final String toString() {
        return "FeedTimelineEventFeedEnded(itemsCount=" + this.itemsCount + ", reason=" + this.reason + ')';
    }
}
