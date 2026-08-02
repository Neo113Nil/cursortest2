package com.vk.sdk.api;

import xsna.epx;
import xsna.pmi0;
import xsna.so;

/* compiled from: RootResponseDto.kt */
/* loaded from: classes5.dex */
public final class RootResponseDto<T> {

    @pmi0("response")
    private final T response;

    public RootResponseDto(T t) {
        this.response = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RootResponseDto) && epx.f(this.response, ((RootResponseDto) obj).response);
    }

    public final int hashCode() {
        T t = this.response;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return so.a(this.response, "RootResponseDto(response=", ")");
    }
}
