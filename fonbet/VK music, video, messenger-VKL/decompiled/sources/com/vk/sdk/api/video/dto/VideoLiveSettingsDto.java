package com.vk.sdk.api.video.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveSettingsDto.kt */
/* loaded from: classes5.dex */
public final class VideoLiveSettingsDto {

    @pmi0("can_rewind")
    private final BaseBoolIntDto canRewind;

    @pmi0("is_clips_live")
    private final BaseBoolIntDto isClipsLive;

    @pmi0("is_endless")
    private final BaseBoolIntDto isEndless;

    @pmi0("max_duration")
    private final Integer maxDuration;

    public VideoLiveSettingsDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveSettingsDto)) {
            return false;
        }
        VideoLiveSettingsDto videoLiveSettingsDto = (VideoLiveSettingsDto) obj;
        return this.canRewind == videoLiveSettingsDto.canRewind && this.isEndless == videoLiveSettingsDto.isEndless && epx.f(this.maxDuration, videoLiveSettingsDto.maxDuration) && this.isClipsLive == videoLiveSettingsDto.isClipsLive;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.canRewind;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isEndless;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        Integer num = this.maxDuration;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isClipsLive;
        return hashCode3 + (baseBoolIntDto3 != null ? baseBoolIntDto3.hashCode() : 0);
    }

    public final String toString() {
        return "VideoLiveSettingsDto(canRewind=" + this.canRewind + ", isEndless=" + this.isEndless + ", maxDuration=" + this.maxDuration + ", isClipsLive=" + this.isClipsLive + ")";
    }

    public VideoLiveSettingsDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3) {
        this.canRewind = baseBoolIntDto;
        this.isEndless = baseBoolIntDto2;
        this.maxDuration = num;
        this.isClipsLive = baseBoolIntDto3;
    }

    public /* synthetic */ VideoLiveSettingsDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, Integer num, BaseBoolIntDto baseBoolIntDto3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : baseBoolIntDto2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : baseBoolIntDto3);
    }
}
