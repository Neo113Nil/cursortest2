package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsDto> CREATOR = new a();

    @pmi0("admin_2fa_check_fail")
    private final Boolean admin2faCheckFail;

    @pmi0("albums_count")
    private final Integer albumsCount;

    @pmi0("albums_limit")
    private final Integer albumsLimit;

    @pmi0("atol_payments")
    private final MarketSettingsAtolPaymentsDto atolPayments;

    @pmi0("button_site_open_enabled")
    private final Boolean buttonSiteOpenEnabled;

    @pmi0("buttons")
    private final MarketSettingsButtonsDto buttons;

    @pmi0("can_launch_autopromotion")
    private final Boolean canLaunchAutopromotion;

    @pmi0("can_message")
    private final Boolean canMessage;

    @pmi0("cities")
    private final MarketCitySettingsDto cities;

    @pmi0("comments_enabled")
    private final Integer commentsEnabled;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencySettingsDto currency;

    @pmi0(C4572u.g)
    private final MarketSettingsDeliveryDto delivery;

    @pmi0("enabled")
    private final Boolean enabled;

    @pmi0("goods")
    private final MarketSettingsGoodsDto goods;

    @pmi0("group")
    private final MarketSettingsGroupDto group;

    @pmi0("has_albums_v2_intro")
    private final Boolean hasAlbumsV2Intro;

    @pmi0("items_count")
    private final Integer itemsCount;

    @pmi0("market_items_autopromotion_link")
    private final String marketItemsAutopromotionLink;

    @pmi0("market_type")
    private final MarketOwnerTypeDto marketType;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("orders")
    private final MarketSettingsOrdersDto orders;

    @pmi0("payments")
    private final MarketSettingsPaymentsDto payments;

    @pmi0("services")
    private final MarketSettingsServicesDto services;

    @pmi0("shop_conditions")
    private final MarketShopConditionsDto shopConditions;

    @pmi0("stock_mode")
    private final Integer stockMode;

    @pmi0("toogles")
    private final MarketTogglesDto toogles;

    @pmi0("unviewed_orders_count")
    private final Integer unviewedOrdersCount;

    @pmi0("video_enabled")
    private final Boolean videoEnabled;

    @pmi0("viewed_products_enabled")
    private final Boolean viewedProductsEnabled;

    /* compiled from: MarketSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsDto> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.api.generated.market.dto.MarketSettingsDto, still in use, count: 2, list:
              (r1v0 com.vk.api.generated.market.dto.MarketSettingsDto) from 0x0180: MOVE (r26v1 com.vk.api.generated.market.dto.MarketSettingsDto) = (r1v0 com.vk.api.generated.market.dto.MarketSettingsDto) (LINE:385)
              (r1v0 com.vk.api.generated.market.dto.MarketSettingsDto) from 0x017c: MOVE (r26v4 com.vk.api.generated.market.dto.MarketSettingsDto) = (r1v0 com.vk.api.generated.market.dto.MarketSettingsDto) (LINE:381)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.market.dto.MarketSettingsDto createFromParcel(android.os.Parcel r34) {
            /*
                Method dump skipped, instructions count: 587
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.market.dto.MarketSettingsDto.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsDto[] newArray(int i) {
            return new MarketSettingsDto[i];
        }
    }

    public MarketSettingsDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final Integer d() {
        return this.albumsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.albumsLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSettingsDto)) {
            return false;
        }
        MarketSettingsDto marketSettingsDto = (MarketSettingsDto) obj;
        return epx.f(this.group, marketSettingsDto.group) && epx.f(this.payments, marketSettingsDto.payments) && epx.f(this.atolPayments, marketSettingsDto.atolPayments) && epx.f(this.delivery, marketSettingsDto.delivery) && epx.f(this.orders, marketSettingsDto.orders) && epx.f(this.albumsLimit, marketSettingsDto.albumsLimit) && epx.f(this.albumsCount, marketSettingsDto.albumsCount) && epx.f(this.hasAlbumsV2Intro, marketSettingsDto.hasAlbumsV2Intro) && epx.f(this.toogles, marketSettingsDto.toogles) && this.marketType == marketSettingsDto.marketType && epx.f(this.buttonSiteOpenEnabled, marketSettingsDto.buttonSiteOpenEnabled) && epx.f(this.videoEnabled, marketSettingsDto.videoEnabled) && epx.f(this.itemsCount, marketSettingsDto.itemsCount) && epx.f(this.unviewedOrdersCount, marketSettingsDto.unviewedOrdersCount) && epx.f(this.cities, marketSettingsDto.cities) && epx.f(this.canMessage, marketSettingsDto.canMessage) && epx.f(this.stockMode, marketSettingsDto.stockMode) && epx.f(this.commentsEnabled, marketSettingsDto.commentsEnabled) && epx.f(this.minOrderPrice, marketSettingsDto.minOrderPrice) && epx.f(this.currency, marketSettingsDto.currency) && epx.f(this.enabled, marketSettingsDto.enabled) && epx.f(this.buttons, marketSettingsDto.buttons) && epx.f(this.shopConditions, marketSettingsDto.shopConditions) && epx.f(this.viewedProductsEnabled, marketSettingsDto.viewedProductsEnabled) && epx.f(this.marketItemsAutopromotionLink, marketSettingsDto.marketItemsAutopromotionLink) && epx.f(this.admin2faCheckFail, marketSettingsDto.admin2faCheckFail) && epx.f(this.services, marketSettingsDto.services) && epx.f(this.canLaunchAutopromotion, marketSettingsDto.canLaunchAutopromotion) && epx.f(this.goods, marketSettingsDto.goods);
    }

    public final int hashCode() {
        MarketSettingsGroupDto marketSettingsGroupDto = this.group;
        int hashCode = (marketSettingsGroupDto == null ? 0 : marketSettingsGroupDto.hashCode()) * 31;
        MarketSettingsPaymentsDto marketSettingsPaymentsDto = this.payments;
        int hashCode2 = (hashCode + (marketSettingsPaymentsDto == null ? 0 : marketSettingsPaymentsDto.hashCode())) * 31;
        MarketSettingsAtolPaymentsDto marketSettingsAtolPaymentsDto = this.atolPayments;
        int hashCode3 = (hashCode2 + (marketSettingsAtolPaymentsDto == null ? 0 : marketSettingsAtolPaymentsDto.hashCode())) * 31;
        MarketSettingsDeliveryDto marketSettingsDeliveryDto = this.delivery;
        int hashCode4 = (hashCode3 + (marketSettingsDeliveryDto == null ? 0 : marketSettingsDeliveryDto.hashCode())) * 31;
        MarketSettingsOrdersDto marketSettingsOrdersDto = this.orders;
        int hashCode5 = (hashCode4 + (marketSettingsOrdersDto == null ? 0 : marketSettingsOrdersDto.hashCode())) * 31;
        Integer num = this.albumsLimit;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.albumsCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasAlbumsV2Intro;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketTogglesDto marketTogglesDto = this.toogles;
        int hashCode9 = (hashCode8 + (marketTogglesDto == null ? 0 : marketTogglesDto.hashCode())) * 31;
        MarketOwnerTypeDto marketOwnerTypeDto = this.marketType;
        int hashCode10 = (hashCode9 + (marketOwnerTypeDto == null ? 0 : marketOwnerTypeDto.hashCode())) * 31;
        Boolean bool2 = this.buttonSiteOpenEnabled;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.videoEnabled;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.itemsCount;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.unviewedOrdersCount;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MarketCitySettingsDto marketCitySettingsDto = this.cities;
        int hashCode15 = (hashCode14 + (marketCitySettingsDto == null ? 0 : marketCitySettingsDto.hashCode())) * 31;
        Boolean bool4 = this.canMessage;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num5 = this.stockMode;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.commentsEnabled;
        int hashCode18 = (hashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        int hashCode19 = (hashCode18 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        MarketCurrencySettingsDto marketCurrencySettingsDto = this.currency;
        int hashCode20 = (hashCode19 + (marketCurrencySettingsDto == null ? 0 : marketCurrencySettingsDto.hashCode())) * 31;
        Boolean bool5 = this.enabled;
        int hashCode21 = (hashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        MarketSettingsButtonsDto marketSettingsButtonsDto = this.buttons;
        int hashCode22 = (hashCode21 + (marketSettingsButtonsDto == null ? 0 : marketSettingsButtonsDto.hashCode())) * 31;
        MarketShopConditionsDto marketShopConditionsDto = this.shopConditions;
        int hashCode23 = (hashCode22 + (marketShopConditionsDto == null ? 0 : marketShopConditionsDto.hashCode())) * 31;
        Boolean bool6 = this.viewedProductsEnabled;
        int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.marketItemsAutopromotionLink;
        int hashCode25 = (hashCode24 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool7 = this.admin2faCheckFail;
        int hashCode26 = (hashCode25 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        MarketSettingsServicesDto marketSettingsServicesDto = this.services;
        int hashCode27 = (hashCode26 + (marketSettingsServicesDto == null ? 0 : marketSettingsServicesDto.hashCode())) * 31;
        Boolean bool8 = this.canLaunchAutopromotion;
        int hashCode28 = (hashCode27 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        MarketSettingsGoodsDto marketSettingsGoodsDto = this.goods;
        return hashCode28 + (marketSettingsGoodsDto != null ? marketSettingsGoodsDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSettingsDto(group=" + this.group + ", payments=" + this.payments + ", atolPayments=" + this.atolPayments + ", delivery=" + this.delivery + ", orders=" + this.orders + ", albumsLimit=" + this.albumsLimit + ", albumsCount=" + this.albumsCount + ", hasAlbumsV2Intro=" + this.hasAlbumsV2Intro + ", toogles=" + this.toogles + ", marketType=" + this.marketType + ", buttonSiteOpenEnabled=" + this.buttonSiteOpenEnabled + ", videoEnabled=" + this.videoEnabled + ", itemsCount=" + this.itemsCount + ", unviewedOrdersCount=" + this.unviewedOrdersCount + ", cities=" + this.cities + ", canMessage=" + this.canMessage + ", stockMode=" + this.stockMode + ", commentsEnabled=" + this.commentsEnabled + ", minOrderPrice=" + this.minOrderPrice + ", currency=" + this.currency + ", enabled=" + this.enabled + ", buttons=" + this.buttons + ", shopConditions=" + this.shopConditions + ", viewedProductsEnabled=" + this.viewedProductsEnabled + ", marketItemsAutopromotionLink=" + this.marketItemsAutopromotionLink + ", admin2faCheckFail=" + this.admin2faCheckFail + ", services=" + this.services + ", canLaunchAutopromotion=" + this.canLaunchAutopromotion + ", goods=" + this.goods + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketSettingsGroupDto marketSettingsGroupDto = this.group;
        if (marketSettingsGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsGroupDto.writeToParcel(parcel, i);
        }
        MarketSettingsPaymentsDto marketSettingsPaymentsDto = this.payments;
        if (marketSettingsPaymentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsPaymentsDto.writeToParcel(parcel, i);
        }
        MarketSettingsAtolPaymentsDto marketSettingsAtolPaymentsDto = this.atolPayments;
        if (marketSettingsAtolPaymentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsAtolPaymentsDto.writeToParcel(parcel, i);
        }
        MarketSettingsDeliveryDto marketSettingsDeliveryDto = this.delivery;
        if (marketSettingsDeliveryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsDeliveryDto.writeToParcel(parcel, i);
        }
        MarketSettingsOrdersDto marketSettingsOrdersDto = this.orders;
        if (marketSettingsOrdersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsOrdersDto.writeToParcel(parcel, i);
        }
        Integer num = this.albumsLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.albumsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.hasAlbumsV2Intro;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MarketTogglesDto marketTogglesDto = this.toogles;
        if (marketTogglesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketTogglesDto.writeToParcel(parcel, i);
        }
        MarketOwnerTypeDto marketOwnerTypeDto = this.marketType;
        if (marketOwnerTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOwnerTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.buttonSiteOpenEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.videoEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num3 = this.itemsCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.unviewedOrdersCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        MarketCitySettingsDto marketCitySettingsDto = this.cities;
        if (marketCitySettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCitySettingsDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.canMessage;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Integer num5 = this.stockMode;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.commentsEnabled;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeParcelable(this.minOrderPrice, i);
        MarketCurrencySettingsDto marketCurrencySettingsDto = this.currency;
        if (marketCurrencySettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCurrencySettingsDto.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.enabled;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        MarketSettingsButtonsDto marketSettingsButtonsDto = this.buttons;
        if (marketSettingsButtonsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsButtonsDto.writeToParcel(parcel, i);
        }
        MarketShopConditionsDto marketShopConditionsDto = this.shopConditions;
        if (marketShopConditionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketShopConditionsDto.writeToParcel(parcel, i);
        }
        Boolean bool6 = this.viewedProductsEnabled;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.marketItemsAutopromotionLink);
        Boolean bool7 = this.admin2faCheckFail;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        MarketSettingsServicesDto marketSettingsServicesDto = this.services;
        if (marketSettingsServicesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsServicesDto.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.canLaunchAutopromotion;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        MarketSettingsGoodsDto marketSettingsGoodsDto = this.goods;
        if (marketSettingsGoodsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSettingsGoodsDto.writeToParcel(parcel, i);
        }
    }

    public MarketSettingsDto(MarketSettingsGroupDto marketSettingsGroupDto, MarketSettingsPaymentsDto marketSettingsPaymentsDto, MarketSettingsAtolPaymentsDto marketSettingsAtolPaymentsDto, MarketSettingsDeliveryDto marketSettingsDeliveryDto, MarketSettingsOrdersDto marketSettingsOrdersDto, Integer num, Integer num2, Boolean bool, MarketTogglesDto marketTogglesDto, MarketOwnerTypeDto marketOwnerTypeDto, Boolean bool2, Boolean bool3, Integer num3, Integer num4, MarketCitySettingsDto marketCitySettingsDto, Boolean bool4, Integer num5, Integer num6, MarketPriceDto marketPriceDto, MarketCurrencySettingsDto marketCurrencySettingsDto, Boolean bool5, MarketSettingsButtonsDto marketSettingsButtonsDto, MarketShopConditionsDto marketShopConditionsDto, Boolean bool6, String str, Boolean bool7, MarketSettingsServicesDto marketSettingsServicesDto, Boolean bool8, MarketSettingsGoodsDto marketSettingsGoodsDto) {
        this.group = marketSettingsGroupDto;
        this.payments = marketSettingsPaymentsDto;
        this.atolPayments = marketSettingsAtolPaymentsDto;
        this.delivery = marketSettingsDeliveryDto;
        this.orders = marketSettingsOrdersDto;
        this.albumsLimit = num;
        this.albumsCount = num2;
        this.hasAlbumsV2Intro = bool;
        this.toogles = marketTogglesDto;
        this.marketType = marketOwnerTypeDto;
        this.buttonSiteOpenEnabled = bool2;
        this.videoEnabled = bool3;
        this.itemsCount = num3;
        this.unviewedOrdersCount = num4;
        this.cities = marketCitySettingsDto;
        this.canMessage = bool4;
        this.stockMode = num5;
        this.commentsEnabled = num6;
        this.minOrderPrice = marketPriceDto;
        this.currency = marketCurrencySettingsDto;
        this.enabled = bool5;
        this.buttons = marketSettingsButtonsDto;
        this.shopConditions = marketShopConditionsDto;
        this.viewedProductsEnabled = bool6;
        this.marketItemsAutopromotionLink = str;
        this.admin2faCheckFail = bool7;
        this.services = marketSettingsServicesDto;
        this.canLaunchAutopromotion = bool8;
        this.goods = marketSettingsGoodsDto;
    }

    public /* synthetic */ MarketSettingsDto(MarketSettingsGroupDto marketSettingsGroupDto, MarketSettingsPaymentsDto marketSettingsPaymentsDto, MarketSettingsAtolPaymentsDto marketSettingsAtolPaymentsDto, MarketSettingsDeliveryDto marketSettingsDeliveryDto, MarketSettingsOrdersDto marketSettingsOrdersDto, Integer num, Integer num2, Boolean bool, MarketTogglesDto marketTogglesDto, MarketOwnerTypeDto marketOwnerTypeDto, Boolean bool2, Boolean bool3, Integer num3, Integer num4, MarketCitySettingsDto marketCitySettingsDto, Boolean bool4, Integer num5, Integer num6, MarketPriceDto marketPriceDto, MarketCurrencySettingsDto marketCurrencySettingsDto, Boolean bool5, MarketSettingsButtonsDto marketSettingsButtonsDto, MarketShopConditionsDto marketShopConditionsDto, Boolean bool6, String str, Boolean bool7, MarketSettingsServicesDto marketSettingsServicesDto, Boolean bool8, MarketSettingsGoodsDto marketSettingsGoodsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketSettingsGroupDto, (i & 2) != 0 ? null : marketSettingsPaymentsDto, (i & 4) != 0 ? null : marketSettingsAtolPaymentsDto, (i & 8) != 0 ? null : marketSettingsDeliveryDto, (i & 16) != 0 ? null : marketSettingsOrdersDto, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : marketTogglesDto, (i & 512) != 0 ? null : marketOwnerTypeDto, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : marketCitySettingsDto, (i & 32768) != 0 ? null : bool4, (i & 65536) != 0 ? null : num5, (i & 131072) != 0 ? null : num6, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : marketPriceDto, (i & 524288) != 0 ? null : marketCurrencySettingsDto, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool5, (i & 2097152) != 0 ? null : marketSettingsButtonsDto, (i & 4194304) != 0 ? null : marketShopConditionsDto, (i & 8388608) != 0 ? null : bool6, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str, (i & 33554432) != 0 ? null : bool7, (i & 67108864) != 0 ? null : marketSettingsServicesDto, (i & 134217728) != 0 ? null : bool8, (i & 268435456) != 0 ? null : marketSettingsGoodsDto);
    }
}
