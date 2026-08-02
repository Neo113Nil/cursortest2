package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;
import xsna.zr;

@imi0
/* loaded from: classes3.dex */
public final class LayoutDto {
    public static final Companion Companion = new Companion();
    public final String a;

    public static final class Companion {
        public final KSerializer<LayoutDto> serializer() {
            return LayoutDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LayoutDto(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            sp.x(i, 1, LayoutDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutDto) && epx.f(this.a, ((LayoutDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr.a("LayoutDto(type=", this.a, ")");
    }
}
