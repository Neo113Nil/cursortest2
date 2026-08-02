package com.vk.sdk.api.likes.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: LikesAddResponseDto.kt */
/* loaded from: classes5.dex */
public final class LikesAddResponseDto {

    @pmi0("likes")
    private final int likes;

    public LikesAddResponseDto(int i) {
        this.likes = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LikesAddResponseDto) && this.likes == ((LikesAddResponseDto) obj).likes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.likes);
    }

    public final String toString() {
        return tgw.b(this.likes, "LikesAddResponseDto(likes=", ")");
    }
}
