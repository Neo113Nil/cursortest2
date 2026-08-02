package com.vk.repository.internal.repos.stickers.database.converters.dto;

import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;

/* compiled from: ImageSizeDto.kt */
/* loaded from: classes5.dex */
public final class ImageSizeDto {

    @pmi0("height")
    private final int height;

    @pmi0("isBase")
    private final boolean isBase;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    @pmi0("withPadding")
    private final boolean withPadding;

    public ImageSizeDto(String str, int i, int i2, boolean z, boolean z2) {
        this.url = str;
        this.height = i;
        this.width = i2;
        this.isBase = z;
        this.withPadding = z2;
    }

    public final int a() {
        return this.height;
    }

    public final String b() {
        return this.url;
    }

    public final int c() {
        return this.width;
    }

    public final boolean d() {
        return this.withPadding;
    }

    public final boolean e() {
        return this.isBase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSizeDto)) {
            return false;
        }
        ImageSizeDto imageSizeDto = (ImageSizeDto) obj;
        return epx.f(this.url, imageSizeDto.url) && this.height == imageSizeDto.height && this.width == imageSizeDto.width && this.isBase == imageSizeDto.isBase && this.withPadding == imageSizeDto.withPadding;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.withPadding) + qoy.b(shy.a(this.width, shy.a(this.height, this.url.hashCode() * 31, 31), 31), 31, this.isBase);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageSizeDto(url=");
        sb.append(this.url);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", isBase=");
        sb.append(this.isBase);
        sb.append(", withPadding=");
        return q0.a(sb, this.withPadding, ')');
    }
}
