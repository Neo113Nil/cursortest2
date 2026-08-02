package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoVideoAdsOverlayDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsOverlayDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsOverlayDto> CREATOR = new a();

    @pmi0("banner_id")
    private final String bannerId;

    @pmi0("start_at")
    private final int startAt;

    /* compiled from: VideoVideoAdsOverlayDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsOverlayDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsOverlayDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsOverlayDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsOverlayDto[] newArray(int i) {
            return new VideoVideoAdsOverlayDto[i];
        }
    }

    public VideoVideoAdsOverlayDto(int i, String str) {
        this.startAt = i;
        this.bannerId = str;
    }

    public final String d() {
        return this.bannerId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.startAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsOverlayDto)) {
            return false;
        }
        VideoVideoAdsOverlayDto videoVideoAdsOverlayDto = (VideoVideoAdsOverlayDto) obj;
        return this.startAt == videoVideoAdsOverlayDto.startAt && epx.f(this.bannerId, videoVideoAdsOverlayDto.bannerId);
    }

    public final int hashCode() {
        return this.bannerId.hashCode() + (Integer.hashCode(this.startAt) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsOverlayDto(startAt=");
        sb.append(this.startAt);
        sb.append(", bannerId=");
        return ho8.a(sb, this.bannerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.startAt);
        parcel.writeString(this.bannerId);
    }
}
