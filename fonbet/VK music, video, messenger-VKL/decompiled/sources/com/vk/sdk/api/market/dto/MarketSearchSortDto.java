package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchSortDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchSortDto[] $VALUES;

    @pmi0("1")
    public static final MarketSearchSortDto DATE;

    @pmi0("0")
    public static final MarketSearchSortDto DEFAULT;

    @pmi0("2")
    public static final MarketSearchSortDto PRICE;

    @pmi0("3")
    public static final MarketSearchSortDto RELEVANCE;
    private final int value;

    static {
        MarketSearchSortDto marketSearchSortDto = new MarketSearchSortDto("DEFAULT", 0, 0);
        DEFAULT = marketSearchSortDto;
        MarketSearchSortDto marketSearchSortDto2 = new MarketSearchSortDto("DATE", 1, 1);
        DATE = marketSearchSortDto2;
        MarketSearchSortDto marketSearchSortDto3 = new MarketSearchSortDto("PRICE", 2, 2);
        PRICE = marketSearchSortDto3;
        MarketSearchSortDto marketSearchSortDto4 = new MarketSearchSortDto("RELEVANCE", 3, 3);
        RELEVANCE = marketSearchSortDto4;
        MarketSearchSortDto[] marketSearchSortDtoArr = {marketSearchSortDto, marketSearchSortDto2, marketSearchSortDto3, marketSearchSortDto4};
        $VALUES = marketSearchSortDtoArr;
        $ENTRIES = new asp(marketSearchSortDtoArr);
    }

    private MarketSearchSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchSortDto valueOf(String str) {
        return (MarketSearchSortDto) Enum.valueOf(MarketSearchSortDto.class, str);
    }

    public static MarketSearchSortDto[] values() {
        return (MarketSearchSortDto[]) $VALUES.clone();
    }
}
