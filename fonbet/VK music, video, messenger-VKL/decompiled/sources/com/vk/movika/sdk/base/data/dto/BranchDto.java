package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;
import xsna.urd0;
import xsna.xe9;
import xsna.xq;

@imi0
/* loaded from: classes3.dex */
public final class BranchDto {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final Double c;
    public final String d;
    public final Boolean e;

    public static final class Companion {
        public final KSerializer<BranchDto> serializer() {
            return BranchDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BranchDto(int i, String str, String str2, Double d, String str3, Boolean bool) {
        if (3 != (i & 3)) {
            sp.x(i, 3, BranchDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BranchDto)) {
            return false;
        }
        BranchDto branchDto = (BranchDto) obj;
        return epx.f(this.a, branchDto.a) && epx.f(this.b, branchDto.b) && epx.f(this.c, branchDto.c) && epx.f(this.d, branchDto.d) && epx.f(this.e, branchDto.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        Double d = this.c;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("BranchDto(id=", this.a, ", chapterId=", this.b, ", weight=");
        a.append(this.c);
        a.append(", manifestURL=");
        a.append(this.d);
        a.append(", isDefault=");
        return xq.d(a, this.e, ")");
    }
}
