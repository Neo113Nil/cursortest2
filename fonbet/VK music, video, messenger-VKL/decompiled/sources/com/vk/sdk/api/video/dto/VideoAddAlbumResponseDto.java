package com.vk.sdk.api.video.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: VideoAddAlbumResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoAddAlbumResponseDto {

    @pmi0("album_id")
    private final int albumId;

    public VideoAddAlbumResponseDto(int i) {
        this.albumId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoAddAlbumResponseDto) && this.albumId == ((VideoAddAlbumResponseDto) obj).albumId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.albumId);
    }

    public final String toString() {
        return tgw.b(this.albumId, "VideoAddAlbumResponseDto(albumId=", ")");
    }
}
