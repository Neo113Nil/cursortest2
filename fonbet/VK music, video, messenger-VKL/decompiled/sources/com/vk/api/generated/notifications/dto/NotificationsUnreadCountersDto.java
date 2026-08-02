package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: NotificationsUnreadCountersDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnreadCountersDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnreadCountersDto> CREATOR = new a();

    @pmi0("groups")
    private final List<NotificationsGroupUnreadCounterDto> groups;

    @pmi0("user")
    private final int user;

    /* compiled from: NotificationsUnreadCountersDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnreadCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnreadCountersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(NotificationsGroupUnreadCounterDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NotificationsUnreadCountersDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnreadCountersDto[] newArray(int i) {
            return new NotificationsUnreadCountersDto[i];
        }
    }

    public NotificationsUnreadCountersDto(int i, List<NotificationsGroupUnreadCounterDto> list) {
        this.user = i;
        this.groups = list;
    }

    public final List<NotificationsGroupUnreadCounterDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnreadCountersDto)) {
            return false;
        }
        NotificationsUnreadCountersDto notificationsUnreadCountersDto = (NotificationsUnreadCountersDto) obj;
        return this.user == notificationsUnreadCountersDto.user && epx.f(this.groups, notificationsUnreadCountersDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + (Integer.hashCode(this.user) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsUnreadCountersDto(user=");
        sb.append(this.user);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.user);
        Iterator a2 = ao.a(parcel, this.groups);
        while (a2.hasNext()) {
            ((NotificationsGroupUnreadCounterDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
