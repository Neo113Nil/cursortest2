package com.vk.sdk.api.utils.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsLinkCheckedDto.kt */
/* loaded from: classes5.dex */
public final class UtilsLinkCheckedDto {

    @pmi0("link")
    private final String link;

    @pmi0("status")
    private final UtilsLinkCheckedStatusDto status;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsLinkCheckedDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLinkCheckedDto)) {
            return false;
        }
        UtilsLinkCheckedDto utilsLinkCheckedDto = (UtilsLinkCheckedDto) obj;
        return epx.f(this.link, utilsLinkCheckedDto.link) && this.status == utilsLinkCheckedDto.status;
    }

    public final int hashCode() {
        String str = this.link;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UtilsLinkCheckedStatusDto utilsLinkCheckedStatusDto = this.status;
        return hashCode + (utilsLinkCheckedStatusDto != null ? utilsLinkCheckedStatusDto.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsLinkCheckedDto(link=" + this.link + ", status=" + this.status + ")";
    }

    public UtilsLinkCheckedDto(String str, UtilsLinkCheckedStatusDto utilsLinkCheckedStatusDto) {
        this.link = str;
        this.status = utilsLinkCheckedStatusDto;
    }

    public /* synthetic */ UtilsLinkCheckedDto(String str, UtilsLinkCheckedStatusDto utilsLinkCheckedStatusDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : utilsLinkCheckedStatusDto);
    }
}
