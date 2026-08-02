package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("feed_time")
    private final MobileOfficialAppsFeedStat$FeedTime feedTime;

    public MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted(MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime) {
        this.feedTime = mobileOfficialAppsFeedStat$FeedTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted) && epx.f(this.feedTime, ((MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted) obj).feedTime);
    }

    public final int hashCode() {
        return this.feedTime.hashCode();
    }

    public final String toString() {
        return "FeedTimelineEventAppStarted(feedTime=" + this.feedTime + ')';
    }
}
