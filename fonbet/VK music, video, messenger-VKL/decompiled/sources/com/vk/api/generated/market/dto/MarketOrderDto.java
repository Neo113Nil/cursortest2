package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketOrderDto.kt */
/* loaded from: classes15.dex */
public final class MarketOrderDto implements Parcelable {
    public static final Parcelable.Creator<MarketOrderDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("can_add_review")
    private final Boolean canAddReview;

    @pmi0("cancel_info")
    private final BaseLinkDto cancelInfo;

    @pmi0("comment")
    private final String comment;

    @pmi0("comment_for_user")
    private final String commentForUser;

    @pmi0("date")
    private final int date;

    @pmi0("date_viewed")
    private final Integer dateViewed;

    @pmi0(C4572u.g)
    private final MarketOrderDeliveryDto delivery;

    @pmi0("dimensions")
    private final MarketItemDimensionsDto dimensions;

    @pmi0("discount")
    private final MarketPriceDto discount;

    @pmi0("display_order_id")
    private final String displayOrderId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final int id;

    @pmi0("integration_groups")
    private final List<MarketIntegrationsGroupsDto> integrationGroups;

    @pmi0("integration_order_id")
    private final String integrationOrderId;

    @pmi0("integration_order_url")
    private final String integrationOrderUrl;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    @pmi0("is_viewed_by_admin")
    private final Boolean isViewedByAdmin;

    @pmi0("items_count")
    private final int itemsCount;

    @pmi0("merchant_comment")
    private final String merchantComment;

    @pmi0("order_info_banners")
    private final List<MarketOrderInfoBannerDto> orderInfoBanners;

    @pmi0("payment")
    private final MarketOrderPaymentDto payment;

    @pmi0("payment_action")
    private final MarketPaymentActionDto paymentAction;

    @pmi0("preview_order_items")
    private final List<MarketOrderItemDto> previewOrderItems;

    @pmi0("price_details")
    private final List<MarketOrderDetailsPriceDto> priceDetails;

    @pmi0("promo_code")
    private final MarketPromoCodeDto promoCode;

    @pmi0("recipient")
    private final MarketOrderRecipientDto recipient;

    @pmi0("seller")
    private final MarketOrderSellerDto seller;

    @pmi0("status")
    private final int status;

    @pmi0("tags")
    private final List<MarketOrderTagDto> tags;

    @pmi0("total_price")
    private final MarketPriceDto totalPrice;

    @pmi0("track_link")
    private final String trackLink;

    @pmi0("track_number")
    private final String trackNumber;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("weight")
    private final Integer weight;

