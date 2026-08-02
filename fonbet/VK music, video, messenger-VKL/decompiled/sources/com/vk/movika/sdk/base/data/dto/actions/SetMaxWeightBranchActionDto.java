package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class SetMaxWeightBranchActionDto implements a {
    public static final Companion Companion = new Companion();
    public final NoBranchActionArgsDto a;

    public static final class Companion {
        public final KSerializer<SetMaxWeightBranchActionDto> serializer() {
            return SetMaxWeightBranchActionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetMaxWeightBranchActionDto(int i, NoBranchActionArgsDto noBranchActionArgsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = noBranchActionArgsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetMaxWeightBranchActionDto) && epx.f(this.a, ((SetMaxWeightBranchActionDto) obj).a);
    }

    public final int hashCode() {
        NoBranchActionArgsDto noBranchActionArgsDto = this.a;
        if (noBranchActionArgsDto == null) {
            return 0;
        }
        return noBranchActionArgsDto.hashCode();
    }

    public final String toString() {
        return "SetMaxWeightBranchActionDto(args=" + this.a + ")";
    }

    public SetMaxWeightBranchActionDto() {
        this.a = null;
    }
}
