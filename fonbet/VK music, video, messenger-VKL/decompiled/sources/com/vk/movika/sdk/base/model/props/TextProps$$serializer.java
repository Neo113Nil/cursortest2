package com.vk.movika.sdk.base.model.props;

import com.vk.movika.sdk.base.model.props.TextProps;
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
public /* synthetic */ class TextProps$$serializer implements vht<TextProps> {
    public static final int $stable;
    public static final TextProps$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TextProps$$serializer textProps$$serializer = new TextProps$$serializer();
        INSTANCE = textProps$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.model.props.TextProps", textProps$$serializer, 6);
        xfb0Var.j("value", true);
        xfb0Var.j("gravityHorizontal", true);
        xfb0Var.j("gravityVertical", true);
        xfb0Var.j("color", true);
        xfb0Var.j("size", true);
        xfb0Var.j("alpha", true);
        descriptor = xfb0Var;
    }

    private TextProps$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<Object>[] kSerializerArr = TextProps.g;
        oqm0 oqm0Var = oqm0.a;
        KSerializer<?> a = xn8.a(oqm0Var);
        KSerializer<?> a2 = xn8.a(kSerializerArr[1]);
        KSerializer<?> a3 = xn8.a(kSerializerArr[2]);
        KSerializer<?> a4 = xn8.a(oqm0Var);
        v6o v6oVar = v6o.a;
        return new KSerializer[]{a, a2, a3, a4, xn8.a(v6oVar), xn8.a(v6oVar)};
    }

    @Override // xsna.a3m
    public final TextProps deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = TextProps.g;
        int i = 0;
        String str = null;
        TextProps.GravityHorizontal gravityHorizontal = null;
        TextProps.GravityVertical gravityVertical = null;
        String str2 = null;
        Double d2 = null;
        Double d3 = null;
        boolean z = true;
        while (z) {
            int m = d.m(serialDescriptor);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) d.i(serialDescriptor, 0, oqm0.a, str);
                    i |= 1;
                    break;
                case 1:
                    gravityHorizontal = (TextProps.GravityHorizontal) d.i(serialDescriptor, 1, kSerializerArr[1], gravityHorizontal);
                    i |= 2;
                    break;
                case 2:
                    gravityVertical = (TextProps.GravityVertical) d.i(serialDescriptor, 2, kSerializerArr[2], gravityVertical);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) d.i(serialDescriptor, 3, oqm0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) d.i(serialDescriptor, 4, v6o.a, d2);
                    i |= 16;
                    break;
                case 5:
                    d3 = (Double) d.i(serialDescriptor, 5, v6o.a, d3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(serialDescriptor);
        return new TextProps(i, str, gravityHorizontal, gravityVertical, str2, d2, d3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, TextProps textProps) {
        Double d = textProps.f;
        Double d2 = textProps.e;
        String str = textProps.d;
        TextProps.GravityVertical gravityVertical = textProps.c;
        TextProps.GravityHorizontal gravityHorizontal = textProps.b;
        String str2 = textProps.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d3 = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = TextProps.g;
        if (d3.z() || str2 != null) {
            d3.s(serialDescriptor, 0, oqm0.a, str2);
        }
        if (d3.z() || gravityHorizontal != null) {
            d3.s(serialDescriptor, 1, kSerializerArr[1], gravityHorizontal);
        }
        if (d3.z() || gravityVertical != null) {
            d3.s(serialDescriptor, 2, kSerializerArr[2], gravityVertical);
        }
        if (d3.z() || str != null) {
            d3.s(serialDescriptor, 3, oqm0.a, str);
        }
        if (d3.z() || d2 != null) {
            d3.s(serialDescriptor, 4, v6o.a, d2);
        }
        if (d3.z() || d != null) {
            d3.s(serialDescriptor, 5, v6o.a, d);
        }
        d3.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
