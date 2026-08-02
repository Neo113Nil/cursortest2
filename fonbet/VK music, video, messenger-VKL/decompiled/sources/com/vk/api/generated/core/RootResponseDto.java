package com.vk.api.generated.core;

import xsna.epx;
import xsna.l8y;
import xsna.pmi0;
import xsna.x9y;
import xsna.zcl;

/* compiled from: RootResponseDto.kt */
/* loaded from: classes14.dex */
public final class RootResponseDto<T> {

    @pmi0("error")
    private final x9y error;

    @pmi0("execute_errors")
    private final l8y executeErrors;

    @pmi0("response")
    private final T response;

    public RootResponseDto(T t, x9y x9yVar, l8y l8yVar) {
        this.response = t;
        this.error = x9yVar;
        this.executeErrors = l8yVar;
    }

    public final x9y a() {
        return this.error;
    }

    public final l8y b() {
        return this.executeErrors;
    }

    public final T c() {
        return this.response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RootResponseDto)) {
            return false;
        }
        RootResponseDto rootResponseDto = (RootResponseDto) obj;
        return epx.f(this.response, rootResponseDto.response) && epx.f(this.error, rootResponseDto.error) && epx.f(this.executeErrors, rootResponseDto.executeErrors);
    }

    public final int hashCode() {
        T t = this.response;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        x9y x9yVar = this.error;
        int hashCode2 = (hashCode + (x9yVar == null ? 0 : x9yVar.b.hashCode())) * 31;
        l8y l8yVar = this.executeErrors;
        return hashCode2 + (l8yVar != null ? l8yVar.b.hashCode() : 0);
    }

    public final String toString() {
        return "RootResponseDto(response=" + this.response + ", error=" + this.error + ", executeErrors=" + this.executeErrors + ')';
    }

    public /* synthetic */ RootResponseDto(Object obj, x9y x9yVar, l8y l8yVar, int i, zcl zclVar) {
        this(obj, (i & 2) != 0 ? null : x9yVar, (i & 4) != 0 ? null : l8yVar);
    }
}
