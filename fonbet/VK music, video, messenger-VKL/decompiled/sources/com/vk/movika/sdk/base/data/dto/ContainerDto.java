package com.vk.movika.sdk.base.data.dto;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import xsna.bh10;
import xsna.epx;
import xsna.fpf0;
import xsna.fw3;
import xsna.imi0;
import xsna.rqi;
import xsna.sp;
import xsna.tub0;
import xsna.urd0;
import xsna.yk3;

@imi0
/* loaded from: classes3.dex */
public final class ContainerDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] j = {null, null, null, null, new yk3(ControlDto$$serializer.INSTANCE), null, new tub0(fpf0.a(com.vk.movika.sdk.base.data.dto.actions.a.class), new Annotation[0]), new b(), new yk3(EventDto$$serializer.INSTANCE)};
    public final String a;
    public final long b;
    public final String c;
    public final LayoutDto d;
    public final List<ControlDto> e;
    public final Long f;
    public final com.vk.movika.sdk.base.data.dto.actions.a g;
    public final String h;
    public final List<EventDto> i;

    public static final class Companion {
        public final KSerializer<ContainerDto> serializer() {
            return ContainerDto$$serializer.INSTANCE;
        }
    }

    public ContainerDto(int i, String str, long j2, String str2, LayoutDto layoutDto, List list, Long l, com.vk.movika.sdk.base.data.dto.actions.a aVar, String str3, List list2) {
        if (7 != (i & 7)) {
            sp.x(i, 7, ContainerDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j2;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = layoutDto;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.b;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = aVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContainerDto)) {
            return false;
        }
        ContainerDto containerDto = (ContainerDto) obj;
        return epx.f(this.a, containerDto.a) && this.b == containerDto.b && epx.f(this.c, containerDto.c) && epx.f(this.d, containerDto.d) && epx.f(this.e, containerDto.e) && epx.f(this.f, containerDto.f) && epx.f(this.g, containerDto.g) && epx.f(this.h, containerDto.h) && epx.f(this.i, containerDto.i);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        LayoutDto layoutDto = this.d;
        int a2 = fw3.a((a + (layoutDto == null ? 0 : layoutDto.a.hashCode())) * 31, 31, this.e);
        Long l = this.f;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        com.vk.movika.sdk.base.data.dto.actions.a aVar = this.g;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<EventDto> list = this.i;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder d = rqi.d(this.b, "ContainerDto(id=", this.a, ", startTime=");
        d.append(", type=");
        d.append(this.c);
        d.append(", layout=");
        d.append(this.d);
        d.append(", controls=");
        d.append(this.e);
        d.append(", endTime=");
        d.append(this.f);
        d.append(", containerAction=");
        d.append(this.g);
        d.append(", props=");
        d.append(this.h);
        d.append(", events=");
        d.append(this.i);
        d.append(")");
        return d.toString();
    }
}
