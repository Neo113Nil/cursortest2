package com.vk.movika.sdk.base.model.props;

import kotlinx.serialization.KSerializer;
import xsna.imi0;
import xsna.sp;

@imi0
/* loaded from: classes3.dex */
public final class SizeProps {
    public static final Companion Companion = new Companion();
    public final Double a;
    public final Double b;

    public static final class Companion {
        public final KSerializer<SizeProps> serializer() {
            return SizeProps$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SizeProps(int i, Double d, Double d2) {
        if (3 != (i & 3)) {
            sp.x(i, 3, SizeProps$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }
}
