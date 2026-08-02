package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhotosTagsSuggestionItemEndCardDto.kt */
/* loaded from: classes5.dex */
public final class PhotosTagsSuggestionItemEndCardDto {

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("subtitle")
    private final String subtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotosTagsSuggestionItemEndCardDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemEndCardDto)) {
            return false;
        }
        PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = (PhotosTagsSuggestionItemEndCardDto) obj;
        return epx.f(this.subtitle, photosTagsSuggestionItemEndCardDto.subtitle) && epx.f(this.button, photosTagsSuggestionItemEndCardDto.button);
    }

    public final int hashCode() {
        String str = this.subtitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhotosTagsSuggestionItemEndCardDto(subtitle=" + this.subtitle + ", button=" + this.button + ")";
    }

    public PhotosTagsSuggestionItemEndCardDto(String str, BaseLinkButtonDto baseLinkButtonDto) {
        this.subtitle = str;
        this.button = baseLinkButtonDto;
    }

    public /* synthetic */ PhotosTagsSuggestionItemEndCardDto(String str, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseLinkButtonDto);
    }
}
