package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: BaseObjectDto.kt */
/* loaded from: classes5.dex */
public final class BaseObjectDto {

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    public BaseObjectDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseObjectDto)) {
            return false;
        }
        BaseObjectDto baseObjectDto = (BaseObjectDto) obj;
        return this.id == baseObjectDto.id && epx.f(this.title, baseObjectDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "BaseObjectDto(id=", ", title=", this.title, ")");
    }
}
