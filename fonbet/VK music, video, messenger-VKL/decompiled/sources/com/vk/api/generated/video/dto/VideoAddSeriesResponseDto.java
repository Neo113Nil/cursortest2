package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VideoAddSeriesResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoAddSeriesResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoAddSeriesResponseDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("series_id")
    private final int seriesId;

    /* compiled from: VideoAddSeriesResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoAddSeriesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAddSeriesResponseDto createFromParcel(Parcel parcel) {
            return new VideoAddSeriesResponseDto((UserId) parcel.readParcelable(VideoAddSeriesResponseDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAddSeriesResponseDto[] newArray(int i) {
            return new VideoAddSeriesResponseDto[i];
        }
    }

    public VideoAddSeriesResponseDto(UserId userId, int i) {
        this.ownerId = userId;
        this.seriesId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAddSeriesResponseDto)) {
            return false;
        }
        VideoAddSeriesResponseDto videoAddSeriesResponseDto = (VideoAddSeriesResponseDto) obj;
        return epx.f(this.ownerId, videoAddSeriesResponseDto.ownerId) && this.seriesId == videoAddSeriesResponseDto.seriesId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.seriesId) + (Long.hashCode(this.ownerId.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAddSeriesResponseDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", seriesId=");
        return vu5.b(sb, this.seriesId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.seriesId);
    }
}
