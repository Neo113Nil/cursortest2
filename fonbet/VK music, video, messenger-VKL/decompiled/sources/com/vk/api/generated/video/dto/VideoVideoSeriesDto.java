package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoVideoSeriesDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoSeriesDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoSeriesDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoVideoSeriesDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoSeriesDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoSeriesDto createFromParcel(Parcel parcel) {
            return new VideoVideoSeriesDto(parcel.readInt(), (UserId) parcel.readParcelable(VideoVideoSeriesDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoSeriesDto[] newArray(int i) {
            return new VideoVideoSeriesDto[i];
        }
    }

    public VideoVideoSeriesDto(int i, UserId userId, String str) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoSeriesDto)) {
            return false;
        }
        VideoVideoSeriesDto videoVideoSeriesDto = (VideoVideoSeriesDto) obj;
        return this.id == videoVideoSeriesDto.id && epx.f(this.ownerId, videoVideoSeriesDto.ownerId) && epx.f(this.title, videoVideoSeriesDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoSeriesDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
    }
}
