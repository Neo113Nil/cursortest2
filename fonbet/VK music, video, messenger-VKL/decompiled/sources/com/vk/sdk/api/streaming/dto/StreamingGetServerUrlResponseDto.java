package com.vk.sdk.api.streaming.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: StreamingGetServerUrlResponseDto.kt */
/* loaded from: classes5.dex */
public final class StreamingGetServerUrlResponseDto {

    @pmi0("endpoint")
    private final String endpoint;

    @pmi0("key")
    private final String key;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamingGetServerUrlResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingGetServerUrlResponseDto)) {
            return false;
        }
        StreamingGetServerUrlResponseDto streamingGetServerUrlResponseDto = (StreamingGetServerUrlResponseDto) obj;
        return epx.f(this.endpoint, streamingGetServerUrlResponseDto.endpoint) && epx.f(this.key, streamingGetServerUrlResponseDto.key);
    }

    public final int hashCode() {
        String str = this.endpoint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ss9.a("StreamingGetServerUrlResponseDto(endpoint=", this.endpoint, ", key=", this.key, ")");
    }

    public StreamingGetServerUrlResponseDto(String str, String str2) {
        this.endpoint = str;
        this.key = str2;
    }

    public /* synthetic */ StreamingGetServerUrlResponseDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
