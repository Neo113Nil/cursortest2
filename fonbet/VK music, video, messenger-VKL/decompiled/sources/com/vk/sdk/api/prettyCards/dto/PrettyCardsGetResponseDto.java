package com.vk.sdk.api.prettyCards.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: PrettyCardsGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class PrettyCardsGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<PrettyCardsPrettyCardDto> items;

    public PrettyCardsGetResponseDto(int i, List<PrettyCardsPrettyCardDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsGetResponseDto)) {
            return false;
        }
        PrettyCardsGetResponseDto prettyCardsGetResponseDto = (PrettyCardsGetResponseDto) obj;
        return this.count == prettyCardsGetResponseDto.count && epx.f(this.items, prettyCardsGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "PrettyCardsGetResponseDto(count=", ", items=", ")", this.items);
    }
}
