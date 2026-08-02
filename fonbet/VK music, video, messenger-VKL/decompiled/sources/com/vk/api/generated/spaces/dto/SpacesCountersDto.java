package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: SpacesCountersDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCountersDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCountersDto> CREATOR = new a();

    @pmi0("space_id")
    private final long spaceId;

    @pmi0("unread_count")
    private final int unreadCount;

    /* compiled from: SpacesCountersDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCountersDto createFromParcel(Parcel parcel) {
            return new SpacesCountersDto(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCountersDto[] newArray(int i) {
            return new SpacesCountersDto[i];
        }
    }

    public SpacesCountersDto(long j, int i) {
        this.spaceId = j;
        this.unreadCount = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesCountersDto)) {
            return false;
        }
        SpacesCountersDto spacesCountersDto = (SpacesCountersDto) obj;
        return this.spaceId == spacesCountersDto.spaceId && this.unreadCount == spacesCountersDto.unreadCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unreadCount) + (Long.hashCode(this.spaceId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesCountersDto(spaceId=");
        sb.append(this.spaceId);
        sb.append(", unreadCount=");
        return vu5.b(sb, this.unreadCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spaceId);
        parcel.writeInt(this.unreadCount);
    }
}
