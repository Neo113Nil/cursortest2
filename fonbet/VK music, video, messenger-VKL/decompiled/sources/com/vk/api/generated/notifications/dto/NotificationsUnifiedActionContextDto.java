package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: NotificationsUnifiedActionContextDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedActionContextDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedActionContextDto> CREATOR = new a();

    @pmi0("room_id")
    private final String roomId;

    /* compiled from: NotificationsUnifiedActionContextDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedActionContextDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedActionContextDto createFromParcel(Parcel parcel) {
            return new NotificationsUnifiedActionContextDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedActionContextDto[] newArray(int i) {
            return new NotificationsUnifiedActionContextDto[i];
        }
    }

    public NotificationsUnifiedActionContextDto(String str) {
        this.roomId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsUnifiedActionContextDto) && epx.f(this.roomId, ((NotificationsUnifiedActionContextDto) obj).roomId);
    }

    public final int hashCode() {
        return this.roomId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NotificationsUnifiedActionContextDto(roomId="), this.roomId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.roomId);
    }
}
