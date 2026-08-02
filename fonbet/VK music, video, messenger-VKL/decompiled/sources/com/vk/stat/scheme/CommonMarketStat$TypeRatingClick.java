package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeRatingClick implements SchemeStat$TypeClick.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_rating_click_block")
    private final CommonMarketStat$TypeRatingBlockItem typeRatingClickBlock;

    @pmi0("type_rating_click_photos")
    private final CommonMarketStat$TypeRatingPhotosItem typeRatingClickPhotos;

    @pmi0("type_rating_click_review")
    private final CommonMarketStat$TypeRatingClickReviewItem typeRatingClickReview;

    @pmi0("type_rating_send_review")
    private final CommonMarketStat$TypeRatingSendReviewItem typeRatingSendReview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_rating_click_block")
        public static final Type TYPE_RATING_CLICK_BLOCK;

        @pmi0("type_rating_click_photos")
        public static final Type TYPE_RATING_CLICK_PHOTOS;

        @pmi0("type_rating_click_review")
        public static final Type TYPE_RATING_CLICK_REVIEW;

        @pmi0("type_rating_send_review")
        public static final Type TYPE_RATING_SEND_REVIEW;

        static {
            Type type = new Type("TYPE_RATING_CLICK_REVIEW", 0);
            TYPE_RATING_CLICK_REVIEW = type;
            Type type2 = new Type("TYPE_RATING_SEND_REVIEW", 1);
            TYPE_RATING_SEND_REVIEW = type2;
            Type type3 = new Type("TYPE_RATING_CLICK_BLOCK", 2);
            TYPE_RATING_CLICK_BLOCK = type3;
            Type type4 = new Type("TYPE_RATING_CLICK_PHOTOS", 3);
            TYPE_RATING_CLICK_PHOTOS = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    /* compiled from: CommonMarketStat.kt */
    public static final class a {
        public static CommonMarketStat$TypeRatingClick a(b bVar) {
            if (bVar instanceof CommonMarketStat$TypeRatingClickReviewItem) {
                return new CommonMarketStat$TypeRatingClick(Type.TYPE_RATING_CLICK_REVIEW, (CommonMarketStat$TypeRatingClickReviewItem) bVar, null, null, null, 28, null);
            }
            if (bVar instanceof CommonMarketStat$TypeRatingSendReviewItem) {
                return new CommonMarketStat$TypeRatingClick(Type.TYPE_RATING_SEND_REVIEW, null, (CommonMarketStat$TypeRatingSendReviewItem) bVar, null, null, 26, null);
            }
            if (bVar instanceof CommonMarketStat$TypeRatingBlockItem) {
                return new CommonMarketStat$TypeRatingClick(Type.TYPE_RATING_CLICK_BLOCK, null, null, (CommonMarketStat$TypeRatingBlockItem) bVar, null, 22, null);
            }
            if (!(bVar instanceof CommonMarketStat$TypeRatingPhotosItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeRatingClickReviewItem, TypeRatingSendReviewItem, TypeRatingBlockItem, TypeRatingPhotosItem)");
            }
            return new CommonMarketStat$TypeRatingClick(Type.TYPE_RATING_CLICK_PHOTOS, null, null, null, (CommonMarketStat$TypeRatingPhotosItem) bVar, 14, null);
        }
    }

    /* compiled from: CommonMarketStat.kt */
    /* loaded from: classes11.dex */
    public interface b {
    }

    private CommonMarketStat$TypeRatingClick(Type type, CommonMarketStat$TypeRatingClickReviewItem commonMarketStat$TypeRatingClickReviewItem, CommonMarketStat$TypeRatingSendReviewItem commonMarketStat$TypeRatingSendReviewItem, CommonMarketStat$TypeRatingBlockItem commonMarketStat$TypeRatingBlockItem, CommonMarketStat$TypeRatingPhotosItem commonMarketStat$TypeRatingPhotosItem) {
        this.type = type;
        this.typeRatingClickReview = commonMarketStat$TypeRatingClickReviewItem;
        this.typeRatingSendReview = commonMarketStat$TypeRatingSendReviewItem;
        this.typeRatingClickBlock = commonMarketStat$TypeRatingBlockItem;
        this.typeRatingClickPhotos = commonMarketStat$TypeRatingPhotosItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeRatingClick)) {
            return false;
        }
        CommonMarketStat$TypeRatingClick commonMarketStat$TypeRatingClick = (CommonMarketStat$TypeRatingClick) obj;
        return this.type == commonMarketStat$TypeRatingClick.type && epx.f(this.typeRatingClickReview, commonMarketStat$TypeRatingClick.typeRatingClickReview) && epx.f(this.typeRatingSendReview, commonMarketStat$TypeRatingClick.typeRatingSendReview) && epx.f(this.typeRatingClickBlock, commonMarketStat$TypeRatingClick.typeRatingClickBlock) && epx.f(this.typeRatingClickPhotos, commonMarketStat$TypeRatingClick.typeRatingClickPhotos);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        CommonMarketStat$TypeRatingClickReviewItem commonMarketStat$TypeRatingClickReviewItem = this.typeRatingClickReview;
        int hashCode2 = (hashCode + (commonMarketStat$TypeRatingClickReviewItem == null ? 0 : commonMarketStat$TypeRatingClickReviewItem.hashCode())) * 31;
        CommonMarketStat$TypeRatingSendReviewItem commonMarketStat$TypeRatingSendReviewItem = this.typeRatingSendReview;
        int hashCode3 = (hashCode2 + (commonMarketStat$TypeRatingSendReviewItem == null ? 0 : commonMarketStat$TypeRatingSendReviewItem.hashCode())) * 31;
        CommonMarketStat$TypeRatingBlockItem commonMarketStat$TypeRatingBlockItem = this.typeRatingClickBlock;
        int hashCode4 = (hashCode3 + (commonMarketStat$TypeRatingBlockItem == null ? 0 : commonMarketStat$TypeRatingBlockItem.hashCode())) * 31;
        CommonMarketStat$TypeRatingPhotosItem commonMarketStat$TypeRatingPhotosItem = this.typeRatingClickPhotos;
        return hashCode4 + (commonMarketStat$TypeRatingPhotosItem != null ? commonMarketStat$TypeRatingPhotosItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeRatingClick(type=" + this.type + ", typeRatingClickReview=" + this.typeRatingClickReview + ", typeRatingSendReview=" + this.typeRatingSendReview + ", typeRatingClickBlock=" + this.typeRatingClickBlock + ", typeRatingClickPhotos=" + this.typeRatingClickPhotos + ')';
    }

    public /* synthetic */ CommonMarketStat$TypeRatingClick(Type type, CommonMarketStat$TypeRatingClickReviewItem commonMarketStat$TypeRatingClickReviewItem, CommonMarketStat$TypeRatingSendReviewItem commonMarketStat$TypeRatingSendReviewItem, CommonMarketStat$TypeRatingBlockItem commonMarketStat$TypeRatingBlockItem, CommonMarketStat$TypeRatingPhotosItem commonMarketStat$TypeRatingPhotosItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : commonMarketStat$TypeRatingClickReviewItem, (i & 4) != 0 ? null : commonMarketStat$TypeRatingSendReviewItem, (i & 8) != 0 ? null : commonMarketStat$TypeRatingBlockItem, (i & 16) != 0 ? null : commonMarketStat$TypeRatingPhotosItem);
    }
}
