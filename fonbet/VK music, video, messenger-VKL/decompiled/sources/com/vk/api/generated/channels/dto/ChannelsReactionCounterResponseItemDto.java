package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ChannelsReactionCounterResponseItemDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsReactionCounterResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsReactionCounterResponseItemDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("reaction_id")
    private final int reactionId;

    /* compiled from: ChannelsReactionCounterResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsReactionCounterResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsReactionCounterResponseItemDto createFromParcel(Parcel parcel) {
            return new ChannelsReactionCounterResponseItemDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsReactionCounterResponseItemDto[] newArray(int i) {
            return new ChannelsReactionCounterResponseItemDto[i];
        }
    }

    public ChannelsReactionCounterResponseItemDto(int i, int i2) {
        this.reactionId = i;
        this.count = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsReactionCounterResponseItemDto)) {
            return false;
        }
        ChannelsReactionCounterResponseItemDto channelsReactionCounterResponseItemDto = (ChannelsReactionCounterResponseItemDto) obj;
        return this.reactionId == channelsReactionCounterResponseItemDto.reactionId && this.count == channelsReactionCounterResponseItemDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (Integer.hashCode(this.reactionId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsReactionCounterResponseItemDto(reactionId=");
        sb.append(this.reactionId);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reactionId);
        parcel.writeInt(this.count);
    }
}
