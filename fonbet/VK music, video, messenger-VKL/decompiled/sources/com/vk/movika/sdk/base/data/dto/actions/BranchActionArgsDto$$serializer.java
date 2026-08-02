package com.vk.movika.sdk.base.data.dto.actions;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.epx;
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
public /* synthetic */ class BranchActionArgsDto$$serializer implements vht<BranchActionArgsDto> {
    public static final int $stable;
    public static final BranchActionArgsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BranchActionArgsDto$$serializer branchActionArgsDto$$serializer = new BranchActionArgsDto$$serializer();
        INSTANCE = branchActionArgsDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.actions.BranchActionArgsDto", branchActionArgsDto$$serializer, 3);
        xfb0Var.j("branchId", false);
        xfb0Var.j("shouldOpenNow", true);
        xfb0Var.j("isDetachContainer", true);
        descriptor = xfb0Var;
    }

    private BranchActionArgsDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        g18 g18Var = g18.a;
        return new KSerializer[]{oqm0.a, xn8.a(g18Var), xn8.a(g18Var)};
    }

    @Override // xsna.a3m
    public final BranchActionArgsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(serialDescriptor, 0);
                i |= 1;
            } else if (m == 1) {
                bool = (Boolean) d.i(serialDescriptor, 1, g18.a, bool);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                bool2 = (Boolean) d.i(serialDescriptor, 2, g18.a, bool2);
                i |= 4;
            }
        }
        d.e(serialDescriptor);
        return new BranchActionArgsDto(i, bool, bool2, str);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, BranchActionArgsDto branchActionArgsDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        String str = branchActionArgsDto.a;
        Boolean bool = branchActionArgsDto.c;
        Boolean bool2 = branchActionArgsDto.b;
        d.m(serialDescriptor, 0, str);
        if (d.z() || bool2 != null) {
            d.s(serialDescriptor, 1, g18.a, bool2);
        }
        if (d.z() || !epx.f(bool, Boolean.TRUE)) {
            d.s(serialDescriptor, 2, g18.a, bool);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
