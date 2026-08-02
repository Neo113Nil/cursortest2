package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.mig;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunityReviewView implements SchemeStat$TypeView.b {

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

    @pmi0("type_community_review_show")
    private final mig typeCommunityReviewShow;

    @pmi0("type_community_review_show_window_review")
    private final CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem typeCommunityReviewShowWindowReview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_community_review_show")
        public static final Type TYPE_COMMUNITY_REVIEW_SHOW;

        @pmi0("type_community_review_show_window_review")
        public static final Type TYPE_COMMUNITY_REVIEW_SHOW_WINDOW_REVIEW;

        static {
            Type type = new Type("TYPE_COMMUNITY_REVIEW_SHOW", 0);
            TYPE_COMMUNITY_REVIEW_SHOW = type;
            Type type2 = new Type("TYPE_COMMUNITY_REVIEW_SHOW_WINDOW_REVIEW", 1);
            TYPE_COMMUNITY_REVIEW_SHOW_WINDOW_REVIEW = type2;
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

    private CommonCommunitiesStat$TypeCommunityReviewView(Type type, mig migVar, CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Long l) {
        this.type = type;
        this.typeCommunityReviewShow = migVar;
        this.typeCommunityReviewShowWindowReview = commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem;
        this.ratingType = commonMarketStat$RatingType;
        this.rateValue = f;
        this.ratesCount = num;
        this.ownerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunityReviewView)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunityReviewView commonCommunitiesStat$TypeCommunityReviewView = (CommonCommunitiesStat$TypeCommunityReviewView) obj;
        return this.type == commonCommunitiesStat$TypeCommunityReviewView.type && epx.f(this.typeCommunityReviewShow, commonCommunitiesStat$TypeCommunityReviewView.typeCommunityReviewShow) && epx.f(this.typeCommunityReviewShowWindowReview, commonCommunitiesStat$TypeCommunityReviewView.typeCommunityReviewShowWindowReview) && this.ratingType == commonCommunitiesStat$TypeCommunityReviewView.ratingType && epx.f(this.rateValue, commonCommunitiesStat$TypeCommunityReviewView.rateValue) && epx.f(this.ratesCount, commonCommunitiesStat$TypeCommunityReviewView.ratesCount) && epx.f(this.ownerId, commonCommunitiesStat$TypeCommunityReviewView.ownerId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        mig migVar = this.typeCommunityReviewShow;
        int hashCode2 = (hashCode + (migVar == null ? 0 : migVar.hashCode())) * 31;
        CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem = this.typeCommunityReviewShowWindowReview;
        int hashCode3 = (hashCode2 + (commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem == null ? 0 : commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem.hashCode())) * 31;
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode4 = (hashCode3 + (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode())) * 31;
        Float f = this.rateValue;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ratesCount;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommunityReviewView(type=");
        sb.append(this.type);
        sb.append(", typeCommunityReviewShow=");
        sb.append(this.typeCommunityReviewShow);
        sb.append(", typeCommunityReviewShowWindowReview=");
        sb.append(this.typeCommunityReviewShowWindowReview);
        sb.append(", ratingType=");
        sb.append(this.ratingType);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", ratesCount=");
        sb.append(this.ratesCount);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunityReviewView(Type type, mig migVar, CommonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : migVar, (i & 4) != 0 ? null : commonCommunitiesStat$TypeCommunityReviewShowWindowReviewItem, (i & 8) != 0 ? null : commonMarketStat$RatingType, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : l);
    }
}
