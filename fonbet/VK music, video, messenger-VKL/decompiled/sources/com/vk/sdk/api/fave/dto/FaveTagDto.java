package com.vk.sdk.api.fave.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FaveTagDto.kt */
/* loaded from: classes5.dex */
public final class FaveTagDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public FaveTagDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveTagDto)) {
            return false;
        }
        FaveTagDto faveTagDto = (FaveTagDto) obj;
        return epx.f(this.id, faveTagDto.id) && epx.f(this.name, faveTagDto.name);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FaveTagDto(id=" + this.id + ", name=" + this.name + ")";
    }

    public FaveTagDto(Integer num, String str) {
        this.id = num;
        this.name = str;
    }

    public /* synthetic */ FaveTagDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
