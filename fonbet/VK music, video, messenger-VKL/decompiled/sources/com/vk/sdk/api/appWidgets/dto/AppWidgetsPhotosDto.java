package com.vk.sdk.api.appWidgets.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppWidgetsPhotosDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsPhotosDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<AppWidgetsPhotoDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public AppWidgetsPhotosDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWidgetsPhotosDto)) {
            return false;
        }
        AppWidgetsPhotosDto appWidgetsPhotosDto = (AppWidgetsPhotosDto) obj;
        return epx.f(this.count, appWidgetsPhotosDto.count) && epx.f(this.items, appWidgetsPhotosDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AppWidgetsPhotoDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AppWidgetsPhotosDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public AppWidgetsPhotosDto(Integer num, List<AppWidgetsPhotoDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ AppWidgetsPhotosDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
