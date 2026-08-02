package com.vk.sdk.api.wall.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: WallPostAdsStealthResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallPostAdsStealthResponseDto {

    @pmi0("post_id")
    private final int postId;

    public WallPostAdsStealthResponseDto(int i) {
        this.postId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallPostAdsStealthResponseDto) && this.postId == ((WallPostAdsStealthResponseDto) obj).postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId);
    }

    public final String toString() {
        return tgw.b(this.postId, "WallPostAdsStealthResponseDto(postId=", ")");
    }
}
