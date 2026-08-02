package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeRatingShowReviewItem {

    @pmi0("item_number_in_popup")
    private final Integer itemNumberInPopup;

    @pmi0("items_in_popup")
    private final Integer itemsInPopup;

    @pmi0("order_id")
    private final Integer orderId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("rate_count")
    private final Integer rateCount;

    @pmi0("rate_value")
    private final Float rateValue;

    public CommonMarketStat$TypeRatingShowReviewItem(long j, Float f, Integer num, Integer num2, Integer num3, Integer num4) {
        this.ownerId = j;
        this.rateValue = f;
        this.rateCount = num;
        this.orderId = num2;
        this.itemsInPopup = num3;
        this.itemNumberInPopup = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeRatingShowReviewItem)) {
            return false;
        }
        CommonMarketStat$TypeRatingShowReviewItem commonMarketStat$TypeRatingShowReviewItem = (CommonMarketStat$TypeRatingShowReviewItem) obj;
        return this.ownerId == commonMarketStat$TypeRatingShowReviewItem.ownerId && epx.f(this.rateValue, commonMarketStat$TypeRatingShowReviewItem.rateValue) && epx.f(this.rateCount, commonMarketStat$TypeRatingShowReviewItem.rateCount) && epx.f(this.orderId, commonMarketStat$TypeRatingShowReviewItem.orderId) && epx.f(this.itemsInPopup, commonMarketStat$TypeRatingShowReviewItem.itemsInPopup) && epx.f(this.itemNumberInPopup, commonMarketStat$TypeRatingShowReviewItem.itemNumberInPopup);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Float f = this.rateValue;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.rateCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.orderId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemsInPopup;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.itemNumberInPopup;
        return hashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRatingShowReviewItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", rateCount=");
        sb.append(this.rateCount);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", itemsInPopup=");
        sb.append(this.itemsInPopup);
        sb.append(", itemNumberInPopup=");
        return uqi.b(sb, this.itemNumberInPopup, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeRatingShowReviewItem(long j, Float f, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}
