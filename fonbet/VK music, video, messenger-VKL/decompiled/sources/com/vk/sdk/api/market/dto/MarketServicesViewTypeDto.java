package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketServicesViewTypeDto.kt */
/* loaded from: classes5.dex */
public final class MarketServicesViewTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketServicesViewTypeDto[] $VALUES;

    @pmi0("1")
    public static final MarketServicesViewTypeDto CARDS;

    @pmi0("2")
    public static final MarketServicesViewTypeDto ROWS;
    private final int value;

    static {
        MarketServicesViewTypeDto marketServicesViewTypeDto = new MarketServicesViewTypeDto("CARDS", 0, 1);
        CARDS = marketServicesViewTypeDto;
        MarketServicesViewTypeDto marketServicesViewTypeDto2 = new MarketServicesViewTypeDto("ROWS", 1, 2);
        ROWS = marketServicesViewTypeDto2;
        MarketServicesViewTypeDto[] marketServicesViewTypeDtoArr = {marketServicesViewTypeDto, marketServicesViewTypeDto2};
        $VALUES = marketServicesViewTypeDtoArr;
        $ENTRIES = new asp(marketServicesViewTypeDtoArr);
    }

    private MarketServicesViewTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketServicesViewTypeDto valueOf(String str) {
        return (MarketServicesViewTypeDto) Enum.valueOf(MarketServicesViewTypeDto.class, str);
    }

    public static MarketServicesViewTypeDto[] values() {
        return (MarketServicesViewTypeDto[]) $VALUES.clone();
    }
}
