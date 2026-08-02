package com.vk.movika.sdk.base.model.props;

import com.vk.movika.sdk.base.model.props.ShapeProps;
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
public /* synthetic */ class ShapeProps$$serializer implements vht<ShapeProps> {
    public static final int $stable;
    public static final ShapeProps$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShapeProps$$serializer shapeProps$$serializer = new ShapeProps$$serializer();
        INSTANCE = shapeProps$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.model.props.ShapeProps", shapeProps$$serializer, 3);
        xfb0Var.j("border", true);
        xfb0Var.j("type", false);
        xfb0Var.j("roundCorners", true);
        descriptor = xfb0Var;
    }

    private ShapeProps$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{xn8.a(BorderProps$$serializer.INSTANCE), ShapeProps.d[1], xn8.a(v6o.a)};
    }

    @Override // xsna.a3m
    public final ShapeProps deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ShapeProps.d;
        BorderProps borderProps = null;
        boolean z = true;
        int i = 0;
        ShapeProps.Type type = null;
        Double d2 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                borderProps = (BorderProps) d.i(serialDescriptor, 0, BorderProps$$serializer.INSTANCE, borderProps);
                i |= 1;
            } else if (m == 1) {
                type = (ShapeProps.Type) d.y(serialDescriptor, 1, kSerializerArr[1], type);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                d2 = (Double) d.i(serialDescriptor, 2, v6o.a, d2);
                i |= 4;
            }
        }
        d.e(serialDescriptor);
        return new ShapeProps(i, borderProps, type, d2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, ShapeProps shapeProps) {
        BorderProps borderProps = shapeProps.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ShapeProps.d;
        if (d.z() || borderProps != null) {
            d.s(serialDescriptor, 0, BorderProps$$serializer.INSTANCE, borderProps);
        }
        KSerializer<Object> kSerializer = kSerializerArr[1];
        ShapeProps.Type type = shapeProps.b;
        Double d2 = shapeProps.c;
        d.n(serialDescriptor, 1, kSerializer, type);
        if (d.z() || d2 != null) {
            d.s(serialDescriptor, 2, v6o.a, d2);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
