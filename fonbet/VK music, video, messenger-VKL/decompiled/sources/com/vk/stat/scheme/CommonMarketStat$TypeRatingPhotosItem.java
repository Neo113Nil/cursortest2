package com.vk.stat.scheme;

import com.vk.stat.scheme.CommonMarketStat$TypeRatingClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeRatingPhotosItem implements CommonMarketStat$TypeRatingClick.b {

    @pmi0("integration_type")
    private final String integrationType;

    @pmi0("item_id")
    private final Long itemId;

    @pmi0("owner_id")
    private final long ownerId;

    @pmi0("photos_count")
    private final Integer photosCount;

    @pmi0("rate_count_before")
    private final Integer rateCountBefore;

    @pmi0("rate_value_before")
    private final Float rateValueBefore;

    @pmi0("rating_type")
    private final CommonMarketStat$RatingType ratingType;

    public CommonMarketStat$TypeRatingPhotosItem(long j, Long l, CommonMarketStat$RatingType commonMarketStat$RatingType, String str, Integer num, Float f, Integer num2) {
        this.ownerId = j;
        this.itemId = l;
        this.ratingType = commonMarketStat$RatingType;
        this.integrationType = str;
        this.photosCount = num;
        this.rateValueBefore = f;
        this.rateCountBefore = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeRatingPhotosItem)) {
            return false;
        }
        CommonMarketStat$TypeRatingPhotosItem commonMarketStat$TypeRatingPhotosItem = (CommonMarketStat$TypeRatingPhotosItem) obj;
        return this.ownerId == commonMarketStat$TypeRatingPhotosItem.ownerId && epx.f(this.itemId, commonMarketStat$TypeRatingPhotosItem.itemId) && this.ratingType == commonMarketStat$TypeRatingPhotosItem.ratingType && epx.f(this.integrationType, commonMarketStat$TypeRatingPhotosItem.integrationType) && epx.f(this.photosCount, commonMarketStat$TypeRatingPhotosItem.photosCount) && epx.f(this.rateValueBefore, commonMarketStat$TypeRatingPhotosItem.rateValueBefore) && epx.f(this.rateCountBefore, commonMarketStat$TypeRatingPhotosItem.rateCountBefore);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.ownerId) * 31;
        Long l = this.itemId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode3 = (hashCode2 + (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode())) * 31;
        String str = this.integrationType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.photosCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.rateValueBefore;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.rateCountBefore;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRatingPhotosItem(ownerId=");
        sb.append(this.ownerId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", ratingType=");
        sb.append(this.ratingType);
        sb.append(", integrationType=");
        sb.append(this.integrationType);
        sb.append(", photosCount=");
        sb.append(this.photosCount);
        sb.append(", rateValueBefore=");
        sb.append(this.rateValueBefore);
        sb.append(", rateCountBefore=");
        return uqi.b(sb, this.rateCountBefore, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeRatingPhotosItem(long j, Long l, CommonMarketStat$RatingType commonMarketStat$RatingType, String str, Integer num, Float f, Integer num2, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : commonMarketStat$RatingType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : num2);
    }
}
