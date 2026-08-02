package com.vk.sdk.api.market.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketMarketItemAvailabilityDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketItemAvailabilityDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MarketMarketItemAvailabilityDto[] $VALUES;

    @pmi0("0")
    public static final MarketMarketItemAvailabilityDto AVAILABLE;

    @pmi0("1")
    public static final MarketMarketItemAvailabilityDto REMOVED;

    @pmi0("2")
    public static final MarketMarketItemAvailabilityDto UNAVAILABLE;
    private final int value;

    static {
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = new MarketMarketItemAvailabilityDto("AVAILABLE", 0, 0);
        AVAILABLE = marketMarketItemAvailabilityDto;
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto2 = new MarketMarketItemAvailabilityDto(SignalingProtocol.HUNGUP_REASON_REMOVED, 1, 1);
        REMOVED = marketMarketItemAvailabilityDto2;
        MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto3 = new MarketMarketItemAvailabilityDto("UNAVAILABLE", 2, 2);
        UNAVAILABLE = marketMarketItemAvailabilityDto3;
        MarketMarketItemAvailabilityDto[] marketMarketItemAvailabilityDtoArr = {marketMarketItemAvailabilityDto, marketMarketItemAvailabilityDto2, marketMarketItemAvailabilityDto3};
        $VALUES = marketMarketItemAvailabilityDtoArr;
        $ENTRIES = new asp(marketMarketItemAvailabilityDtoArr);
    }

    private MarketMarketItemAvailabilityDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static MarketMarketItemAvailabilityDto valueOf(String str) {
        return (MarketMarketItemAvailabilityDto) Enum.valueOf(MarketMarketItemAvailabilityDto.class, str);
    }

    public static MarketMarketItemAvailabilityDto[] values() {
        return (MarketMarketItemAvailabilityDto[]) $VALUES.clone();
    }
}
