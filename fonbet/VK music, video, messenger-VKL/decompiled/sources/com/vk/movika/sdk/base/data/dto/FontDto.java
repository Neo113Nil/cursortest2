package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.i5s;
import xsna.imi0;
import xsna.xe9;

@imi0
/* loaded from: classes3.dex */
public final class FontDto {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final String c;

    public static final class Companion {
        public final KSerializer<FontDto> serializer() {
            return FontDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FontDto(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontDto)) {
            return false;
        }
        FontDto fontDto = (FontDto) obj;
        return epx.f(this.a, fontDto.a) && epx.f(this.b, fontDto.b) && epx.f(this.c, fontDto.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return i5s.a(xe9.a("FontDto(family=", this.a, ", style=", this.b, ", weight="), this.c, ")");
    }

    public FontDto() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
