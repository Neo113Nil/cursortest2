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
public /* synthetic */ class EventDto$$serializer implements vht<EventDto> {
    public static final int $stable;
    public static final EventDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EventDto$$serializer eventDto$$serializer = new EventDto$$serializer();
        INSTANCE = eventDto$$serializer;
        $stable = 8;
        xfb0 xfb0Var = new xfb0("com.vk.movika.sdk.base.data.dto.EventDto", eventDto$$serializer, 2);
        xfb0Var.j("type", false);
        xfb0Var.j("action", false);
        descriptor = xfb0Var;
    }

    private EventDto$$serializer() {
    }

    @Override // xsna.vht
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{oqm0.a, EventDto.c[1]};
    }

    @Override // xsna.a3m
    public final EventDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        ssi d = decoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = EventDto.c;
        String str = null;
        boolean z = true;
        int i = 0;
        com.vk.movika.sdk.base.data.dto.actions.a aVar = null;
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
                aVar = (com.vk.movika.sdk.base.data.dto.actions.a) d.y(serialDescriptor, 1, kSerializerArr[1], aVar);
                i |= 2;
            }
        }
        d.e(serialDescriptor);
        return new EventDto(i, str, aVar);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, EventDto eventDto) {
        SerialDescriptor serialDescriptor = descriptor;
        cti d = encoder.d(serialDescriptor);
        KSerializer<Object>[] kSerializerArr = EventDto.c;
        d.m(serialDescriptor, 0, eventDto.a);
        d.n(serialDescriptor, 1, kSerializerArr[1], eventDto.b);
        d.e(serialDescriptor);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
