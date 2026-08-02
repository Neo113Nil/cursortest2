package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: VideoAddSeasonResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoAddSeasonResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoAddSeasonResponseDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("season_id")
    private final int seasonId;

    @pmi0("series_id")
    private final int seriesId;

    /* compiled from: VideoAddSeasonResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoAddSeasonResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoAddSeasonResponseDto createFromParcel(Parcel parcel) {
            return new VideoAddSeasonResponseDto((UserId) parcel.readParcelable(VideoAddSeasonResponseDto.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAddSeasonResponseDto[] newArray(int i) {
            return new VideoAddSeasonResponseDto[i];
        }
    }

    public VideoAddSeasonResponseDto(UserId userId, int i, int i2) {
        this.ownerId = userId;
        this.seriesId = i;
        this.seasonId = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAddSeasonResponseDto)) {
            return false;
        }
        VideoAddSeasonResponseDto videoAddSeasonResponseDto = (VideoAddSeasonResponseDto) obj;
        return epx.f(this.ownerId, videoAddSeasonResponseDto.ownerId) && this.seriesId == videoAddSeasonResponseDto.seriesId && this.seasonId == videoAddSeasonResponseDto.seasonId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.seasonId) + shy.a(this.seriesId, Long.hashCode(this.ownerId.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAddSeasonResponseDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", seriesId=");
        sb.append(this.seriesId);
        sb.append(", seasonId=");
        return vu5.b(sb, this.seasonId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.seriesId);
        parcel.writeInt(this.seasonId);
    }
}
