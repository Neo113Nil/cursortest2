package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: BaseObjectWithNameDto.kt */
/* loaded from: classes5.dex */
public final class BaseObjectWithNameDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public BaseObjectWithNameDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseObjectWithNameDto)) {
            return false;
        }
        BaseObjectWithNameDto baseObjectWithNameDto = (BaseObjectWithNameDto) obj;
        return this.id == baseObjectWithNameDto.id && epx.f(this.name, baseObjectWithNameDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "BaseObjectWithNameDto(id=", ", name=", this.name, ")");
    }
}
