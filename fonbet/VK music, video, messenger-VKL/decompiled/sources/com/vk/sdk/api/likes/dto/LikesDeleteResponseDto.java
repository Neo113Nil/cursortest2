package com.vk.sdk.api.likes.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: LikesDeleteResponseDto.kt */
/* loaded from: classes5.dex */
public final class LikesDeleteResponseDto {

    @pmi0("likes")
    private final int likes;

    public LikesDeleteResponseDto(int i) {
        this.likes = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LikesDeleteResponseDto) && this.likes == ((LikesDeleteResponseDto) obj).likes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.likes);
    }

    public final String toString() {
        return tgw.b(this.likes, "LikesDeleteResponseDto(likes=", ")");
    }
}
