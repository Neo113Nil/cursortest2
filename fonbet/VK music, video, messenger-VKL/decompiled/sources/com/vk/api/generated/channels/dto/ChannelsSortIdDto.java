package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ChannelsSortIdDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsSortIdDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsSortIdDto> CREATOR = new a();

    @pmi0("major_id")
    private final int majorId;

    @pmi0("minor_id")
    private final int minorId;

    /* compiled from: ChannelsSortIdDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsSortIdDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsSortIdDto createFromParcel(Parcel parcel) {
            return new ChannelsSortIdDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsSortIdDto[] newArray(int i) {
            return new ChannelsSortIdDto[i];
        }
    }

    public ChannelsSortIdDto(int i, int i2) {
        this.majorId = i;
        this.minorId = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsSortIdDto)) {
            return false;
        }
        ChannelsSortIdDto channelsSortIdDto = (ChannelsSortIdDto) obj;
        return this.majorId == channelsSortIdDto.majorId && this.minorId == channelsSortIdDto.minorId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minorId) + (Integer.hashCode(this.majorId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsSortIdDto(majorId=");
        sb.append(this.majorId);
        sb.append(", minorId=");
        return vu5.b(sb, this.minorId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.majorId);
        parcel.writeInt(this.minorId);
    }
}
