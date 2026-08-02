package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypePostingTimeline implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("context")
    private final MobileOfficialAppsFeedStat$PostingContext context;

    @pmi0("events")
    private final List<MobileOfficialAppsFeedStat$PostingTimelineEvent> events;

    @pmi0("screen_close_time")
    private final MobileOfficialAppsFeedStat$FeedTime screenCloseTime;

    @pmi0("screen_initialized_time")
    private final MobileOfficialAppsFeedStat$FeedTime screenInitializedTime;

    @pmi0("screen_interaction_time")
    private final MobileOfficialAppsFeedStat$FeedTime screenInteractionTime;

    @pmi0("screen_start_time")
    private final MobileOfficialAppsFeedStat$FeedTime screenStartTime;

    public MobileOfficialAppsFeedStat$TypePostingTimeline(MobileOfficialAppsFeedStat$PostingContext mobileOfficialAppsFeedStat$PostingContext, List<MobileOfficialAppsFeedStat$PostingTimelineEvent> list, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime2, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime3, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime4) {
        this.context = mobileOfficialAppsFeedStat$PostingContext;
        this.events = list;
        this.screenStartTime = mobileOfficialAppsFeedStat$FeedTime;
        this.screenInitializedTime = mobileOfficialAppsFeedStat$FeedTime2;
        this.screenInteractionTime = mobileOfficialAppsFeedStat$FeedTime3;
        this.screenCloseTime = mobileOfficialAppsFeedStat$FeedTime4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypePostingTimeline)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypePostingTimeline mobileOfficialAppsFeedStat$TypePostingTimeline = (MobileOfficialAppsFeedStat$TypePostingTimeline) obj;
        return epx.f(this.context, mobileOfficialAppsFeedStat$TypePostingTimeline.context) && epx.f(this.events, mobileOfficialAppsFeedStat$TypePostingTimeline.events) && epx.f(this.screenStartTime, mobileOfficialAppsFeedStat$TypePostingTimeline.screenStartTime) && epx.f(this.screenInitializedTime, mobileOfficialAppsFeedStat$TypePostingTimeline.screenInitializedTime) && epx.f(this.screenInteractionTime, mobileOfficialAppsFeedStat$TypePostingTimeline.screenInteractionTime) && epx.f(this.screenCloseTime, mobileOfficialAppsFeedStat$TypePostingTimeline.screenCloseTime);
    }

    public final int hashCode() {
        int a = fw3.a(this.context.hashCode() * 31, 31, this.events);
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime = this.screenStartTime;
        int hashCode = (a + (mobileOfficialAppsFeedStat$FeedTime == null ? 0 : mobileOfficialAppsFeedStat$FeedTime.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime2 = this.screenInitializedTime;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$FeedTime2 == null ? 0 : mobileOfficialAppsFeedStat$FeedTime2.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime3 = this.screenInteractionTime;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsFeedStat$FeedTime3 == null ? 0 : mobileOfficialAppsFeedStat$FeedTime3.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime4 = this.screenCloseTime;
        return hashCode3 + (mobileOfficialAppsFeedStat$FeedTime4 != null ? mobileOfficialAppsFeedStat$FeedTime4.hashCode() : 0);
    }

    public final String toString() {
        return "TypePostingTimeline(context=" + this.context + ", events=" + this.events + ", screenStartTime=" + this.screenStartTime + ", screenInitializedTime=" + this.screenInitializedTime + ", screenInteractionTime=" + this.screenInteractionTime + ", screenCloseTime=" + this.screenCloseTime + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypePostingTimeline(MobileOfficialAppsFeedStat$PostingContext mobileOfficialAppsFeedStat$PostingContext, List list, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime2, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime3, MobileOfficialAppsFeedStat$FeedTime mobileOfficialAppsFeedStat$FeedTime4, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$PostingContext, list, (i & 4) != 0 ? null : mobileOfficialAppsFeedStat$FeedTime, (i & 8) != 0 ? null : mobileOfficialAppsFeedStat$FeedTime2, (i & 16) != 0 ? null : mobileOfficialAppsFeedStat$FeedTime3, (i & 32) != 0 ? null : mobileOfficialAppsFeedStat$FeedTime4);
    }
}
