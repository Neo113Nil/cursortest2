package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketItemRatingItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b, MobileOfficialAppsMarketStat$TypeMarketView.b {

    @pmi0("rate_value")
    private final Float rateValue;

    @pmi0("rates_count")
    private final Integer ratesCount;

    @pmi0("rating_type")
    private final CommonMarketStat$RatingType ratingType;

    public CommonMarketStat$TypeMarketItemRatingItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketItemRatingItem)) {
            return false;
        }
        CommonMarketStat$TypeMarketItemRatingItem commonMarketStat$TypeMarketItemRatingItem = (CommonMarketStat$TypeMarketItemRatingItem) obj;
        return this.ratingType == commonMarketStat$TypeMarketItemRatingItem.ratingType && epx.f(this.rateValue, commonMarketStat$TypeMarketItemRatingItem.rateValue) && epx.f(this.ratesCount, commonMarketStat$TypeMarketItemRatingItem.ratesCount);
    }

    public final int hashCode() {
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode = (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode()) * 31;
        Float f = this.rateValue;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ratesCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketItemRatingItem(ratingType=");
        sb.append(this.ratingType);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", ratesCount=");
        return uqi.b(sb, this.ratesCount, ')');
    }

    public CommonMarketStat$TypeMarketItemRatingItem(CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num) {
        this.ratingType = commonMarketStat$RatingType;
        this.rateValue = f;
        this.ratesCount = num;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketItemRatingItem(CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : commonMarketStat$RatingType, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num);
    }
}
