package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketAvitoLinkStatusDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsSettingsMarketDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSettingsMarketDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSettingsMarketDto> CREATOR = new a();

    @pmi0("avito_community_link")
    private final MarketAvitoLinkStatusDto avitoCommunityLink;

    @pmi0("buttons")
    private final GroupsSettingsMarketButtonsDto buttons;

    @pmi0("can_message")
    private final BaseBoolIntDto canMessage;

    @pmi0("city_ids")
    private final List<Integer> cityIds;

    @pmi0("comments_enabled")
    private final Integer commentsEnabled;

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final Integer countryId;

    @pmi0("country_ids")
    private final List<Integer> countryIds;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("is_hs_enabled")
    private final Boolean isHsEnabled;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("shop_conditions")
    private final GroupsSettingsMarketShopConditionsDto shopConditions;

    @pmi0("type")
    private final GroupsMarketStateDto type;

    @pmi0("viewed_products_enabled")
    private final Boolean viewedProductsEnabled;

    @pmi0("wiki")
    private final Object wiki;

    /* compiled from: GroupsSettingsMarketDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSettingsMarketDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(GroupsSettingsMarketDto.class.getClassLoader());
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(GroupsSettingsMarketDto.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(GroupsSettingsMarketDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = pm0.b(parcel, arrayList2, i2, 1);
                }
            }
            MarketCurrencyDto marketCurrencyDto = (MarketCurrencyDto) parcel.readParcelable(GroupsSettingsMarketDto.class.getClassLoader());
            GroupsMarketStateDto createFromParcel = parcel.readInt() == 0 ? null : GroupsMarketStateDto.CREATOR.createFromParcel(parcel);
            Object readValue = parcel.readValue(GroupsSettingsMarketDto.class.getClassLoader());
            GroupsSettingsMarketButtonsDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsSettingsMarketButtonsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto = (GroupsSettingsMarketShopConditionsDto) parcel.readParcelable(GroupsSettingsMarketDto.class.getClassLoader());
            MarketAvitoLinkStatusDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketAvitoLinkStatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsSettingsMarketDto(baseBoolIntDto, arrayList, baseBoolIntDto2, valueOf2, valueOf3, valueOf4, marketPriceDto, arrayList2, marketCurrencyDto, createFromParcel, readValue, createFromParcel2, valueOf, groupsSettingsMarketShopConditionsDto, createFromParcel3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSettingsMarketDto[] newArray(int i) {
            return new GroupsSettingsMarketDto[i];
        }
    }

    public GroupsSettingsMarketDto(BaseBoolIntDto baseBoolIntDto, List<Integer> list, BaseBoolIntDto baseBoolIntDto2, Integer num, Integer num2, Integer num3, MarketPriceDto marketPriceDto, List<Integer> list2, MarketCurrencyDto marketCurrencyDto, GroupsMarketStateDto groupsMarketStateDto, Object obj, GroupsSettingsMarketButtonsDto groupsSettingsMarketButtonsDto, Boolean bool, GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto, MarketAvitoLinkStatusDto marketAvitoLinkStatusDto, Boolean bool2) {
        this.enabled = baseBoolIntDto;
        this.cityIds = list;
        this.canMessage = baseBoolIntDto2;
        this.commentsEnabled = num;
        this.contactId = num2;
        this.countryId = num3;
        this.minOrderPrice = marketPriceDto;
        this.countryIds = list2;
        this.currency = marketCurrencyDto;
        this.type = groupsMarketStateDto;
        this.wiki = obj;
        this.buttons = groupsSettingsMarketButtonsDto;
        this.isHsEnabled = bool;
        this.shopConditions = groupsSettingsMarketShopConditionsDto;
        this.avitoCommunityLink = marketAvitoLinkStatusDto;
        this.viewedProductsEnabled = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSettingsMarketDto)) {
            return false;
        }
        GroupsSettingsMarketDto groupsSettingsMarketDto = (GroupsSettingsMarketDto) obj;
        return this.enabled == groupsSettingsMarketDto.enabled && epx.f(this.cityIds, groupsSettingsMarketDto.cityIds) && this.canMessage == groupsSettingsMarketDto.canMessage && epx.f(this.commentsEnabled, groupsSettingsMarketDto.commentsEnabled) && epx.f(this.contactId, groupsSettingsMarketDto.contactId) && epx.f(this.countryId, groupsSettingsMarketDto.countryId) && epx.f(this.minOrderPrice, groupsSettingsMarketDto.minOrderPrice) && epx.f(this.countryIds, groupsSettingsMarketDto.countryIds) && epx.f(this.currency, groupsSettingsMarketDto.currency) && this.type == groupsSettingsMarketDto.type && epx.f(this.wiki, groupsSettingsMarketDto.wiki) && epx.f(this.buttons, groupsSettingsMarketDto.buttons) && epx.f(this.isHsEnabled, groupsSettingsMarketDto.isHsEnabled) && epx.f(this.shopConditions, groupsSettingsMarketDto.shopConditions) && epx.f(this.avitoCommunityLink, groupsSettingsMarketDto.avitoCommunityLink) && epx.f(this.viewedProductsEnabled, groupsSettingsMarketDto.viewedProductsEnabled);
    }

    public final int hashCode() {
        int hashCode = this.enabled.hashCode() * 31;
        List<Integer> list = this.cityIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canMessage;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.commentsEnabled;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.contactId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.countryId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        int hashCode7 = (hashCode6 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        List<Integer> list2 = this.countryIds;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketCurrencyDto marketCurrencyDto = this.currency;
        int hashCode9 = (hashCode8 + (marketCurrencyDto == null ? 0 : marketCurrencyDto.hashCode())) * 31;
        GroupsMarketStateDto groupsMarketStateDto = this.type;
        int hashCode10 = (hashCode9 + (groupsMarketStateDto == null ? 0 : groupsMarketStateDto.hashCode())) * 31;
        Object obj = this.wiki;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        GroupsSettingsMarketButtonsDto groupsSettingsMarketButtonsDto = this.buttons;
        int hashCode12 = (hashCode11 + (groupsSettingsMarketButtonsDto == null ? 0 : groupsSettingsMarketButtonsDto.hashCode())) * 31;
        Boolean bool = this.isHsEnabled;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto = this.shopConditions;
        int hashCode14 = (hashCode13 + (groupsSettingsMarketShopConditionsDto == null ? 0 : groupsSettingsMarketShopConditionsDto.hashCode())) * 31;
        MarketAvitoLinkStatusDto marketAvitoLinkStatusDto = this.avitoCommunityLink;
        int hashCode15 = (hashCode14 + (marketAvitoLinkStatusDto == null ? 0 : marketAvitoLinkStatusDto.hashCode())) * 31;
        Boolean bool2 = this.viewedProductsEnabled;
        return hashCode15 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSettingsMarketDto(enabled=");
        sb.append(this.enabled);
        sb.append(", cityIds=");
        sb.append(this.cityIds);
        sb.append(", canMessage=");
        sb.append(this.canMessage);
        sb.append(", commentsEnabled=");
        sb.append(this.commentsEnabled);
        sb.append(", contactId=");
        sb.append(this.contactId);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", minOrderPrice=");
        sb.append(this.minOrderPrice);
        sb.append(", countryIds=");
        sb.append(this.countryIds);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", wiki=");
        sb.append(this.wiki);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", isHsEnabled=");
        sb.append(this.isHsEnabled);
        sb.append(", shopConditions=");
        sb.append(this.shopConditions);
        sb.append(", avitoCommunityLink=");
        sb.append(this.avitoCommunityLink);
        sb.append(", viewedProductsEnabled=");
        return tn.a(sb, this.viewedProductsEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.enabled, i);
        List<Integer> list = this.cityIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeParcelable(this.canMessage, i);
        Integer num = this.commentsEnabled;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.contactId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.countryId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.minOrderPrice, i);
        List<Integer> list2 = this.countryIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        parcel.writeParcelable(this.currency, i);
        GroupsMarketStateDto groupsMarketStateDto = this.type;
        if (groupsMarketStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsMarketStateDto.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.wiki);
        GroupsSettingsMarketButtonsDto groupsSettingsMarketButtonsDto = this.buttons;
        if (groupsSettingsMarketButtonsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsSettingsMarketButtonsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isHsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.shopConditions, i);
        MarketAvitoLinkStatusDto marketAvitoLinkStatusDto = this.avitoCommunityLink;
        if (marketAvitoLinkStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketAvitoLinkStatusDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.viewedProductsEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ GroupsSettingsMarketDto(BaseBoolIntDto baseBoolIntDto, List list, BaseBoolIntDto baseBoolIntDto2, Integer num, Integer num2, Integer num3, MarketPriceDto marketPriceDto, List list2, MarketCurrencyDto marketCurrencyDto, GroupsMarketStateDto groupsMarketStateDto, Object obj, GroupsSettingsMarketButtonsDto groupsSettingsMarketButtonsDto, Boolean bool, GroupsSettingsMarketShopConditionsDto groupsSettingsMarketShopConditionsDto, MarketAvitoLinkStatusDto marketAvitoLinkStatusDto, Boolean bool2, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : baseBoolIntDto2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : marketPriceDto, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : marketCurrencyDto, (i & 512) != 0 ? null : groupsMarketStateDto, (i & 1024) != 0 ? null : obj, (i & 2048) != 0 ? null : groupsSettingsMarketButtonsDto, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : groupsSettingsMarketShopConditionsDto, (i & 16384) != 0 ? null : marketAvitoLinkStatusDto, (i & 32768) != 0 ? null : bool2);
    }
}
