package com.vk.movika.sdk.base.data.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.epx;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class ContainerDto$$serializer implements vht<ContainerDto> {
    public static final int $stable;
    public static final ContainerDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ContainerDto$$serializer containerDto$$serializer = new ContainerDto$$serializer();
        INSTANCE = containerDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.ContainerDto", containerDto$$serializer, 9);
        xfb0Var.j("id", false);
        xfb0Var.j("startTime", false);
        xfb0Var.j("type", false);
        xfb0Var.j(TtmlNode.TAG_LAYOUT, true);
        xfb0Var.j("controls", true);
        xfb0Var.j("endTime", true);
        xfb0Var.j("containerAction", true);
        xfb0Var.j("props", true);
        xfb0Var.j("events", true);
        descriptor = xfb0Var;
    }

    private ContainerDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ContainerDto.j;
        u500 u500Var = u500.a;
        KSerializer<?> a = xn8.a(LayoutDto$$serializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[4];
        KSerializer<?> a2 = xn8.a(u500Var);
        KSerializer<?> a3 = xn8.a(kSerializerArr[6]);
        KSerializer<?> a4 = xn8.a(kSerializerArr[7]);
        KSerializer<?> a5 = xn8.a(kSerializerArr[8]);
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, u500Var, oqm0Var, a, kSerializer, a2, a3, a4, a5};
    }

    @Override // xsna.a3m
    public final ContainerDto deserialize(Decoder decoder) {
        KSerializer<Object>[] kSerializerArr;
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr2 = ContainerDto.j;
        Long l = null;
        List list = null;
        String str = null;
        String str2 = null;
        LayoutDto layoutDto = null;
        List list2 = null;
        long j = 0;
        int i = 0;
        boolean z = true;
        com.vk.movika.sdk.base.data.dto.actions.a aVar = null;
        String str3 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            switch (m) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    str = d.u(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    j = d.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    str2 = d.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    layoutDto = (LayoutDto) d.i(serialDescriptor, 3, LayoutDto$$serializer.INSTANCE, layoutDto);
                    i |= 8;
                    break;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    list2 = (List) d.y(serialDescriptor, 4, kSerializerArr[4], list2);
                    i |= 16;
                    break;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    l = (Long) d.i(serialDescriptor, 5, u500.a, l);
                    i |= 32;
                    break;
                case 6:
                    kSerializerArr = kSerializerArr2;
                    aVar = (com.vk.movika.sdk.base.data.dto.actions.a) d.i(serialDescriptor, 6, kSerializerArr[6], aVar);
                    i |= 64;
                    break;
                case 7:
                    kSerializerArr = kSerializerArr2;
                    str3 = (String) d.i(serialDescriptor, 7, kSerializerArr[7], str3);
                    i |= 128;
                    break;
                case 8:
                    kSerializerArr = kSerializerArr2;
                    list = (List) d.i(serialDescriptor, 8, kSerializerArr[8], list);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
            kSerializerArr2 = kSerializerArr;
        }
        d.e(serialDescriptor);
        return new ContainerDto(i, str, j, str2, layoutDto, list2, l, aVar, str3, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, ContainerDto containerDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ContainerDto.j;
        String str = containerDto.a;
        List<EventDto> list = containerDto.i;
        String str2 = containerDto.h;
        com.vk.movika.sdk.base.data.dto.actions.a aVar = containerDto.g;
        Long l = containerDto.f;
        List<ControlDto> list2 = containerDto.e;
        LayoutDto layoutDto = containerDto.d;
        d.m(serialDescriptor, 0, str);
        d.q(serialDescriptor, 1, containerDto.b);
        d.m(serialDescriptor, 2, containerDto.c);
        if (d.z() || layoutDto != null) {
            d.s(serialDescriptor, 3, LayoutDto$$serializer.INSTANCE, layoutDto);
        }
        if (d.z() || !epx.f(list2, EmptyList.b)) {
            d.n(serialDescriptor, 4, kSerializerArr[4], list2);
        }
        if (d.z() || l != null) {
            d.s(serialDescriptor, 5, u500.a, l);
        }
        if (d.z() || aVar != null) {
            d.s(serialDescriptor, 6, kSerializerArr[6], aVar);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 7, kSerializerArr[7], str2);
        }
        if (d.z() || list != null) {
            d.s(serialDescriptor, 8, kSerializerArr[8], list);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
