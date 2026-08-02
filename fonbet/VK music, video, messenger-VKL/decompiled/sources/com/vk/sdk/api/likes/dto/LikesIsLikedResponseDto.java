package com.vk.sdk.api.likes.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.pmi0;

/* compiled from: LikesIsLikedResponseDto.kt */
/* loaded from: classes5.dex */
public final class LikesIsLikedResponseDto {

    @pmi0("copied")
    private final BaseBoolIntDto copied;

    @pmi0("liked")
    private final BaseBoolIntDto liked;

    public LikesIsLikedResponseDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2) {
        this.liked = baseBoolIntDto;
        this.copied = baseBoolIntDto2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesIsLikedResponseDto)) {
            return false;
        }
        LikesIsLikedResponseDto likesIsLikedResponseDto = (LikesIsLikedResponseDto) obj;
        return this.liked == likesIsLikedResponseDto.liked && this.copied == likesIsLikedResponseDto.copied;
    }

    public final int hashCode() {
        return this.copied.hashCode() + (this.liked.hashCode() * 31);
    }

    public final String toString() {
        return "LikesIsLikedResponseDto(liked=" + this.liked + ", copied=" + this.copied + ")";
    }
}
