package com.vk.sdk.api.groups.dto;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.market.dto.MarketCurrencyDto;
import com.vk.sdk.api.market.dto.MarketPriceDto;
import xsna.epx;
import xsna.jq;
import xsna.mq;
import xsna.pmi0;
import xsna.to;
import xsna.zcl;

/* compiled from: GroupsMarketInfoDto.kt */
/* loaded from: classes5.dex */
public final class GroupsMarketInfoDto {

    @pmi0("contact_id")
    private final Integer contactId;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final MarketCurrencyDto currency;

    @pmi0("currency_text")
    private final String currencyText;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("is_show_header_items_link")
    private final BaseBoolIntDto isShowHeaderItemsLink;

    @pmi0("main_album_id")
    private final Integer mainAlbumId;

    @pmi0("min_order_price")
    private final MarketPriceDto minOrderPrice;

    @pmi0("price_max")
    private final String priceMax;

    @pmi0("price_min")
    private final String priceMin;

    @pmi0("type")
    private final String type;

    public GroupsMarketInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMarketInfoDto)) {
            return false;
        }
        GroupsMarketInfoDto groupsMarketInfoDto = (GroupsMarketInfoDto) obj;
        return epx.f(this.type, groupsMarketInfoDto.type) && epx.f(this.contactId, groupsMarketInfoDto.contactId) && epx.f(this.currency, groupsMarketInfoDto.currency) && epx.f(this.currencyText, groupsMarketInfoDto.currencyText) && this.isShowHeaderItemsLink == groupsMarketInfoDto.isShowHeaderItemsLink && this.enabled == groupsMarketInfoDto.enabled && epx.f(this.mainAlbumId, groupsMarketInfoDto.mainAlbumId) && epx.f(this.priceMax, groupsMarketInfoDto.priceMax) && epx.f(this.priceMin, groupsMarketInfoDto.priceMin) && epx.f(this.minOrderPrice, groupsMarketInfoDto.minOrderPrice);
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
        BaseBoolIntDto baseBoolIntDto = this.isShowHeaderItemsLink;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.enabled;
        int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num2 = this.mainAlbumId;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.priceMax;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceMin;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        return hashCode9 + (marketPriceDto != null ? marketPriceDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        Integer num = this.contactId;
        MarketCurrencyDto marketCurrencyDto = this.currency;
        String str2 = this.currencyText;
        BaseBoolIntDto baseBoolIntDto = this.isShowHeaderItemsLink;
        BaseBoolIntDto baseBoolIntDto2 = this.enabled;
        Integer num2 = this.mainAlbumId;
        String str3 = this.priceMax;
        String str4 = this.priceMin;
        MarketPriceDto marketPriceDto = this.minOrderPrice;
        StringBuilder d = jq.d(num, "GroupsMarketInfoDto(type=", str, ", contactId=", ", currency=");
        d.append(marketCurrencyDto);
        d.append(", currencyText=");
        d.append(str2);
        d.append(", isShowHeaderItemsLink=");
        to.b(d, baseBoolIntDto, ", enabled=", baseBoolIntDto2, ", mainAlbumId=");
        mq.b(num2, ", priceMax=", str3, ", priceMin=", d);
        d.append(str4);
        d.append(", minOrderPrice=");
        d.append(marketPriceDto);
        d.append(")");
        return d.toString();
    }

    public GroupsMarketInfoDto(String str, Integer num, MarketCurrencyDto marketCurrencyDto, String str2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num2, String str3, String str4, MarketPriceDto marketPriceDto) {
        this.type = str;
        this.contactId = num;
        this.currency = marketCurrencyDto;
        this.currencyText = str2;
        this.isShowHeaderItemsLink = baseBoolIntDto;
        this.enabled = baseBoolIntDto2;
        this.mainAlbumId = num2;
        this.priceMax = str3;
        this.priceMin = str4;
        this.minOrderPrice = marketPriceDto;
    }

    public /* synthetic */ GroupsMarketInfoDto(String str, Integer num, MarketCurrencyDto marketCurrencyDto, String str2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num2, String str3, String str4, MarketPriceDto marketPriceDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : marketCurrencyDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : baseBoolIntDto, (i & 32) != 0 ? null : baseBoolIntDto2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : marketPriceDto);
    }
}
