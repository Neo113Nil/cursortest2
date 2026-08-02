package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickerStockItemPreviewImageDto.kt */
/* loaded from: classes5.dex */
public final class StickerStockItemPreviewImageDto {

    @pmi0("baseUrl")
    private final String baseUrl;

    @pmi0("imageSquare")
    private final ImageListDto imageSquare;

    @pmi0("imageWide")
    private final ImageListDto imageWide;

    public StickerStockItemPreviewImageDto(String str, ImageListDto imageListDto, ImageListDto imageListDto2) {
        this.baseUrl = str;
        this.imageSquare = imageListDto;
        this.imageWide = imageListDto2;
    }

    public final String a() {
        return this.baseUrl;
    }

    public final ImageListDto b() {
        return this.imageSquare;
    }

    public final ImageListDto c() {
        return this.imageWide;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerStockItemPreviewImageDto)) {
            return false;
        }
        StickerStockItemPreviewImageDto stickerStockItemPreviewImageDto = (StickerStockItemPreviewImageDto) obj;
        return epx.f(this.baseUrl, stickerStockItemPreviewImageDto.baseUrl) && epx.f(this.imageSquare, stickerStockItemPreviewImageDto.imageSquare) && epx.f(this.imageWide, stickerStockItemPreviewImageDto.imageWide);
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        ImageListDto imageListDto = this.imageSquare;
        int hashCode2 = (hashCode + (imageListDto == null ? 0 : imageListDto.hashCode())) * 31;
        ImageListDto imageListDto2 = this.imageWide;
        return hashCode2 + (imageListDto2 != null ? imageListDto2.hashCode() : 0);
    }

    public final String toString() {
        return "StickerStockItemPreviewImageDto(baseUrl=" + this.baseUrl + ", imageSquare=" + this.imageSquare + ", imageWide=" + this.imageWide + ')';
    }

    public /* synthetic */ StickerStockItemPreviewImageDto(String str, ImageListDto imageListDto, ImageListDto imageListDto2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : imageListDto, (i & 4) != 0 ? null : imageListDto2);
    }
}
