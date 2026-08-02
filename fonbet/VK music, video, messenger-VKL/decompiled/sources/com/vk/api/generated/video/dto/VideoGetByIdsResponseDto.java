package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: VideoGetByIdsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetByIdsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetByIdsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    /* compiled from: VideoGetByIdsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetByIdsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetByIdsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(VideoGetByIdsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new VideoGetByIdsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetByIdsResponseDto[] newArray(int i) {
            return new VideoGetByIdsResponseDto[i];
        }
    }

    public VideoGetByIdsResponseDto(List<VideoVideoFullDto> list) {
        this.items = list;
    }

    public final List<VideoVideoFullDto> d() {
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
        return (obj instanceof VideoGetByIdsResponseDto) && epx.f(this.items, ((VideoGetByIdsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoGetByIdsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
