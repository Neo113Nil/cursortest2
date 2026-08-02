package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketItemReviewClick implements SchemeStat$TypeClick.b {

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("item_number_in_popup")
    private final Integer itemNumberInPopup;

    @pmi0("items_in_popup")
    private final Integer itemsInPopup;

    @pmi0("order_id")
    private final Integer orderId;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("rate_value")
    private final Float rateValue;

    @pmi0("rates_count")
    private final Integer ratesCount;

    @pmi0("rating_type")
    private final CommonMarketStat$RatingType ratingType;

    @pmi0("source_popup_id")
    private final Integer sourcePopupId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_item_review_click_review")
    private final c typeItemReviewClickReview;

    @pmi0("type_item_review_popup_close_close_click")
    private final d typeItemReviewPopupCloseCloseClick;

    @pmi0("type_item_review_popup_close_no_click")
    private final e typeItemReviewPopupCloseNoClick;

    @pmi0("type_item_review_popup_close_yes_click")
    private final g typeItemReviewPopupCloseYesClick;

    @pmi0("type_item_review_send_review")
    private final CommonMarketStat$TypeItemReviewSendReviewItem typeItemReviewSendReview;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_item_review_click_review")
        public static final Type TYPE_ITEM_REVIEW_CLICK_REVIEW;

        @pmi0("type_item_review_popup_close_close_click")
        public static final Type TYPE_ITEM_REVIEW_POPUP_CLOSE_CLOSE_CLICK;

        @pmi0("type_item_review_popup_close_no_click")
        public static final Type TYPE_ITEM_REVIEW_POPUP_CLOSE_NO_CLICK;

        @pmi0("type_item_review_popup_close_yes_click")
        public static final Type TYPE_ITEM_REVIEW_POPUP_CLOSE_YES_CLICK;

        @pmi0("type_item_review_send_review")
        public static final Type TYPE_ITEM_REVIEW_SEND_REVIEW;

        static {
            Type type = new Type("TYPE_ITEM_REVIEW_CLICK_REVIEW", 0);
            TYPE_ITEM_REVIEW_CLICK_REVIEW = type;
            Type type2 = new Type("TYPE_ITEM_REVIEW_SEND_REVIEW", 1);
            TYPE_ITEM_REVIEW_SEND_REVIEW = type2;
            Type type3 = new Type("TYPE_ITEM_REVIEW_POPUP_CLOSE_YES_CLICK", 2);
            TYPE_ITEM_REVIEW_POPUP_CLOSE_YES_CLICK = type3;
            Type type4 = new Type("TYPE_ITEM_REVIEW_POPUP_CLOSE_NO_CLICK", 3);
            TYPE_ITEM_REVIEW_POPUP_CLOSE_NO_CLICK = type4;
            Type type5 = new Type("TYPE_ITEM_REVIEW_POPUP_CLOSE_CLOSE_CLICK", 4);
            TYPE_ITEM_REVIEW_POPUP_CLOSE_CLOSE_CLICK = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
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
        public static CommonMarketStat$TypeMarketItemReviewClick a(CommonMarketStat$RatingType commonMarketStat$RatingType, Integer num, Integer num2, Integer num3, Float f, Integer num4, Integer num5, b bVar, int i) {
            Float f2 = (i & 64) != 0 ? null : f;
            Integer num6 = (i & 128) != 0 ? null : num4;
            Long l = null;
            Integer num7 = null;
            if (bVar instanceof c) {
                return new CommonMarketStat$TypeMarketItemReviewClick(Type.TYPE_ITEM_REVIEW_CLICK_REVIEW, (c) bVar, null, null, null, null, commonMarketStat$RatingType, num7, l, num, num2, num3, f2, num6, num5, 60, null);
            }
            if (bVar instanceof CommonMarketStat$TypeItemReviewSendReviewItem) {
                return new CommonMarketStat$TypeMarketItemReviewClick(Type.TYPE_ITEM_REVIEW_SEND_REVIEW, null, (CommonMarketStat$TypeItemReviewSendReviewItem) bVar, null, null, null, commonMarketStat$RatingType, num7, l, num, num2, num3, f2, num6, num5, 58, null);
            }
            if (bVar instanceof g) {
                return new CommonMarketStat$TypeMarketItemReviewClick(Type.TYPE_ITEM_REVIEW_POPUP_CLOSE_YES_CLICK, null, null, (g) bVar, null, null, commonMarketStat$RatingType, num7, l, num, num2, num3, f2, num6, num5, 54, null);
            }
            if (bVar instanceof e) {
                return new CommonMarketStat$TypeMarketItemReviewClick(Type.TYPE_ITEM_REVIEW_POPUP_CLOSE_NO_CLICK, null, null, null, (e) bVar, null, commonMarketStat$RatingType, num7, l, num, num2, num3, f2, num6, num5, 46, null);
            }
            if (bVar instanceof d) {
                return new CommonMarketStat$TypeMarketItemReviewClick(Type.TYPE_ITEM_REVIEW_POPUP_CLOSE_CLOSE_CLICK, null, null, null, null, (d) bVar, commonMarketStat$RatingType, num7, l, num, num2, num3, f2, num6, num5, 30, null);
            }
            throw new IllegalArgumentException("payload must be one of(TypeItemReviewClickReviewItem, TypeItemReviewSendReviewItem, TypeItemReviewPopupCloseYesClickItem, TypeItemReviewPopupCloseNoClickItem, TypeItemReviewPopupCloseCloseClickItem)");
        }
    }

    /* compiled from: CommonMarketStat.kt */
    /* loaded from: classes11.dex */
    public interface b {
    }

    private CommonMarketStat$TypeMarketItemReviewClick(Type type, c cVar, CommonMarketStat$TypeItemReviewSendReviewItem commonMarketStat$TypeItemReviewSendReviewItem, g gVar, e eVar, d dVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Integer num, Long l, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6) {
        this.type = type;
        this.typeItemReviewClickReview = cVar;
        this.typeItemReviewSendReview = commonMarketStat$TypeItemReviewSendReviewItem;
        this.typeItemReviewPopupCloseYesClick = gVar;
        this.typeItemReviewPopupCloseNoClick = eVar;
        this.typeItemReviewPopupCloseCloseClick = dVar;
        this.ratingType = commonMarketStat$RatingType;
        this.itemId = num;
        this.ownerId = l;
        this.orderId = num2;
        this.itemsInPopup = num3;
        this.itemNumberInPopup = num4;
        this.rateValue = f;
        this.ratesCount = num5;
        this.sourcePopupId = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketItemReviewClick)) {
            return false;
        }
        CommonMarketStat$TypeMarketItemReviewClick commonMarketStat$TypeMarketItemReviewClick = (CommonMarketStat$TypeMarketItemReviewClick) obj;
        return this.type == commonMarketStat$TypeMarketItemReviewClick.type && epx.f(this.typeItemReviewClickReview, commonMarketStat$TypeMarketItemReviewClick.typeItemReviewClickReview) && epx.f(this.typeItemReviewSendReview, commonMarketStat$TypeMarketItemReviewClick.typeItemReviewSendReview) && epx.f(this.typeItemReviewPopupCloseYesClick, commonMarketStat$TypeMarketItemReviewClick.typeItemReviewPopupCloseYesClick) && epx.f(this.typeItemReviewPopupCloseNoClick, commonMarketStat$TypeMarketItemReviewClick.typeItemReviewPopupCloseNoClick) && epx.f(this.typeItemReviewPopupCloseCloseClick, commonMarketStat$TypeMarketItemReviewClick.typeItemReviewPopupCloseCloseClick) && this.ratingType == commonMarketStat$TypeMarketItemReviewClick.ratingType && epx.f(this.itemId, commonMarketStat$TypeMarketItemReviewClick.itemId) && epx.f(this.ownerId, commonMarketStat$TypeMarketItemReviewClick.ownerId) && epx.f(this.orderId, commonMarketStat$TypeMarketItemReviewClick.orderId) && epx.f(this.itemsInPopup, commonMarketStat$TypeMarketItemReviewClick.itemsInPopup) && epx.f(this.itemNumberInPopup, commonMarketStat$TypeMarketItemReviewClick.itemNumberInPopup) && epx.f(this.rateValue, commonMarketStat$TypeMarketItemReviewClick.rateValue) && epx.f(this.ratesCount, commonMarketStat$TypeMarketItemReviewClick.ratesCount) && epx.f(this.sourcePopupId, commonMarketStat$TypeMarketItemReviewClick.sourcePopupId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        c cVar = this.typeItemReviewClickReview;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        CommonMarketStat$TypeItemReviewSendReviewItem commonMarketStat$TypeItemReviewSendReviewItem = this.typeItemReviewSendReview;
        int hashCode3 = (hashCode2 + (commonMarketStat$TypeItemReviewSendReviewItem == null ? 0 : commonMarketStat$TypeItemReviewSendReviewItem.hashCode())) * 31;
        g gVar = this.typeItemReviewPopupCloseYesClick;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e eVar = this.typeItemReviewPopupCloseNoClick;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.typeItemReviewPopupCloseCloseClick;
        int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode7 = (hashCode6 + (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode())) * 31;
        Integer num = this.itemId;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.orderId;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemsInPopup;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.itemNumberInPopup;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f = this.rateValue;
        int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num5 = this.ratesCount;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.sourcePopupId;
        return hashCode14 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketItemReviewClick(type=");
        sb.append(this.type);
        sb.append(", typeItemReviewClickReview=");
        sb.append(this.typeItemReviewClickReview);
        sb.append(", typeItemReviewSendReview=");
        sb.append(this.typeItemReviewSendReview);
        sb.append(", typeItemReviewPopupCloseYesClick=");
        sb.append(this.typeItemReviewPopupCloseYesClick);
        sb.append(", typeItemReviewPopupCloseNoClick=");
        sb.append(this.typeItemReviewPopupCloseNoClick);
        sb.append(", typeItemReviewPopupCloseCloseClick=");
        sb.append(this.typeItemReviewPopupCloseCloseClick);
        sb.append(", ratingType=");
        sb.append(this.ratingType);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", itemsInPopup=");
        sb.append(this.itemsInPopup);
        sb.append(", itemNumberInPopup=");
        sb.append(this.itemNumberInPopup);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", ratesCount=");
        sb.append(this.ratesCount);
        sb.append(", sourcePopupId=");
        return uqi.b(sb, this.sourcePopupId, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeMarketItemReviewClick(Type type, c cVar, CommonMarketStat$TypeItemReviewSendReviewItem commonMarketStat$TypeItemReviewSendReviewItem, g gVar, e eVar, d dVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Integer num, Long l, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : commonMarketStat$TypeItemReviewSendReviewItem, (i & 8) != 0 ? null : gVar, (i & 16) != 0 ? null : eVar, (i & 32) != 0 ? null : dVar, (i & 64) != 0 ? null : commonMarketStat$RatingType, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : f, (i & 8192) != 0 ? null : num5, (i & 16384) != 0 ? null : num6);
    }
}
