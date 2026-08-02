package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkApplicationStoreDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkApplicationStoreDto {

    @pmi0("id")
    private final Float id;

    @pmi0("name")
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLinkApplicationStoreDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkApplicationStoreDto)) {
            return false;
        }
        BaseLinkApplicationStoreDto baseLinkApplicationStoreDto = (BaseLinkApplicationStoreDto) obj;
        return epx.f(this.id, baseLinkApplicationStoreDto.id) && epx.f(this.name, baseLinkApplicationStoreDto.name);
    }

    public final int hashCode() {
        Float f = this.id;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLinkApplicationStoreDto(id=" + this.id + ", name=" + this.name + ")";
    }

    public BaseLinkApplicationStoreDto(Float f, String str) {
        this.id = f;
        this.name = str;
    }

    public /* synthetic */ BaseLinkApplicationStoreDto(Float f, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : str);
    }
}
