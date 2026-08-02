package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchItemsSortDirectionDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchItemsSortDirectionDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchItemsSortDirectionDto[] $VALUES;

    @pmi0("0")
    public static final MarketSearchItemsSortDirectionDto TYPE_0;

    @pmi0("1")
    public static final MarketSearchItemsSortDirectionDto TYPE_1;
    private final int value;

    static {
        MarketSearchItemsSortDirectionDto marketSearchItemsSortDirectionDto = new MarketSearchItemsSortDirectionDto("TYPE_0", 0, 0);
        TYPE_0 = marketSearchItemsSortDirectionDto;
        MarketSearchItemsSortDirectionDto marketSearchItemsSortDirectionDto2 = new MarketSearchItemsSortDirectionDto("TYPE_1", 1, 1);
        TYPE_1 = marketSearchItemsSortDirectionDto2;
        MarketSearchItemsSortDirectionDto[] marketSearchItemsSortDirectionDtoArr = {marketSearchItemsSortDirectionDto, marketSearchItemsSortDirectionDto2};
        $VALUES = marketSearchItemsSortDirectionDtoArr;
        $ENTRIES = new asp(marketSearchItemsSortDirectionDtoArr);
    }

    private MarketSearchItemsSortDirectionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchItemsSortDirectionDto valueOf(String str) {
        return (MarketSearchItemsSortDirectionDto) Enum.valueOf(MarketSearchItemsSortDirectionDto.class, str);
    }

    public static MarketSearchItemsSortDirectionDto[] values() {
        return (MarketSearchItemsSortDirectionDto[]) $VALUES.clone();
    }
}
