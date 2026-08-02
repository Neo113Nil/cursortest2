package com.vk.api.generated.channels.dto;

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

/* compiled from: ChannelsArchiveResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsArchiveResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsArchiveResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ChannelsFailedChannelIdItemDto> items;

    /* compiled from: ChannelsArchiveResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsArchiveResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsArchiveResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ChannelsFailedChannelIdItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ChannelsArchiveResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsArchiveResponseDto[] newArray(int i) {
            return new ChannelsArchiveResponseDto[i];
        }
    }

    public ChannelsArchiveResponseDto(List<ChannelsFailedChannelIdItemDto> list) {
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
        return (obj instanceof ChannelsArchiveResponseDto) && epx.f(this.items, ((ChannelsArchiveResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelsArchiveResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsFailedChannelIdItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
