package com.vk.movika.sdk.base.data.dto;

import com.ironsource.X3;
import com.vk.movika.sdk.base.data.dto.MetadataDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class MetadataDto$$serializer implements vht<MetadataDto> {
    public static final int $stable;
    public static final MetadataDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MetadataDto$$serializer metadataDto$$serializer = new MetadataDto$$serializer();
        INSTANCE = metadataDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.MetadataDto", metadataDto$$serializer, 7);
        xfb0Var.j("id", true);
        xfb0Var.j("version", true);
        xfb0Var.j("build", true);
        xfb0Var.j("created", true);
        xfb0Var.j("updated", true);
        xfb0Var.j("initChapterId", true);
        xfb0Var.j(X3.i.I0, true);
        descriptor = xfb0Var;
    }

    private MetadataDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(n9x.a), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final MetadataDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str2 = (String) d.i(serialDescriptor, 1, oqm0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) d.i(serialDescriptor, 2, n9x.a, num);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) d.i(serialDescriptor, 3, oqm0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) d.i(serialDescriptor, 4, oqm0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) d.i(serialDescriptor, 5, oqm0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) d.i(serialDescriptor, 6, oqm0.a, str6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(serialDescriptor);
        return new MetadataDto(i, str, str2, num, str3, str4, str5, str6);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, MetadataDto metadataDto) {
        String str = metadataDto.g;
        String str2 = metadataDto.f;
        String str3 = metadataDto.e;
        String str4 = metadataDto.d;
        Integer num = metadataDto.c;
        String str5 = metadataDto.b;
        String str6 = metadataDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        MetadataDto.Companion companion = MetadataDto.Companion;
        if (d.z() || str6 != null) {
            d.s(serialDescriptor, 0, oqm0.a, str6);
        }
        if (d.z() || str5 != null) {
            d.s(serialDescriptor, 1, oqm0.a, str5);
        }
        if (d.z() || num != null) {
            d.s(serialDescriptor, 2, n9x.a, num);
        }
        if (d.z() || str4 != null) {
            d.s(serialDescriptor, 3, oqm0.a, str4);
        }
        if (d.z() || str3 != null) {
            d.s(serialDescriptor, 4, oqm0.a, str3);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 5, oqm0.a, str2);
        }
        if (d.z() || str != null) {
            d.s(serialDescriptor, 6, oqm0.a, str);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
