package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeRatingView implements SchemeStat$TypeView.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_rating_show_block")
    private final CommonMarketStat$TypeRatingBlockItem typeRatingShowBlock;

    @pmi0("type_rating_show_review")
    private final CommonMarketStat$TypeRatingShowReviewItem typeRatingShowReview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_rating_show_block")
        public static final Type TYPE_RATING_SHOW_BLOCK;

        @pmi0("type_rating_show_review")
        public static final Type TYPE_RATING_SHOW_REVIEW;

        static {
            Type type = new Type("TYPE_RATING_SHOW_REVIEW", 0);
            TYPE_RATING_SHOW_REVIEW = type;
            Type type2 = new Type("TYPE_RATING_SHOW_BLOCK", 1);
            TYPE_RATING_SHOW_BLOCK = type2;
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

    private CommonMarketStat$TypeRatingView(Type type, CommonMarketStat$TypeRatingShowReviewItem commonMarketStat$TypeRatingShowReviewItem, CommonMarketStat$TypeRatingBlockItem commonMarketStat$TypeRatingBlockItem) {
        this.type = type;
        this.typeRatingShowReview = commonMarketStat$TypeRatingShowReviewItem;
        this.typeRatingShowBlock = commonMarketStat$TypeRatingBlockItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeRatingView)) {
            return false;
        }
        CommonMarketStat$TypeRatingView commonMarketStat$TypeRatingView = (CommonMarketStat$TypeRatingView) obj;
        return this.type == commonMarketStat$TypeRatingView.type && epx.f(this.typeRatingShowReview, commonMarketStat$TypeRatingView.typeRatingShowReview) && epx.f(this.typeRatingShowBlock, commonMarketStat$TypeRatingView.typeRatingShowBlock);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        CommonMarketStat$TypeRatingShowReviewItem commonMarketStat$TypeRatingShowReviewItem = this.typeRatingShowReview;
        int hashCode2 = (hashCode + (commonMarketStat$TypeRatingShowReviewItem == null ? 0 : commonMarketStat$TypeRatingShowReviewItem.hashCode())) * 31;
        CommonMarketStat$TypeRatingBlockItem commonMarketStat$TypeRatingBlockItem = this.typeRatingShowBlock;
        return hashCode2 + (commonMarketStat$TypeRatingBlockItem != null ? commonMarketStat$TypeRatingBlockItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeRatingView(type=" + this.type + ", typeRatingShowReview=" + this.typeRatingShowReview + ", typeRatingShowBlock=" + this.typeRatingShowBlock + ')';
    }

    public /* synthetic */ CommonMarketStat$TypeRatingView(Type type, CommonMarketStat$TypeRatingShowReviewItem commonMarketStat$TypeRatingShowReviewItem, CommonMarketStat$TypeRatingBlockItem commonMarketStat$TypeRatingBlockItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : commonMarketStat$TypeRatingShowReviewItem, (i & 4) != 0 ? null : commonMarketStat$TypeRatingBlockItem);
    }
}
