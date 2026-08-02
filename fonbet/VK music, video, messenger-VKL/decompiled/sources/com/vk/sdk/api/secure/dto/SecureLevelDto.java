package com.vk.sdk.api.secure.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SecureLevelDto.kt */
/* loaded from: classes5.dex */
public final class SecureLevelDto {

    @pmi0("level")
    private final Integer level;

    @pmi0("uid")
    private final Integer uid;

    /* JADX WARN: Multi-variable type inference failed */
    public SecureLevelDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureLevelDto)) {
            return false;
        }
        SecureLevelDto secureLevelDto = (SecureLevelDto) obj;
        return epx.f(this.level, secureLevelDto.level) && epx.f(this.uid, secureLevelDto.uid);
    }

    public final int hashCode() {
        Integer num = this.level;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.uid;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SecureLevelDto(level=" + this.level + ", uid=" + this.uid + ")";
    }

    public SecureLevelDto(Integer num, Integer num2) {
        this.level = num;
        this.uid = num2;
    }

    public /* synthetic */ SecureLevelDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
