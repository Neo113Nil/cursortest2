package com.vk.sdk.api.streaming.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zr;

/* compiled from: StreamingGetStemResponseDto.kt */
/* loaded from: classes5.dex */
public final class StreamingGetStemResponseDto {

    @pmi0("stem")
    private final String stem;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamingGetStemResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamingGetStemResponseDto) && epx.f(this.stem, ((StreamingGetStemResponseDto) obj).stem);
    }

    public final int hashCode() {
        String str = this.stem;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr.a("StreamingGetStemResponseDto(stem=", this.stem, ")");
    }

    public StreamingGetStemResponseDto(String str) {
        this.stem = str;
    }

    public /* synthetic */ StreamingGetStemResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
