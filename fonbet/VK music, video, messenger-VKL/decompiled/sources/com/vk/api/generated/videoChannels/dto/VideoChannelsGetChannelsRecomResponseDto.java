package com.vk.api.generated.videoChannels.dto;

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

/* compiled from: VideoChannelsGetChannelsRecomResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsGetChannelsRecomResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsGetChannelsRecomResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<VideoChannelsChannelRecomDto> items;

    /* compiled from: VideoChannelsGetChannelsRecomResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsGetChannelsRecomResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetChannelsRecomResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoChannelsChannelRecomDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoChannelsGetChannelsRecomResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetChannelsRecomResponseDto[] newArray(int i) {
            return new VideoChannelsGetChannelsRecomResponseDto[i];
        }
    }

    public VideoChannelsGetChannelsRecomResponseDto(List<VideoChannelsChannelRecomDto> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoChannelsGetChannelsRecomResponseDto) && epx.f(this.items, ((VideoChannelsGetChannelsRecomResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoChannelsGetChannelsRecomResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoChannelsChannelRecomDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
