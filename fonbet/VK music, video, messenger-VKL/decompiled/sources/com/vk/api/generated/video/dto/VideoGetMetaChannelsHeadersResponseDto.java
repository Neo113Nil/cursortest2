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

/* compiled from: VideoGetMetaChannelsHeadersResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetMetaChannelsHeadersResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetMetaChannelsHeadersResponseDto> CREATOR = new a();

    @pmi0("meta_channels")
    private final List<VideoMetaChannelHeaderDto> metaChannels;

    /* compiled from: VideoGetMetaChannelsHeadersResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetMetaChannelsHeadersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetMetaChannelsHeadersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoMetaChannelHeaderDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoGetMetaChannelsHeadersResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetMetaChannelsHeadersResponseDto[] newArray(int i) {
            return new VideoGetMetaChannelsHeadersResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoGetMetaChannelsHeadersResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetMetaChannelsHeadersResponseDto) && epx.f(this.metaChannels, ((VideoGetMetaChannelsHeadersResponseDto) obj).metaChannels);
    }

    public final int hashCode() {
        List<VideoMetaChannelHeaderDto> list = this.metaChannels;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoGetMetaChannelsHeadersResponseDto(metaChannels="), this.metaChannels);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoMetaChannelHeaderDto> list = this.metaChannels;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoMetaChannelHeaderDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoGetMetaChannelsHeadersResponseDto(List<VideoMetaChannelHeaderDto> list) {
        this.metaChannels = list;
    }

    public /* synthetic */ VideoGetMetaChannelsHeadersResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