    /* compiled from: MarketOrderDto.kt */
    public static final class a implements Parcelable.Creator<MarketOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketOrderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            ArrayList arrayList2;
            UserId userId;
            UserId userId2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            MarketItemDimensionsDto marketItemDimensionsDto;
            MarketPriceDto marketPriceDto;
            ArrayList arrayList5;
            MarketOrderDeliveryDto marketOrderDeliveryDto;
            ArrayList arrayList6;
            MarketOrderRecipientDto marketOrderRecipientDto;
            BaseLinkDto baseLinkDto;
            ArrayList arrayList7;
            ArrayList arrayList8;
            MarketOrderSellerDto marketOrderSellerDto;
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            UserId userId3 = (UserId) parcel.readParcelable(MarketOrderDto.class.getClassLoader());
            UserId userId4 = (UserId) parcel.readParcelable(MarketOrderDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            MarketPriceDto marketPriceDto2 = (MarketPriceDto) parcel.readParcelable(MarketOrderDto.class.getClassLoader());
            MarketIntegrationsTypeDto marketIntegrationsTypeDto = (MarketIntegrationsTypeDto) parcel.readParcelable(MarketOrderDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList = new ArrayList(readInt5);
                int i2 = 0;
                while (i2 != readInt5) {
                    i2 = en.a(MarketIntegrationsGroupsDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList arrayList9 = arrayList;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                i = readInt;
                arrayList2 = new ArrayList(readInt6);
                userId = userId3;
                int i3 = 0;
                while (true) {
                    userId2 = userId4;
                    if (i3 == readInt6) {
                        break;
                    }
                    i3 = en.a(MarketOrderTagDto.CREATOR, parcel, arrayList2, i3, 1);
                    userId4 = userId2;
                    readInt2 = readInt2;
                }
            } else {
                i = readInt;
                userId = userId3;
                arrayList2 = null;
                userId2 = userId4;
            }
            int i4 = readInt2;
            MarketItemDimensionsDto createFromParcel = parcel.readInt() == 0 ? null : MarketItemDimensionsDto.CREATOR.createFromParcel(parcel);
            MarketPriceDto marketPriceDto3 = (MarketPriceDto) parcel.readParcelable(MarketOrderDto.class.getClassLoader());
            MarketPromoCodeDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketPromoCodeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt7 = parcel.readInt();
                arrayList3 = arrayList2;
                arrayList4 = new ArrayList(readInt7);
                marketItemDimensionsDto = createFromParcel;
                int i5 = 0;
                while (true) {
                    marketPriceDto = marketPriceDto3;
                    if (i5 == readInt7) {
                        break;
                    }
                    i5 = en.a(MarketOrderItemDto.CREATOR, parcel, arrayList4, i5, 1);
                    marketPriceDto3 = marketPriceDto;
                    createFromParcel2 = createFromParcel2;
                }
            } else {
                arrayList3 = arrayList2;
                marketItemDimensionsDto = createFromParcel;
                arrayList4 = null;
                marketPriceDto = marketPriceDto3;
            }
            MarketPromoCodeDto marketPromoCodeDto = createFromParcel2;
            MarketOrderDeliveryDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketOrderDeliveryDto.CREATOR.createFromParcel(parcel);
            MarketOrderRecipientDto createFromParcel4 = parcel.readInt() == 0 ? null : MarketOrderRecipientDto.CREATOR.createFromParcel(parcel);
            MarketOrderPaymentDto createFromParcel5 = parcel.readInt() == 0 ? null : MarketOrderPaymentDto.CREATOR.createFromParcel(parcel);
            MarketPaymentActionDto createFromParcel6 = parcel.readInt() == 0 ? null : MarketPaymentActionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList4;
                marketOrderDeliveryDto = createFromParcel3;
                marketOrderRecipientDto = createFromParcel4;
                arrayList6 = null;
            } else {
                arrayList5 = arrayList4;
                int readInt8 = parcel.readInt();
                marketOrderDeliveryDto = createFromParcel3;
                arrayList6 = new ArrayList(readInt8);
                marketOrderRecipientDto = createFromParcel4;
                int i6 = 0;
                while (i6 != readInt8) {
                    i6 = en.a(MarketOrderDetailsPriceDto.CREATOR, parcel, arrayList6, i6, 1);
                    readInt8 = readInt8;
                    createFromParcel5 = createFromParcel5;
                }
            }
            MarketOrderPaymentDto marketOrderPaymentDto = createFromParcel5;
            BaseLinkDto baseLinkDto2 = (BaseLinkDto) parcel.readParcelable(MarketOrderDto.class.getClassLoader());
            MarketOrderSellerDto createFromParcel7 = parcel.readInt() == 0 ? null : MarketOrderSellerDto.CREATOR.createFromParcel(parcel);
            MarketPromoCodeDto marketPromoCodeDto2 = marketPromoCodeDto;
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseLinkDto = baseLinkDto2;
                arrayList7 = arrayList6;
                marketOrderSellerDto = createFromParcel7;
                arrayList8 = null;
            } else {
                baseLinkDto = baseLinkDto2;
                int readInt9 = parcel.readInt();
                arrayList7 = arrayList6;
                arrayList8 = new ArrayList(readInt9);
                marketOrderSellerDto = createFromParcel7;
                int i7 = 0;
                while (i7 != readInt9) {
                    i7 = en.a(MarketOrderInfoBannerDto.CREATOR, parcel, arrayList8, i7, 1);
                    readInt9 = readInt9;
                    marketPromoCodeDto2 = marketPromoCodeDto2;
                }
            }
            MarketPromoCodeDto marketPromoCodeDto3 = marketPromoCodeDto2;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketOrderDto(i, userId, userId2, i4, readInt3, readInt4, marketPriceDto2, marketIntegrationsTypeDto, arrayList9, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, valueOf3, arrayList3, marketItemDimensionsDto, marketPriceDto, marketPromoCodeDto3, arrayList5, marketOrderDeliveryDto, marketOrderRecipientDto, marketOrderPaymentDto, createFromParcel6, arrayList7, baseLinkDto, marketOrderSellerDto, readString9, arrayList8, valueOf, valueOf4, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketOrderDto[] newArray(int i) {
            return new MarketOrderDto[i];
        }
    }

