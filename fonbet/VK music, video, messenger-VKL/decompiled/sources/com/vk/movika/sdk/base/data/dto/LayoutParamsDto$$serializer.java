package com.vk.movika.sdk.base.data.dto;

import com.vk.movika.sdk.base.data.dto.LayoutParamsDto;
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
public /* synthetic */ class LayoutParamsDto$$serializer implements vht<LayoutParamsDto> {
    public static final int $stable;
    public static final LayoutParamsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LayoutParamsDto$$serializer layoutParamsDto$$serializer = new LayoutParamsDto$$serializer();
        INSTANCE = layoutParamsDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.LayoutParamsDto", layoutParamsDto$$serializer, 8);
        xfb0Var.j("x", true);
        xfb0Var.j("y", true);
        xfb0Var.j("width", true);
        xfb0Var.j("height", true);
        xfb0Var.j("angle", true);
        xfb0Var.j("alignment", true);
        xfb0Var.j("font", true);
        xfb0Var.j("innerSizesDependOn", true);
        descriptor = xfb0Var;
    }

    private LayoutParamsDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        v6o v6oVar = v6o.a;
        KSerializer<?> a = xn8.a(v6oVar);
        KSerializer<?> a2 = xn8.a(v6oVar);
        KSerializer<?> a3 = xn8.a(v6oVar);
        KSerializer<?> a4 = xn8.a(v6oVar);
        KSerializer<?> a5 = xn8.a(v6oVar);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{a, a2, a3, a4, a5, xn8.a(oqm0Var), xn8.a(FontDto$$serializer.INSTANCE), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final LayoutParamsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        int i = 0;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        String str = null;
        FontDto fontDto = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int m = d.m(serialDescriptor);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d2 = (Double) d.i(serialDescriptor, 0, v6o.a, d2);
                    i |= 1;
                    break;
                case 1:
                    d3 = (Double) d.i(serialDescriptor, 1, v6o.a, d3);
                    i |= 2;
                    break;
                case 2:
                    d4 = (Double) d.i(serialDescriptor, 2, v6o.a, d4);
                    i |= 4;
                    break;
                case 3:
                    d5 = (Double) d.i(serialDescriptor, 3, v6o.a, d5);
                    i |= 8;
                    break;
                case 4:
                    d6 = (Double) d.i(serialDescriptor, 4, v6o.a, d6);
                    i |= 16;
                    break;
                case 5:
                    str = (String) d.i(serialDescriptor, 5, oqm0.a, str);
                    i |= 32;
                    break;
                case 6:
                    fontDto = (FontDto) d.i(serialDescriptor, 6, FontDto$$serializer.INSTANCE, fontDto);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) d.i(serialDescriptor, 7, oqm0.a, str2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(serialDescriptor);
        return new LayoutParamsDto(i, d2, d3, d4, d5, d6, str, fontDto, str2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, LayoutParamsDto layoutParamsDto) {
        String str = layoutParamsDto.h;
        FontDto fontDto = layoutParamsDto.g;
        String str2 = layoutParamsDto.f;
        Double d = layoutParamsDto.e;
        Double d2 = layoutParamsDto.d;
        Double d3 = layoutParamsDto.c;
        Double d4 = layoutParamsDto.b;
        Double d5 = layoutParamsDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d6 = encoder.d(serialDescriptor);
        LayoutParamsDto.Companion companion = LayoutParamsDto.Companion;
        if (d6.z() || d5 != null) {
            d6.s(serialDescriptor, 0, v6o.a, d5);
        }
        if (d6.z() || d4 != null) {
            d6.s(serialDescriptor, 1, v6o.a, d4);
        }
        if (d6.z() || d3 != null) {
            d6.s(serialDescriptor, 2, v6o.a, d3);
        }
        if (d6.z() || d2 != null) {
            d6.s(serialDescriptor, 3, v6o.a, d2);
        }
        if (d6.z() || d != null) {
            d6.s(serialDescriptor, 4, v6o.a, d);
        }
        if (d6.z() || str2 != null) {
            d6.s(serialDescriptor, 5, oqm0.a, str2);
        }
        if (d6.z() || fontDto != null) {
            d6.s(serialDescriptor, 6, FontDto$$serializer.INSTANCE, fontDto);
        }
        if (d6.z() || str != null) {
            d6.s(serialDescriptor, 7, oqm0.a, str);
        }
        d6.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
