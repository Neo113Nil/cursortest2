package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;

@imi0
/* loaded from: classes3.dex */
public final class SetNextBranchActionDto implements a {
    public static final Companion Companion = new Companion();
    public final BranchActionArgsDto a;

    public static final class Companion {
        public final KSerializer<SetNextBranchActionDto> serializer() {
            return SetNextBranchActionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetNextBranchActionDto(int i, BranchActionArgsDto branchActionArgsDto) {
        if (1 == (i & 1)) {
            this.a = branchActionArgsDto;
        } else {
            sp.x(i, 1, SetNextBranchActionDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetNextBranchActionDto) && epx.f(this.a, ((SetNextBranchActionDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetNextBranchActionDto(args=" + this.a + ")";
    }
}
