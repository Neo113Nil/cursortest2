package com.vk.movika.sdk.base.model.props;

import com.vk.movika.sdk.base.model.props.SizeProps;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.ozl;
import xsna.ssi;
import xsna.v6o;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class SizeProps$$serializer implements vht<SizeProps> {
    public static final int $stable;
    public static final SizeProps$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SizeProps$$serializer sizeProps$$serializer = new SizeProps$$serializer();
        INSTANCE = sizeProps$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.model.props.SizeProps", sizeProps$$serializer, 2);
        xfb0Var.j("width", false);
        xfb0Var.j("height", false);
        descriptor = xfb0Var;
    }

    private SizeProps$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        v6o v6oVar = v6o.a;
        return new KSerializer[]{xn8.a(v6oVar), xn8.a(v6oVar)};
    }

    @Override // xsna.a3m
    public final SizeProps deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        Double d2 = null;
        boolean z = true;
        int i = 0;
        Double d3 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                d2 = (Double) d.i(serialDescriptor, 0, v6o.a, d2);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                d3 = (Double) d.i(serialDescriptor, 1, v6o.a, d3);
                i |= 2;
            }
        }
        d.e(serialDescriptor);
        return new SizeProps(i, d2, d3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, SizeProps sizeProps) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        SizeProps.Companion companion = SizeProps.Companion;
        v6o v6oVar = v6o.a;
        d.s(serialDescriptor, 0, v6oVar, sizeProps.a);
        d.s(serialDescriptor, 1, v6oVar, sizeProps.b);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
