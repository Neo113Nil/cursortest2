package com.vk.sdk.api.wall.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: WallPostResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallPostResponseDto {

    @pmi0("post_id")
    private final int postId;

    public WallPostResponseDto(int i) {
        this.postId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPostResponseDto) && this.postId == ((WallPostResponseDto) obj).postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId);
    }

    public final String toString() {
        return tgw.b(this.postId, "WallPostResponseDto(postId=", ")");
    }
}
