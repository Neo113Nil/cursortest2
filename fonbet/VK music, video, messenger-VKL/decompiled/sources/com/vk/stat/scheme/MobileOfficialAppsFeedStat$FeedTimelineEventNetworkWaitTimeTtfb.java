package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("feed_time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange feedTimeRange;

    public MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange) {
        this.feedTimeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb) && epx.f(this.feedTimeRange, ((MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTimeTtfb) obj).feedTimeRange);
    }

    public final int hashCode() {
        return this.feedTimeRange.hashCode();
    }

    public final String toString() {
        return "FeedTimelineEventNetworkWaitTimeTtfb(feedTimeRange=" + this.feedTimeRange + ')';
    }
}
