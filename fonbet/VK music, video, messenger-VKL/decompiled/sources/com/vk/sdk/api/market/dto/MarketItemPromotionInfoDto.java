package com.vk.sdk.api.market.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketItemPromotionInfoDto.kt */
/* loaded from: classes5.dex */
public final class MarketItemPromotionInfoDto {

    @pmi0("is_available")
    private final Boolean isAvailable;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketItemPromotionInfoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketItemPromotionInfoDto) && epx.f(this.isAvailable, ((MarketItemPromotionInfoDto) obj).isAvailable);
    }

    public final int hashCode() {
        Boolean bool = this.isAvailable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "MarketItemPromotionInfoDto(isAvailable=" + this.isAvailable + ")";
    }

    public MarketItemPromotionInfoDto(Boolean bool) {
        this.isAvailable = bool;
    }

    public /* synthetic */ MarketItemPromotionInfoDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
