package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoStatsPixelParamsDto.kt */
/* loaded from: classes15.dex */
public final class VideoStatsPixelParamsDto implements Parcelable {
    public static final Parcelable.Creator<VideoStatsPixelParamsDto> CREATOR = new a();

    @pmi0("interval")
    private final Integer interval;

    /* compiled from: VideoStatsPixelParamsDto.kt */
    public static final class a implements Parcelable.Creator<VideoStatsPixelParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoStatsPixelParamsDto createFromParcel(Parcel parcel) {
            return new VideoStatsPixelParamsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStatsPixelParamsDto[] newArray(int i) {
            return new VideoStatsPixelParamsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoStatsPixelParamsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.interval;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoStatsPixelParamsDto) && epx.f(this.interval, ((VideoStatsPixelParamsDto) obj).interval);
    }

    public final int hashCode() {
        Integer num = this.interval;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("VideoStatsPixelParamsDto(interval="), this.interval, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.interval;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoStatsPixelParamsDto(Integer num) {
        this.interval = num;
    }

    public /* synthetic */ VideoStatsPixelParamsDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
