package com.vk.sdk.api.market.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: MarketAddResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketAddResponseDto {

    @pmi0("market_item_id")
    private final int marketItemId;

    public MarketAddResponseDto(int i) {
        this.marketItemId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketAddResponseDto) && this.marketItemId == ((MarketAddResponseDto) obj).marketItemId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.marketItemId);
    }

    public final String toString() {
        return tgw.b(this.marketItemId, "MarketAddResponseDto(marketItemId=", ")");
    }
}
