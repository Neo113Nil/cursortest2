package com.vk.sdk.api.docs.dto;

import xsna.epx;
import xsna.h5s;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: DocsDocTypesDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocTypesDto {

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public DocsDocTypesDto(int i, String str, int i2) {
        this.id = i;
        this.name = str;
        this.count = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocTypesDto)) {
            return false;
        }
        DocsDocTypesDto docsDocTypesDto = (DocsDocTypesDto) obj;
        return this.id == docsDocTypesDto.id && epx.f(this.name, docsDocTypesDto.name) && this.count == docsDocTypesDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
    }

    public final String toString() {
        return h5s.c(this.count, ")", kh10.a(this.id, "DocsDocTypesDto(id=", ", name=", this.name, ", count="));
    }
}
