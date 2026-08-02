package com.vk.superapp.api.generated;

import xsna.epx;
import xsna.k73;
import xsna.pmi0;

/* compiled from: SingleRootResponseDto.kt */
/* loaded from: classes6.dex */
public final class SingleRootResponseDto<T> {

    @pmi0("response")
    private final T response;

    public SingleRootResponseDto(T t) {
        this.response = t;
    }

    public final T a() {
        return this.response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleRootResponseDto) && epx.f(this.response, ((SingleRootResponseDto) obj).response);
    }

    public final int hashCode() {
        T t = this.response;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("SingleRootResponseDto(response="), this.response, ')');
    }
}
