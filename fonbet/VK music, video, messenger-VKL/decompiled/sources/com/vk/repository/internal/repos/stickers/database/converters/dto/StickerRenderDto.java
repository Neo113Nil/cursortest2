package com.vk.repository.internal.repos.stickers.database.converters.dto;

import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: StickerRenderDto.kt */
/* loaded from: classes5.dex */
public final class StickerRenderDto {

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final ImageListDto image;

    @pmi0("imageDark")
    private final ImageListDto imageDark;

    @pmi0("isRendering")
    private final boolean isRendering;

    @pmi0("isStub")
    private final boolean isStub;

    public StickerRenderDto(String str, ImageListDto imageListDto, ImageListDto imageListDto2, boolean z, boolean z2) {
        this.id = str;
        this.image = imageListDto;
        this.imageDark = imageListDto2;
        this.isStub = z;
        this.isRendering = z2;
    }

    public final String a() {
        return this.id;
    }

    public final ImageListDto b() {
        return this.image;
    }

    public final ImageListDto c() {
        return this.imageDark;
    }

    public final boolean d() {
        return this.isRendering;
    }

    public final boolean e() {
        return this.isStub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerRenderDto)) {
            return false;
        }
        StickerRenderDto stickerRenderDto = (StickerRenderDto) obj;
        return epx.f(this.id, stickerRenderDto.id) && epx.f(this.image, stickerRenderDto.image) && epx.f(this.imageDark, stickerRenderDto.imageDark) && this.isStub == stickerRenderDto.isStub && this.isRendering == stickerRenderDto.isRendering;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRendering) + qoy.b((this.imageDark.hashCode() + ((this.image.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.isStub);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerRenderDto(id=");
        sb.append(this.id);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", imageDark=");
        sb.append(this.imageDark);
        sb.append(", isStub=");
        sb.append(this.isStub);
        sb.append(", isRendering=");
        return q0.a(sb, this.isRendering, ')');
    }
}
