package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: BaseCityDto.kt */
/* loaded from: classes5.dex */
public final class BaseCityDto {

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    public BaseCityDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCityDto)) {
            return false;
        }
        BaseCityDto baseCityDto = (BaseCityDto) obj;
        return this.id == baseCityDto.id && epx.f(this.title, baseCityDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "BaseCityDto(id=", ", title=", this.title, ")");
    }
}
