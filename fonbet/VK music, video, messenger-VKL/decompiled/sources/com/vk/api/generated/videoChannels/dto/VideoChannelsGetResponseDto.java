package com.vk.api.generated.videoChannels.dto;

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

/* compiled from: VideoChannelsGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsGetResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<VideoChannelsChannelDto> items;

    /* compiled from: VideoChannelsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoChannelsChannelDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoChannelsGetResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsGetResponseDto[] newArray(int i) {
            return new VideoChannelsGetResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoChannelsGetResponseDto() {
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
        return (obj instanceof VideoChannelsGetResponseDto) && epx.f(this.items, ((VideoChannelsGetResponseDto) obj).items);
    }

    public final int hashCode() {
        List<VideoChannelsChannelDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VideoChannelsGetResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoChannelsChannelDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoChannelsChannelDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoChannelsGetResponseDto(List<VideoChannelsChannelDto> list) {
        this.items = list;
    }

    public /* synthetic */ VideoChannelsGetResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
