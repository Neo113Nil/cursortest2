package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zr;

/* compiled from: StoriesUploadResultDto.kt */
/* loaded from: classes5.dex */
public final class StoriesUploadResultDto {

    @pmi0("upload_result")
    private final String uploadResult;

    /* JADX WARN: Multi-variable type inference failed */
    public StoriesUploadResultDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoriesUploadResultDto) && epx.f(this.uploadResult, ((StoriesUploadResultDto) obj).uploadResult);
    }

    public final int hashCode() {
        String str = this.uploadResult;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr.a("StoriesUploadResultDto(uploadResult=", this.uploadResult, ")");
    }

    public StoriesUploadResultDto(String str) {
        this.uploadResult = str;
    }

    public /* synthetic */ StoriesUploadResultDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
