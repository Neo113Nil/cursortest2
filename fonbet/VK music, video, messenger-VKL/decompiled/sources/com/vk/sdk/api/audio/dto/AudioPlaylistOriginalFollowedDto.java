package com.vk.sdk.api.audio.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioPlaylistOriginalFollowedDto.kt */
/* loaded from: classes5.dex */
public final class AudioPlaylistOriginalFollowedDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("playlist_id")
    private final int playlistId;

    public AudioPlaylistOriginalFollowedDto(int i, UserId userId, String str) {
        this.playlistId = i;
        this.ownerId = userId;
        this.accessKey = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistOriginalFollowedDto)) {
            return false;
        }
        AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = (AudioPlaylistOriginalFollowedDto) obj;
        return this.playlistId == audioPlaylistOriginalFollowedDto.playlistId && epx.f(this.ownerId, audioPlaylistOriginalFollowedDto.ownerId) && epx.f(this.accessKey, audioPlaylistOriginalFollowedDto.accessKey);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.playlistId) * 31, 31, this.ownerId.b);
        String str = this.accessKey;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.playlistId;
        UserId userId = this.ownerId;
        String str = this.accessKey;
        StringBuilder sb = new StringBuilder("AudioPlaylistOriginalFollowedDto(playlistId=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", accessKey=");
        return i5s.a(sb, str, ")");
    }

    public /* synthetic */ AudioPlaylistOriginalFollowedDto(int i, UserId userId, String str, int i2, zcl zclVar) {
        this(i, userId, (i2 & 4) != 0 ? null : str);
    }
}
