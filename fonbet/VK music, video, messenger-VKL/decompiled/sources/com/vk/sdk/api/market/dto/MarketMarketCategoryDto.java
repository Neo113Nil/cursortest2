package com.vk.sdk.api.market.dto;

import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketMarketCategoryDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketCategoryDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("section")
    private final MarketSectionDto section;

    public MarketMarketCategoryDto(int i, String str, MarketSectionDto marketSectionDto) {
        this.id = i;
        this.name = str;
        this.section = marketSectionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategoryDto)) {
            return false;
        }
        MarketMarketCategoryDto marketMarketCategoryDto = (MarketMarketCategoryDto) obj;
        return this.id == marketMarketCategoryDto.id && epx.f(this.name, marketMarketCategoryDto.name) && epx.f(this.section, marketMarketCategoryDto.section);
    }

    public final int hashCode() {
        return this.section.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        MarketSectionDto marketSectionDto = this.section;
        StringBuilder a = kh10.a(i, "MarketMarketCategoryDto(id=", ", name=", str, ", section=");
        a.append(marketSectionDto);
        a.append(")");
        return a.toString();
    }
}
