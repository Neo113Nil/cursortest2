package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes3.dex */
public final class DefaultArgs {
    public static final Companion Companion = new Companion();
    public final Boolean a;

    public static final class Companion {
        public final KSerializer<DefaultArgs> serializer() {
            return DefaultArgs$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefaultArgs(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = Boolean.FALSE;
        } else {
            this.a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultArgs) && epx.f(this.a, ((DefaultArgs) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "DefaultArgs(isDetachContainer=" + this.a + ")";
    }

    public DefaultArgs() {
        this.a = Boolean.FALSE;
    }
}
