package com.vk.sdk.api.market.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketEditOrderPaymentStatusDto.kt */
/* loaded from: classes5.dex */
public final class MarketEditOrderPaymentStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketEditOrderPaymentStatusDto[] $VALUES;

    @pmi0("not_paid")
    public static final MarketEditOrderPaymentStatusDto NOT_PAID;

    @pmi0("paid")
    public static final MarketEditOrderPaymentStatusDto PAID;

    @pmi0("returned")
    public static final MarketEditOrderPaymentStatusDto RETURNED;
    private final String value;

    static {
        MarketEditOrderPaymentStatusDto marketEditOrderPaymentStatusDto = new MarketEditOrderPaymentStatusDto("NOT_PAID", 0, "not_paid");
        NOT_PAID = marketEditOrderPaymentStatusDto;
        MarketEditOrderPaymentStatusDto marketEditOrderPaymentStatusDto2 = new MarketEditOrderPaymentStatusDto("PAID", 1, "paid");
        PAID = marketEditOrderPaymentStatusDto2;
        MarketEditOrderPaymentStatusDto marketEditOrderPaymentStatusDto3 = new MarketEditOrderPaymentStatusDto("RETURNED", 2, "returned");
        RETURNED = marketEditOrderPaymentStatusDto3;
        MarketEditOrderPaymentStatusDto[] marketEditOrderPaymentStatusDtoArr = {marketEditOrderPaymentStatusDto, marketEditOrderPaymentStatusDto2, marketEditOrderPaymentStatusDto3};
        $VALUES = marketEditOrderPaymentStatusDtoArr;
        $ENTRIES = new asp(marketEditOrderPaymentStatusDtoArr);
    }

    private MarketEditOrderPaymentStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MarketEditOrderPaymentStatusDto valueOf(String str) {
        return (MarketEditOrderPaymentStatusDto) Enum.valueOf(MarketEditOrderPaymentStatusDto.class, str);
    }

    public static MarketEditOrderPaymentStatusDto[] values() {
        return (MarketEditOrderPaymentStatusDto[]) $VALUES.clone();
    }
}
