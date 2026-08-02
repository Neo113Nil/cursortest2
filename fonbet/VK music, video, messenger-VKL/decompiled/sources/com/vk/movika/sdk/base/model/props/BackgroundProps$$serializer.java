package com.vk.movika.sdk.base.model.props;

import com.vk.movika.sdk.base.model.props.BackgroundProps;
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
public /* synthetic */ class BackgroundProps$$serializer implements vht<BackgroundProps> {
    public static final int $stable;
    public static final BackgroundProps$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BackgroundProps$$serializer backgroundProps$$serializer = new BackgroundProps$$serializer();
        INSTANCE = backgroundProps$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.model.props.BackgroundProps", backgroundProps$$serializer, 4);
        xfb0Var.j("type", true);
        xfb0Var.j("src", true);
        xfb0Var.j("color", true);
        xfb0Var.j("alpha", true);
        descriptor = xfb0Var;
    }

    private BackgroundProps$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> a = xn8.a(BackgroundProps.e[0]);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{a, xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(v6o.a)};
    }

    @Override // xsna.a3m
    public final BackgroundProps deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = BackgroundProps.e;
        int i = 0;
        BackgroundProps.Type type = null;
        String str = null;
        String str2 = null;
        Double d2 = null;
        boolean z = true;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                type = (BackgroundProps.Type) d.i(serialDescriptor, 0, kSerializerArr[0], type);
                i |= 1;
            } else if (m == 1) {
                str = (String) d.i(serialDescriptor, 1, oqm0.a, str);
                i |= 2;
            } else if (m == 2) {
                str2 = (String) d.i(serialDescriptor, 2, oqm0.a, str2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                d2 = (Double) d.i(serialDescriptor, 3, v6o.a, d2);
                i |= 8;
            }
        }
        d.e(serialDescriptor);
        return new BackgroundProps(i, type, str, str2, d2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, BackgroundProps backgroundProps) {
        Double d = backgroundProps.d;
        String str = backgroundProps.c;
        String str2 = backgroundProps.b;
        BackgroundProps.Type type = backgroundProps.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d2 = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = BackgroundProps.e;
        if (d2.z() || type != null) {
            d2.s(serialDescriptor, 0, kSerializerArr[0], type);
        }
        if (d2.z() || str2 != null) {
            d2.s(serialDescriptor, 1, oqm0.a, str2);
        }
        if (d2.z() || str != null) {
            d2.s(serialDescriptor, 2, oqm0.a, str);
        }
        if (d2.z() || d != null) {
            d2.s(serialDescriptor, 3, v6o.a, d);
        }
        d2.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
