package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class ControlDto$$serializer implements vht<ControlDto> {
    public static final int $stable;
    public static final ControlDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ControlDto$$serializer controlDto$$serializer = new ControlDto$$serializer();
        INSTANCE = controlDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.ControlDto", controlDto$$serializer, 6);
        xfb0Var.j("id", false);
        xfb0Var.j("type", false);
        xfb0Var.j("label", true);
        xfb0Var.j("layoutParams", true);
        xfb0Var.j("events", true);
        xfb0Var.j("props", true);
        descriptor = xfb0Var;
    }

    private ControlDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<Object>[] kSerializerArr = ControlDto.g;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, xn8.a(oqm0Var), xn8.a(LayoutParamsDto$$serializer.INSTANCE), xn8.a(kSerializerArr[4]), xn8.a(kSerializerArr[5])};
    }

    @Override // xsna.a3m
    public final ControlDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ControlDto.g;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        LayoutParamsDto layoutParamsDto = null;
        List list = null;
        String str4 = null;
        boolean z = true;
        while (z) {
            int m = d.m(serialDescriptor);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = d.u(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = d.u(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) d.i(serialDescriptor, 2, oqm0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    layoutParamsDto = (LayoutParamsDto) d.i(serialDescriptor, 3, LayoutParamsDto$$serializer.INSTANCE, layoutParamsDto);
                    i |= 8;
                    break;
                case 4:
                    list = (List) d.i(serialDescriptor, 4, kSerializerArr[4], list);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) d.i(serialDescriptor, 5, kSerializerArr[5], str4);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(serialDescriptor);
        return new ControlDto(i, str, str2, str3, layoutParamsDto, list, str4);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, ControlDto controlDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ControlDto.g;
        String str = controlDto.a;
        String str2 = controlDto.f;
        List<EventDto> list = controlDto.e;
        LayoutParamsDto layoutParamsDto = controlDto.d;
        String str3 = controlDto.c;
        d.m(serialDescriptor, 0, str);
        d.m(serialDescriptor, 1, controlDto.b);
        if (d.z() || str3 != null) {
            d.s(serialDescriptor, 2, oqm0.a, str3);
        }
        if (d.z() || layoutParamsDto != null) {
            d.s(serialDescriptor, 3, LayoutParamsDto$$serializer.INSTANCE, layoutParamsDto);
        }
        if (d.z() || list != null) {
            d.s(serialDescriptor, 4, kSerializerArr[4], list);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 5, kSerializerArr[5], str2);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
