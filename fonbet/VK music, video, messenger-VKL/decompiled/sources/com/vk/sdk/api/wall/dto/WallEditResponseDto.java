package com.vk.sdk.api.wall.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: WallEditResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallEditResponseDto {

    @pmi0("post_id")
    private final int postId;

    public WallEditResponseDto(int i) {
        this.postId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallEditResponseDto) && this.postId == ((WallEditResponseDto) obj).postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId);
    }

    public final String toString() {
        return tgw.b(this.postId, "WallEditResponseDto(postId=", ")");
    }
}
