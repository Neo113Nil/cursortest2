package com.vk.movika.sdk.base.data.dto.actions;

import com.vk.movika.sdk.base.data.dto.actions.OpenURIActionDto;
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
public /* synthetic */ class OpenURIActionDto$$serializer implements vht<OpenURIActionDto> {
    public static final int $stable;
    public static final OpenURIActionDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OpenURIActionDto$$serializer openURIActionDto$$serializer = new OpenURIActionDto$$serializer();
        INSTANCE = openURIActionDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("openURI", openURIActionDto$$serializer, 1);
        xfb0Var.j("args", false);
        descriptor = xfb0Var;
    }

    private OpenURIActionDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{OpenURIActionDto$ArgsDto$$serializer.INSTANCE};
    }

    @Override // xsna.a3m
    public final OpenURIActionDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        OpenURIActionDto.ArgsDto argsDto = null;
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
                argsDto = (OpenURIActionDto.ArgsDto) d.y(serialDescriptor, 0, OpenURIActionDto$ArgsDto$$serializer.INSTANCE, argsDto);
                i = 1;
            }
        }
        d.e(serialDescriptor);
        return new OpenURIActionDto(i, argsDto);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, OpenURIActionDto openURIActionDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        OpenURIActionDto.Companion companion = OpenURIActionDto.Companion;
        d.n(serialDescriptor, 0, OpenURIActionDto$ArgsDto$$serializer.INSTANCE, openURIActionDto.a);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
