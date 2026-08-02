package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;

/* compiled from: BaseRequestParamDto.kt */
/* loaded from: classes5.dex */
public final class BaseRequestParamDto {

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    public BaseRequestParamDto(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRequestParamDto)) {
            return false;
        }
        BaseRequestParamDto baseRequestParamDto = (BaseRequestParamDto) obj;
        return epx.f(this.key, baseRequestParamDto.key) && epx.f(this.value, baseRequestParamDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("BaseRequestParamDto(key=", this.key, ", value=", this.value, ")");
    }
}
