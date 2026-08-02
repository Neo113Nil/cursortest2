package com.vk.sdk.api.apps.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: AppsGetLastUploadedVersionResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetLastUploadedVersionResponseDto {

    @pmi0("version")
    private final String version;

    public AppsGetLastUploadedVersionResponseDto(String str) {
        this.version = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsGetLastUploadedVersionResponseDto) && epx.f(this.version, ((AppsGetLastUploadedVersionResponseDto) obj).version);
    }

    public final int hashCode() {
        return this.version.hashCode();
    }

    public final String toString() {
        return zr.a("AppsGetLastUploadedVersionResponseDto(version=", this.version, ")");
    }
}
