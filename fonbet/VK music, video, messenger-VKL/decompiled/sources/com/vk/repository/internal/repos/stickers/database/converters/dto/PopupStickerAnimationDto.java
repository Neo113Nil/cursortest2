package com.vk.repository.internal.repos.stickers.database.converters.dto;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: PopupStickerAnimationDto.kt */
/* loaded from: classes5.dex */
public final class PopupStickerAnimationDto {

    @pmi0("autoplay")
    private final boolean autoplay;

    @pmi0("layers")
    private final List<PopupStickerAnimationLayerDto> layers;

    /* JADX WARN: Multi-variable type inference failed */
    public PopupStickerAnimationDto(boolean z, List<? extends PopupStickerAnimationLayerDto> list) {
        this.autoplay = z;
        this.layers = list;
    }

    public final boolean a() {
        return this.autoplay;
    }

    public final List<PopupStickerAnimationLayerDto> b() {
        return this.layers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupStickerAnimationDto)) {
            return false;
        }
        PopupStickerAnimationDto popupStickerAnimationDto = (PopupStickerAnimationDto) obj;
        return this.autoplay == popupStickerAnimationDto.autoplay && epx.f(this.layers, popupStickerAnimationDto.layers);
    }

    public final int hashCode() {
        return this.layers.hashCode() + (Boolean.hashCode(this.autoplay) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupStickerAnimationDto(autoplay=");
        sb.append(this.autoplay);
        sb.append(", layers=");
        return ms9.a(')', sb, this.layers);
    }
}
