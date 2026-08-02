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
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class VideoDto$$serializer implements vht<VideoDto> {
    public static final int $stable;
    public static final VideoDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VideoDto$$serializer videoDto$$serializer = new VideoDto$$serializer();
        INSTANCE = videoDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.VideoDto", videoDto$$serializer, 4);
        xfb0Var.j("id", false);
        xfb0Var.j("duration", true);
        xfb0Var.j("shortlink", true);
        xfb0Var.j("variants", false);
        descriptor = xfb0Var;
    }

    private VideoDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = VideoDto.e;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, xn8.a(u500.a), xn8.a(oqm0Var), kSerializerArr[3]};
    }

    @Override // xsna.a3m
    public final VideoDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = VideoDto.e;
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(serialDescriptor, 0);
                i |= 1;
            } else if (m == 1) {
                l = (Long) d.i(serialDescriptor, 1, u500.a, l);
                i |= 2;
            } else if (m == 2) {
                str2 = (String) d.i(serialDescriptor, 2, oqm0.a, str2);
                i |= 4;
            } else {
                if (m != 3) {
                    throw new UnknownFieldException(m);
                }
                list = (List) d.y(serialDescriptor, 3, kSerializerArr[3], list);
                i |= 8;
            }
        }
        d.e(serialDescriptor);
        return new VideoDto(i, str, l, str2, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, VideoDto videoDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = VideoDto.e;
        String str = videoDto.a;
        String str2 = videoDto.c;
        Long l = videoDto.b;
        d.m(serialDescriptor, 0, str);
        if (d.z() || l != null) {
            d.s(serialDescriptor, 1, u500.a, l);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 2, oqm0.a, str2);
        }
        d.n(serialDescriptor, 3, kSerializerArr[3], videoDto.d);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
