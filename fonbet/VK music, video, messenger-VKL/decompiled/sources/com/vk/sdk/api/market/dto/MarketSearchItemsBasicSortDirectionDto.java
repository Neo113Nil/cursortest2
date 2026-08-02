package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchItemsBasicSortDirectionDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchItemsBasicSortDirectionDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchItemsBasicSortDirectionDto[] $VALUES;

    @pmi0("0")
    public static final MarketSearchItemsBasicSortDirectionDto TYPE_0;

    @pmi0("1")
    public static final MarketSearchItemsBasicSortDirectionDto TYPE_1;
    private final int value;

    static {
        MarketSearchItemsBasicSortDirectionDto marketSearchItemsBasicSortDirectionDto = new MarketSearchItemsBasicSortDirectionDto("TYPE_0", 0, 0);
        TYPE_0 = marketSearchItemsBasicSortDirectionDto;
        MarketSearchItemsBasicSortDirectionDto marketSearchItemsBasicSortDirectionDto2 = new MarketSearchItemsBasicSortDirectionDto("TYPE_1", 1, 1);
        TYPE_1 = marketSearchItemsBasicSortDirectionDto2;
        MarketSearchItemsBasicSortDirectionDto[] marketSearchItemsBasicSortDirectionDtoArr = {marketSearchItemsBasicSortDirectionDto, marketSearchItemsBasicSortDirectionDto2};
        $VALUES = marketSearchItemsBasicSortDirectionDtoArr;
        $ENTRIES = new asp(marketSearchItemsBasicSortDirectionDtoArr);
    }

    private MarketSearchItemsBasicSortDirectionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchItemsBasicSortDirectionDto valueOf(String str) {
        return (MarketSearchItemsBasicSortDirectionDto) Enum.valueOf(MarketSearchItemsBasicSortDirectionDto.class, str);
    }

    public static MarketSearchItemsBasicSortDirectionDto[] values() {
        return (MarketSearchItemsBasicSortDirectionDto[]) $VALUES.clone();
    }
}
