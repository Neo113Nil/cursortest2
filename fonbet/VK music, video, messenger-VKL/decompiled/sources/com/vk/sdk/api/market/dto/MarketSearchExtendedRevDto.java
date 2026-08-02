package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchExtendedRevDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchExtendedRevDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchExtendedRevDto[] $VALUES;

    @pmi0("0")
    public static final MarketSearchExtendedRevDto NORMAL;

    @pmi0("1")
    public static final MarketSearchExtendedRevDto REVERSE;
    private final int value;

    static {
        MarketSearchExtendedRevDto marketSearchExtendedRevDto = new MarketSearchExtendedRevDto("NORMAL", 0, 0);
        NORMAL = marketSearchExtendedRevDto;
        MarketSearchExtendedRevDto marketSearchExtendedRevDto2 = new MarketSearchExtendedRevDto("REVERSE", 1, 1);
        REVERSE = marketSearchExtendedRevDto2;
        MarketSearchExtendedRevDto[] marketSearchExtendedRevDtoArr = {marketSearchExtendedRevDto, marketSearchExtendedRevDto2};
        $VALUES = marketSearchExtendedRevDtoArr;
        $ENTRIES = new asp(marketSearchExtendedRevDtoArr);
    }

    private MarketSearchExtendedRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchExtendedRevDto valueOf(String str) {
        return (MarketSearchExtendedRevDto) Enum.valueOf(MarketSearchExtendedRevDto.class, str);
    }

    public static MarketSearchExtendedRevDto[] values() {
        return (MarketSearchExtendedRevDto[]) $VALUES.clone();
    }
}
