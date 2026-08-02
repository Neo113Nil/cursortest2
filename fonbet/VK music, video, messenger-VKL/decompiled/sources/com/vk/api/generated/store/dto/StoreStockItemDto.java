package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.FreeBox;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.stickers.dto.StickersAuthorSubscriptionDto;
import com.vk.api.generated.stickers.dto.StickersBonusDto;
import com.vk.api.generated.stickers.dto.StickersWishlistsStatusDto;
import io.appmetrica.analytics.impl.L2;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoreStockItemDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemDto implements Parcelable {
    public static final Parcelable.Creator<StoreStockItemDto> CREATOR = new a();

    @pmi0("additional_view_price_buy")
    private final StoreAdditionalViewPriceDto additionalViewPriceBuy;

    @pmi0("author")
    private final String author;

    @pmi0(L2.g)
    private final String background;

    @pmi0("badge")
    private final StoreStockItemBadgeDto badge;

    @pmi0("bonus")
    private final StickersBonusDto bonus;

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("can_gift")
    private final BaseBoolIntDto canGift;

    @pmi0("can_purchase")
    private final BaseBoolIntDto canPurchase;

    @pmi0("can_purchase_for")
    private final BaseBoolIntDto canPurchaseFor;

    @pmi0("can_show_alt_pay_method")
    private final Boolean canShowAltPayMethod;

    @pmi0("cashback")
    private final StoreSubscriptionCashbackDto cashback;

    @pmi0("demo_photos_560")
    private final List<String> demoPhotos560;

    @pmi0("description")
    private final String description;

    @pmi0("discount")
    private final StoreStockItemDiscountDto discount;

    @pmi0(FreeBox.TYPE)
    private final BaseBoolIntDto free;

    @pmi0("is_cis_region")
    private final BaseBoolIntDto isCisRegion;

    @pmi0("is_trial")
    private final BaseBoolIntDto isTrial;

    @pmi0("item_rating")
    private final MarketMarketItemRatingDto itemRating;

    @pmi0("management_url")
    private final String managementUrl;

    @pmi0("merchant_product_id")
    private final String merchantProductId;

    @pmi0("merchant_restrictions")
    private final StoreStockItemMerchantRestrictionsDto merchantRestrictions;

    /* renamed from: new, reason: not valid java name */
    @pmi0("new")
    private final BaseBoolIntDto f23new;

    @pmi0("no_inapp_url")
    private final String noInappUrl;

    @pmi0("no_purchase_reason")
    private final String noPurchaseReason;

    @pmi0("note")
    private final String note;

    @pmi0("old_price")
    private final Integer oldPrice;

    @pmi0("old_price_buy")
    private final Integer oldPriceBuy;

    @pmi0("old_price_buy_str")
    private final String oldPriceBuyStr;

    @pmi0("old_price_gift")
    private final Integer oldPriceGift;

    @pmi0("old_price_gift_str")
    private final String oldPriceGiftStr;

    @pmi0("old_price_str")
    private final String oldPriceStr;

    @pmi0("payment_type")
    private final PaymentTypeDto paymentType;

    @pmi0("period")
    private final Integer period;

    @pmi0("photo_120")
    private final String photo120;

    @pmi0("photo_140")
    private final String photo140;

    @pmi0("photo_296")
    private final String photo296;

    @pmi0("photo_35")
    private final String photo35;

    @pmi0("photo_40")
    private final String photo40;

    @pmi0("photo_592")
    private final String photo592;

    @pmi0("photo_60")
    private final String photo60;

    @pmi0("photo_70")
    private final String photo70;

    @pmi0("photo_80")
    private final String photo80;

    @pmi0("price")
    private final StoreStockItemPriceDto price;

    @pmi0("price_buy")
    private final Integer priceBuy;

    @pmi0("price_buy_discount")
    private final String priceBuyDiscount;

    @pmi0("price_buy_str")
    private final String priceBuyStr;

    @pmi0("price_gift")
    private final Integer priceGift;

    @pmi0("price_gift_discount")
    private final String priceGiftDiscount;

    @pmi0("price_gift_str")
    private final String priceGiftStr;

    @pmi0("price_str")
    private final String priceStr;

    @pmi0("product")
    private final StoreProductDto product;

    @pmi0("purchase_details")
    private final StoreStockItemPurchaseDetailsDto purchaseDetails;

    @pmi0("stickers_author_subscription")
    private final StickersAuthorSubscriptionDto stickersAuthorSubscription;

    @pmi0("stickers_bonus")
    private final StickersBonusDto stickersBonus;

    @pmi0("terms_url")
    private final String termsUrl;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("trial_period")
    private final Integer trialPeriod;

    @pmi0("unavailable_placeholder")
    private final List<BaseImageDto> unavailablePlaceholder;

    @pmi0("version_hash")
    private final String versionHash;

    @pmi0("vkme_only")
    private final BaseBoolIntDto vkmeOnly;

    @pmi0("wishlists_status")
    private final StickersWishlistsStatusDto wishlistsStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoreStockItemDto.kt */
    public static final class PaymentTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PaymentTypeDto[] $VALUES;

        @pmi0("balance")
        public static final PaymentTypeDto BALANCE;
        public static final Parcelable.Creator<PaymentTypeDto> CREATOR;

        @pmi0("inapp")
        public static final PaymentTypeDto INAPP;
        private final String value;

        /* compiled from: StoreStockItemDto.kt */
        public static final class a implements Parcelable.Creator<PaymentTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final PaymentTypeDto createFromParcel(Parcel parcel) {
                return PaymentTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentTypeDto[] newArray(int i) {
                return new PaymentTypeDto[i];
            }
        }

        static {
            PaymentTypeDto paymentTypeDto = new PaymentTypeDto("BALANCE", 0, "balance");
            BALANCE = paymentTypeDto;
            PaymentTypeDto paymentTypeDto2 = new PaymentTypeDto("INAPP", 1, "inapp");
            INAPP = paymentTypeDto2;
            PaymentTypeDto[] paymentTypeDtoArr = {paymentTypeDto, paymentTypeDto2};
            $VALUES = paymentTypeDtoArr;
            $ENTRIES = new asp(paymentTypeDtoArr);
            CREATOR = new a();
        }

        private PaymentTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PaymentTypeDto valueOf(String str) {
            return (PaymentTypeDto) Enum.valueOf(PaymentTypeDto.class, str);
        }

        public static PaymentTypeDto[] values() {
            return (PaymentTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StoreStockItemDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemDto createFromParcel(Parcel parcel) {
            PaymentTypeDto paymentTypeDto;
            StoreStockItemMerchantRestrictionsDto createFromParcel;
            BaseBoolIntDto baseBoolIntDto;
            StoreSubscriptionCashbackDto createFromParcel2;
            StoreSubscriptionCashbackDto storeSubscriptionCashbackDto;
            StoreStockItemBadgeDto createFromParcel3;
            StoreStockItemBadgeDto storeStockItemBadgeDto;
            StoreStockItemPurchaseDetailsDto createFromParcel4;
            BaseBoolIntDto baseBoolIntDto2;
            StickersBonusDto createFromParcel5;
            StickersBonusDto stickersBonusDto;
            StoreStockItemDiscountDto createFromParcel6;
            StoreProductDto storeProductDto;
            String str;
            ArrayList arrayList;
            Boolean valueOf;
            StoreProductDto createFromParcel7 = StoreProductDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            String readString3 = parcel.readString();
            PaymentTypeDto createFromParcel8 = parcel.readInt() == 0 ? null : PaymentTypeDto.CREATOR.createFromParcel(parcel);
            StoreStockItemPriceDto createFromParcel9 = parcel.readInt() == 0 ? null : StoreStockItemPriceDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            StoreAdditionalViewPriceDto createFromParcel10 = parcel.readInt() == 0 ? null : StoreAdditionalViewPriceDto.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                paymentTypeDto = createFromParcel8;
                createFromParcel = null;
            } else {
                paymentTypeDto = createFromParcel8;
                createFromParcel = StoreStockItemMerchantRestrictionsDto.CREATOR.createFromParcel(parcel);
            }
            StoreStockItemMerchantRestrictionsDto storeStockItemMerchantRestrictionsDto = createFromParcel;
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseBoolIntDto = baseBoolIntDto9;
                createFromParcel2 = null;
            } else {
                baseBoolIntDto = baseBoolIntDto9;
                createFromParcel2 = StoreSubscriptionCashbackDto.CREATOR.createFromParcel(parcel);
            }
            StoreSubscriptionCashbackDto storeSubscriptionCashbackDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                storeSubscriptionCashbackDto = storeSubscriptionCashbackDto2;
                createFromParcel3 = null;
            } else {
                storeSubscriptionCashbackDto = storeSubscriptionCashbackDto2;
                createFromParcel3 = StoreStockItemBadgeDto.CREATOR.createFromParcel(parcel);
            }
            StoreStockItemBadgeDto storeStockItemBadgeDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                storeStockItemBadgeDto = storeStockItemBadgeDto2;
                createFromParcel4 = null;
            } else {
                storeStockItemBadgeDto = storeStockItemBadgeDto2;
                createFromParcel4 = StoreStockItemPurchaseDetailsDto.CREATOR.createFromParcel(parcel);
            }
            StoreStockItemPurchaseDetailsDto storeStockItemPurchaseDetailsDto = createFromParcel4;
            BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseBoolIntDto2 = baseBoolIntDto10;
                createFromParcel5 = null;
            } else {
                baseBoolIntDto2 = baseBoolIntDto10;
                createFromParcel5 = StickersBonusDto.CREATOR.createFromParcel(parcel);
            }
            StickersBonusDto stickersBonusDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                stickersBonusDto = stickersBonusDto2;
                createFromParcel6 = null;
            } else {
                stickersBonusDto = stickersBonusDto2;
                createFromParcel6 = StoreStockItemDiscountDto.CREATOR.createFromParcel(parcel);
            }
            StoreStockItemDiscountDto storeStockItemDiscountDto = createFromParcel6;
            String readString28 = parcel.readString();
            if (parcel.readInt() == 0) {
                storeProductDto = createFromParcel7;
                str = readString;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                storeProductDto = createFromParcel7;
                ArrayList arrayList2 = new ArrayList(readInt);
                str = readString;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoreStockItemDto.class, parcel, arrayList2, i, 1);
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoreStockItemDto(storeProductDto, str, readString2, baseBoolIntDto3, baseBoolIntDto4, baseBoolIntDto5, baseBoolIntDto6, readString3, paymentTypeDto, createFromParcel9, readString4, valueOf2, readString5, valueOf3, createFromParcel10, readString6, readString7, valueOf4, readString8, valueOf5, readString9, readString10, valueOf6, readString11, readString12, readString13, storeStockItemMerchantRestrictionsDto, readString14, readString15, readString16, readString17, readString18, readString19, createStringArrayList, baseBoolIntDto7, valueOf7, valueOf8, baseBoolIntDto8, baseBoolIntDto, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, storeSubscriptionCashbackDto, storeStockItemBadgeDto, storeStockItemPurchaseDetailsDto, baseBoolIntDto2, stickersBonusDto, storeStockItemDiscountDto, readString28, arrayList, valueOf, parcel.readInt() == 0 ? null : StickersBonusDto.CREATOR.createFromParcel(parcel), (MarketMarketItemRatingDto) parcel.readParcelable(StoreStockItemDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : StickersWishlistsStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StickersAuthorSubscriptionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemDto[] newArray(int i) {
            return new StoreStockItemDto[i];
        }
    }

    public StoreStockItemDto(StoreProductDto storeProductDto, String str, String str2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, String str3, PaymentTypeDto paymentTypeDto, StoreStockItemPriceDto storeStockItemPriceDto, String str4, Integer num, String str5, Integer num2, StoreAdditionalViewPriceDto storeAdditionalViewPriceDto, String str6, String str7, Integer num3, String str8, Integer num4, String str9, String str10, Integer num5, String str11, String str12, String str13, StoreStockItemMerchantRestrictionsDto storeStockItemMerchantRestrictionsDto, String str14, String str15, String str16, String str17, String str18, String str19, List<String> list, BaseBoolIntDto baseBoolIntDto5, Integer num6, Integer num7, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, StoreSubscriptionCashbackDto storeSubscriptionCashbackDto, StoreStockItemBadgeDto storeStockItemBadgeDto, StoreStockItemPurchaseDetailsDto storeStockItemPurchaseDetailsDto, BaseBoolIntDto baseBoolIntDto8, StickersBonusDto stickersBonusDto, StoreStockItemDiscountDto storeStockItemDiscountDto, String str28, List<BaseImageDto> list2, Boolean bool, StickersBonusDto stickersBonusDto2, MarketMarketItemRatingDto marketMarketItemRatingDto, String str29, StickersWishlistsStatusDto stickersWishlistsStatusDto, StickersAuthorSubscriptionDto stickersAuthorSubscriptionDto) {
        this.product = storeProductDto;
        this.description = str;
        this.author = str2;
        this.canPurchase = baseBoolIntDto;
        this.canPurchaseFor = baseBoolIntDto2;
        this.free = baseBoolIntDto3;
        this.canGift = baseBoolIntDto4;
        this.note = str3;
        this.paymentType = paymentTypeDto;
        this.price = storeStockItemPriceDto;
        this.priceStr = str4;
        this.oldPrice = num;
        this.oldPriceStr = str5;
        this.priceBuy = num2;
        this.additionalViewPriceBuy = storeAdditionalViewPriceDto;
        this.priceBuyStr = str6;
        this.priceBuyDiscount = str7;
        this.oldPriceBuy = num3;
        this.oldPriceBuyStr = str8;
        this.priceGift = num4;
        this.priceGiftStr = str9;
        this.priceGiftDiscount = str10;
        this.oldPriceGift = num5;
        this.oldPriceGiftStr = str11;
        this.noPurchaseReason = str12;
        this.merchantProductId = str13;
        this.merchantRestrictions = storeStockItemMerchantRestrictionsDto;
        this.photo35 = str14;
        this.photo70 = str15;
        this.photo140 = str16;
        this.photo296 = str17;
        this.photo592 = str18;
        this.background = str19;
        this.demoPhotos560 = list;
        this.f23new = baseBoolIntDto5;
        this.period = num6;
        this.trialPeriod = num7;
        this.isTrial = baseBoolIntDto6;
        this.isCisRegion = baseBoolIntDto7;
        this.buttonTitle = str20;
        this.photo40 = str21;
        this.photo60 = str22;
        this.photo80 = str23;
        this.photo120 = str24;
        this.managementUrl = str25;
        this.termsUrl = str26;
        this.noInappUrl = str27;
        this.cashback = storeSubscriptionCashbackDto;
        this.badge = storeStockItemBadgeDto;
        this.purchaseDetails = storeStockItemPurchaseDetailsDto;
        this.vkmeOnly = baseBoolIntDto8;
        this.bonus = stickersBonusDto;
        this.discount = storeStockItemDiscountDto;
        this.versionHash = str28;
        this.unavailablePlaceholder = list2;
        this.canShowAltPayMethod = bool;
        this.stickersBonus = stickersBonusDto2;
        this.itemRating = marketMarketItemRatingDto;
        this.trackCode = str29;
        this.wishlistsStatus = stickersWishlistsStatusDto;
        this.stickersAuthorSubscription = stickersAuthorSubscriptionDto;
    }

    public final String B() {
        return this.oldPriceBuyStr;
    }

    public final Integer C() {
        return this.oldPriceGift;
    }

    public final String D() {
        return this.oldPriceGiftStr;
    }

    public final StoreStockItemPurchaseDetailsDto D0() {
        return this.purchaseDetails;
    }

    public final PaymentTypeDto F() {
        return this.paymentType;
    }

    public final StickersAuthorSubscriptionDto F0() {
        return this.stickersAuthorSubscription;
    }

    public final String G() {
        return this.photo140;
    }

    public final String H0() {
        return this.versionHash;
    }

    public final String K() {
        return this.photo296;
    }

    public final BaseBoolIntDto K0() {
        return this.vkmeOnly;
    }

    public final String M() {
        return this.photo35;
    }

    public final StickersWishlistsStatusDto N0() {
        return this.wishlistsStatus;
    }

    public final String R() {
        return this.photo592;
    }

    public final String T() {
        return this.photo70;
    }

    public final Integer W() {
        return this.priceBuy;
    }

    public final String Z() {
        return this.priceBuyDiscount;
    }

    public final String a0() {
        return this.priceBuyStr;
    }

    public final StoreAdditionalViewPriceDto d() {
        return this.additionalViewPriceBuy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.author;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStockItemDto)) {
            return false;
        }
        StoreStockItemDto storeStockItemDto = (StoreStockItemDto) obj;
        return epx.f(this.product, storeStockItemDto.product) && epx.f(this.description, storeStockItemDto.description) && epx.f(this.author, storeStockItemDto.author) && this.canPurchase == storeStockItemDto.canPurchase && this.canPurchaseFor == storeStockItemDto.canPurchaseFor && this.free == storeStockItemDto.free && this.canGift == storeStockItemDto.canGift && epx.f(this.note, storeStockItemDto.note) && this.paymentType == storeStockItemDto.paymentType && epx.f(this.price, storeStockItemDto.price) && epx.f(this.priceStr, storeStockItemDto.priceStr) && epx.f(this.oldPrice, storeStockItemDto.oldPrice) && epx.f(this.oldPriceStr, storeStockItemDto.oldPriceStr) && epx.f(this.priceBuy, storeStockItemDto.priceBuy) && epx.f(this.additionalViewPriceBuy, storeStockItemDto.additionalViewPriceBuy) && epx.f(this.priceBuyStr, storeStockItemDto.priceBuyStr) && epx.f(this.priceBuyDiscount, storeStockItemDto.priceBuyDiscount) && epx.f(this.oldPriceBuy, storeStockItemDto.oldPriceBuy) && epx.f(this.oldPriceBuyStr, storeStockItemDto.oldPriceBuyStr) && epx.f(this.priceGift, storeStockItemDto.priceGift) && epx.f(this.priceGiftStr, storeStockItemDto.priceGiftStr) && epx.f(this.priceGiftDiscount, storeStockItemDto.priceGiftDiscount) && epx.f(this.oldPriceGift, storeStockItemDto.oldPriceGift) && epx.f(this.oldPriceGiftStr, storeStockItemDto.oldPriceGiftStr) && epx.f(this.noPurchaseReason, storeStockItemDto.noPurchaseReason) && epx.f(this.merchantProductId, storeStockItemDto.merchantProductId) && epx.f(this.merchantRestrictions, storeStockItemDto.merchantRestrictions) && epx.f(this.photo35, storeStockItemDto.photo35) && epx.f(this.photo70, storeStockItemDto.photo70) && epx.f(this.photo140, storeStockItemDto.photo140) && epx.f(this.photo296, storeStockItemDto.photo296) && epx.f(this.photo592, storeStockItemDto.photo592) && epx.f(this.background, storeStockItemDto.background) && epx.f(this.demoPhotos560, storeStockItemDto.demoPhotos560) && this.f23new == storeStockItemDto.f23new && epx.f(this.period, storeStockItemDto.period) && epx.f(this.trialPeriod, storeStockItemDto.trialPeriod) && this.isTrial == storeStockItemDto.isTrial && this.isCisRegion == storeStockItemDto.isCisRegion && epx.f(this.buttonTitle, storeStockItemDto.buttonTitle) && epx.f(this.photo40, storeStockItemDto.photo40) && epx.f(this.photo60, storeStockItemDto.photo60) && epx.f(this.photo80, storeStockItemDto.photo80) && epx.f(this.photo120, storeStockItemDto.photo120) && epx.f(this.managementUrl, storeStockItemDto.managementUrl) && epx.f(this.termsUrl, storeStockItemDto.termsUrl) && epx.f(this.noInappUrl, storeStockItemDto.noInappUrl) && epx.f(this.cashback, storeStockItemDto.cashback) && epx.f(this.badge, storeStockItemDto.badge) && epx.f(this.purchaseDetails, storeStockItemDto.purchaseDetails) && this.vkmeOnly == storeStockItemDto.vkmeOnly && epx.f(this.bonus, storeStockItemDto.bonus) && epx.f(this.discount, storeStockItemDto.discount) && epx.f(this.versionHash, storeStockItemDto.versionHash) && epx.f(this.unavailablePlaceholder, storeStockItemDto.unavailablePlaceholder) && epx.f(this.canShowAltPayMethod, storeStockItemDto.canShowAltPayMethod) && epx.f(this.stickersBonus, storeStockItemDto.stickersBonus) && epx.f(this.itemRating, storeStockItemDto.itemRating) && epx.f(this.trackCode, storeStockItemDto.trackCode) && epx.f(this.wishlistsStatus, storeStockItemDto.wishlistsStatus) && epx.f(this.stickersAuthorSubscription, storeStockItemDto.stickersAuthorSubscription);
    }

    public final StoreStockItemBadgeDto f() {
        return this.badge;
    }

    public final BaseBoolIntDto g() {
        return this.canGift;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = this.product.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.author;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canPurchase;
        int hashCode4 = (hashCode3 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.canPurchaseFor;
        int hashCode5 = (hashCode4 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.free;
        int hashCode6 = (hashCode5 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.canGift;
        int hashCode7 = (hashCode6 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        String str3 = this.note;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentTypeDto paymentTypeDto = this.paymentType;
        int hashCode9 = (hashCode8 + (paymentTypeDto == null ? 0 : paymentTypeDto.hashCode())) * 31;
        StoreStockItemPriceDto storeStockItemPriceDto = this.price;
        int hashCode10 = (hashCode9 + (storeStockItemPriceDto == null ? 0 : storeStockItemPriceDto.hashCode())) * 31;
        String str4 = this.priceStr;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.oldPrice;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.oldPriceStr;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.priceBuy;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StoreAdditionalViewPriceDto storeAdditionalViewPriceDto = this.additionalViewPriceBuy;
        int hashCode15 = (hashCode14 + (storeAdditionalViewPriceDto == null ? 0 : storeAdditionalViewPriceDto.hashCode())) * 31;
        String str6 = this.priceBuyStr;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.priceBuyDiscount;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.oldPriceBuy;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.oldPriceBuyStr;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.priceGift;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.priceGiftStr;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.priceGiftDiscount;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num5 = this.oldPriceGift;
        int hashCode23 = (hashCode22 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str11 = this.oldPriceGiftStr;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.noPurchaseReason;
        int hashCode25 = (hashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.merchantProductId;
        int hashCode26 = (hashCode25 + (str13 == null ? 0 : str13.hashCode())) * 31;
        StoreStockItemMerchantRestrictionsDto storeStockItemMerchantRestrictionsDto = this.merchantRestrictions;
        int hashCode27 = (hashCode26 + (storeStockItemMerchantRestrictionsDto == null ? 0 : storeStockItemMerchantRestrictionsDto.hashCode())) * 31;
        String str14 = this.photo35;
        int hashCode28 = (hashCode27 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.photo70;
        int hashCode29 = (hashCode28 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.photo140;
        int hashCode30 = (hashCode29 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.photo296;
        int hashCode31 = (hashCode30 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.photo592;
        int hashCode32 = (hashCode31 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.background;
        int hashCode33 = (hashCode32 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List<String> list = this.demoPhotos560;
        int hashCode34 = (hashCode33 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto5 = this.f23new;
        int hashCode35 = (hashCode34 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
        Integer num6 = this.period;
        int hashCode36 = (hashCode35 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.trialPeriod;
        int hashCode37 = (hashCode36 + (num7 == null ? 0 : num7.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto6 = this.isTrial;
        int hashCode38 = (hashCode37 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto7 = this.isCisRegion;
        int hashCode39 = (hashCode38 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
        String str20 = this.buttonTitle;
        int hashCode40 = (hashCode39 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.photo40;
        int hashCode41 = (hashCode40 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.photo60;
        int hashCode42 = (hashCode41 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.photo80;
        int hashCode43 = (hashCode42 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.photo120;
        int hashCode44 = (hashCode43 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.managementUrl;
        int hashCode45 = (hashCode44 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.termsUrl;
        int hashCode46 = (hashCode45 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.noInappUrl;
        int hashCode47 = (hashCode46 + (str27 == null ? 0 : str27.hashCode())) * 31;
        StoreSubscriptionCashbackDto storeSubscriptionCashbackDto = this.cashback;
        int hashCode48 = (hashCode47 + (storeSubscriptionCashbackDto == null ? 0 : storeSubscriptionCashbackDto.hashCode())) * 31;
        StoreStockItemBadgeDto storeStockItemBadgeDto = this.badge;
        int hashCode49 = (hashCode48 + (storeStockItemBadgeDto == null ? 0 : storeStockItemBadgeDto.hashCode())) * 31;
        StoreStockItemPurchaseDetailsDto storeStockItemPurchaseDetailsDto = this.purchaseDetails;
        int hashCode50 = (hashCode49 + (storeStockItemPurchaseDetailsDto == null ? 0 : storeStockItemPurchaseDetailsDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto8 = this.vkmeOnly;
        int hashCode51 = (hashCode50 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
        StickersBonusDto stickersBonusDto = this.bonus;
        int hashCode52 = (hashCode51 + (stickersBonusDto == null ? 0 : stickersBonusDto.hashCode())) * 31;
        StoreStockItemDiscountDto storeStockItemDiscountDto = this.discount;
        int hashCode53 = (hashCode52 + (storeStockItemDiscountDto == null ? 0 : storeStockItemDiscountDto.hashCode())) * 31;
        String str28 = this.versionHash;
        int hashCode54 = (hashCode53 + (str28 == null ? 0 : str28.hashCode())) * 31;
        List<BaseImageDto> list2 = this.unavailablePlaceholder;
        int hashCode55 = (hashCode54 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.canShowAltPayMethod;
        int hashCode56 = (hashCode55 + (bool == null ? 0 : bool.hashCode())) * 31;
        StickersBonusDto stickersBonusDto2 = this.stickersBonus;
        int hashCode57 = (hashCode56 + (stickersBonusDto2 == null ? 0 : stickersBonusDto2.hashCode())) * 31;
        MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
        int hashCode58 = (hashCode57 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
        String str29 = this.trackCode;
        int hashCode59 = (hashCode58 + (str29 == null ? 0 : str29.hashCode())) * 31;
        StickersWishlistsStatusDto stickersWishlistsStatusDto = this.wishlistsStatus;
        int hashCode60 = (hashCode59 + (stickersWishlistsStatusDto == null ? 0 : stickersWishlistsStatusDto.hashCode())) * 31;
        StickersAuthorSubscriptionDto stickersAuthorSubscriptionDto = this.stickersAuthorSubscription;
        return hashCode60 + (stickersAuthorSubscriptionDto != null ? stickersAuthorSubscriptionDto.hashCode() : 0);
    }

    public final BaseBoolIntDto i() {
        return this.canPurchase;
    }

    public final BaseBoolIntDto j() {
        return this.canPurchaseFor;
    }

    public final Boolean k() {
        return this.canShowAltPayMethod;
    }

    public final BaseBoolIntDto l() {
        return this.free;
    }

    public final Integer l0() {
        return this.priceGift;
    }

    public final String n() {
        return this.merchantProductId;
    }

    public final String o() {
        return this.noPurchaseReason;
    }

    public final String p() {
        return this.note;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "StoreStockItemDto(product=" + this.product + ", description=" + this.description + ", author=" + this.author + ", canPurchase=" + this.canPurchase + ", canPurchaseFor=" + this.canPurchaseFor + ", free=" + this.free + ", canGift=" + this.canGift + ", note=" + this.note + ", paymentType=" + this.paymentType + ", price=" + this.price + ", priceStr=" + this.priceStr + ", oldPrice=" + this.oldPrice + ", oldPriceStr=" + this.oldPriceStr + ", priceBuy=" + this.priceBuy + ", additionalViewPriceBuy=" + this.additionalViewPriceBuy + ", priceBuyStr=" + this.priceBuyStr + ", priceBuyDiscount=" + this.priceBuyDiscount + ", oldPriceBuy=" + this.oldPriceBuy + ", oldPriceBuyStr=" + this.oldPriceBuyStr + ", priceGift=" + this.priceGift + ", priceGiftStr=" + this.priceGiftStr + ", priceGiftDiscount=" + this.priceGiftDiscount + ", oldPriceGift=" + this.oldPriceGift + ", oldPriceGiftStr=" + this.oldPriceGiftStr + ", noPurchaseReason=" + this.noPurchaseReason + ", merchantProductId=" + this.merchantProductId + ", merchantRestrictions=" + this.merchantRestrictions + ", photo35=" + this.photo35 + ", photo70=" + this.photo70 + ", photo140=" + this.photo140 + ", photo296=" + this.photo296 + ", photo592=" + this.photo592 + ", background=" + this.background + ", demoPhotos560=" + this.demoPhotos560 + ", new=" + this.f23new + ", period=" + this.period + ", trialPeriod=" + this.trialPeriod + ", isTrial=" + this.isTrial + ", isCisRegion=" + this.isCisRegion + ", buttonTitle=" + this.buttonTitle + ", photo40=" + this.photo40 + ", photo60=" + this.photo60 + ", photo80=" + this.photo80 + ", photo120=" + this.photo120 + ", managementUrl=" + this.managementUrl + ", termsUrl=" + this.termsUrl + ", noInappUrl=" + this.noInappUrl + ", cashback=" + this.cashback + ", badge=" + this.badge + ", purchaseDetails=" + this.purchaseDetails + ", vkmeOnly=" + this.vkmeOnly + ", bonus=" + this.bonus + ", discount=" + this.discount + ", versionHash=" + this.versionHash + ", unavailablePlaceholder=" + this.unavailablePlaceholder + ", canShowAltPayMethod=" + this.canShowAltPayMethod + ", stickersBonus=" + this.stickersBonus + ", itemRating=" + this.itemRating + ", trackCode=" + this.trackCode + ", wishlistsStatus=" + this.wishlistsStatus + ", stickersAuthorSubscription=" + this.stickersAuthorSubscription + ')';
    }

    public final Integer u() {
        return this.oldPriceBuy;
    }

    public final String v0() {
        return this.priceGiftDiscount;
    }

    public final String w0() {
        return this.priceGiftStr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.product.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeString(this.author);
        parcel.writeParcelable(this.canPurchase, i);
        parcel.writeParcelable(this.canPurchaseFor, i);
        parcel.writeParcelable(this.free, i);
        parcel.writeParcelable(this.canGift, i);
        parcel.writeString(this.note);
        PaymentTypeDto paymentTypeDto = this.paymentType;
        if (paymentTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentTypeDto.writeToParcel(parcel, i);
        }
        StoreStockItemPriceDto storeStockItemPriceDto = this.price;
        if (storeStockItemPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemPriceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.priceStr);
        Integer num = this.oldPrice;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.oldPriceStr);
        Integer num2 = this.priceBuy;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        StoreAdditionalViewPriceDto storeAdditionalViewPriceDto = this.additionalViewPriceBuy;
        if (storeAdditionalViewPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeAdditionalViewPriceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.priceBuyStr);
        parcel.writeString(this.priceBuyDiscount);
        Integer num3 = this.oldPriceBuy;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.oldPriceBuyStr);
        Integer num4 = this.priceGift;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.priceGiftStr);
        parcel.writeString(this.priceGiftDiscount);
        Integer num5 = this.oldPriceGift;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeString(this.oldPriceGiftStr);
        parcel.writeString(this.noPurchaseReason);
        parcel.writeString(this.merchantProductId);
        StoreStockItemMerchantRestrictionsDto storeStockItemMerchantRestrictionsDto = this.merchantRestrictions;
        if (storeStockItemMerchantRestrictionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemMerchantRestrictionsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.photo35);
        parcel.writeString(this.photo70);
        parcel.writeString(this.photo140);
        parcel.writeString(this.photo296);
        parcel.writeString(this.photo592);
        parcel.writeString(this.background);
        parcel.writeStringList(this.demoPhotos560);
        parcel.writeParcelable(this.f23new, i);
        Integer num6 = this.period;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.trialPeriod;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeParcelable(this.isTrial, i);
        parcel.writeParcelable(this.isCisRegion, i);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.photo40);
        parcel.writeString(this.photo60);
        parcel.writeString(this.photo80);
        parcel.writeString(this.photo120);
        parcel.writeString(this.managementUrl);
        parcel.writeString(this.termsUrl);
        parcel.writeString(this.noInappUrl);
        StoreSubscriptionCashbackDto storeSubscriptionCashbackDto = this.cashback;
        if (storeSubscriptionCashbackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeSubscriptionCashbackDto.writeToParcel(parcel, i);
        }
        StoreStockItemBadgeDto storeStockItemBadgeDto = this.badge;
        if (storeStockItemBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemBadgeDto.writeToParcel(parcel, i);
        }
        StoreStockItemPurchaseDetailsDto storeStockItemPurchaseDetailsDto = this.purchaseDetails;
        if (storeStockItemPurchaseDetailsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemPurchaseDetailsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.vkmeOnly, i);
        StickersBonusDto stickersBonusDto = this.bonus;
        if (stickersBonusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersBonusDto.writeToParcel(parcel, i);
        }
        StoreStockItemDiscountDto storeStockItemDiscountDto = this.discount;
        if (storeStockItemDiscountDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeStockItemDiscountDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.versionHash);
        List<BaseImageDto> list = this.unavailablePlaceholder;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.canShowAltPayMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StickersBonusDto stickersBonusDto2 = this.stickersBonus;
        if (stickersBonusDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersBonusDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.itemRating, i);
        parcel.writeString(this.trackCode);
        StickersWishlistsStatusDto stickersWishlistsStatusDto = this.wishlistsStatus;
        if (stickersWishlistsStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersWishlistsStatusDto.writeToParcel(parcel, i);
        }
        StickersAuthorSubscriptionDto stickersAuthorSubscriptionDto = this.stickersAuthorSubscription;
        if (stickersAuthorSubscriptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersAuthorSubscriptionDto.writeToParcel(parcel, i);
        }
    }

    public final StoreProductDto y0() {
        return this.product;
    }

    public /* synthetic */ StoreStockItemDto(StoreProductDto storeProductDto, String str, String str2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, String str3, PaymentTypeDto paymentTypeDto, StoreStockItemPriceDto storeStockItemPriceDto, String str4, Integer num, String str5, Integer num2, StoreAdditionalViewPriceDto storeAdditionalViewPriceDto, String str6, String str7, Integer num3, String str8, Integer num4, String str9, String str10, Integer num5, String str11, String str12, String str13, StoreStockItemMerchantRestrictionsDto storeStockItemMerchantRestrictionsDto, String str14, String str15, String str16, String str17, String str18, String str19, List list, BaseBoolIntDto baseBoolIntDto5, Integer num6, Integer num7, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, StoreSubscriptionCashbackDto storeSubscriptionCashbackDto, StoreStockItemBadgeDto storeStockItemBadgeDto, StoreStockItemPurchaseDetailsDto storeStockItemPurchaseDetailsDto, BaseBoolIntDto baseBoolIntDto8, StickersBonusDto stickersBonusDto, StoreStockItemDiscountDto storeStockItemDiscountDto, String str28, List list2, Boolean bool, StickersBonusDto stickersBonusDto2, MarketMarketItemRatingDto marketMarketItemRatingDto, String str29, StickersWishlistsStatusDto stickersWishlistsStatusDto, StickersAuthorSubscriptionDto stickersAuthorSubscriptionDto, int i, int i2, zcl zclVar) {
        this(storeProductDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseBoolIntDto, (i & 16) != 0 ? null : baseBoolIntDto2, (i & 32) != 0 ? null : baseBoolIntDto3, (i & 64) != 0 ? null : baseBoolIntDto4, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : paymentTypeDto, (i & 512) != 0 ? null : storeStockItemPriceDto, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : storeAdditionalViewPriceDto, (i & 32768) != 0 ? null : str6, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : num3, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str8, (i & 524288) != 0 ? null : num4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9, (i & 2097152) != 0 ? null : str10, (i & 4194304) != 0 ? null : num5, (i & 8388608) != 0 ? null : str11, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str12, (i & 33554432) != 0 ? null : str13, (i & 67108864) != 0 ? null : storeStockItemMerchantRestrictionsDto, (i & 134217728) != 0 ? null : str14, (i & 268435456) != 0 ? null : str15, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str16, (i & 1073741824) != 0 ? null : str17, (i & Integer.MIN_VALUE) != 0 ? null : str18, (i2 & 1) != 0 ? null : str19, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : baseBoolIntDto5, (i2 & 8) != 0 ? null : num6, (i2 & 16) != 0 ? null : num7, (i2 & 32) != 0 ? null : baseBoolIntDto6, (i2 & 64) != 0 ? null : baseBoolIntDto7, (i2 & 128) != 0 ? null : str20, (i2 & 256) != 0 ? null : str21, (i2 & 512) != 0 ? null : str22, (i2 & 1024) != 0 ? null : str23, (i2 & 2048) != 0 ? null : str24, (i2 & 4096) != 0 ? null : str25, (i2 & 8192) != 0 ? null : str26, (i2 & 16384) != 0 ? null : str27, (i2 & 32768) != 0 ? null : storeSubscriptionCashbackDto, (i2 & 65536) != 0 ? null : storeStockItemBadgeDto, (i2 & 131072) != 0 ? null : storeStockItemPurchaseDetailsDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto8, (i2 & 524288) != 0 ? null : stickersBonusDto, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : storeStockItemDiscountDto, (i2 & 2097152) != 0 ? null : str28, (i2 & 4194304) != 0 ? null : list2, (i2 & 8388608) != 0 ? null : bool, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : stickersBonusDto2, (i2 & 33554432) != 0 ? null : marketMarketItemRatingDto, (i2 & 67108864) != 0 ? null : str29, (i2 & 134217728) != 0 ? null : stickersWishlistsStatusDto, (i2 & 268435456) != 0 ? null : stickersAuthorSubscriptionDto);
    }
}
