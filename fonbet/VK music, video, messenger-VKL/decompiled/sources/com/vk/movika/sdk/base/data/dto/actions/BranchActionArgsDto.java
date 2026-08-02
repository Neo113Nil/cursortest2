package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;
import xsna.xq;

@imi0
/* loaded from: classes3.dex */
public final class BranchActionArgsDto {
    public static final Companion Companion = new Companion();
    public final String a;
    public final Boolean b;
    public final Boolean c;

    public static final class Companion {
        public final KSerializer<BranchActionArgsDto> serializer() {
            return BranchActionArgsDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BranchActionArgsDto(int i, Boolean bool, Boolean bool2, String str) {
        if (1 != (i & 1)) {
            sp.x(i, 1, BranchActionArgsDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = Boolean.TRUE;
        } else {
            this.c = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BranchActionArgsDto)) {
            return false;
        }
        BranchActionArgsDto branchActionArgsDto = (BranchActionArgsDto) obj;
        return epx.f(this.a, branchActionArgsDto.a) && epx.f(this.b, branchActionArgsDto.b) && epx.f(this.c, branchActionArgsDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BranchActionArgsDto(branchId=");
        sb.append(this.a);
        sb.append(", shouldOpenNow=");
        sb.append(this.b);
        sb.append(", isDetachContainer=");
        return xq.d(sb, this.c, ")");
    }
}
