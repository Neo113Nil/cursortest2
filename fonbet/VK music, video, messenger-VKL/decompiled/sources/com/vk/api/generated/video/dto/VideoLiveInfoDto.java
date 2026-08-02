package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoLiveInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoLiveInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoLiveInfoDto> CREATOR = new a();

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    @pmi0("is_notifications_blocked")
    private final BaseBoolIntDto isNotificationsBlocked;

    /* compiled from: VideoLiveInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoLiveInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoLiveInfoDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<BaseBoolIntDto> creator = BaseBoolIntDto.CREATOR;
            return new VideoLiveInfoDto(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLiveInfoDto[] newArray(int i) {
            return new VideoLiveInfoDto[i];
        }
    }

    public VideoLiveInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2) {
        this.enabled = baseBoolIntDto;
        this.isNotificationsBlocked = baseBoolIntDto2;
    }

    public final BaseBoolIntDto d() {
        return this.enabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.isNotificationsBlocked;
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
        return "VideoLiveInfoDto(enabled=" + this.enabled + ", isNotificationsBlocked=" + this.isNotificationsBlocked + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.enabled.writeToParcel(parcel, i);
        BaseBoolIntDto baseBoolIntDto = this.isNotificationsBlocked;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoLiveInfoDto(BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : baseBoolIntDto2);
    }
}
