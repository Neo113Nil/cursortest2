package com.vk.sdk.api.docs.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.rzl;
import xsna.shy;
import xsna.xy6;

/* compiled from: DocsDocPreviewVideoDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocPreviewVideoDto {

    @pmi0("file_size")
    private final int fileSize;

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("width")
    private final int width;

    public DocsDocPreviewVideoDto(String str, int i, int i2, int i3) {
        this.src = str;
        this.width = i;
        this.height = i2;
        this.fileSize = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewVideoDto)) {
            return false;
        }
        DocsDocPreviewVideoDto docsDocPreviewVideoDto = (DocsDocPreviewVideoDto) obj;
        return epx.f(this.src, docsDocPreviewVideoDto.src) && this.width == docsDocPreviewVideoDto.width && this.height == docsDocPreviewVideoDto.height && this.fileSize == docsDocPreviewVideoDto.fileSize;
    }

    public final int hashCode() {
        return Integer.hashCode(this.fileSize) + shy.a(this.height, shy.a(this.width, this.src.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.src;
        return rzl.a(this.height, this.fileSize, ", fileSize=", ")", xy6.b(this.width, "DocsDocPreviewVideoDto(src=", str, ", width=", ", height="));
    }
}
