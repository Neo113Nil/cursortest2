package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class NoBranchActionArgsDto {
    public static final Companion Companion = new Companion();
    public final Boolean a;
    public final Boolean b;

    public static final class Companion {
        public final KSerializer<NoBranchActionArgsDto> serializer() {
            return NoBranchActionArgsDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NoBranchActionArgsDto(int i, Boolean bool, Boolean bool2) {
        this.a = (i & 1) == 0 ? null : bool;
        if ((i & 2) == 0) {
            this.b = Boolean.TRUE;
        } else {
            this.b = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoBranchActionArgsDto)) {
            return false;
        }
        NoBranchActionArgsDto noBranchActionArgsDto = (NoBranchActionArgsDto) obj;
        return epx.f(this.a, noBranchActionArgsDto.a) && epx.f(this.b, noBranchActionArgsDto.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "NoBranchActionArgsDto(shouldOpenNow=" + this.a + ", isDetachContainer=" + this.b + ")";
    }

    public NoBranchActionArgsDto() {
        Boolean bool = Boolean.TRUE;
        this.a = null;
        this.b = bool;
    }
}
