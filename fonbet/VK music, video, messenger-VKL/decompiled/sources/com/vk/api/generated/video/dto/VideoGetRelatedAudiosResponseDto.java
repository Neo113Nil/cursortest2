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

/* compiled from: VideoGetRelatedAudiosResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetRelatedAudiosResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetRelatedAudiosResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<VideoRelatedAudioDto> items;

    /* compiled from: VideoGetRelatedAudiosResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetRelatedAudiosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetRelatedAudiosResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoRelatedAudioDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoGetRelatedAudiosResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetRelatedAudiosResponseDto[] newArray(int i) {
            return new VideoGetRelatedAudiosResponseDto[i];
        }
    }

    public VideoGetRelatedAudiosResponseDto(List<VideoRelatedAudioDto> list) {
        this.items = list;
    }

    public final List<VideoRelatedAudioDto> d() {
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
        return (obj instanceof VideoGetRelatedAudiosResponseDto) && epx.f(this.items, ((VideoGetRelatedAudiosResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoGetRelatedAudiosResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoRelatedAudioDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
