package com.vk.movika.sdk.base.model.props;

import com.vk.movika.sdk.base.model.props.BorderProps;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.v6o;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class BorderProps$$serializer implements vht<BorderProps> {
    public static final int $stable;
    public static final BorderProps$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BorderProps$$serializer borderProps$$serializer = new BorderProps$$serializer();
        INSTANCE = borderProps$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.model.props.BorderProps", borderProps$$serializer, 3);
        xfb0Var.j("width", true);
        xfb0Var.j("color", true);
        xfb0Var.j("alpha", true);
        descriptor = xfb0Var;
    }

    private BorderProps$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        v6o v6oVar = v6o.a;
        return new KSerializer[]{xn8.a(v6oVar), xn8.a(oqm0.a), xn8.a(v6oVar)};
    }

    @Override // xsna.a3m
    public final BorderProps deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        Double d2 = null;
        boolean z = true;
        int i = 0;
        String str = null;
        Double d3 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                d2 = (Double) d.i(serialDescriptor, 0, v6o.a, d2);
                i |= 1;
            } else if (m == 1) {
                str = (String) d.i(serialDescriptor, 1, oqm0.a, str);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                d3 = (Double) d.i(serialDescriptor, 2, v6o.a, d3);
                i |= 4;
            }
        }
        d.e(serialDescriptor);
        return new BorderProps(i, d2, str, d3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, BorderProps borderProps) {
        Double d = borderProps.c;
        String str = borderProps.b;
        Double d2 = borderProps.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d3 = encoder.d(serialDescriptor);
        BorderProps.Companion companion = BorderProps.Companion;
        if (d3.z() || d2 != null) {
            d3.s(serialDescriptor, 0, v6o.a, d2);
        }
        if (d3.z() || str != null) {
            d3.s(serialDescriptor, 1, oqm0.a, str);
        }
        if (d3.z() || d != null) {
            d3.s(serialDescriptor, 2, v6o.a, d);
        }
        d3.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
