package com.vk.movika.sdk.base.data.dto;

import com.ironsource.X3;
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
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class ManifestDto$$serializer implements vht<ManifestDto> {
    public static final int $stable;
    public static final ManifestDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ManifestDto$$serializer manifestDto$$serializer = new ManifestDto$$serializer();
        INSTANCE = manifestDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.ManifestDto", manifestDto$$serializer, 3);
        xfb0Var.j("metadata", false);
        xfb0Var.j("chapters", false);
        xfb0Var.j(X3.i.I0, true);
        descriptor = xfb0Var;
    }

    private ManifestDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MetadataDto$$serializer.INSTANCE, ManifestDto.d[1], xn8.a(MediaDto$$serializer.INSTANCE)};
    }

    @Override // xsna.a3m
    public final ManifestDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ManifestDto.d;
        MetadataDto metadataDto = null;
        boolean z = true;
        int i = 0;
        List list = null;
        MediaDto mediaDto = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                metadataDto = (MetadataDto) d.y(serialDescriptor, 0, MetadataDto$$serializer.INSTANCE, metadataDto);
                i |= 1;
            } else if (m == 1) {
                list = (List) d.y(serialDescriptor, 1, kSerializerArr[1], list);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                mediaDto = (MediaDto) d.i(serialDescriptor, 2, MediaDto$$serializer.INSTANCE, mediaDto);
                i |= 4;
            }
        }
        d.e(serialDescriptor);
        return new ManifestDto(i, metadataDto, list, mediaDto);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, ManifestDto manifestDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ManifestDto.d;
        MetadataDto$$serializer metadataDto$$serializer = MetadataDto$$serializer.INSTANCE;
        MetadataDto metadataDto = manifestDto.a;
        MediaDto mediaDto = manifestDto.c;
        d.n(serialDescriptor, 0, metadataDto$$serializer, metadataDto);
        d.n(serialDescriptor, 1, kSerializerArr[1], manifestDto.b);
        if (d.z() || mediaDto != null) {
            d.s(serialDescriptor, 2, MediaDto$$serializer.INSTANCE, mediaDto);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
