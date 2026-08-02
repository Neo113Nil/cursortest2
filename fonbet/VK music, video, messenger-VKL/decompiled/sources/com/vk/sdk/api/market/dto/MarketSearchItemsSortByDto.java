package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchItemsSortByDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchItemsSortByDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchItemsSortByDto[] $VALUES;

    @pmi0("1")
    public static final MarketSearchItemsSortByDto DATE;

    @pmi0("2")
    public static final MarketSearchItemsSortByDto PRICE;

    @pmi0("3")
    public static final MarketSearchItemsSortByDto RELEVANCE;
    private final int value;

    static {
        MarketSearchItemsSortByDto marketSearchItemsSortByDto = new MarketSearchItemsSortByDto("DATE", 0, 1);
        DATE = marketSearchItemsSortByDto;
        MarketSearchItemsSortByDto marketSearchItemsSortByDto2 = new MarketSearchItemsSortByDto("PRICE", 1, 2);
        PRICE = marketSearchItemsSortByDto2;
        MarketSearchItemsSortByDto marketSearchItemsSortByDto3 = new MarketSearchItemsSortByDto("RELEVANCE", 2, 3);
        RELEVANCE = marketSearchItemsSortByDto3;
        MarketSearchItemsSortByDto[] marketSearchItemsSortByDtoArr = {marketSearchItemsSortByDto, marketSearchItemsSortByDto2, marketSearchItemsSortByDto3};
        $VALUES = marketSearchItemsSortByDtoArr;
        $ENTRIES = new asp(marketSearchItemsSortByDtoArr);
    }

    private MarketSearchItemsSortByDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchItemsSortByDto valueOf(String str) {
        return (MarketSearchItemsSortByDto) Enum.valueOf(MarketSearchItemsSortByDto.class, str);
    }

    public static MarketSearchItemsSortByDto[] values() {
        return (MarketSearchItemsSortByDto[]) $VALUES.clone();
    }
}
