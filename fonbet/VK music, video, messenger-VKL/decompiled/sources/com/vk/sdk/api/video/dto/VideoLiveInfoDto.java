package com.vk.sdk.api.video.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveInfoDto.kt */
/* loaded from: classes5.dex */
public final class VideoLiveInfoDto {

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("is_notifications_blocked")
    private final BaseBoolIntDto isNotificationsBlocked;

    public VideoLiveInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2) {
        this.enabled = baseBoolIntDto;
        this.isNotificationsBlocked = baseBoolIntDto2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLiveInfoDto)) {
            return false;
        }
        VideoLiveInfoDto videoLiveInfoDto = (VideoLiveInfoDto) obj;
        return this.enabled == videoLiveInfoDto.enabled && this.isNotificationsBlocked == videoLiveInfoDto.isNotificationsBlocked;
    }

    public final int hashCode() {
        int hashCode = this.enabled.hashCode() * 31;
        BaseBoolIntDto baseBoolIntDto = this.isNotificationsBlocked;
        return hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode());
    }

    public final String toString() {
        return "VideoLiveInfoDto(enabled=" + this.enabled + ", isNotificationsBlocked=" + this.isNotificationsBlocked + ")";
    }

    public /* synthetic */ VideoLiveInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : baseBoolIntDto2);
    }
}
