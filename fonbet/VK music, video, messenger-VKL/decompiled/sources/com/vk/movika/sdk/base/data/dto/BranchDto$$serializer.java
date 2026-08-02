package com.vk.movika.sdk.base.data.dto;

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
import xsna.v6o;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

@ozl
/* loaded from: classes3.dex */
public /* synthetic */ class BranchDto$$serializer implements vht<BranchDto> {
    public static final int $stable;
    public static final BranchDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BranchDto$$serializer branchDto$$serializer = new BranchDto$$serializer();
        INSTANCE = branchDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.BranchDto", branchDto$$serializer, 5);
        xfb0Var.j("id", false);
        xfb0Var.j("chapterId", false);
        xfb0Var.j("weight", true);
        xfb0Var.j("manifestURL", true);
        xfb0Var.j("isDefault", true);
        descriptor = xfb0Var;
    }

    private BranchDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        return new KSerializer[]{oqm0Var, oqm0Var, xn8.a(v6o.a), xn8.a(oqm0Var), xn8.a(g18.a)};
    }

    @Override // xsna.a3m
    public final BranchDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        int i = 0;
        String str = null;
        String str2 = null;
        Double d2 = null;
        String str3 = null;
        Boolean bool = null;
        boolean z = true;
        while (z) {
            int m = d.m(serialDescriptor);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                str = d.u(serialDescriptor, 0);
                i |= 1;
            } else if (m == 1) {
                str2 = d.u(serialDescriptor, 1);
                i |= 2;
            } else if (m == 2) {
                d2 = (Double) d.i(serialDescriptor, 2, v6o.a, d2);
                i |= 4;
            } else if (m == 3) {
                str3 = (String) d.i(serialDescriptor, 3, oqm0.a, str3);
                i |= 8;
            } else {
                if (m != 4) {
                    throw new UnknownFieldException(m);
                }
                bool = (Boolean) d.i(serialDescriptor, 4, g18.a, bool);
                i |= 16;
            }
        }
        d.e(serialDescriptor);
        return new BranchDto(i, str, str2, d2, str3, bool);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, BranchDto branchDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        String str = branchDto.a;
        Boolean bool = branchDto.e;
        String str2 = branchDto.d;
        Double d2 = branchDto.c;
        d.m(serialDescriptor, 0, str);
        d.m(serialDescriptor, 1, branchDto.b);
        if (d.z() || d2 != null) {
            d.s(serialDescriptor, 2, v6o.a, d2);
        }
        if (d.z() || str2 != null) {
            d.s(serialDescriptor, 3, oqm0.a, str2);
        }
        if (d.z() || bool != null) {
            d.s(serialDescriptor, 4, g18.a, bool);
        }
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
