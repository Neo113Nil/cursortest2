package com.vk.sdk.api.appWidgets.dto;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zr;

/* compiled from: AppWidgetsGetGroupImageUploadServerResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppWidgetsGetGroupImageUploadServerResponseDto {

    @pmi0(ApiProtocol.KEY_UPLOAD_URL)
    private final String uploadUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public AppWidgetsGetGroupImageUploadServerResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppWidgetsGetGroupImageUploadServerResponseDto) && epx.f(this.uploadUrl, ((AppWidgetsGetGroupImageUploadServerResponseDto) obj).uploadUrl);
    }

    public final int hashCode() {
        String str = this.uploadUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr.a("AppWidgetsGetGroupImageUploadServerResponseDto(uploadUrl=", this.uploadUrl, ")");
    }

    public AppWidgetsGetGroupImageUploadServerResponseDto(String str) {
        this.uploadUrl = str;
    }

    public /* synthetic */ AppWidgetsGetGroupImageUploadServerResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
