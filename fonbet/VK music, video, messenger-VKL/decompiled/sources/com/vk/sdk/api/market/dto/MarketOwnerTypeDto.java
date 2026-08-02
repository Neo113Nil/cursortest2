package com.vk.sdk.api.market.dto;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketOwnerTypeDto.kt */
/* loaded from: classes5.dex */
public final class MarketOwnerTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketOwnerTypeDto[] $VALUES;

    @pmi0("base")
    public static final MarketOwnerTypeDto BASE;

    @pmi0(C4217a2.e)
    public static final MarketOwnerTypeDto DISABLED;

    @pmi0("pro")
    public static final MarketOwnerTypeDto PRO;
    private final String value;

    static {
        MarketOwnerTypeDto marketOwnerTypeDto = new MarketOwnerTypeDto("BASE", 0, "base");
        BASE = marketOwnerTypeDto;
        MarketOwnerTypeDto marketOwnerTypeDto2 = new MarketOwnerTypeDto("PRO", 1, "pro");
        PRO = marketOwnerTypeDto2;
        MarketOwnerTypeDto marketOwnerTypeDto3 = new MarketOwnerTypeDto("DISABLED", 2, C4217a2.e);
        DISABLED = marketOwnerTypeDto3;
        MarketOwnerTypeDto[] marketOwnerTypeDtoArr = {marketOwnerTypeDto, marketOwnerTypeDto2, marketOwnerTypeDto3};
        $VALUES = marketOwnerTypeDtoArr;
        $ENTRIES = new asp(marketOwnerTypeDtoArr);
    }

    private MarketOwnerTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketOwnerTypeDto valueOf(String str) {
        return (MarketOwnerTypeDto) Enum.valueOf(MarketOwnerTypeDto.class, str);
    }

    public static MarketOwnerTypeDto[] values() {
        return (MarketOwnerTypeDto[]) $VALUES.clone();
    }
}
