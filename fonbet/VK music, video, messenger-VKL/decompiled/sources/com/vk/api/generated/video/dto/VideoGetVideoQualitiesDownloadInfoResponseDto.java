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

/* compiled from: VideoGetVideoQualitiesDownloadInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetVideoQualitiesDownloadInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetVideoQualitiesDownloadInfoResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<VideoInfoDto> items;

    /* compiled from: VideoGetVideoQualitiesDownloadInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetVideoQualitiesDownloadInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetVideoQualitiesDownloadInfoResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoInfoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoGetVideoQualitiesDownloadInfoResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetVideoQualitiesDownloadInfoResponseDto[] newArray(int i) {
            return new VideoGetVideoQualitiesDownloadInfoResponseDto[i];
        }
    }

    public VideoGetVideoQualitiesDownloadInfoResponseDto(List<VideoInfoDto> list) {
        this.items = list;
    }

    public final List<VideoInfoDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetVideoQualitiesDownloadInfoResponseDto) && epx.f(this.items, ((VideoGetVideoQualitiesDownloadInfoResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoGetVideoQualitiesDownloadInfoResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoInfoDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
