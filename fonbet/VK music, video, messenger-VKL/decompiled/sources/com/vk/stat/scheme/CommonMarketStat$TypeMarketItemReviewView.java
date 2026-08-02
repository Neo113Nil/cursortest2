package com.vk.stat.scheme;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketItemReviewView implements SchemeStat$TypeView.b {

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

    @pmi0("type_item_review_popup_close_show")
    private final f typeItemReviewPopupCloseShow;

    @pmi0("type_item_review_popup_has_review_show")
    private final h typeItemReviewPopupHasReviewShow;

    @pmi0("type_item_review_popup_not_bought_show")
    private final i typeItemReviewPopupNotBoughtShow;

    @pmi0("type_item_review_popup_review_not_available_show")
    private final j typeItemReviewPopupReviewNotAvailableShow;

    @pmi0("type_item_review_popup_review_unknown_error_show")
    private final k typeItemReviewPopupReviewUnknownErrorShow;

    @pmi0("type_item_review_popup_success_show")
    private final l typeItemReviewPopupSuccessShow;

    @pmi0("type_market_item_review_update_screen_show")
    private final n typeMarketItemReviewUpdateScreenShow;

    @pmi0("type_popup_review_show")
    private final u typePopupReviewShow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_item_review_popup_close_show")
        public static final Type TYPE_ITEM_REVIEW_POPUP_CLOSE_SHOW;

        @pmi0("type_item_review_popup_has_review_show")
        public static final Type TYPE_ITEM_REVIEW_POPUP_HAS_REVIEW_SHOW;

        @pmi0("type_item_review_popup_not_bought_show")
        public static final Type TYPE_ITEM_REVIEW_POPUP_NOT_BOUGHT_SHOW;

        @pmi0("type_item_review_popup_review_not_available_show")
        public static final Type TYPE_ITEM_REVIEW_POPUP_REVIEW_NOT_AVAILABLE_SHOW;

        @pmi0("type_item_review_popup_review_unknown_error_show")
        public static final Type TYPE_ITEM_REVIEW_POPUP_REVIEW_UNKNOWN_ERROR_SHOW;

        @pmi0("type_item_review_popup_success_show")
        public static final Type TYPE_ITEM_REVIEW_POPUP_SUCCESS_SHOW;

        @pmi0("type_market_item_review_update_screen_show")
        public static final Type TYPE_MARKET_ITEM_REVIEW_UPDATE_SCREEN_SHOW;

        @pmi0("type_popup_review_show")
        public static final Type TYPE_POPUP_REVIEW_SHOW;

        static {
            Type type = new Type("TYPE_ITEM_REVIEW_POPUP_CLOSE_SHOW", 0);
            TYPE_ITEM_REVIEW_POPUP_CLOSE_SHOW = type;
            Type type2 = new Type("TYPE_ITEM_REVIEW_POPUP_SUCCESS_SHOW", 1);
            TYPE_ITEM_REVIEW_POPUP_SUCCESS_SHOW = type2;
            Type type3 = new Type("TYPE_ITEM_REVIEW_POPUP_NOT_BOUGHT_SHOW", 2);
            TYPE_ITEM_REVIEW_POPUP_NOT_BOUGHT_SHOW = type3;
            Type type4 = new Type("TYPE_ITEM_REVIEW_POPUP_HAS_REVIEW_SHOW", 3);
            TYPE_ITEM_REVIEW_POPUP_HAS_REVIEW_SHOW = type4;
            Type type5 = new Type("TYPE_ITEM_REVIEW_POPUP_REVIEW_NOT_AVAILABLE_SHOW", 4);
            TYPE_ITEM_REVIEW_POPUP_REVIEW_NOT_AVAILABLE_SHOW = type5;
            Type type6 = new Type("TYPE_ITEM_REVIEW_POPUP_REVIEW_UNKNOWN_ERROR_SHOW", 5);
            TYPE_ITEM_REVIEW_POPUP_REVIEW_UNKNOWN_ERROR_SHOW = type6;
            Type type7 = new Type("TYPE_POPUP_REVIEW_SHOW", 6);
            TYPE_POPUP_REVIEW_SHOW = type7;
            Type type8 = new Type("TYPE_MARKET_ITEM_REVIEW_UPDATE_SCREEN_SHOW", 7);
            TYPE_MARKET_ITEM_REVIEW_UPDATE_SCREEN_SHOW = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
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
        public static CommonMarketStat$TypeMarketItemReviewView a(CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Long l, Integer num2, Integer num3, Integer num4, Integer num5, b bVar, int i) {
            Float f2 = (i & 2) != 0 ? null : f;
            Integer num6 = (i & 4) != 0 ? null : num;
            Integer num7 = (i & 32) != 0 ? null : num2;
            Integer num8 = (i & 64) != 0 ? null : num3;
            Integer num9 = (i & 128) != 0 ? null : num4;
            Integer num10 = (i & 256) != 0 ? null : num5;
            Integer num11 = null;
            if (bVar instanceof f) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_ITEM_REVIEW_POPUP_CLOSE_SHOW, (f) bVar, null, null, null, null, null, null, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, IronSourceError.ERROR_CODE_INIT_FAILED, null);
            }
            if (bVar instanceof l) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_ITEM_REVIEW_POPUP_SUCCESS_SHOW, null, (l) bVar, null, null, null, null, null, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null);
            }
            if (bVar instanceof i) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_ITEM_REVIEW_POPUP_NOT_BOUGHT_SHOW, null, null, (i) bVar, null, null, null, null, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, 502, null);
            }
            if (bVar instanceof h) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_ITEM_REVIEW_POPUP_HAS_REVIEW_SHOW, null, null, null, (h) bVar, null, null, null, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, 494, null);
            }
            if (bVar instanceof j) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_ITEM_REVIEW_POPUP_REVIEW_NOT_AVAILABLE_SHOW, null, null, null, null, (j) bVar, null, null, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, 478, null);
            }
            if (bVar instanceof k) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_ITEM_REVIEW_POPUP_REVIEW_UNKNOWN_ERROR_SHOW, null, null, null, null, null, (k) bVar, null, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, 446, null);
            }
            if (bVar instanceof u) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_POPUP_REVIEW_SHOW, null, null, null, null, null, null, (u) bVar, null, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, 382, null);
            }
            if (bVar instanceof n) {
                return new CommonMarketStat$TypeMarketItemReviewView(Type.TYPE_MARKET_ITEM_REVIEW_UPDATE_SCREEN_SHOW, null, null, null, null, null, null, null, (n) bVar, commonMarketStat$RatingType, f2, num6, num11, l, num7, num8, num9, num10, 254, null);
            }
            throw new IllegalArgumentException("payload must be one of(TypeItemReviewPopupCloseShowItem, TypeItemReviewPopupSuccessShowItem, TypeItemReviewPopupNotBoughtShowItem, TypeItemReviewPopupHasReviewShowItem, TypeItemReviewPopupReviewNotAvailableShowItem, TypeItemReviewPopupReviewUnknownErrorShowItem, TypePopupReviewShow, TypeMarketItemReviewUpdateScreenShow)");
        }
    }

    /* compiled from: CommonMarketStat.kt */
    public interface b {
    }

    private CommonMarketStat$TypeMarketItemReviewView(Type type, f fVar, l lVar, i iVar, h hVar, j jVar, k kVar, u uVar, n nVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.type = type;
        this.typeItemReviewPopupCloseShow = fVar;
        this.typeItemReviewPopupSuccessShow = lVar;
        this.typeItemReviewPopupNotBoughtShow = iVar;
        this.typeItemReviewPopupHasReviewShow = hVar;
        this.typeItemReviewPopupReviewNotAvailableShow = jVar;
        this.typeItemReviewPopupReviewUnknownErrorShow = kVar;
        this.typePopupReviewShow = uVar;
        this.typeMarketItemReviewUpdateScreenShow = nVar;
        this.ratingType = commonMarketStat$RatingType;
        this.rateValue = f;
        this.ratesCount = num;
        this.itemId = num2;
        this.ownerId = l;
        this.orderId = num3;
        this.itemsInPopup = num4;
        this.itemNumberInPopup = num5;
        this.sourcePopupId = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketItemReviewView)) {
            return false;
        }
        CommonMarketStat$TypeMarketItemReviewView commonMarketStat$TypeMarketItemReviewView = (CommonMarketStat$TypeMarketItemReviewView) obj;
        return this.type == commonMarketStat$TypeMarketItemReviewView.type && epx.f(this.typeItemReviewPopupCloseShow, commonMarketStat$TypeMarketItemReviewView.typeItemReviewPopupCloseShow) && epx.f(this.typeItemReviewPopupSuccessShow, commonMarketStat$TypeMarketItemReviewView.typeItemReviewPopupSuccessShow) && epx.f(this.typeItemReviewPopupNotBoughtShow, commonMarketStat$TypeMarketItemReviewView.typeItemReviewPopupNotBoughtShow) && epx.f(this.typeItemReviewPopupHasReviewShow, commonMarketStat$TypeMarketItemReviewView.typeItemReviewPopupHasReviewShow) && epx.f(this.typeItemReviewPopupReviewNotAvailableShow, commonMarketStat$TypeMarketItemReviewView.typeItemReviewPopupReviewNotAvailableShow) && epx.f(this.typeItemReviewPopupReviewUnknownErrorShow, commonMarketStat$TypeMarketItemReviewView.typeItemReviewPopupReviewUnknownErrorShow) && epx.f(this.typePopupReviewShow, commonMarketStat$TypeMarketItemReviewView.typePopupReviewShow) && epx.f(this.typeMarketItemReviewUpdateScreenShow, commonMarketStat$TypeMarketItemReviewView.typeMarketItemReviewUpdateScreenShow) && this.ratingType == commonMarketStat$TypeMarketItemReviewView.ratingType && epx.f(this.rateValue, commonMarketStat$TypeMarketItemReviewView.rateValue) && epx.f(this.ratesCount, commonMarketStat$TypeMarketItemReviewView.ratesCount) && epx.f(this.itemId, commonMarketStat$TypeMarketItemReviewView.itemId) && epx.f(this.ownerId, commonMarketStat$TypeMarketItemReviewView.ownerId) && epx.f(this.orderId, commonMarketStat$TypeMarketItemReviewView.orderId) && epx.f(this.itemsInPopup, commonMarketStat$TypeMarketItemReviewView.itemsInPopup) && epx.f(this.itemNumberInPopup, commonMarketStat$TypeMarketItemReviewView.itemNumberInPopup) && epx.f(this.sourcePopupId, commonMarketStat$TypeMarketItemReviewView.sourcePopupId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        f fVar = this.typeItemReviewPopupCloseShow;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        l lVar = this.typeItemReviewPopupSuccessShow;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        i iVar = this.typeItemReviewPopupNotBoughtShow;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h hVar = this.typeItemReviewPopupHasReviewShow;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        j jVar = this.typeItemReviewPopupReviewNotAvailableShow;
        int hashCode6 = (hashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.typeItemReviewPopupReviewUnknownErrorShow;
        int hashCode7 = (hashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        u uVar = this.typePopupReviewShow;
        int hashCode8 = (hashCode7 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        n nVar = this.typeMarketItemReviewUpdateScreenShow;
        int hashCode9 = (hashCode8 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        CommonMarketStat$RatingType commonMarketStat$RatingType = this.ratingType;
        int hashCode10 = (hashCode9 + (commonMarketStat$RatingType == null ? 0 : commonMarketStat$RatingType.hashCode())) * 31;
        Float f = this.rateValue;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.ratesCount;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.itemId;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.orderId;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.itemsInPopup;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.itemNumberInPopup;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.sourcePopupId;
        return hashCode17 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketItemReviewView(type=");
        sb.append(this.type);
        sb.append(", typeItemReviewPopupCloseShow=");
        sb.append(this.typeItemReviewPopupCloseShow);
        sb.append(", typeItemReviewPopupSuccessShow=");
        sb.append(this.typeItemReviewPopupSuccessShow);
        sb.append(", typeItemReviewPopupNotBoughtShow=");
        sb.append(this.typeItemReviewPopupNotBoughtShow);
        sb.append(", typeItemReviewPopupHasReviewShow=");
        sb.append(this.typeItemReviewPopupHasReviewShow);
        sb.append(", typeItemReviewPopupReviewNotAvailableShow=");
        sb.append(this.typeItemReviewPopupReviewNotAvailableShow);
        sb.append(", typeItemReviewPopupReviewUnknownErrorShow=");
        sb.append(this.typeItemReviewPopupReviewUnknownErrorShow);
        sb.append(", typePopupReviewShow=");
        sb.append(this.typePopupReviewShow);
        sb.append(", typeMarketItemReviewUpdateScreenShow=");
        sb.append(this.typeMarketItemReviewUpdateScreenShow);
        sb.append(", ratingType=");
        sb.append(this.ratingType);
        sb.append(", rateValue=");
        sb.append(this.rateValue);
        sb.append(", ratesCount=");
        sb.append(this.ratesCount);
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
        sb.append(", sourcePopupId=");
        return uqi.b(sb, this.sourcePopupId, ')');
    }

    public /* synthetic */ CommonMarketStat$TypeMarketItemReviewView(Type type, f fVar, l lVar, i iVar, h hVar, j jVar, k kVar, u uVar, n nVar, CommonMarketStat$RatingType commonMarketStat$RatingType, Float f, Integer num, Integer num2, Long l, Integer num3, Integer num4, Integer num5, Integer num6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : iVar, (i & 16) != 0 ? null : hVar, (i & 32) != 0 ? null : jVar, (i & 64) != 0 ? null : kVar, (i & 128) != 0 ? null : uVar, (i & 256) != 0 ? null : nVar, (i & 512) != 0 ? null : commonMarketStat$RatingType, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : l, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : num5, (i & 131072) != 0 ? null : num6);
    }
}
