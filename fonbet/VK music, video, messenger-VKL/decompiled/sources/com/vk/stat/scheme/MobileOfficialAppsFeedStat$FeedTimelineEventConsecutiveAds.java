package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("count")
    private final Integer count;

    @pmi0("where")
    private final Where where;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Where {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Where[] $VALUES;

        @pmi0("between_pages")
        public static final Where BETWEEN_PAGES;

        @pmi0("within_page")
        public static final Where WITHIN_PAGE;

        static {
            Where where = new Where("WITHIN_PAGE", 0);
            WITHIN_PAGE = where;
            Where where2 = new Where("BETWEEN_PAGES", 1);
            BETWEEN_PAGES = where2;
            Where[] whereArr = {where, where2};
            $VALUES = whereArr;
            $ENTRIES = new asp(whereArr);
        }

        private Where(String str, int i) {
        }

        public static Where valueOf(String str) {
            return (Where) Enum.valueOf(Where.class, str);
        }

        public static Where[] values() {
            return (Where[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds = (MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds) obj;
        return this.where == mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds.where && epx.f(this.count, mobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds.count);
    }

    public final int hashCode() {
        Where where = this.where;
        int hashCode = (where == null ? 0 : where.hashCode()) * 31;
        Integer num = this.count;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedTimelineEventConsecutiveAds(where=");
        sb.append(this.where);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    public MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds(Where where, Integer num) {
        this.where = where;
        this.count = num;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds(Where where, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : where, (i & 2) != 0 ? null : num);
    }
}
