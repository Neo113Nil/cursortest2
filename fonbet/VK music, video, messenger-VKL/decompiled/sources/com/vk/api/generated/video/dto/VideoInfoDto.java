package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VideoInfoDto.kt */
/* loaded from: classes15.dex */
public final class VideoInfoDto implements Parcelable {
    public static final Parcelable.Creator<VideoInfoDto> CREATOR = new a();

    @pmi0("qualities")
    private final List<VideoInfoQualitiesDto> qualities;

    @pmi0("tracks")
    private final List<VideoInfoTrackDto> tracks;

    @pmi0("united_video_id")
    private final long unitedVideoId;

    /* compiled from: VideoInfoDto.kt */
    public static final class a implements Parcelable.Creator<VideoInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInfoDto createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(VideoInfoQualitiesDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(VideoInfoTrackDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new VideoInfoDto(readLong, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInfoDto[] newArray(int i) {
            return new VideoInfoDto[i];
        }
    }

    public VideoInfoDto(long j, List<VideoInfoQualitiesDto> list, List<VideoInfoTrackDto> list2) {
        this.unitedVideoId = j;
        this.qualities = list;
        this.tracks = list2;
    }

    public final List<VideoInfoQualitiesDto> d() {
        return this.qualities;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoInfoTrackDto> e() {
        return this.tracks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoDto)) {
            return false;
        }
        VideoInfoDto videoInfoDto = (VideoInfoDto) obj;
        return this.unitedVideoId == videoInfoDto.unitedVideoId && epx.f(this.qualities, videoInfoDto.qualities) && epx.f(this.tracks, videoInfoDto.tracks);
    }

    public final int hashCode() {
        return this.tracks.hashCode() + fw3.a(Long.hashCode(this.unitedVideoId) * 31, 31, this.qualities);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfoDto(unitedVideoId=");
        sb.append(this.unitedVideoId);
        sb.append(", qualities=");
        sb.append(this.qualities);
        sb.append(", tracks=");
        return ms9.a(')', sb, this.tracks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.unitedVideoId);
        Iterator a2 = ao.a(parcel, this.qualities);
        while (a2.hasNext()) {
            ((VideoInfoQualitiesDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.tracks);
        while (a3.hasNext()) {
            ((VideoInfoTrackDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
