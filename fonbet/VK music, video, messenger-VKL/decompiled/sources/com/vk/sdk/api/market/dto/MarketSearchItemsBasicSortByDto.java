package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchItemsBasicSortByDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchItemsBasicSortByDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchItemsBasicSortByDto[] $VALUES;

    @pmi0("1")
    public static final MarketSearchItemsBasicSortByDto DATE;

    @pmi0("2")
    public static final MarketSearchItemsBasicSortByDto PRICE;

    @pmi0("3")
    public static final MarketSearchItemsBasicSortByDto RELEVANCE;
    private final int value;

    static {
        MarketSearchItemsBasicSortByDto marketSearchItemsBasicSortByDto = new MarketSearchItemsBasicSortByDto("DATE", 0, 1);
        DATE = marketSearchItemsBasicSortByDto;
        MarketSearchItemsBasicSortByDto marketSearchItemsBasicSortByDto2 = new MarketSearchItemsBasicSortByDto("PRICE", 1, 2);
        PRICE = marketSearchItemsBasicSortByDto2;
        MarketSearchItemsBasicSortByDto marketSearchItemsBasicSortByDto3 = new MarketSearchItemsBasicSortByDto("RELEVANCE", 2, 3);
        RELEVANCE = marketSearchItemsBasicSortByDto3;
        MarketSearchItemsBasicSortByDto[] marketSearchItemsBasicSortByDtoArr = {marketSearchItemsBasicSortByDto, marketSearchItemsBasicSortByDto2, marketSearchItemsBasicSortByDto3};
        $VALUES = marketSearchItemsBasicSortByDtoArr;
        $ENTRIES = new asp(marketSearchItemsBasicSortByDtoArr);
    }

    private MarketSearchItemsBasicSortByDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchItemsBasicSortByDto valueOf(String str) {
        return (MarketSearchItemsBasicSortByDto) Enum.valueOf(MarketSearchItemsBasicSortByDto.class, str);
    }

    public static MarketSearchItemsBasicSortByDto[] values() {
        return (MarketSearchItemsBasicSortByDto[]) $VALUES.clone();
    }
}
