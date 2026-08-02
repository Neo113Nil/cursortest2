package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;

@imi0
/* loaded from: classes3.dex */
public final class OpenURIActionDto implements a {
    public static final Companion Companion = new Companion();
    public final ArgsDto a;

    @imi0
    public static final class ArgsDto {
        public static final Companion Companion = new Companion();
        public final String a;
        public final Boolean b;

        public static final class Companion {
            public final KSerializer<ArgsDto> serializer() {
                return OpenURIActionDto$ArgsDto$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ArgsDto(int i, String str, Boolean bool) {
            if (1 != (i & 1)) {
                sp.x(i, 1, OpenURIActionDto$ArgsDto$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArgsDto)) {
                return false;
            }
            ArgsDto argsDto = (ArgsDto) obj;
            return epx.f(this.a, argsDto.a) && epx.f(this.b, argsDto.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "ArgsDto(uri=" + this.a + ", isDetachContainer=" + this.b + ")";
        }
    }

    public static final class Companion {
        public final KSerializer<OpenURIActionDto> serializer() {
            return OpenURIActionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpenURIActionDto(int i, ArgsDto argsDto) {
        if (1 == (i & 1)) {
            this.a = argsDto;
        } else {
            sp.x(i, 1, OpenURIActionDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenURIActionDto) && epx.f(this.a, ((OpenURIActionDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenURIActionDto(args=" + this.a + ")";
    }
}
