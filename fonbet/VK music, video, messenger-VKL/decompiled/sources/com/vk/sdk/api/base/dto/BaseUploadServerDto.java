package com.vk.sdk.api.base.dto;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: BaseUploadServerDto.kt */
/* loaded from: classes5.dex */
public final class BaseUploadServerDto {

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    public BaseUploadServerDto(String str) {
        this.uploadUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseUploadServerDto) && epx.f(this.uploadUrl, ((BaseUploadServerDto) obj).uploadUrl);
    }

    public final int hashCode() {
        return this.uploadUrl.hashCode();
    }

    public final String toString() {
        return zr.a("BaseUploadServerDto(uploadUrl=", this.uploadUrl, ")");
    }
}
