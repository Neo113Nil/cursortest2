package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zkg;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketCommunityReviewView implements SchemeStat$TypeView.b {

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

    @pmi0("type_market_community_review_update_screen_show")
    private final zkg typeMarketCommunityReviewUpdateScreenShow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_market_community_review_update_screen_show")
        public static final Type TYPE_MARKET_COMMUNITY_REVIEW_UPDATE_SCREEN_SHOW;

        static {
            Type type = new Type("TYPE_MARKET_COMMUNITY_REVIEW_UPDATE_SCREEN_SHOW", 0);
            TYPE_MARKET_COMMUNITY_REVIEW_UPDATE_SCREEN_SHOW = type;
            Type[] typeArr = {type};
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

    public /* synthetic */ CommonMarketStat$TypeMarketCommunityReviewView(Type type, zkg zkgVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Long l, zcl zclVar) {
        this(type, zkgVar, commonMarketStat$RatingType, f, num, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketCommunityReviewView)) {
            return false;
        }
        CommonMarketStat$TypeMarketCommunityReviewView commonMarketStat$TypeMarketCommunityReviewView = (CommonMarketStat$TypeMarketCommunityReviewView) obj;
        return this.type == commonMarketStat$TypeMarketCommunityReviewView.type && epx.f(this.typeMarketCommunityReviewUpdateScreenShow, commonMarketStat$TypeMarketCommunityReviewView.typeMarketCommunityReviewUpdateScreenShow) && this.ratingType == commonMarketStat$TypeMarketCommunityReviewView.ratingType && epx.f(this.rateValue, commonMarketStat$TypeMarketCommunityReviewView.rateValue) && epx.f(this.ratesCount, commonMarketStat$TypeMarketCommunityReviewView.ratesCount) && epx.f(this.ownerId, commonMarketStat$TypeMarketCommunityReviewView.ownerId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        zkg zkgVar = this.typeMarketCommunityReviewUpdateScreenShow;
        int hashCode2 = (hashCode + (zkgVar == null ? 0 : zkgVar.hashCode())) * 31;
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode3 = (hashCode2 + (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode())) * 31;
        Float f = this.rateValue;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ratesCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        return hashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketCommunityReviewView(type=");
        sb.append(this.type);
        sb.append(", typeMarketCommunityReviewUpdateScreenShow=");
        sb.append(this.typeMarketCommunityReviewUpdateScreenShow);
        sb.append(", ratingType=");
        sb.append(this.ratingType);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", ratesCount=");
        sb.append(this.ratesCount);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    private CommonMarketStat$TypeMarketCommunityReviewView(Type type, zkg zkgVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Long l) {
        this.type = type;
        this.typeMarketCommunityReviewUpdateScreenShow = zkgVar;
        this.ratingType = commonMarketStat$RatingType;
        this.rateValue = f;
        this.ratesCount = num;
        this.ownerId = l;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketCommunityReviewView(Type type, zkg zkgVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : zkgVar, (i & 4) != 0 ? null : commonMarketStat$RatingType, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : l);
    }
}
