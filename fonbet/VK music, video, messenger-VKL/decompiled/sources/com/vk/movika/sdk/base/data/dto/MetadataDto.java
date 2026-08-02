package com.vk.movika.sdk.base.data.dto;

import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.i5s;
import xsna.imi0;
import xsna.mq;
import xsna.n6j;
import xsna.xe9;

@imi0
/* loaded from: classes3.dex */
public final class MetadataDto {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public static final class Companion {
        public final KSerializer<MetadataDto> serializer() {
            return MetadataDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MetadataDto(int i, String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
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
            this.c = num;
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
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataDto)) {
            return false;
        }
        MetadataDto metadataDto = (MetadataDto) obj;
        return epx.f(this.a, metadataDto.a) && epx.f(this.b, metadataDto.b) && epx.f(this.c, metadataDto.c) && epx.f(this.d, metadataDto.d) && epx.f(this.e, metadataDto.e) && epx.f(this.f, metadataDto.f) && epx.f(this.g, metadataDto.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("MetadataDto(id=", this.a, ", version=", this.b, ", build=");
        mq.b(this.c, ", created=", this.d, ", updated=", a);
        n6j.b(a, this.e, ", initChapterId=", this.f, ", media=");
        return i5s.a(a, this.g, ")");
    }

    public MetadataDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
