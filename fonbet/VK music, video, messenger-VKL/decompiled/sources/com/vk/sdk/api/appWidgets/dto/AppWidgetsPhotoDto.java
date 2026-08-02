package com.vk.sdk.api.appWidgets.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AppWidgetsPhotoDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsPhotoDto {

    @pmi0("id")
    private final String id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    public AppWidgetsPhotoDto(String str, List<BaseImageDto> list) {
        this.id = str;
        this.images = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWidgetsPhotoDto)) {
            return false;
        }
        AppWidgetsPhotoDto appWidgetsPhotoDto = (AppWidgetsPhotoDto) obj;
        return epx.f(this.id, appWidgetsPhotoDto.id) && epx.f(this.images, appWidgetsPhotoDto.images);
    }

    public final int hashCode() {
        return this.images.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return "AppWidgetsPhotoDto(id=" + this.id + ", images=" + this.images + ")";
    }
}
