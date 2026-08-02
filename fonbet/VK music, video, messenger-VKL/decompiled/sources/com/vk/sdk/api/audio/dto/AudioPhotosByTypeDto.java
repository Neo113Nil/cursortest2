package com.vk.sdk.api.audio.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AudioPhotosByTypeDto.kt */
/* loaded from: classes5.dex */
public final class AudioPhotosByTypeDto {

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("type")
    private final String type;

    public AudioPhotosByTypeDto(String str, List<BaseImageDto> list) {
        this.type = str;
        this.photo = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotosByTypeDto)) {
            return false;
        }
        AudioPhotosByTypeDto audioPhotosByTypeDto = (AudioPhotosByTypeDto) obj;
        return epx.f(this.type, audioPhotosByTypeDto.type) && epx.f(this.photo, audioPhotosByTypeDto.photo);
    }

    public final int hashCode() {
        return this.photo.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AudioPhotosByTypeDto(type=" + this.type + ", photo=" + this.photo + ")";
    }
}