    public MarketOrderDto(int i, UserId userId, UserId userId2, int i2, int i3, int i4, MarketPriceDto marketPriceDto, MarketIntegrationsTypeDto marketIntegrationsTypeDto, List<MarketIntegrationsGroupsDto> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, List<MarketOrderTagDto> list2, MarketItemDimensionsDto marketItemDimensionsDto, MarketPriceDto marketPriceDto2, MarketPromoCodeDto marketPromoCodeDto, List<MarketOrderItemDto> list3, MarketOrderDeliveryDto marketOrderDeliveryDto, MarketOrderRecipientDto marketOrderRecipientDto, MarketOrderPaymentDto marketOrderPaymentDto, MarketPaymentActionDto marketPaymentActionDto, List<MarketOrderDetailsPriceDto> list4, BaseLinkDto baseLinkDto, MarketOrderSellerDto marketOrderSellerDto, String str9, List<MarketOrderInfoBannerDto> list5, Boolean bool, Integer num2, Boolean bool2) {
        this.id = i;
        this.groupId = userId;
        this.userId = userId2;
        this.date = i2;
        this.status = i3;
        this.itemsCount = i4;
        this.totalPrice = marketPriceDto;
        this.integrationType = marketIntegrationsTypeDto;
        this.integrationGroups = list;
        this.integrationOrderUrl = str;
        this.integrationOrderId = str2;
        this.displayOrderId = str3;
        this.trackNumber = str4;
        this.trackLink = str5;
        this.comment = str6;
        this.address = str7;
        this.merchantComment = str8;
        this.weight = num;
        this.tags = list2;
        this.dimensions = marketItemDimensionsDto;
        this.discount = marketPriceDto2;
        this.promoCode = marketPromoCodeDto;
        this.previewOrderItems = list3;
        this.delivery = marketOrderDeliveryDto;
        this.recipient = marketOrderRecipientDto;
        this.payment = marketOrderPaymentDto;
        this.paymentAction = marketPaymentActionDto;
        this.priceDetails = list4;
        this.cancelInfo = baseLinkDto;
        this.seller = marketOrderSellerDto;
        this.commentForUser = str9;
        this.orderInfoBanners = list5;
        this.isViewedByAdmin = bool;
        this.dateViewed = num2;
        this.canAddReview = bool2;
    }

    public final MarketOrderPaymentDto B() {
        return this.payment;
    }

    public final MarketPaymentActionDto C() {
        return this.paymentAction;
    }

    public final List<MarketOrderItemDto> D() {
        return this.previewOrderItems;
    }

    public final List<MarketOrderDetailsPriceDto> F() {
        return this.priceDetails;
    }

    public final MarketPromoCodeDto G() {
        return this.promoCode;
    }

    public final MarketOrderRecipientDto K() {
        return this.recipient;
    }

    public final MarketOrderSellerDto M() {
        return this.seller;
    }

    public final int R() {
        return this.status;
    }

    public final MarketPriceDto T() {
        return this.totalPrice;
    }

    public final String W() {
        return this.trackLink;
    }

    public final String Z() {
        return this.trackNumber;
    }

