package com.vk.sdk.api.market.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: MarketSectionDto.kt */
/* loaded from: classes5.dex */
public final class MarketSectionDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public MarketSectionDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSectionDto)) {
            return false;
        }
        MarketSectionDto marketSectionDto = (MarketSectionDto) obj;
        return this.id == marketSectionDto.id && epx.f(this.name, marketSectionDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "MarketSectionDto(id=", ", name=", this.name, ")");
    }
}
