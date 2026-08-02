package com.vk.stat.scheme;

import com.vk.stat.scheme.CommonMarketStat$TypeRatingClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeRatingClickReviewItem implements CommonMarketStat$TypeRatingClick.b {

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("rate_count")
    private final Integer rateCount;

    @pmi0("rate_value")
    private final Float rateValue;

    public CommonMarketStat$TypeRatingClickReviewItem(long j, Float f, Integer num) {
        this.ownerId = j;
        this.rateValue = f;
        this.rateCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeRatingClickReviewItem)) {
            return false;
        }
        CommonMarketStat$TypeRatingClickReviewItem commonMarketStat$TypeRatingClickReviewItem = (CommonMarketStat$TypeRatingClickReviewItem) obj;
        return this.ownerId == commonMarketStat$TypeRatingClickReviewItem.ownerId && epx.f(this.rateValue, commonMarketStat$TypeRatingClickReviewItem.rateValue) && epx.f(this.rateCount, commonMarketStat$TypeRatingClickReviewItem.rateCount);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Float f = this.rateValue;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.rateCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRatingClickReviewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", rateCount=");
        return uqi.b(sb, this.rateCount, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeRatingClickReviewItem(long j, Float f, Integer num, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num);
    }
}
