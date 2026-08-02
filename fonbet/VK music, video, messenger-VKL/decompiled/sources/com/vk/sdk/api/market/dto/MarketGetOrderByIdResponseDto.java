package com.vk.sdk.api.market.dto;

import com.ironsource.C4504q2;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetOrderByIdResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketGetOrderByIdResponseDto {

    @pmi0(C4504q2.u)
    private final MarketOrderDto order;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGetOrderByIdResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketGetOrderByIdResponseDto) && epx.f(this.order, ((MarketGetOrderByIdResponseDto) obj).order);
    }

    public final int hashCode() {
        MarketOrderDto marketOrderDto = this.order;
        if (marketOrderDto == null) {
            return 0;
        }
        return marketOrderDto.hashCode();
    }

    public final String toString() {
        return "MarketGetOrderByIdResponseDto(order=" + this.order + ")";
    }

    public MarketGetOrderByIdResponseDto(MarketOrderDto marketOrderDto) {
        this.order = marketOrderDto;
    }

    public /* synthetic */ MarketGetOrderByIdResponseDto(MarketOrderDto marketOrderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketOrderDto);
    }
}
