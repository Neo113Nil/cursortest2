package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ChannelsChannelReactionIdToMessageReactionIdDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsChannelReactionIdToMessageReactionIdDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsChannelReactionIdToMessageReactionIdDto> CREATOR = new a();

    @pmi0("channel_reaction_id")
    private final int channelReactionId;

    @pmi0("message_reaction_id")
    private final int messageReactionId;

    /* compiled from: ChannelsChannelReactionIdToMessageReactionIdDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsChannelReactionIdToMessageReactionIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelReactionIdToMessageReactionIdDto createFromParcel(Parcel parcel) {
            return new ChannelsChannelReactionIdToMessageReactionIdDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelReactionIdToMessageReactionIdDto[] newArray(int i) {
            return new ChannelsChannelReactionIdToMessageReactionIdDto[i];
        }
    }

    public ChannelsChannelReactionIdToMessageReactionIdDto(int i, int i2) {
        this.channelReactionId = i;
        this.messageReactionId = i2;
    }

    public final int d() {
        return this.channelReactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.messageReactionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsChannelReactionIdToMessageReactionIdDto)) {
            return false;
        }
        ChannelsChannelReactionIdToMessageReactionIdDto channelsChannelReactionIdToMessageReactionIdDto = (ChannelsChannelReactionIdToMessageReactionIdDto) obj;
        return this.channelReactionId == channelsChannelReactionIdToMessageReactionIdDto.channelReactionId && this.messageReactionId == channelsChannelReactionIdToMessageReactionIdDto.messageReactionId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.messageReactionId) + (Integer.hashCode(this.channelReactionId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsChannelReactionIdToMessageReactionIdDto(channelReactionId=");
        sb.append(this.channelReactionId);
        sb.append(", messageReactionId=");
        return vu5.b(sb, this.messageReactionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.channelReactionId);
        parcel.writeInt(this.messageReactionId);
    }
}
