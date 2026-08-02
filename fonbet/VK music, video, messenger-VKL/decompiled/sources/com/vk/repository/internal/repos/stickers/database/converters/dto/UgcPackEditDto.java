package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: UgcPackEditDto.kt */
/* loaded from: classes5.dex */
public final class UgcPackEditDto {

    @pmi0("stickerImageHeight")
    private final int stickerImageHeight;

    @pmi0("stickerImageUploadUrl")
    private final String stickerImageUploadUrl;

    @pmi0("stickerImageWidth")
    private final int stickerImageWidth;

    @pmi0("stickersLimit")
    private final int stickersLimit;

    public UgcPackEditDto(String str, int i, int i2, int i3) {
        this.stickerImageUploadUrl = str;
        this.stickerImageWidth = i;
        this.stickerImageHeight = i2;
        this.stickersLimit = i3;
    }

    public final int a() {
        return this.stickerImageHeight;
    }

    public final String b() {
        return this.stickerImageUploadUrl;
    }

    public final int c() {
        return this.stickerImageWidth;
    }

    public final int d() {
        return this.stickersLimit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgcPackEditDto)) {
            return false;
        }
        UgcPackEditDto ugcPackEditDto = (UgcPackEditDto) obj;
        return epx.f(this.stickerImageUploadUrl, ugcPackEditDto.stickerImageUploadUrl) && this.stickerImageWidth == ugcPackEditDto.stickerImageWidth && this.stickerImageHeight == ugcPackEditDto.stickerImageHeight && this.stickersLimit == ugcPackEditDto.stickersLimit;
    }

    public final int hashCode() {
        return Integer.hashCode(this.stickersLimit) + shy.a(this.stickerImageHeight, shy.a(this.stickerImageWidth, this.stickerImageUploadUrl.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UgcPackEditDto(stickerImageUploadUrl=");
        sb.append(this.stickerImageUploadUrl);
        sb.append(", stickerImageWidth=");
        sb.append(this.stickerImageWidth);
        sb.append(", stickerImageHeight=");
        sb.append(this.stickerImageHeight);
        sb.append(", stickersLimit=");
        return vu5.b(sb, this.stickersLimit, ')');
    }
}
