package com.vk.movika.sdk.base.data.dto.actions;

import com.vk.movika.sdk.base.data.dto.actions.DefaultArgs;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class DefaultArgs$$serializer implements vht<DefaultArgs> {
    public static final int $stable;
    public static final DefaultArgs$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DefaultArgs$$serializer defaultArgs$$serializer = new DefaultArgs$$serializer();
        INSTANCE = defaultArgs$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.actions.DefaultArgs", defaultArgs$$serializer, 1);
        xfb0Var.j("isDetachContainer", true);
        descriptor = xfb0Var;
    }

    private DefaultArgs$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{xn8.a(g18.a)};
    }

    @Override // xsna.a3m
    public final DefaultArgs deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else {
                if (m != 0) {
                    throw new UnknownFieldException(m);
                }
                bool = (Boolean) d.i(serialDescriptor, 0, g18.a, bool);
                i = 1;
            }
        }
        d.e(serialDescriptor);
        return new DefaultArgs(i, bool);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, DefaultArgs defaultArgs) {
        Boolean bool = defaultArgs.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        DefaultArgs.Companion companion = DefaultArgs.Companion;
        if (d.z() || !epx.f(bool, Boolean.FALSE)) {
            d.s(serialDescriptor, 0, g18.a, bool);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
