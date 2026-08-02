package com.vk.movika.sdk.base.data.dto;

import com.huawei.hms.adapter.internal.CommonCode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
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
public /* synthetic */ class VideoVariantDto$$serializer implements vht<VideoVariantDto> {
    public static final int $stable;
    public static final VideoVariantDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VideoVariantDto$$serializer videoVariantDto$$serializer = new VideoVariantDto$$serializer();
        INSTANCE = videoVariantDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.VideoVariantDto", videoVariantDto$$serializer, 9);
        xfb0Var.j("url", true);
        xfb0Var.j("type", false);
        xfb0Var.j("size", true);
        xfb0Var.j("standard", true);
        xfb0Var.j(CommonCode.MapKey.HAS_RESOLUTION, true);
        xfb0Var.j(BadConnectionSignaling.KEY_BAD_NET_BITRATE, true);
        xfb0Var.j("cover", true);
        xfb0Var.j("preview", true);
        xfb0Var.j("payload", true);
        descriptor = xfb0Var;
    }

    private VideoVariantDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<Object>[] kSerializerArr = VideoVariantDto.j;
        oqm0 oqm0Var = oqm0.a;
        KSerializer<?> a = xn8.a(oqm0Var);
        u500 u500Var = u500.a;
        return new KSerializer[]{a, oqm0Var, xn8.a(u500Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(u500Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(kSerializerArr[8])};
    }

    @Override // xsna.a3m
    public final VideoVariantDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = VideoVariantDto.j;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
        String str6 = null;
        String str7 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int m = d.m(serialDescriptor);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) d.i(serialDescriptor, 0, oqm0.a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = d.u(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) d.i(serialDescriptor, 2, u500.a, l);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) d.i(serialDescriptor, 3, oqm0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) d.i(serialDescriptor, 4, oqm0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) d.i(serialDescriptor, 5, u500.a, l2);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) d.i(serialDescriptor, 6, oqm0.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) d.i(serialDescriptor, 7, oqm0.a, str7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) d.i(serialDescriptor, 8, kSerializerArr[8], str);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(serialDescriptor);
        return new VideoVariantDto(i, str2, str3, l, str4, str5, l2, str6, str7, str);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, VideoVariantDto videoVariantDto) {
        String str = videoVariantDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = VideoVariantDto.j;
        if (d.z() || str != null) {
            d.s(serialDescriptor, 0, oqm0.a, str);
        }
        String str2 = videoVariantDto.b;
        String str3 = videoVariantDto.i;
        String str4 = videoVariantDto.h;
        String str5 = videoVariantDto.g;
        Long l = videoVariantDto.f;
        String str6 = videoVariantDto.e;
        String str7 = videoVariantDto.d;
        Long l2 = videoVariantDto.c;
        d.m(serialDescriptor, 1, str2);
        if (d.z() || l2 != null) {
            d.s(serialDescriptor, 2, u500.a, l2);
        }
        if (d.z() || str7 != null) {
            d.s(serialDescriptor, 3, oqm0.a, str7);
        }
        if (d.z() || str6 != null) {
            d.s(serialDescriptor, 4, oqm0.a, str6);
        }
        if (d.z() || l != null) {
            d.s(serialDescriptor, 5, u500.a, l);
        }
        if (d.z() || str5 != null) {
            d.s(serialDescriptor, 6, oqm0.a, str5);
        }
        if (d.z() || str4 != null) {
            d.s(serialDescriptor, 7, oqm0.a, str4);
        }
        if (d.z() || str3 != null) {
            d.s(serialDescriptor, 8, kSerializerArr[8], str3);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
