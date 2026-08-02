package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {

    @pmi0("duration")
    private final String duration;

    public MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView(String str) {
        this.duration = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView) && epx.f(this.duration, ((MobileOfficialAppsFeedStat$FeedTimelineEventLoaderView) obj).duration);
    }

    public final int hashCode() {
        return this.duration.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("FeedTimelineEventLoaderView(duration="), this.duration, ')');
    }
}