    public final Boolean d() {
        return this.canAddReview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOrderDto)) {
            return false;
        }
        MarketOrderDto marketOrderDto = (MarketOrderDto) obj;
        return this.id == marketOrderDto.id && epx.f(this.groupId, marketOrderDto.groupId) && epx.f(this.userId, marketOrderDto.userId) && this.date == marketOrderDto.date && this.status == marketOrderDto.status && this.itemsCount == marketOrderDto.itemsCount && epx.f(this.totalPrice, marketOrderDto.totalPrice) && this.integrationType == marketOrderDto.integrationType && epx.f(this.integrationGroups, marketOrderDto.integrationGroups) && epx.f(this.integrationOrderUrl, marketOrderDto.integrationOrderUrl) && epx.f(this.integrationOrderId, marketOrderDto.integrationOrderId) && epx.f(this.displayOrderId, marketOrderDto.displayOrderId) && epx.f(this.trackNumber, marketOrderDto.trackNumber) && epx.f(this.trackLink, marketOrderDto.trackLink) && epx.f(this.comment, marketOrderDto.comment) && epx.f(this.address, marketOrderDto.address) && epx.f(this.merchantComment, marketOrderDto.merchantComment) && epx.f(this.weight, marketOrderDto.weight) && epx.f(this.tags, marketOrderDto.tags) && epx.f(this.dimensions, marketOrderDto.dimensions) && epx.f(this.discount, marketOrderDto.discount) && epx.f(this.promoCode, marketOrderDto.promoCode) && epx.f(this.previewOrderItems, marketOrderDto.previewOrderItems) && epx.f(this.delivery, marketOrderDto.delivery) && epx.f(this.recipient, marketOrderDto.recipient) && epx.f(this.payment, marketOrderDto.payment) && epx.f(this.paymentAction, marketOrderDto.paymentAction) && epx.f(this.priceDetails, marketOrderDto.priceDetails) && epx.f(this.cancelInfo, marketOrderDto.cancelInfo) && epx.f(this.seller, marketOrderDto.seller) && epx.f(this.commentForUser, marketOrderDto.commentForUser) && epx.f(this.orderInfoBanners, marketOrderDto.orderInfoBanners) && epx.f(this.isViewedByAdmin, marketOrderDto.isViewedByAdmin) && epx.f(this.dateViewed, marketOrderDto.dateViewed) && epx.f(this.canAddReview, marketOrderDto.canAddReview);
    }

    public final Integer f() {
        return this.dateViewed;
    }

    public final MarketOrderDeliveryDto g() {
        return this.delivery;
    }

    public final int getId() {
        return this.id;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int hashCode = (this.totalPrice.hashCode() + shy.a(this.itemsCount, shy.a(this.status, shy.a(this.date, bh10.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.groupId.b), 31, this.userId.b), 31), 31), 31)) * 31;
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        int hashCode2 = (hashCode + (marketIntegrationsTypeDto == null ? 0 : marketIntegrationsTypeDto.hashCode())) * 31;
        List<MarketIntegrationsGroupsDto> list = this.integrationGroups;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.integrationOrderUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.integrationOrderId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayOrderId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackNumber;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackLink;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.comment;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.address;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.merchantComment;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.weight;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        List<MarketOrderTagDto> list2 = this.tags;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketItemDimensionsDto marketItemDimensionsDto = this.dimensions;
        int hashCode14 = (hashCode13 + (marketItemDimensionsDto == null ? 0 : marketItemDimensionsDto.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.discount;
        int hashCode15 = (hashCode14 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        MarketPromoCodeDto marketPromoCodeDto = this.promoCode;
        int hashCode16 = (hashCode15 + (marketPromoCodeDto == null ? 0 : marketPromoCodeDto.hashCode())) * 31;
        List<MarketOrderItemDto> list3 = this.previewOrderItems;
        int hashCode17 = (hashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MarketOrderDeliveryDto marketOrderDeliveryDto = this.delivery;
        int hashCode18 = (hashCode17 + (marketOrderDeliveryDto == null ? 0 : marketOrderDeliveryDto.hashCode())) * 31;
        MarketOrderRecipientDto marketOrderRecipientDto = this.recipient;
        int hashCode19 = (hashCode18 + (marketOrderRecipientDto == null ? 0 : marketOrderRecipientDto.hashCode())) * 31;
        MarketOrderPaymentDto marketOrderPaymentDto = this.payment;
        int hashCode20 = (hashCode19 + (marketOrderPaymentDto == null ? 0 : marketOrderPaymentDto.hashCode())) * 31;
        MarketPaymentActionDto marketPaymentActionDto = this.paymentAction;
        int hashCode21 = (hashCode20 + (marketPaymentActionDto == null ? 0 : marketPaymentActionDto.hashCode())) * 31;
        List<MarketOrderDetailsPriceDto> list4 = this.priceDetails;
        int hashCode22 = (hashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.cancelInfo;
        int hashCode23 = (hashCode22 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        MarketOrderSellerDto marketOrderSellerDto = this.seller;
        int hashCode24 = (hashCode23 + (marketOrderSellerDto == null ? 0 : marketOrderSellerDto.hashCode())) * 31;
        String str9 = this.commentForUser;
        int hashCode25 = (hashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<MarketOrderInfoBannerDto> list5 = this.orderInfoBanners;
        int hashCode26 = (hashCode25 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.isViewedByAdmin;
        int hashCode27 = (hashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.dateViewed;
        int hashCode28 = (hashCode27 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.canAddReview;
        return hashCode28 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final MarketPriceDto i() {
        return this.discount;
    }

    public final String j() {
        return this.displayOrderId;
    }

    public final List<MarketIntegrationsGroupsDto> k() {
        return this.integrationGroups;
    }

    public final String l() {
        return this.integrationOrderId;
    }

    public final String n() {
        return this.integrationOrderUrl;
    }

    public final MarketIntegrationsTypeDto o() {
        return this.integrationType;
    }

    public final int p() {
        return this.itemsCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketOrderDto(id=");
        sb.append(this.id);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", itemsCount=");
        sb.append(this.itemsCount);
        sb.append(", totalPrice=");
        sb.append(this.totalPrice);
        sb.append(", integrationType=");
        sb.append(this.integrationType);
        sb.append(", integrationGroups=");
        sb.append(this.integrationGroups);
        sb.append(", integrationOrderUrl=");
        sb.append(this.integrationOrderUrl);
        sb.append(", integrationOrderId=");
        sb.append(this.integrationOrderId);
        sb.append(", displayOrderId=");
        sb.append(this.displayOrderId);
        sb.append(", trackNumber=");
        sb.append(this.trackNumber);
        sb.append(", trackLink=");
        sb.append(this.trackLink);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", merchantComment=");
        sb.append(this.merchantComment);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", dimensions=");
        sb.append(this.dimensions);
        sb.append(", discount=");
        sb.append(this.discount);
        sb.append(", promoCode=");
        sb.append(this.promoCode);
        sb.append(", previewOrderItems=");
        sb.append(this.previewOrderItems);
        sb.append(", delivery=");
        sb.append(this.delivery);
        sb.append(", recipient=");
        sb.append(this.recipient);
        sb.append(", payment=");
        sb.append(this.payment);
        sb.append(", paymentAction=");
        sb.append(this.paymentAction);
        sb.append(", priceDetails=");
        sb.append(this.priceDetails);
        sb.append(", cancelInfo=");
        sb.append(this.cancelInfo);
        sb.append(", seller=");
        sb.append(this.seller);
        sb.append(", commentForUser=");
        sb.append(this.commentForUser);
        sb.append(", orderInfoBanners=");
        sb.append(this.orderInfoBanners);
        sb.append(", isViewedByAdmin=");
        sb.append(this.isViewedByAdmin);
        sb.append(", dateViewed=");
        sb.append(this.dateViewed);
        sb.append(", canAddReview=");
        return tn.a(sb, this.canAddReview, ')');
    }

    public final List<MarketOrderInfoBannerDto> u() {
        return this.orderInfoBanners;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.date);
        parcel.writeInt(this.status);
        parcel.writeInt(this.itemsCount);
        parcel.writeParcelable(this.totalPrice, i);
        parcel.writeParcelable(this.integrationType, i);
        List<MarketIntegrationsGroupsDto> list = this.integrationGroups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketIntegrationsGroupsDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.integrationOrderUrl);
        parcel.writeString(this.integrationOrderId);
        parcel.writeString(this.displayOrderId);
        parcel.writeString(this.trackNumber);
        parcel.writeString(this.trackLink);
        parcel.writeString(this.comment);
        parcel.writeString(this.address);
        parcel.writeString(this.merchantComment);
        Integer num = this.weight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<MarketOrderTagDto> list2 = this.tags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketOrderTagDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        MarketItemDimensionsDto marketItemDimensionsDto = this.dimensions;
        if (marketItemDimensionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemDimensionsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.discount, i);
        MarketPromoCodeDto marketPromoCodeDto = this.promoCode;
        if (marketPromoCodeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPromoCodeDto.writeToParcel(parcel, i);
        }
        List<MarketOrderItemDto> list3 = this.previewOrderItems;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MarketOrderItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        MarketOrderDeliveryDto marketOrderDeliveryDto = this.delivery;
        if (marketOrderDeliveryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderDeliveryDto.writeToParcel(parcel, i);
        }
        MarketOrderRecipientDto marketOrderRecipientDto = this.recipient;
        if (marketOrderRecipientDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderRecipientDto.writeToParcel(parcel, i);
        }
        MarketOrderPaymentDto marketOrderPaymentDto = this.payment;
        if (marketOrderPaymentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderPaymentDto.writeToParcel(parcel, i);
        }
        MarketPaymentActionDto marketPaymentActionDto = this.paymentAction;
        if (marketPaymentActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPaymentActionDto.writeToParcel(parcel, i);
        }
        List<MarketOrderDetailsPriceDto> list4 = this.priceDetails;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MarketOrderDetailsPriceDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.cancelInfo, i);
        MarketOrderSellerDto marketOrderSellerDto = this.seller;
        if (marketOrderSellerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderSellerDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.commentForUser);
        List<MarketOrderInfoBannerDto> list5 = this.orderInfoBanners;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((MarketOrderInfoBannerDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isViewedByAdmin;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num2 = this.dateViewed;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool2 = this.canAddReview;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ MarketOrderDto(int i, UserId userId, UserId userId2, int i2, int i3, int i4, MarketPriceDto marketPriceDto, MarketIntegrationsTypeDto marketIntegrationsTypeDto, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, List list2, MarketItemDimensionsDto marketItemDimensionsDto, MarketPriceDto marketPriceDto2, MarketPromoCodeDto marketPromoCodeDto, List list3, MarketOrderDeliveryDto marketOrderDeliveryDto, MarketOrderRecipientDto marketOrderRecipientDto, MarketOrderPaymentDto marketOrderPaymentDto, MarketPaymentActionDto marketPaymentActionDto, List list4, BaseLinkDto baseLinkDto, MarketOrderSellerDto marketOrderSellerDto, String str9, List list5, Boolean bool, Integer num2, Boolean bool2, int i5, int i6, zcl zclVar) {
        this(i, userId, userId2, i2, i3, i4, marketPriceDto, (i5 & 128) != 0 ? null : marketIntegrationsTypeDto, (i5 & 256) != 0 ? null : list, (i5 & 512) != 0 ? null : str, (i5 & 1024) != 0 ? null : str2, (i5 & 2048) != 0 ? null : str3, (i5 & 4096) != 0 ? null : str4, (i5 & 8192) != 0 ? null : str5, (i5 & 16384) != 0 ? null : str6, (32768 & i5) != 0 ? null : str7, (65536 & i5) != 0 ? null : str8, (131072 & i5) != 0 ? null : num, (262144 & i5) != 0 ? null : list2, (524288 & i5) != 0 ? null : marketItemDimensionsDto, (1048576 & i5) != 0 ? null : marketPriceDto2, (2097152 & i5) != 0 ? null : marketPromoCodeDto, (4194304 & i5) != 0 ? null : list3, (8388608 & i5) != 0 ? null : marketOrderDeliveryDto, (16777216 & i5) != 0 ? null : marketOrderRecipientDto, (33554432 & i5) != 0 ? null : marketOrderPaymentDto, (67108864 & i5) != 0 ? null : marketPaymentActionDto, (134217728 & i5) != 0 ? null : list4, (268435456 & i5) != 0 ? null : baseLinkDto, (536870912 & i5) != 0 ? null : marketOrderSellerDto, (1073741824 & i5) != 0 ? null : str9, (i5 & Integer.MIN_VALUE) != 0 ? null : list5, (i6 & 1) != 0 ? null : bool, (i6 & 2) != 0 ? null : num2, (i6 & 4) != 0 ? null : bool2);
    }
}
