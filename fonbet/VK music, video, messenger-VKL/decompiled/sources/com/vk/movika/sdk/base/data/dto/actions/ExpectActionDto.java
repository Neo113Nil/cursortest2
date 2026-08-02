package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class ExpectActionDto implements a {
    public static final Companion Companion = new Companion();
    public final DefaultArgs a;

    public static final class Companion {
        public final KSerializer<ExpectActionDto> serializer() {
            return ExpectActionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExpectActionDto(int i, DefaultArgs defaultArgs) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = defaultArgs;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExpectActionDto) && epx.f(this.a, ((ExpectActionDto) obj).a);
    }

    public final int hashCode() {
        DefaultArgs defaultArgs = this.a;
        if (defaultArgs == null) {
            return 0;
        }
        return defaultArgs.hashCode();
    }

    public final String toString() {
        return "ExpectActionDto(args=" + this.a + ")";
    }

    public ExpectActionDto() {
        this.a = null;
    }
}
