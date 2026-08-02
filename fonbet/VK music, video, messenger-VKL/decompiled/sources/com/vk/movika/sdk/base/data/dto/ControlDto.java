package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;
import xsna.urd0;
import xsna.xe9;
import xsna.yk3;

@imi0
/* loaded from: classes3.dex */
public final class ControlDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] g = {null, null, null, null, new yk3(EventDto$$serializer.INSTANCE), new b()};
    public final String a;
    public final String b;
    public final String c;
    public final LayoutParamsDto d;
    public final List<EventDto> e;
    public final String f;

    public static final class Companion {
        public final KSerializer<ControlDto> serializer() {
            return ControlDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ControlDto(int i, String str, String str2, String str3, LayoutParamsDto layoutParamsDto, List list, String str4) {
        if (3 != (i & 3)) {
            sp.x(i, 3, ControlDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = layoutParamsDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlDto)) {
            return false;
        }
        ControlDto controlDto = (ControlDto) obj;
        return epx.f(this.a, controlDto.a) && epx.f(this.b, controlDto.b) && epx.f(this.c, controlDto.c) && epx.f(this.d, controlDto.d) && epx.f(this.e, controlDto.e) && epx.f(this.f, controlDto.f);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        LayoutParamsDto layoutParamsDto = this.d;
        int hashCode2 = (hashCode + (layoutParamsDto == null ? 0 : layoutParamsDto.hashCode())) * 31;
        List<EventDto> list = this.e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("ControlDto(id=", this.a, ", type=", this.b, ", label=");
        a.append(this.c);
        a.append(", layoutParams=");
        a.append(this.d);
        a.append(", events=");
        a.append(this.e);
        a.append(", props=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
