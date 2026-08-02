package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class MediaDto$$serializer implements vht<MediaDto> {
    public static final int $stable;
    public static final MediaDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MediaDto$$serializer mediaDto$$serializer = new MediaDto$$serializer();
        INSTANCE = mediaDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.MediaDto", mediaDto$$serializer, 1);
        xfb0Var.j("videos", false);
        descriptor = xfb0Var;
    }

    private MediaDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MediaDto.b[0]};
    }

    @Override // xsna.a3m
    public final MediaDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = MediaDto.b;
        List list = null;
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
                list = (List) d.y(serialDescriptor, 0, kSerializerArr[0], list);
                i = 1;
            }
        }
        d.e(serialDescriptor);
        return new MediaDto(i, list);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, MediaDto mediaDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        d.n(serialDescriptor, 0, MediaDto.b[0], mediaDto.a);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
