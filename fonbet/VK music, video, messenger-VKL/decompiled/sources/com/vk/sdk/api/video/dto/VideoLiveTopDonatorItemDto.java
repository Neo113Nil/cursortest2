package com.vk.sdk.api.video.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoLiveTopDonatorItemDto.kt */
/* loaded from: classes5.dex */
public final class VideoLiveTopDonatorItemDto {

    @pmi0("score")
    private final int score;

    @pmi0("user_id")
    private final UserId userId;

    public VideoLiveTopDonatorItemDto(UserId userId, int i) {
        this.userId = userId;
        this.score = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveTopDonatorItemDto)) {
            return false;
        }
        VideoLiveTopDonatorItemDto videoLiveTopDonatorItemDto = (VideoLiveTopDonatorItemDto) obj;
        return epx.f(this.userId, videoLiveTopDonatorItemDto.userId) && this.score == videoLiveTopDonatorItemDto.score;
    }

    public final int hashCode() {
        return Integer.hashCode(this.score) + (Long.hashCode(this.userId.b) * 31);
    }

    public final String toString() {
        return "VideoLiveTopDonatorItemDto(userId=" + this.userId + ", score=" + this.score + ")";
    }
}
