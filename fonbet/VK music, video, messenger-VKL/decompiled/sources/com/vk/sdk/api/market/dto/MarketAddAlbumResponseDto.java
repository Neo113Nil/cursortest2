package com.vk.sdk.api.market.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketAddAlbumResponseDto.kt */
/* loaded from: classes5.dex */
public final class MarketAddAlbumResponseDto {

    @pmi0("albums_count")
    private final Integer albumsCount;

    @pmi0("market_album_id")
    private final Integer marketAlbumId;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketAddAlbumResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketAddAlbumResponseDto)) {
            return false;
        }
        MarketAddAlbumResponseDto marketAddAlbumResponseDto = (MarketAddAlbumResponseDto) obj;
        return epx.f(this.marketAlbumId, marketAddAlbumResponseDto.marketAlbumId) && epx.f(this.albumsCount, marketAddAlbumResponseDto.albumsCount);
    }

    public final int hashCode() {
        Integer num = this.marketAlbumId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.albumsCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "MarketAddAlbumResponseDto(marketAlbumId=" + this.marketAlbumId + ", albumsCount=" + this.albumsCount + ")";
    }

    public MarketAddAlbumResponseDto(Integer num, Integer num2) {
        this.marketAlbumId = num;
        this.albumsCount = num2;
    }

    public /* synthetic */ MarketAddAlbumResponseDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
