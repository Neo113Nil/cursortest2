package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingPostPublishingError implements MobileOfficialAppsFeedStat$PostingTimelineEvent.b {

    @pmi0("code")
    private final String code;

    @pmi0("message")
    private final String message;

    @pmi0("time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange timeRange;

    public MobileOfficialAppsFeedStat$PostingPostPublishingError() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingPostPublishingError)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingPostPublishingError mobileOfficialAppsFeedStat$PostingPostPublishingError = (MobileOfficialAppsFeedStat$PostingPostPublishingError) obj;
        return epx.f(this.timeRange, mobileOfficialAppsFeedStat$PostingPostPublishingError.timeRange) && epx.f(this.message, mobileOfficialAppsFeedStat$PostingPostPublishingError.message) && epx.f(this.code, mobileOfficialAppsFeedStat$PostingPostPublishingError.code);
    }

    public final int hashCode() {
        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = this.timeRange;
        int hashCode = (mobileOfficialAppsFeedStat$FeedTimeRange == null ? 0 : mobileOfficialAppsFeedStat$FeedTimeRange.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingPostPublishingError(timeRange=");
        sb.append(this.timeRange);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", code=");
        return ho8.a(sb, this.code, ')');
    }

    public MobileOfficialAppsFeedStat$PostingPostPublishingError(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, String str, String str2) {
        this.timeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.message = str;
        this.code = str2;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingPostPublishingError(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimeRange, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
