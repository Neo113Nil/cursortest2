package com.vk.movika.sdk.base.data.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.movika.sdk.base.data.dto.FontDto;
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
public /* synthetic */ class FontDto$$serializer implements vht<FontDto> {
    public static final int $stable;
    public static final FontDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FontDto$$serializer fontDto$$serializer = new FontDto$$serializer();
        INSTANCE = fontDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.FontDto", fontDto$$serializer, 3);
        xfb0Var.j("family", true);
        xfb0Var.j(TtmlNode.TAG_STYLE, true);
        xfb0Var.j("weight", true);
        descriptor = xfb0Var;
    }

    private FontDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var)};
    }

    @Override // xsna.a3m
    public final FontDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = (String) d.i(serialDescriptor, 0, oqm0.a, str);
                i |= 1;
            } else if (m == 1) {
                str2 = (String) d.i(serialDescriptor, 1, oqm0.a, str2);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                str3 = (String) d.i(serialDescriptor, 2, oqm0.a, str3);
                i |= 4;
            }
        }
        d.e(serialDescriptor);
        return new FontDto(i, str, str2, str3);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, FontDto fontDto) {
        String str = fontDto.c;
        String str2 = fontDto.b;
        String str3 = fontDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        FontDto.Companion companion = FontDto.Companion;
        if (d.z() || str3 != null) {
            d.s(serialDescriptor, 0, oqm0.a, str3);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 1, oqm0.a, str2);
        }
        if (d.z() || str != null) {
            d.s(serialDescriptor, 2, oqm0.a, str);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
