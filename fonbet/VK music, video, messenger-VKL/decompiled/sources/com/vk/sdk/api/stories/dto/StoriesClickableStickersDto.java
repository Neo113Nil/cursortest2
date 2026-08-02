package com.vk.sdk.api.stories.dto;

import java.util.List;
import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.shy;

/* compiled from: StoriesClickableStickersDto.kt */
/* loaded from: classes5.dex */
public final class StoriesClickableStickersDto {

    @pmi0("clickable_stickers")
    private final List<StoriesClickableStickerDto> clickableStickers;

    @pmi0("original_height")
    private final int originalHeight;

    @pmi0("original_width")
    private final int originalWidth;

    public StoriesClickableStickersDto(List<StoriesClickableStickerDto> list, int i, int i2) {
        this.clickableStickers = list;
        this.originalHeight = i;
        this.originalWidth = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesClickableStickersDto)) {
            return false;
        }
        StoriesClickableStickersDto storiesClickableStickersDto = (StoriesClickableStickersDto) obj;
        return epx.f(this.clickableStickers, storiesClickableStickersDto.clickableStickers) && this.originalHeight == storiesClickableStickersDto.originalHeight && this.originalWidth == storiesClickableStickersDto.originalWidth;
    }

    public final int hashCode() {
        return Integer.hashCode(this.originalWidth) + shy.a(this.originalHeight, this.clickableStickers.hashCode() * 31, 31);
    }

    public final String toString() {
        List<StoriesClickableStickerDto> list = this.clickableStickers;
        int i = this.originalHeight;
        int i2 = this.originalWidth;
        StringBuilder sb = new StringBuilder("StoriesClickableStickersDto(clickableStickers=");
        sb.append(list);
        sb.append(", originalHeight=");
        sb.append(i);
        sb.append(", originalWidth=");
        return h5s.c(i2, ")", sb);
    }
}
