package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsChannelWithLastMessageDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsChannelWithLastMessageDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsChannelWithLastMessageDto> CREATOR = new a();

    @pmi0("channel")
    private final ChannelsChannelDto channel;

    @pmi0("last_message")
    private final ChannelsMessageDto lastMessage;

    /* compiled from: ChannelsChannelWithLastMessageDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsChannelWithLastMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelWithLastMessageDto createFromParcel(Parcel parcel) {
            return new ChannelsChannelWithLastMessageDto(ChannelsChannelDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ChannelsMessageDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsChannelWithLastMessageDto[] newArray(int i) {
            return new ChannelsChannelWithLastMessageDto[i];
        }
    }

    public ChannelsChannelWithLastMessageDto(ChannelsChannelDto channelsChannelDto, ChannelsMessageDto channelsMessageDto) {
        this.channel = channelsChannelDto;
        this.lastMessage = channelsMessageDto;
    }

    public final ChannelsChannelDto d() {
        return this.channel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsChannelWithLastMessageDto)) {
            return false;
        }
        ChannelsChannelWithLastMessageDto channelsChannelWithLastMessageDto = (ChannelsChannelWithLastMessageDto) obj;
        return epx.f(this.channel, channelsChannelWithLastMessageDto.channel) && epx.f(this.lastMessage, channelsChannelWithLastMessageDto.lastMessage);
    }

    public final int hashCode() {
        int hashCode = this.channel.hashCode() * 31;
        ChannelsMessageDto channelsMessageDto = this.lastMessage;
        return hashCode + (channelsMessageDto == null ? 0 : channelsMessageDto.hashCode());
    }

    public final String toString() {
        return "ChannelsChannelWithLastMessageDto(channel=" + this.channel + ", lastMessage=" + this.lastMessage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.channel.writeToParcel(parcel, i);
        ChannelsMessageDto channelsMessageDto = this.lastMessage;
        if (channelsMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessageDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ChannelsChannelWithLastMessageDto(ChannelsChannelDto channelsChannelDto, ChannelsMessageDto channelsMessageDto, int i, zcl zclVar) {
        this(channelsChannelDto, (i & 2) != 0 ? null : channelsMessageDto);
    }
}
