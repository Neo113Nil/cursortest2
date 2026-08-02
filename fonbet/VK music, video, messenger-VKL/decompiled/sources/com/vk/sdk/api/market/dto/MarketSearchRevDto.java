package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketSearchRevDto.kt */
/* loaded from: classes5.dex */
public final class MarketSearchRevDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketSearchRevDto[] $VALUES;

    @pmi0("0")
    public static final MarketSearchRevDto NORMAL;

    @pmi0("1")
    public static final MarketSearchRevDto REVERSE;
    private final int value;

    static {
        MarketSearchRevDto marketSearchRevDto = new MarketSearchRevDto("NORMAL", 0, 0);
        NORMAL = marketSearchRevDto;
        MarketSearchRevDto marketSearchRevDto2 = new MarketSearchRevDto("REVERSE", 1, 1);
        REVERSE = marketSearchRevDto2;
        MarketSearchRevDto[] marketSearchRevDtoArr = {marketSearchRevDto, marketSearchRevDto2};
        $VALUES = marketSearchRevDtoArr;
        $ENTRIES = new asp(marketSearchRevDtoArr);
    }

    private MarketSearchRevDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketSearchRevDto valueOf(String str) {
        return (MarketSearchRevDto) Enum.valueOf(MarketSearchRevDto.class, str);
    }

    public static MarketSearchRevDto[] values() {
        return (MarketSearchRevDto[]) $VALUES.clone();
    }
}
