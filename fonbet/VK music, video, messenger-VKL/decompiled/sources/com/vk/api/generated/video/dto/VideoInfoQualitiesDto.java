package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VideoInfoQualitiesDto.kt */
/* loaded from: classes15.dex */
public final class VideoInfoQualitiesDto implements Parcelable {
    public static final Parcelable.Creator<VideoInfoQualitiesDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("quality")
    private final List<VideoInfoQualityDto> quality;

    /* compiled from: VideoInfoQualitiesDto.kt */
    public static final class a implements Parcelable.Creator<VideoInfoQualitiesDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoInfoQualitiesDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoInfoQualityDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoInfoQualitiesDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoInfoQualitiesDto[] newArray(int i) {
            return new VideoInfoQualitiesDto[i];
        }
    }

    public VideoInfoQualitiesDto(String str, List<VideoInfoQualityDto> list) {
        this.name = str;
        this.quality = list;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoInfoQualityDto> e() {
        return this.quality;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoQualitiesDto)) {
            return false;
        }
        VideoInfoQualitiesDto videoInfoQualitiesDto = (VideoInfoQualitiesDto) obj;
        return epx.f(this.name, videoInfoQualitiesDto.name) && epx.f(this.quality, videoInfoQualitiesDto.quality);
    }

    public final int hashCode() {
        return this.quality.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoInfoQualitiesDto(name=");
        sb.append(this.name);
        sb.append(", quality=");
        return ms9.a(')', sb, this.quality);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.quality);
        while (a2.hasNext()) {
            ((VideoInfoQualityDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
