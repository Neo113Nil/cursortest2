package com.vk.sdk.api.base.dto;

import com.vk.sdk.api.market.dto.MarketPriceDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkProductDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkProductDto {

    @pmi0("merchant")
    private final String merchant;

    @pmi0("orders_count")
    private final Integer ordersCount;

    @pmi0("price")
    private final MarketPriceDto price;

    @pmi0("type")
    private final String type;

    public BaseLinkProductDto(MarketPriceDto marketPriceDto, String str, Integer num, String str2) {
        this.price = marketPriceDto;
        this.merchant = str;
        this.ordersCount = num;
        this.type = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkProductDto)) {
            return false;
        }
        BaseLinkProductDto baseLinkProductDto = (BaseLinkProductDto) obj;
        return epx.f(this.price, baseLinkProductDto.price) && epx.f(this.merchant, baseLinkProductDto.merchant) && epx.f(this.ordersCount, baseLinkProductDto.ordersCount) && epx.f(this.type, baseLinkProductDto.type);
    }

    public final int hashCode() {
        int hashCode = this.price.hashCode() * 31;
        String str = this.merchant;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.ordersCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.type;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLinkProductDto(price=" + this.price + ", merchant=" + this.merchant + ", ordersCount=" + this.ordersCount + ", type=" + this.type + ")";
    }

    public /* synthetic */ BaseLinkProductDto(MarketPriceDto marketPriceDto, String str, Integer num, String str2, int i, zcl zclVar) {
        this(marketPriceDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
    }
}
