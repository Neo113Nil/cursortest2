package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.lig;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityReviewClick implements SchemeStat$TypeClick.b {

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("rate_value")
    private final Float rateValue;

    @pmi0("rates_count")
    private final Integer ratesCount;

    @pmi0("rating_type")
    private final CommonMarketStat$RatingType ratingType;

    @pmi0("type")
    private final Type type;

    @pmi0("type_community_review_click_review")
    private final lig typeCommunityReviewClickReview;

    @pmi0("type_community_review_send_review")
    private final CommonCommunitiesStat$TypeCommunityReviewSendReviewItem typeCommunityReviewSendReview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_community_review_click_review")
        public static final Type TYPE_COMMUNITY_REVIEW_CLICK_REVIEW;

        @pmi0("type_community_review_send_review")
        public static final Type TYPE_COMMUNITY_REVIEW_SEND_REVIEW;

        static {
            Type type = new Type("TYPE_COMMUNITY_REVIEW_CLICK_REVIEW", 0);
            TYPE_COMMUNITY_REVIEW_CLICK_REVIEW = type;
            Type type2 = new Type("TYPE_COMMUNITY_REVIEW_SEND_REVIEW", 1);
            TYPE_COMMUNITY_REVIEW_SEND_REVIEW = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    private CommonCommunitiesStat$TypeCommunityReviewClick(Type type, lig ligVar, CommonCommunitiesStat$TypeCommunityReviewSendReviewItem commonCommunitiesStat$TypeCommunityReviewSendReviewItem, Float f, Integer num, CommonMarketStat$RatingType commonMarketStat$RatingType, Long l) {
        this.type = type;
        this.typeCommunityReviewClickReview = ligVar;
        this.typeCommunityReviewSendReview = commonCommunitiesStat$TypeCommunityReviewSendReviewItem;
        this.rateValue = f;
        this.ratesCount = num;
        this.ratingType = commonMarketStat$RatingType;
        this.ownerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityReviewClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityReviewClick commonCommunitiesStat$TypeCommunityReviewClick = (CommonCommunitiesStat$TypeCommunityReviewClick) obj;
        return this.type == commonCommunitiesStat$TypeCommunityReviewClick.type && epx.f(this.typeCommunityReviewClickReview, commonCommunitiesStat$TypeCommunityReviewClick.typeCommunityReviewClickReview) && epx.f(this.typeCommunityReviewSendReview, commonCommunitiesStat$TypeCommunityReviewClick.typeCommunityReviewSendReview) && epx.f(this.rateValue, commonCommunitiesStat$TypeCommunityReviewClick.rateValue) && epx.f(this.ratesCount, commonCommunitiesStat$TypeCommunityReviewClick.ratesCount) && this.ratingType == commonCommunitiesStat$TypeCommunityReviewClick.ratingType && epx.f(this.ownerId, commonCommunitiesStat$TypeCommunityReviewClick.ownerId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        lig ligVar = this.typeCommunityReviewClickReview;
        int hashCode2 = (hashCode + (ligVar == null ? 0 : ligVar.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityReviewSendReviewItem commonCommunitiesStat$TypeCommunityReviewSendReviewItem = this.typeCommunityReviewSendReview;
        int hashCode3 = (hashCode2 + (commonCommunitiesStat$TypeCommunityReviewSendReviewItem == null ? 0 : commonCommunitiesStat$TypeCommunityReviewSendReviewItem.hashCode())) * 31;
        Float f = this.rateValue;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ratesCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode6 = (hashCode5 + (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode())) * 31;
        Long l = this.ownerId;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunityReviewClick(type=");
        sb.append(this.type);
        sb.append(", typeCommunityReviewClickReview=");
        sb.append(this.typeCommunityReviewClickReview);
        sb.append(", typeCommunityReviewSendReview=");
        sb.append(this.typeCommunityReviewSendReview);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", ratesCount=");
        sb.append(this.ratesCount);
        sb.append(", ratingType=");
        sb.append(this.ratingType);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityReviewClick(Type type, lig ligVar, CommonCommunitiesStat$TypeCommunityReviewSendReviewItem commonCommunitiesStat$TypeCommunityReviewSendReviewItem, Float f, Integer num, CommonMarketStat$RatingType commonMarketStat$RatingType, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : ligVar, (i & 4) != 0 ? null : commonCommunitiesStat$TypeCommunityReviewSendReviewItem, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : commonMarketStat$RatingType, (i & 64) != 0 ? null : l);
    }
}
