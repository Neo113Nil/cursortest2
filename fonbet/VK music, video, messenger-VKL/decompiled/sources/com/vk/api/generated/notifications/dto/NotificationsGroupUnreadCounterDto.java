package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: NotificationsGroupUnreadCounterDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsGroupUnreadCounterDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsGroupUnreadCounterDto> CREATOR = new a();

    @pmi0("counter")
    private final int counter;

    @pmi0("group_id")
    private final UserId groupId;

    /* compiled from: NotificationsGroupUnreadCounterDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsGroupUnreadCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsGroupUnreadCounterDto createFromParcel(Parcel parcel) {
            return new NotificationsGroupUnreadCounterDto((UserId) parcel.readParcelable(NotificationsGroupUnreadCounterDto.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsGroupUnreadCounterDto[] newArray(int i) {
            return new NotificationsGroupUnreadCounterDto[i];
        }
    }

    public NotificationsGroupUnreadCounterDto(UserId userId, int i) {
        this.groupId = userId;
        this.counter = i;
    }

    public final int d() {
        return this.counter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.groupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGroupUnreadCounterDto)) {
            return false;
        }
        NotificationsGroupUnreadCounterDto notificationsGroupUnreadCounterDto = (NotificationsGroupUnreadCounterDto) obj;
        return epx.f(this.groupId, notificationsGroupUnreadCounterDto.groupId) && this.counter == notificationsGroupUnreadCounterDto.counter;
    }

    public final int hashCode() {
        return Integer.hashCode(this.counter) + (Long.hashCode(this.groupId.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsGroupUnreadCounterDto(groupId=");
        sb.append(this.groupId);
        sb.append(", counter=");
        return vu5.b(sb, this.counter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        parcel.writeInt(this.counter);
    }
}
