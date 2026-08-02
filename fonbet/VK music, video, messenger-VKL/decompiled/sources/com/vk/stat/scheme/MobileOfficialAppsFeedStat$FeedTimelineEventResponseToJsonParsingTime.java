package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("feed_time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange feedTimeRange;

    public MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange) {
        this.feedTimeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime) && epx.f(this.feedTimeRange, ((MobileOfficialAppsFeedStat$FeedTimelineEventResponseToJsonParsingTime) obj).feedTimeRange);
    }

    public final int hashCode() {
        return this.feedTimeRange.hashCode();
    }

    public final String toString() {
        return "FeedTimelineEventResponseToJsonParsingTime(feedTimeRange=" + this.feedTimeRange + ')';
    }
}
