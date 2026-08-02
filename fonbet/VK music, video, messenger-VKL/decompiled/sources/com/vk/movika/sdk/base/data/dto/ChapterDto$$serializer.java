package com.vk.movika.sdk.base.data.dto;

import com.ironsource.C4504q2;
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
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class ChapterDto$$serializer implements vht<ChapterDto> {
    public static final int $stable;
    public static final ChapterDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChapterDto$$serializer chapterDto$$serializer = new ChapterDto$$serializer();
        INSTANCE = chapterDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.ChapterDto", chapterDto$$serializer, 6);
        xfb0Var.j("id", false);
        xfb0Var.j("videoId", false);
        xfb0Var.j("containers", true);
        xfb0Var.j("branches", true);
        xfb0Var.j("events", true);
        xfb0Var.j(C4504q2.u, true);
        descriptor = xfb0Var;
    }

    private ChapterDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ChapterDto.g;
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, kSerializerArr[2], kSerializerArr[3], xn8.a(kSerializerArr[4]), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final ChapterDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ChapterDto.g;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
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
                    list = (List) d.y(serialDescriptor, 2, kSerializerArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) d.y(serialDescriptor, 3, kSerializerArr[3], list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) d.i(serialDescriptor, 4, kSerializerArr[4], list3);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) d.i(serialDescriptor, 5, oqm0.a, str3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(serialDescriptor);
        return new ChapterDto(i, str, str2, list, list2, list3, str3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, ChapterDto chapterDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = ChapterDto.g;
        String str = chapterDto.a;
        String str2 = chapterDto.f;
        List<EventDto> list = chapterDto.e;
        List<BranchDto> list2 = chapterDto.d;
        List<ContainerDto> list3 = chapterDto.c;
        d.m(serialDescriptor, 0, str);
        d.m(serialDescriptor, 1, chapterDto.b);
        if (d.z() || !epx.f(list3, EmptyList.b)) {
            d.n(serialDescriptor, 2, kSerializerArr[2], list3);
        }
        if (d.z() || !epx.f(list2, EmptyList.b)) {
            d.n(serialDescriptor, 3, kSerializerArr[3], list2);
        }
        if (d.z() || !epx.f(list, EmptyList.b)) {
            d.s(serialDescriptor, 4, kSerializerArr[4], list);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 5, oqm0.a, str2);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
