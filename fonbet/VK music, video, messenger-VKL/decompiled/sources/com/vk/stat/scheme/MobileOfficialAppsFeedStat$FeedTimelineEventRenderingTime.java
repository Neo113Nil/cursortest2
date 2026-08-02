package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("feed_time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange feedTimeRange;

    @pmi0("items_count")
    private final Integer itemsCount;

    public MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, Integer num) {
        this.feedTimeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.itemsCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime = (MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime) obj;
        return epx.f(this.feedTimeRange, mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime.feedTimeRange) && epx.f(this.itemsCount, mobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime.itemsCount);
    }

    public final int hashCode() {
        int hashCode = this.feedTimeRange.hashCode() * 31;
        Integer num = this.itemsCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedTimelineEventRenderingTime(feedTimeRange=");
        sb.append(this.feedTimeRange);
        sb.append(", itemsCount=");
        return uqi.b(sb, this.itemsCount, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, Integer num, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$FeedTimeRange, (i & 2) != 0 ? null : num);
    }
}
