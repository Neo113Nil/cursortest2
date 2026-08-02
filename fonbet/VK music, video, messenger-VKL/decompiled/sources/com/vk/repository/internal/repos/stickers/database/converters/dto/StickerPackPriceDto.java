package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;

/* compiled from: StickerPackPriceDto.kt */
/* loaded from: classes5.dex */
public final class StickerPackPriceDto {

    @pmi0("current")
    private final int current;

    @pmi0("discount")
    private final Integer discount;

    @pmi0("regular")
    private final Integer regular;

    public StickerPackPriceDto(int i, Integer num, Integer num2) {
        this.current = i;
        this.regular = num;
        this.discount = num2;
    }

    public final int a() {
        return this.current;
    }

    public final Integer b() {
        return this.discount;
    }

    public final Integer c() {
        return this.regular;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackPriceDto)) {
            return false;
        }
        StickerPackPriceDto stickerPackPriceDto = (StickerPackPriceDto) obj;
        return this.current == stickerPackPriceDto.current && epx.f(this.regular, stickerPackPriceDto.regular) && epx.f(this.discount, stickerPackPriceDto.discount);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.current) * 31;
        Integer num = this.regular;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discount;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackPriceDto(current=");
        sb.append(this.current);
        sb.append(", regular=");
        sb.append(this.regular);
        sb.append(", discount=");
        return uqi.b(sb, this.discount, ')');
    }
}
