package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("events")
    private final List<MobileOfficialAppsFeedStat$FeedTimelineEvent> events;

    @pmi0("feed_request_context")
    private final MobileOfficialAppsFeedStat$FeedRequestContext feedRequestContext;

    @pmi0("feed_response_context")
    private final MobileOfficialAppsFeedStat$FeedResponseContext feedResponseContext;

    @pmi0("feed_time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange feedTimeRange;

    public MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline(MobileOfficialAppsFeedStat$FeedRequestContext mobileOfficialAppsFeedStat$FeedRequestContext, MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, List<MobileOfficialAppsFeedStat$FeedTimelineEvent> list, MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext) {
        this.feedRequestContext = mobileOfficialAppsFeedStat$FeedRequestContext;
        this.feedTimeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.events = list;
        this.feedResponseContext = mobileOfficialAppsFeedStat$FeedResponseContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline = (MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline) obj;
        return epx.f(this.feedRequestContext, mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline.feedRequestContext) && epx.f(this.feedTimeRange, mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline.feedTimeRange) && epx.f(this.events, mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline.events) && epx.f(this.feedResponseContext, mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline.feedResponseContext);
    }

    public final int hashCode() {
        int a = fw3.a((this.feedTimeRange.hashCode() + (this.feedRequestContext.hashCode() * 31)) * 31, 31, this.events);
        MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext = this.feedResponseContext;
        return a + (mobileOfficialAppsFeedStat$FeedResponseContext == null ? 0 : mobileOfficialAppsFeedStat$FeedResponseContext.hashCode());
    }

    public final String toString() {
        return "TypeFeedLoadingTimeline(feedRequestContext=" + this.feedRequestContext + ", feedTimeRange=" + this.feedTimeRange + ", events=" + this.events + ", feedResponseContext=" + this.feedResponseContext + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline(MobileOfficialAppsFeedStat$FeedRequestContext mobileOfficialAppsFeedStat$FeedRequestContext, MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, List list, MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$FeedRequestContext, mobileOfficialAppsFeedStat$FeedTimeRange, list, (i & 8) != 0 ? null : mobileOfficialAppsFeedStat$FeedResponseContext);
    }
}
