package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.pmi0;
import xsna.vu5;

/* compiled from: ImageConfigIdDto.kt */
/* loaded from: classes5.dex */
public final class ImageConfigIdDto {

    @pmi0("configId")
    private final int configId;

    @pmi0("version")
    private final int version;

    public ImageConfigIdDto(int i, int i2) {
        this.version = i;
        this.configId = i2;
    }

    public final int a() {
        return this.configId;
    }

    public final int b() {
        return this.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageConfigIdDto)) {
            return false;
        }
        ImageConfigIdDto imageConfigIdDto = (ImageConfigIdDto) obj;
        return this.version == imageConfigIdDto.version && this.configId == imageConfigIdDto.configId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.configId) + (Integer.hashCode(this.version) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageConfigIdDto(version=");
        sb.append(this.version);
        sb.append(", configId=");
        return vu5.b(sb, this.configId, ')');
    }
}
