package com.vk.movika.sdk.base.data.dto;

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

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class LayoutDto$$serializer implements vht<LayoutDto> {
    public static final int $stable;
    public static final LayoutDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LayoutDto$$serializer layoutDto$$serializer = new LayoutDto$$serializer();
        INSTANCE = layoutDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.LayoutDto", layoutDto$$serializer, 1);
        xfb0Var.j("type", false);
        descriptor = xfb0Var;
    }

    private LayoutDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{oqm0.a};
    }

    @Override // xsna.a3m
    public final LayoutDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        String str = null;
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
                str = d.u(serialDescriptor, 0);
                i = 1;
            }
        }
        d.e(serialDescriptor);
        return new LayoutDto(i, str);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, LayoutDto layoutDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        d.m(serialDescriptor, 0, layoutDto.a);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
