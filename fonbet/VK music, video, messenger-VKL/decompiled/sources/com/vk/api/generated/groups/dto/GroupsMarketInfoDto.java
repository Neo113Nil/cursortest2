package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsMarketInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMarketInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMarketInfoDto> CREATOR = new a();

    @pmi0("avito_badge")
    private final GroupsMarketAvitoBadgeDto avitoBadge;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("currency_text")
    private final String currencyText;

    @pmi0("delivery_info")
    private final List<GroupsMarketDeliveryInfoDto> deliveryInfo;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("integration_type")
    private final MarketIntegrationsTypeDto integrationType;

    @pmi0("is_community_manage_enabled")
    private final BaseBoolIntDto isCommunityManageEnabled;

    @pmi0("is_corporate")
    private final Boolean isCorporate;

    @pmi0("is_use_simplified_showcase")
    private final Boolean isUseSimplifiedShowcase;

    @pmi0("main_album_id")
    private final Integer mainAlbumId;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("price_max")
    private final String priceMax;

    @pmi0("price_min")
    private final String priceMin;

    @pmi0("shop_conditions")
    private final GroupsSettingsMarketShopConditionsDto shopConditions;

    @pmi0("trust_marks")
    private final GroupsTrustMarksListDto trustMarks;

    @pmi0("type")
    private final String type;

    @pmi0("unviewed_orders_count")
    private final Integer unviewedOrdersCount;

    @pmi0("viewed_products_enabled")
    private final Boolean viewedProductsEnabled;

    @pmi0("wiki")
    private final PagesWikipageFullDto wiki;

    /* compiled from: GroupsMarketInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMarketInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMarketInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String str;
            Integer num;
            ArrayList arrayList;
            MarketCurrencyDto marketCurrencyDto;
            Boolean valueOf2;
            Boolean valueOf3;
            String readString = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketCurrencyDto createFromParcel = parcel.readInt() == 0 ? null : MarketCurrencyDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            BaseBoolIntDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            Integer num2 = valueOf5;
            String readString4 = parcel.readString();
            MarketPriceDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketPriceDto.CREATOR.createFromParcel(parcel);
            PagesWikipageFullDto createFromParcel4 = parcel.readInt() == 0 ? null : PagesWikipageFullDto.CREATOR.createFromParcel(parcel);
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseBoolIntDto createFromParcel5 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            GroupsTrustMarksListDto createFromParcel6 = parcel.readInt() == 0 ? null : GroupsTrustMarksListDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsSettingsMarketShopConditionsDto createFromParcel7 = parcel.readInt() == 0 ? null : GroupsSettingsMarketShopConditionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = readString;
                num = valueOf4;
                marketCurrencyDto = createFromParcel;
                arrayList = null;
            } else {
                str = readString;
                int readInt = parcel.readInt();
                num = valueOf4;
                arrayList = new ArrayList(readInt);
                marketCurrencyDto = createFromParcel;
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsMarketDeliveryInfoDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                    readString2 = readString2;
                }
            }
            String str2 = readString2;
            GroupsMarketAvitoBadgeDto createFromParcel8 = parcel.readInt() == 0 ? null : GroupsMarketAvitoBadgeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsMarketInfoDto(str, num, marketCurrencyDto, str2, createFromParcel2, num2, readString3, readString4, createFromParcel3, createFromParcel4, valueOf6, createFromParcel5, createFromParcel6, valueOf, createFromParcel7, arrayList, createFromParcel8, valueOf2, valueOf3, parcel.readInt() == 0 ? null : MarketIntegrationsTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMarketInfoDto[] newArray(int i) {
            return new GroupsMarketInfoDto[i];
        }
    }

    public GroupsMarketInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final GroupsMarketAvitoBadgeDto d() {
        return this.avitoBadge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.contactId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMarketInfoDto)) {
            return false;
        }
        GroupsMarketInfoDto groupsMarketInfoDto = (GroupsMarketInfoDto) obj;
        return epx.f(this.type, groupsMarketInfoDto.type) && epx.f(this.contactId, groupsMarketInfoDto.contactId) && epx.f(this.currency, groupsMarketInfoDto.currency) && epx.f(this.currencyText, groupsMarketInfoDto.currencyText) && this.enabled == groupsMarketInfoDto.enabled && epx.f(this.mainAlbumId, groupsMarketInfoDto.mainAlbumId) && epx.f(this.priceMax, groupsMarketInfoDto.priceMax) && epx.f(this.priceMin, groupsMarketInfoDto.priceMin) && epx.f(this.minOrderPrice, groupsMarketInfoDto.minOrderPrice) && epx.f(this.wiki, groupsMarketInfoDto.wiki) && epx.f(this.unviewedOrdersCount, groupsMarketInfoDto.unviewedOrdersCount) && this.isCommunityManageEnabled == groupsMarketInfoDto.isCommunityManageEnabled && epx.f(this.trustMarks, groupsMarketInfoDto.trustMarks) && epx.f(this.isUseSimplifiedShowcase, groupsMarketInfoDto.isUseSimplifiedShowcase) && epx.f(this.shopConditions, groupsMarketInfoDto.shopConditions) && epx.f(this.deliveryInfo, groupsMarketInfoDto.deliveryInfo) && epx.f(this.avitoBadge, groupsMarketInfoDto.avitoBadge) && epx.f(this.viewedProductsEnabled, groupsMarketInfoDto.viewedProductsEnabled) && epx.f(this.isCorporate, groupsMarketInfoDto.isCorporate) && this.integrationType == groupsMarketInfoDto.integrationType;
    }

    public final MarketCurrencyDto f() {
        return this.currency;
    }

    public final String g() {
        return this.currencyText;
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.contactId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarketCurrencyDto marketCurrencyDto = this.currency;
        int hashCode3 = (hashCode2 + (marketCurrencyDto == null ? 0 : marketCurrencyDto.hashCode())) * 31;
        String str2 = this.currencyText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.enabled;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num2 = this.mainAlbumId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.priceMax;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceMin;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        int hashCode9 = (hashCode8 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        PagesWikipageFullDto pagesWikipageFullDto = this.wiki;
        int hashCode10 = (hashCode9 + (pagesWikipageFullDto == null ? 0 : pagesWikipageFullDto.hashCode())) * 31;
        Integer num3 = this.unviewedOrdersCount;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isCommunityManageEnabled;
        int hashCode12 = (hashCode11 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        GroupsTrustMarksListDto groupsTrustMarksListDto = this.trustMarks;
        int hashCode13 = (hashCode12 + (groupsTrustMarksListDto == null ? 0 : groupsTrustMarksListDto.hashCode())) * 31;
        Boolean bool = this.isUseSimplifiedShowcase;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto = this.shopConditions;
        int hashCode15 = (hashCode14 + (groupsSettingsMarketShopConditionsDto == null ? 0 : groupsSettingsMarketShopConditionsDto.hashCode())) * 31;
        List<GroupsMarketDeliveryInfoDto> list = this.deliveryInfo;
        int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsMarketAvitoBadgeDto groupsMarketAvitoBadgeDto = this.avitoBadge;
        int hashCode17 = (hashCode16 + (groupsMarketAvitoBadgeDto == null ? 0 : groupsMarketAvitoBadgeDto.hashCode())) * 31;
        Boolean bool2 = this.viewedProductsEnabled;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCorporate;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        return hashCode19 + (marketIntegrationsTypeDto != null ? marketIntegrationsTypeDto.hashCode() : 0);
    }

    public final List<GroupsMarketDeliveryInfoDto> i() {
        return this.deliveryInfo;
    }

    public final MarketIntegrationsTypeDto j() {
        return this.integrationType;
    }

    public final MarketPriceDto k() {
        return this.minOrderPrice;
    }

    public final GroupsTrustMarksListDto l() {
        return this.trustMarks;
    }

    public final PagesWikipageFullDto n() {
        return this.wiki;
    }

    public final String toString() {
        return "GroupsMarketInfoDto(type=" + this.type + ", contactId=" + this.contactId + ", currency=" + this.currency + ", currencyText=" + this.currencyText + ", enabled=" + this.enabled + ", mainAlbumId=" + this.mainAlbumId + ", priceMax=" + this.priceMax + ", priceMin=" + this.priceMin + ", minOrderPrice=" + this.minOrderPrice + ", wiki=" + this.wiki + ", unviewedOrdersCount=" + this.unviewedOrdersCount + ", isCommunityManageEnabled=" + this.isCommunityManageEnabled + ", trustMarks=" + this.trustMarks + ", isUseSimplifiedShowcase=" + this.isUseSimplifiedShowcase + ", shopConditions=" + this.shopConditions + ", deliveryInfo=" + this.deliveryInfo + ", avitoBadge=" + this.avitoBadge + ", viewedProductsEnabled=" + this.viewedProductsEnabled + ", isCorporate=" + this.isCorporate + ", integrationType=" + this.integrationType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Integer num = this.contactId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        MarketCurrencyDto marketCurrencyDto = this.currency;
        if (marketCurrencyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCurrencyDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.currencyText);
        BaseBoolIntDto baseBoolIntDto = this.enabled;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.mainAlbumId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.priceMax);
        parcel.writeString(this.priceMin);
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        if (marketPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPriceDto.writeToParcel(parcel, i);
        }
        PagesWikipageFullDto pagesWikipageFullDto = this.wiki;
        if (pagesWikipageFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pagesWikipageFullDto.writeToParcel(parcel, i);
        }
        Integer num3 = this.unviewedOrdersCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.isCommunityManageEnabled;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        GroupsTrustMarksListDto groupsTrustMarksListDto = this.trustMarks;
        if (groupsTrustMarksListDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTrustMarksListDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isUseSimplifiedShowcase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto = this.shopConditions;
        if (groupsSettingsMarketShopConditionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSettingsMarketShopConditionsDto.writeToParcel(parcel, i);
        }
        List<GroupsMarketDeliveryInfoDto> list = this.deliveryInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsMarketDeliveryInfoDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GroupsMarketAvitoBadgeDto groupsMarketAvitoBadgeDto = this.avitoBadge;
        if (groupsMarketAvitoBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMarketAvitoBadgeDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.viewedProductsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCorporate;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        MarketIntegrationsTypeDto marketIntegrationsTypeDto = this.integrationType;
        if (marketIntegrationsTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketIntegrationsTypeDto.writeToParcel(parcel, i);
        }
    }

    public GroupsMarketInfoDto(String str, Integer num, MarketCurrencyDto marketCurrencyDto, String str2, BaseBoolIntDto baseBoolIntDto, Integer num2, String str3, String str4, MarketPriceDto marketPriceDto, PagesWikipageFullDto pagesWikipageFullDto, Integer num3, BaseBoolIntDto baseBoolIntDto2, GroupsTrustMarksListDto groupsTrustMarksListDto, Boolean bool, GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto, List<GroupsMarketDeliveryInfoDto> list, GroupsMarketAvitoBadgeDto groupsMarketAvitoBadgeDto, Boolean bool2, Boolean bool3, MarketIntegrationsTypeDto marketIntegrationsTypeDto) {
        this.type = str;
        this.contactId = num;
        this.currency = marketCurrencyDto;
        this.currencyText = str2;
        this.enabled = baseBoolIntDto;
        this.mainAlbumId = num2;
        this.priceMax = str3;
        this.priceMin = str4;
        this.minOrderPrice = marketPriceDto;
        this.wiki = pagesWikipageFullDto;
        this.unviewedOrdersCount = num3;
        this.isCommunityManageEnabled = baseBoolIntDto2;
        this.trustMarks = groupsTrustMarksListDto;
        this.isUseSimplifiedShowcase = bool;
        this.shopConditions = groupsSettingsMarketShopConditionsDto;
        this.deliveryInfo = list;
        this.avitoBadge = groupsMarketAvitoBadgeDto;
        this.viewedProductsEnabled = bool2;
        this.isCorporate = bool3;
        this.integrationType = marketIntegrationsTypeDto;
    }

    public /* synthetic */ GroupsMarketInfoDto(String str, Integer num, MarketCurrencyDto marketCurrencyDto, String str2, BaseBoolIntDto baseBoolIntDto, Integer num2, String str3, String str4, MarketPriceDto marketPriceDto, PagesWikipageFullDto pagesWikipageFullDto, Integer num3, BaseBoolIntDto baseBoolIntDto2, GroupsTrustMarksListDto groupsTrustMarksListDto, Boolean bool, GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto, List list, GroupsMarketAvitoBadgeDto groupsMarketAvitoBadgeDto, Boolean bool2, Boolean bool3, MarketIntegrationsTypeDto marketIntegrationsTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : marketCurrencyDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : baseBoolIntDto, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : marketPriceDto, (i & 512) != 0 ? null : pagesWikipageFullDto, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : baseBoolIntDto2, (i & 4096) != 0 ? null : groupsTrustMarksListDto, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : groupsSettingsMarketShopConditionsDto, (i & 32768) != 0 ? null : list, (i & 65536) != 0 ? null : groupsMarketAvitoBadgeDto, (i & 131072) != 0 ? null : bool2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool3, (i & 524288) != 0 ? null : marketIntegrationsTypeDto);
    }
}
