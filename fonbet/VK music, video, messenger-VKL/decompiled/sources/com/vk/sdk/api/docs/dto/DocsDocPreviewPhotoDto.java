package com.vk.sdk.api.docs.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;
import xsna.zcl;

/* compiled from: DocsDocPreviewPhotoDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocPreviewPhotoDto {

    @pmi0("sizes")
    private final List<DocsDocPreviewPhotoSizesDto> sizes;

    /* JADX WARN: Multi-variable type inference failed */
    public DocsDocPreviewPhotoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DocsDocPreviewPhotoDto) && epx.f(this.sizes, ((DocsDocPreviewPhotoDto) obj).sizes);
    }

    public final int hashCode() {
        List<DocsDocPreviewPhotoSizesDto> list = this.sizes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return wq.c("DocsDocPreviewPhotoDto(sizes=", ")", this.sizes);
    }

    public DocsDocPreviewPhotoDto(List<DocsDocPreviewPhotoSizesDto> list) {
        this.sizes = list;
    }

    public /* synthetic */ DocsDocPreviewPhotoDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
