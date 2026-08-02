package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ChannelsPaidReactionsConfigDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsPaidReactionsConfigDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsPaidReactionsConfigDto> CREATOR = new a();

    @pmi0("reaction_cost")
    private final int reactionCost;

    /* compiled from: ChannelsPaidReactionsConfigDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsPaidReactionsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsPaidReactionsConfigDto createFromParcel(Parcel parcel) {
            return new ChannelsPaidReactionsConfigDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsPaidReactionsConfigDto[] newArray(int i) {
            return new ChannelsPaidReactionsConfigDto[i];
        }
    }

    public ChannelsPaidReactionsConfigDto(int i) {
        this.reactionCost = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsPaidReactionsConfigDto) && this.reactionCost == ((ChannelsPaidReactionsConfigDto) obj).reactionCost;
    }

    public final int hashCode() {
        return Integer.hashCode(this.reactionCost);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ChannelsPaidReactionsConfigDto(reactionCost="), this.reactionCost, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reactionCost);
    }
}
