package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.fw3;
import xsna.imi0;
import xsna.sp;
import xsna.urd0;
import xsna.vq;
import xsna.xe9;
import xsna.yk3;

@imi0
/* loaded from: classes3.dex */
public final class ChapterDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] g = {null, null, new yk3(ContainerDto$$serializer.INSTANCE), new yk3(BranchDto$$serializer.INSTANCE), new yk3(EventDto$$serializer.INSTANCE), null};
    public final String a;
    public final String b;
    public final List<ContainerDto> c;
    public final List<BranchDto> d;
    public final List<EventDto> e;
    public final String f;

    public static final class Companion {
        public final KSerializer<ChapterDto> serializer() {
            return ChapterDto$$serializer.INSTANCE;
        }
    }

    public ChapterDto(int i, String str, String str2, List list, List list2, List list3, String str3) {
        if (3 != (i & 3)) {
            sp.x(i, 3, ChapterDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = EmptyList.b;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.b;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.b;
        } else {
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChapterDto)) {
            return false;
        }
        ChapterDto chapterDto = (ChapterDto) obj;
        return epx.f(this.a, chapterDto.a) && epx.f(this.b, chapterDto.b) && epx.f(this.c, chapterDto.c) && epx.f(this.d, chapterDto.d) && epx.f(this.e, chapterDto.e) && epx.f(this.f, chapterDto.f);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        List<EventDto> list = this.e;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = xe9.a("ChapterDto(id=", this.a, ", videoId=", this.b, ", containers=");
        vq.d(a, this.c, ", branches=", this.d, ", events=");
        a.append(this.e);
        a.append(", order=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
