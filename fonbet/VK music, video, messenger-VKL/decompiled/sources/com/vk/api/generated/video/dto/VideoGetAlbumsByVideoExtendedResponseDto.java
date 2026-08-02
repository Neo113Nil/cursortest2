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

/* compiled from: VideoGetAlbumsByVideoExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetAlbumsByVideoExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetAlbumsByVideoExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoAlbumFullDto> items;

    /* compiled from: VideoGetAlbumsByVideoExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetAlbumsByVideoExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetAlbumsByVideoExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(VideoGetAlbumsByVideoExtendedResponseDto.class, parcel, arrayList, i, 1);
            }
            return new VideoGetAlbumsByVideoExtendedResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetAlbumsByVideoExtendedResponseDto[] newArray(int i) {
            return new VideoGetAlbumsByVideoExtendedResponseDto[i];
        }
    }

    public VideoGetAlbumsByVideoExtendedResponseDto(int i, List<VideoVideoAlbumFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<VideoVideoAlbumFullDto> d() {
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
        if (!(obj instanceof VideoGetAlbumsByVideoExtendedResponseDto)) {
            return false;
        }
        VideoGetAlbumsByVideoExtendedResponseDto videoGetAlbumsByVideoExtendedResponseDto = (VideoGetAlbumsByVideoExtendedResponseDto) obj;
        return this.count == videoGetAlbumsByVideoExtendedResponseDto.count && epx.f(this.items, videoGetAlbumsByVideoExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetAlbumsByVideoExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
