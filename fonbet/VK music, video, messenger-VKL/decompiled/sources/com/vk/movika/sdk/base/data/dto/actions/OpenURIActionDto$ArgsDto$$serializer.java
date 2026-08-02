package com.vk.movika.sdk.base.data.dto.actions;

import com.vk.movika.sdk.base.data.dto.actions.OpenURIActionDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.oqm0;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class OpenURIActionDto$ArgsDto$$serializer implements vht<OpenURIActionDto.ArgsDto> {
    public static final int $stable;
    public static final OpenURIActionDto$ArgsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OpenURIActionDto$ArgsDto$$serializer openURIActionDto$ArgsDto$$serializer = new OpenURIActionDto$ArgsDto$$serializer();
        INSTANCE = openURIActionDto$ArgsDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.actions.OpenURIActionDto.ArgsDto", openURIActionDto$ArgsDto$$serializer, 2);
        xfb0Var.j("uri", false);
        xfb0Var.j("isDetachContainer", true);
        descriptor = xfb0Var;
    }

    private OpenURIActionDto$ArgsDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{oqm0.a, xn8.a(g18.a)};
    }

    @Override // xsna.a3m
    public final OpenURIActionDto.ArgsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                bool = (Boolean) d.i(serialDescriptor, 1, g18.a, bool);
                i |= 2;
            }
        }
        d.e(serialDescriptor);
        return new OpenURIActionDto.ArgsDto(i, str, bool);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, OpenURIActionDto.ArgsDto argsDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        String str = argsDto.a;
        Boolean bool = argsDto.b;
        d.m(serialDescriptor, 0, str);
        if (d.z() || bool != null) {
            d.s(serialDescriptor, 1, g18.a, bool);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
