package com.vk.sdk.api.docs.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.shy;
import xsna.xy6;

/* compiled from: DocsDocPreviewGraffitiDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocPreviewGraffitiDto {

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("width")
    private final int width;

    public DocsDocPreviewGraffitiDto(String str, int i, int i2) {
        this.src = str;
        this.width = i;
        this.height = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewGraffitiDto)) {
            return false;
        }
        DocsDocPreviewGraffitiDto docsDocPreviewGraffitiDto = (DocsDocPreviewGraffitiDto) obj;
        return epx.f(this.src, docsDocPreviewGraffitiDto.src) && this.width == docsDocPreviewGraffitiDto.width && this.height == docsDocPreviewGraffitiDto.height;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + shy.a(this.width, this.src.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.src;
        return h5s.c(this.height, ")", xy6.b(this.width, "DocsDocPreviewGraffitiDto(src=", str, ", width=", ", height="));
    }
}
