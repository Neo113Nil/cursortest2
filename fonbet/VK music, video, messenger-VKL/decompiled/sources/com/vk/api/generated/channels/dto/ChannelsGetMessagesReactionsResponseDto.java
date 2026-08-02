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

/* compiled from: ChannelsGetMessagesReactionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetMessagesReactionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetMessagesReactionsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<ChannelsReactionCountersResponseItemDto> items;

    /* compiled from: ChannelsGetMessagesReactionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetMessagesReactionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessagesReactionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ChannelsReactionCountersResponseItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ChannelsGetMessagesReactionsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetMessagesReactionsResponseDto[] newArray(int i) {
            return new ChannelsGetMessagesReactionsResponseDto[i];
        }
    }

    public ChannelsGetMessagesReactionsResponseDto(List<ChannelsReactionCountersResponseItemDto> list) {
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
        return (obj instanceof ChannelsGetMessagesReactionsResponseDto) && epx.f(this.items, ((ChannelsGetMessagesReactionsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelsGetMessagesReactionsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsReactionCountersResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
