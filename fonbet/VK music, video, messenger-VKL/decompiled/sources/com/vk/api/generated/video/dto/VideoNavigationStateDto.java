package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VideoNavigationStateDto.kt */
/* loaded from: classes15.dex */
public final class VideoNavigationStateDto implements Parcelable {
    public static final Parcelable.Creator<VideoNavigationStateDto> CREATOR = new a();

    @pmi0("tabbar")
    private final VideoTabbarDto tabbar;

    /* compiled from: VideoNavigationStateDto.kt */
    public static final class a implements Parcelable.Creator<VideoNavigationStateDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoNavigationStateDto createFromParcel(Parcel parcel) {
            return new VideoNavigationStateDto(VideoTabbarDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoNavigationStateDto[] newArray(int i) {
            return new VideoNavigationStateDto[i];
        }
    }

    public VideoNavigationStateDto(VideoTabbarDto videoTabbarDto) {
        this.tabbar = videoTabbarDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoNavigationStateDto) && epx.f(this.tabbar, ((VideoNavigationStateDto) obj).tabbar);
    }

    public final int hashCode() {
        return this.tabbar.hashCode();
    }

    public final String toString() {
        return "VideoNavigationStateDto(tabbar=" + this.tabbar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.tabbar.writeToParcel(parcel, i);
    }
}
