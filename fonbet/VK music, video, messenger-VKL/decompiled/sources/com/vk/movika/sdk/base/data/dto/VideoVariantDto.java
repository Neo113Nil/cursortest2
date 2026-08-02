package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.i5s;
import xsna.imi0;
import xsna.n6j;
import xsna.sp;
import xsna.urd0;
import xsna.xe9;

@imi0
/* loaded from: classes3.dex */
public final class VideoVariantDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] j = {null, null, null, null, null, null, null, null, new b()};
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;

    public static final class Companion {
        public final KSerializer<VideoVariantDto> serializer() {
            return VideoVariantDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoVariantDto(int i, String str, String str2, Long l, String str3, String str4, Long l2, String str5, String str6, String str7) {
        if (2 != (i & 2)) {
            sp.x(i, 2, VideoVariantDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVariantDto)) {
            return false;
        }
        VideoVariantDto videoVariantDto = (VideoVariantDto) obj;
        return epx.f(this.a, videoVariantDto.a) && epx.f(this.b, videoVariantDto.b) && epx.f(this.c, videoVariantDto.c) && epx.f(this.d, videoVariantDto.d) && epx.f(this.e, videoVariantDto.e) && epx.f(this.f, videoVariantDto.f) && epx.f(this.g, videoVariantDto.g) && epx.f(this.h, videoVariantDto.h) && epx.f(this.i, videoVariantDto.i);
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Long l = this.c;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("VideoVariantDto(url=", this.a, ", type=", this.b, ", size=");
        a.append(this.c);
        a.append(", standard=");
        a.append(this.d);
        a.append(", resolution=");
        a.append(this.e);
        a.append(", bitrate=");
        a.append(this.f);
        a.append(", cover=");
        n6j.b(a, this.g, ", preview=", this.h, ", payload=");
        return i5s.a(a, this.i, ")");
    }
}
