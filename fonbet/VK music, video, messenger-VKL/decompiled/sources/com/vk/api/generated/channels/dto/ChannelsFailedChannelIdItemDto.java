package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseMessageErrorDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ChannelsFailedChannelIdItemDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsFailedChannelIdItemDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsFailedChannelIdItemDto> CREATOR = new a();

    @pmi0("channel_id")
    private final UserId channelId;

    @pmi0("error")
    private final BaseMessageErrorDto error;

    /* compiled from: ChannelsFailedChannelIdItemDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsFailedChannelIdItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsFailedChannelIdItemDto createFromParcel(Parcel parcel) {
            return new ChannelsFailedChannelIdItemDto((UserId) parcel.readParcelable(ChannelsFailedChannelIdItemDto.class.getClassLoader()), BaseMessageErrorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsFailedChannelIdItemDto[] newArray(int i) {
            return new ChannelsFailedChannelIdItemDto[i];
        }
    }

    public ChannelsFailedChannelIdItemDto(UserId userId, BaseMessageErrorDto baseMessageErrorDto) {
        this.channelId = userId;
        this.error = baseMessageErrorDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsFailedChannelIdItemDto)) {
            return false;
        }
        ChannelsFailedChannelIdItemDto channelsFailedChannelIdItemDto = (ChannelsFailedChannelIdItemDto) obj;
        return epx.f(this.channelId, channelsFailedChannelIdItemDto.channelId) && epx.f(this.error, channelsFailedChannelIdItemDto.error);
    }

    public final int hashCode() {
        return this.error.hashCode() + (Long.hashCode(this.channelId.b) * 31);
    }

    public final String toString() {
        return "ChannelsFailedChannelIdItemDto(channelId=" + this.channelId + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.channelId, i);
        this.error.writeToParcel(parcel, i);
    }
}
