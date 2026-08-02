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

/* compiled from: VideoGetAlbumsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAlbumsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAlbumsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoAlbumDto> items;

    /* compiled from: VideoGetAlbumsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAlbumsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAlbumsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(VideoVideoAlbumDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoGetAlbumsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAlbumsResponseDto[] newArray(int i) {
            return new VideoGetAlbumsResponseDto[i];
        }
    }

    public VideoGetAlbumsResponseDto(int i, List<VideoVideoAlbumDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<VideoVideoAlbumDto> d() {
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
        if (!(obj instanceof VideoGetAlbumsResponseDto)) {
            return false;
        }
        VideoGetAlbumsResponseDto videoGetAlbumsResponseDto = (VideoGetAlbumsResponseDto) obj;
        return this.count == videoGetAlbumsResponseDto.count && epx.f(this.items, videoGetAlbumsResponseDto.items);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAlbumsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoVideoAlbumDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
