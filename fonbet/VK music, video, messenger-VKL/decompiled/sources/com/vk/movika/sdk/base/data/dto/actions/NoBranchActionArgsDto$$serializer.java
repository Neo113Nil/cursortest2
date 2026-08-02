package com.vk.movika.sdk.base.data.dto.actions;

import com.vk.movika.sdk.base.data.dto.actions.NoBranchActionArgsDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class NoBranchActionArgsDto$$serializer implements vht<NoBranchActionArgsDto> {
    public static final int $stable;
    public static final NoBranchActionArgsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NoBranchActionArgsDto$$serializer noBranchActionArgsDto$$serializer = new NoBranchActionArgsDto$$serializer();
        INSTANCE = noBranchActionArgsDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.actions.NoBranchActionArgsDto", noBranchActionArgsDto$$serializer, 2);
        xfb0Var.j("shouldOpenNow", true);
        xfb0Var.j("isDetachContainer", true);
        descriptor = xfb0Var;
    }

    private NoBranchActionArgsDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        g18 g18Var = g18.a;
        return new KSerializer[]{xn8.a(g18Var), xn8.a(g18Var)};
    }

    @Override // xsna.a3m
    public final NoBranchActionArgsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        Boolean bool2 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                bool = (Boolean) d.i(serialDescriptor, 0, g18.a, bool);
                i |= 1;
            } else {
                if (m != 1) {
                    throw new UnknownFieldException(m);
                }
                bool2 = (Boolean) d.i(serialDescriptor, 1, g18.a, bool2);
                i |= 2;
            }
        }
        d.e(serialDescriptor);
        return new NoBranchActionArgsDto(i, bool, bool2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, NoBranchActionArgsDto noBranchActionArgsDto) {
        Boolean bool = noBranchActionArgsDto.b;
        Boolean bool2 = noBranchActionArgsDto.a;
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        NoBranchActionArgsDto.Companion companion = NoBranchActionArgsDto.Companion;
        if (d.z() || bool2 != null) {
            d.s(serialDescriptor, 0, g18.a, bool2);
        }
        if (d.z() || !epx.f(bool, Boolean.TRUE)) {
            d.s(serialDescriptor, 1, g18.a, bool);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
