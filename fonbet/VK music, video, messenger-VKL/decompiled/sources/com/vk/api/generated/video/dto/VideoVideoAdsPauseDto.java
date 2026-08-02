package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoVideoAdsPauseDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoAdsPauseDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoAdsPauseDto> CREATOR = new a();

    @pmi0("banner_id")
    private final String bannerId;

    @pmi0("interval")
    private final VideoVideoAdsPauseIntervalDto interval;

    @pmi0("show_delay")
    private final int showDelay;

    /* compiled from: VideoVideoAdsPauseDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoAdsPauseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsPauseDto createFromParcel(Parcel parcel) {
            return new VideoVideoAdsPauseDto(parcel.readInt(), VideoVideoAdsPauseIntervalDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoAdsPauseDto[] newArray(int i) {
            return new VideoVideoAdsPauseDto[i];
        }
    }

    public VideoVideoAdsPauseDto(int i, VideoVideoAdsPauseIntervalDto videoVideoAdsPauseIntervalDto, String str) {
        this.showDelay = i;
        this.interval = videoVideoAdsPauseIntervalDto;
        this.bannerId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoAdsPauseDto)) {
            return false;
        }
        VideoVideoAdsPauseDto videoVideoAdsPauseDto = (VideoVideoAdsPauseDto) obj;
        return this.showDelay == videoVideoAdsPauseDto.showDelay && epx.f(this.interval, videoVideoAdsPauseDto.interval) && epx.f(this.bannerId, videoVideoAdsPauseDto.bannerId);
    }

    public final int hashCode() {
        return this.bannerId.hashCode() + ((this.interval.hashCode() + (Integer.hashCode(this.showDelay) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoAdsPauseDto(showDelay=");
        sb.append(this.showDelay);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", bannerId=");
        return ho8.a(sb, this.bannerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showDelay);
        this.interval.writeToParcel(parcel, i);
        parcel.writeString(this.bannerId);
    }
}
