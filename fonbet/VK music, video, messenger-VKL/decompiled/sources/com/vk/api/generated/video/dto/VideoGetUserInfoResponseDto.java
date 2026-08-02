package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetUserInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetUserInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetUserInfoResponseDto> CREATOR = new a();

    @pmi0("subscription")
    private final VideoUserInfoSubscriptionDto subscription;

    /* compiled from: VideoGetUserInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetUserInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetUserInfoResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetUserInfoResponseDto(parcel.readInt() == 0 ? null : VideoUserInfoSubscriptionDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetUserInfoResponseDto[] newArray(int i) {
            return new VideoGetUserInfoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoGetUserInfoResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final VideoUserInfoSubscriptionDto d() {
        return this.subscription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetUserInfoResponseDto) && epx.f(this.subscription, ((VideoGetUserInfoResponseDto) obj).subscription);
    }

    public final int hashCode() {
        VideoUserInfoSubscriptionDto videoUserInfoSubscriptionDto = this.subscription;
        if (videoUserInfoSubscriptionDto == null) {
            return 0;
        }
        return videoUserInfoSubscriptionDto.hashCode();
    }

    public final String toString() {
        return "VideoGetUserInfoResponseDto(subscription=" + this.subscription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoUserInfoSubscriptionDto videoUserInfoSubscriptionDto = this.subscription;
        if (videoUserInfoSubscriptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoUserInfoSubscriptionDto.writeToParcel(parcel, i);
        }
    }

    public VideoGetUserInfoResponseDto(VideoUserInfoSubscriptionDto videoUserInfoSubscriptionDto) {
        this.subscription = videoUserInfoSubscriptionDto;
    }

    public /* synthetic */ VideoGetUserInfoResponseDto(VideoUserInfoSubscriptionDto videoUserInfoSubscriptionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoUserInfoSubscriptionDto);
    }
}
