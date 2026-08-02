package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: NotificationsGetUnreadCountersResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsGetUnreadCountersResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsGetUnreadCountersResponseDto> CREATOR = new a();

    @pmi0("counters")
    private final NotificationsUnreadCountersDto counters;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    /* compiled from: NotificationsGetUnreadCountersResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsGetUnreadCountersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsGetUnreadCountersResponseDto createFromParcel(Parcel parcel) {
            NotificationsUnreadCountersDto createFromParcel = NotificationsUnreadCountersDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(NotificationsGetUnreadCountersResponseDto.class, parcel, arrayList, i, 1);
            }
            return new NotificationsGetUnreadCountersResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsGetUnreadCountersResponseDto[] newArray(int i) {
            return new NotificationsGetUnreadCountersResponseDto[i];
        }
    }

    public NotificationsGetUnreadCountersResponseDto(NotificationsUnreadCountersDto notificationsUnreadCountersDto, List<GroupsGroupDto> list) {
        this.counters = notificationsUnreadCountersDto;
        this.groups = list;
    }

    public final NotificationsUnreadCountersDto d() {
        return this.counters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGetUnreadCountersResponseDto)) {
            return false;
        }
        NotificationsGetUnreadCountersResponseDto notificationsGetUnreadCountersResponseDto = (NotificationsGetUnreadCountersResponseDto) obj;
        return epx.f(this.counters, notificationsGetUnreadCountersResponseDto.counters) && epx.f(this.groups, notificationsGetUnreadCountersResponseDto.groups);
    }

    public final int hashCode() {
        return this.groups.hashCode() + (this.counters.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsGetUnreadCountersResponseDto(counters=");
        sb.append(this.counters);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.counters.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.groups);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
