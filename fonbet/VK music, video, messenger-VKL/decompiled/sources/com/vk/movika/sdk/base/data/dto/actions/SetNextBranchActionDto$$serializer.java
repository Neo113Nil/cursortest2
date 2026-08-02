package com.vk.movika.sdk.base.data.dto.actions;

import com.vk.movika.sdk.base.data.dto.actions.SetNextBranchActionDto;
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
public /* synthetic */ class SetNextBranchActionDto$$serializer implements vht<SetNextBranchActionDto> {
    public static final int $stable;
    public static final SetNextBranchActionDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SetNextBranchActionDto$$serializer setNextBranchActionDto$$serializer = new SetNextBranchActionDto$$serializer();
        INSTANCE = setNextBranchActionDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("setNextBranch", setNextBranchActionDto$$serializer, 1);
        xfb0Var.j("args", false);
        descriptor = xfb0Var;
    }

    private SetNextBranchActionDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BranchActionArgsDto$$serializer.INSTANCE};
    }

    @Override // xsna.a3m
    public final SetNextBranchActionDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        BranchActionArgsDto branchActionArgsDto = null;
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
                branchActionArgsDto = (BranchActionArgsDto) d.y(serialDescriptor, 0, BranchActionArgsDto$$serializer.INSTANCE, branchActionArgsDto);
                i = 1;
            }
        }
        d.e(serialDescriptor);
        return new SetNextBranchActionDto(i, branchActionArgsDto);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, SetNextBranchActionDto setNextBranchActionDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        SetNextBranchActionDto.Companion companion = SetNextBranchActionDto.Companion;
        d.n(serialDescriptor, 0, BranchActionArgsDto$$serializer.INSTANCE, setNextBranchActionDto.a);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
