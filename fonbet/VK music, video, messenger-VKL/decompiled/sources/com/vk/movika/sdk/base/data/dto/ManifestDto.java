package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.fw3;
import xsna.imi0;
import xsna.sp;
import xsna.yk3;

@imi0
/* loaded from: classes3.dex */
public final class ManifestDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] d = {null, new yk3(ChapterDto$$serializer.INSTANCE), null};
    public final MetadataDto a;
    public final List<ChapterDto> b;
    public final MediaDto c;

    public static final class Companion {
        public final KSerializer<ManifestDto> serializer() {
            return ManifestDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ManifestDto(int i, MetadataDto metadataDto, List list, MediaDto mediaDto) {
        if (3 != (i & 3)) {
            sp.x(i, 3, ManifestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = metadataDto;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = mediaDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManifestDto)) {
            return false;
        }
        ManifestDto manifestDto = (ManifestDto) obj;
        return epx.f(this.a, manifestDto.a) && epx.f(this.b, manifestDto.b) && epx.f(this.c, manifestDto.c);
    }

    public final int hashCode() {
        int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
        MediaDto mediaDto = this.c;
        return a + (mediaDto == null ? 0 : mediaDto.a.hashCode());
    }

    public final String toString() {
        return "ManifestDto(metadata=" + this.a + ", chapters=" + this.b + ", media=" + this.c + ")";
    }
}
