package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: BaseCountryDto.kt */
/* loaded from: classes5.dex */
public final class BaseCountryDto {

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    public BaseCountryDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCountryDto)) {
            return false;
        }
        BaseCountryDto baseCountryDto = (BaseCountryDto) obj;
        return this.id == baseCountryDto.id && epx.f(this.title, baseCountryDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "BaseCountryDto(id=", ", title=", this.title, ")");
    }
}
