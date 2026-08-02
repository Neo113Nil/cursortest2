package com.vk.movika.sdk.base.data.dto;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.fpf0;
import xsna.imi0;
import xsna.sp;
import xsna.tub0;

@imi0
/* loaded from: classes3.dex */
public final class EventDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] c = {null, new tub0(fpf0.a(com.vk.movika.sdk.base.data.dto.actions.a.class), new Annotation[0])};
    public final String a;
    public final com.vk.movika.sdk.base.data.dto.actions.a b;

    public static final class Companion {
        public final KSerializer<EventDto> serializer() {
            return EventDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EventDto(int i, String str, com.vk.movika.sdk.base.data.dto.actions.a aVar) {
        if (3 != (i & 3)) {
            sp.x(i, 3, EventDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventDto)) {
            return false;
        }
        EventDto eventDto = (EventDto) obj;
        return epx.f(this.a, eventDto.a) && epx.f(this.b, eventDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventDto(type=" + this.a + ", action=" + this.b + ")";
    }
}
