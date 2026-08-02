package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimeRange implements MobileOfficialAppsFeedStat$PostingTimelineEvent.b {

    @pmi0("end_time")
    private final String endTime;

    @pmi0("start_time")
    private final String startTime;

    public MobileOfficialAppsFeedStat$FeedTimeRange(String str, String str2) {
        this.startTime = str;
        this.endTime = str2;
    }

    public final String a() {
        return this.endTime;
    }

    public final String b() {
        return this.startTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimeRange)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = (MobileOfficialAppsFeedStat$FeedTimeRange) obj;
        return epx.f(this.startTime, mobileOfficialAppsFeedStat$FeedTimeRange.startTime) && epx.f(this.endTime, mobileOfficialAppsFeedStat$FeedTimeRange.endTime);
    }

    public final int hashCode() {
        return this.endTime.hashCode() + (this.startTime.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedTimeRange(startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return ho8.a(sb, this.endTime, ')');
    }
}
