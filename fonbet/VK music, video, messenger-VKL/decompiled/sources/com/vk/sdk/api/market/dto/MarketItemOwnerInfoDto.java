package com.vk.sdk.api.market.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketItemOwnerInfoDto.kt */
/* loaded from: classes5.dex */
public final class MarketItemOwnerInfoDto {

    @pmi0("avatar")
    private final List<BaseImageDto> avatar;

    @pmi0("category")
    private final String category;

    @pmi0("category_url")
    private final String categoryUrl;

    @pmi0("is_corporated_market")
    private final Boolean isCorporatedMarket;

    @pmi0("market_type")
    private final MarketOwnerTypeDto marketType;

    @pmi0("name")
    private final String name;

    public MarketItemOwnerInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemOwnerInfoDto)) {
            return false;
        }
        MarketItemOwnerInfoDto marketItemOwnerInfoDto = (MarketItemOwnerInfoDto) obj;
        return epx.f(this.avatar, marketItemOwnerInfoDto.avatar) && epx.f(this.name, marketItemOwnerInfoDto.name) && epx.f(this.category, marketItemOwnerInfoDto.category) && epx.f(this.categoryUrl, marketItemOwnerInfoDto.categoryUrl) && epx.f(this.isCorporatedMarket, marketItemOwnerInfoDto.isCorporatedMarket) && this.marketType == marketItemOwnerInfoDto.marketType;
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.avatar;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isCorporatedMarket;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        MarketOwnerTypeDto marketOwnerTypeDto = this.marketType;
        return hashCode5 + (marketOwnerTypeDto != null ? marketOwnerTypeDto.hashCode() : 0);
    }

    public final String toString() {
        List<BaseImageDto> list = this.avatar;
        String str = this.name;
        String str2 = this.category;
        String str3 = this.categoryUrl;
        Boolean bool = this.isCorporatedMarket;
        MarketOwnerTypeDto marketOwnerTypeDto = this.marketType;
        StringBuilder sb = new StringBuilder("MarketItemOwnerInfoDto(avatar=");
        sb.append(list);
        sb.append(", name=");
        sb.append(str);
        sb.append(", category=");
        n6j.b(sb, str2, ", categoryUrl=", str3, ", isCorporatedMarket=");
        sb.append(bool);
        sb.append(", marketType=");
        sb.append(marketOwnerTypeDto);
        sb.append(")");
        return sb.toString();
    }

    public MarketItemOwnerInfoDto(List<BaseImageDto> list, String str, String str2, String str3, Boolean bool, MarketOwnerTypeDto marketOwnerTypeDto) {
        this.avatar = list;
        this.name = str;
        this.category = str2;
        this.categoryUrl = str3;
        this.isCorporatedMarket = bool;
        this.marketType = marketOwnerTypeDto;
    }

    public /* synthetic */ MarketItemOwnerInfoDto(List list, String str, String str2, String str3, Boolean bool, MarketOwnerTypeDto marketOwnerTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : marketOwnerTypeDto);
    }
}
