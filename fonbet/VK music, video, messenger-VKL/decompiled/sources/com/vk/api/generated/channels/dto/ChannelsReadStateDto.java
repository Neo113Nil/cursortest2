package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ChannelsReadStateDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsReadStateDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsReadStateDto> CREATOR = new a();

    @pmi0("read_up_to_cmid")
    private final int readUpToCmid;

    @pmi0("unread_count")
    private final int unreadCount;

    /* compiled from: ChannelsReadStateDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsReadStateDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsReadStateDto createFromParcel(Parcel parcel) {
            return new ChannelsReadStateDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsReadStateDto[] newArray(int i) {
            return new ChannelsReadStateDto[i];
        }
    }

    public ChannelsReadStateDto(int i, int i2) {
        this.readUpToCmid = i;
        this.unreadCount = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsReadStateDto)) {
            return false;
        }
        ChannelsReadStateDto channelsReadStateDto = (ChannelsReadStateDto) obj;
        return this.readUpToCmid == channelsReadStateDto.readUpToCmid && this.unreadCount == channelsReadStateDto.unreadCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unreadCount) + (Integer.hashCode(this.readUpToCmid) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsReadStateDto(readUpToCmid=");
        sb.append(this.readUpToCmid);
        sb.append(", unreadCount=");
        return vu5.b(sb, this.unreadCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.readUpToCmid);
        parcel.writeInt(this.unreadCount);
    }
}
