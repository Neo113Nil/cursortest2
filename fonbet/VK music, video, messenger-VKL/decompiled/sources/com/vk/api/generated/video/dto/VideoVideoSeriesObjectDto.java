package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoVideoSeriesObjectDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoSeriesObjectDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoSeriesObjectDto> CREATOR = new a();

    @pmi0("seasons")
    private final List<VideoVideoSeasonDto> seasons;

    @pmi0("series")
    private final VideoVideoSeriesDto series;

    /* compiled from: VideoVideoSeriesObjectDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoSeriesObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoSeriesObjectDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            VideoVideoSeriesDto createFromParcel = parcel.readInt() == 0 ? null : VideoVideoSeriesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoVideoSeasonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoVideoSeriesObjectDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoSeriesObjectDto[] newArray(int i) {
            return new VideoVideoSeriesObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoVideoSeriesObjectDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<VideoVideoSeasonDto> d() {
        return this.seasons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoSeriesObjectDto)) {
            return false;
        }
        VideoVideoSeriesObjectDto videoVideoSeriesObjectDto = (VideoVideoSeriesObjectDto) obj;
        return epx.f(this.series, videoVideoSeriesObjectDto.series) && epx.f(this.seasons, videoVideoSeriesObjectDto.seasons);
    }

    public final int hashCode() {
        VideoVideoSeriesDto videoVideoSeriesDto = this.series;
        int hashCode = (videoVideoSeriesDto == null ? 0 : videoVideoSeriesDto.hashCode()) * 31;
        List<VideoVideoSeasonDto> list = this.seasons;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoSeriesObjectDto(series=");
        sb.append(this.series);
        sb.append(", seasons=");
        return ms9.a(')', sb, this.seasons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        VideoVideoSeriesDto videoVideoSeriesDto = this.series;
        if (videoVideoSeriesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoSeriesDto.writeToParcel(parcel, i);
        }
        List<VideoVideoSeasonDto> list = this.seasons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoVideoSeasonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoVideoSeriesObjectDto(VideoVideoSeriesDto videoVideoSeriesDto, List<VideoVideoSeasonDto> list) {
        this.series = videoVideoSeriesDto;
        this.seasons = list;
    }

    public /* synthetic */ VideoVideoSeriesObjectDto(VideoVideoSeriesDto videoVideoSeriesDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoVideoSeriesDto, (i & 2) != 0 ? null : list);
    }
}
