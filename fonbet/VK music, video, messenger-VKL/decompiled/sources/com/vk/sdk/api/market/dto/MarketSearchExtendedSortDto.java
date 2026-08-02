package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchExtendedSortDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchExtendedSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchExtendedSortDto[] $VALUES;

    @pmi0("1")
    public static final MarketSearchExtendedSortDto DATE;

    @pmi0("0")
    public static final MarketSearchExtendedSortDto DEFAULT;

    @pmi0("2")
    public static final MarketSearchExtendedSortDto PRICE;

    @pmi0("3")
    public static final MarketSearchExtendedSortDto RELEVANCE;
    private final int value;

    static {
        MarketSearchExtendedSortDto marketSearchExtendedSortDto = new MarketSearchExtendedSortDto("DEFAULT", 0, 0);
        DEFAULT = marketSearchExtendedSortDto;
        MarketSearchExtendedSortDto marketSearchExtendedSortDto2 = new MarketSearchExtendedSortDto("DATE", 1, 1);
        DATE = marketSearchExtendedSortDto2;
        MarketSearchExtendedSortDto marketSearchExtendedSortDto3 = new MarketSearchExtendedSortDto("PRICE", 2, 2);
        PRICE = marketSearchExtendedSortDto3;
        MarketSearchExtendedSortDto marketSearchExtendedSortDto4 = new MarketSearchExtendedSortDto("RELEVANCE", 3, 3);
        RELEVANCE = marketSearchExtendedSortDto4;
        MarketSearchExtendedSortDto[] marketSearchExtendedSortDtoArr = {marketSearchExtendedSortDto, marketSearchExtendedSortDto2, marketSearchExtendedSortDto3, marketSearchExtendedSortDto4};
        $VALUES = marketSearchExtendedSortDtoArr;
        $ENTRIES = new asp(marketSearchExtendedSortDtoArr);
    }

    private MarketSearchExtendedSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchExtendedSortDto valueOf(String str) {
        return (MarketSearchExtendedSortDto) Enum.valueOf(MarketSearchExtendedSortDto.class, str);
    }

    public static MarketSearchExtendedSortDto[] values() {
        return (MarketSearchExtendedSortDto[]) $VALUES.clone();
    }
}
