package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.notifications.dto.NotificationsNotificationFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetNotificationsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetNotificationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetNotificationsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<NotificationsNotificationFullDto> items;

    @pmi0("new_from")
    private final String newFrom;

    /* compiled from: GroupsGetNotificationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetNotificationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetNotificationsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(NotificationsNotificationFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGetNotificationsResponseDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetNotificationsResponseDto[] newArray(int i) {
            return new GroupsGetNotificationsResponseDto[i];
        }
    }

    public GroupsGetNotificationsResponseDto(int i, List<NotificationsNotificationFullDto> list, String str) {
        this.count = i;
        this.items = list;
        this.newFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetNotificationsResponseDto)) {
            return false;
        }
        GroupsGetNotificationsResponseDto groupsGetNotificationsResponseDto = (GroupsGetNotificationsResponseDto) obj;
        return this.count == groupsGetNotificationsResponseDto.count && epx.f(this.items, groupsGetNotificationsResponseDto.items) && epx.f(this.newFrom, groupsGetNotificationsResponseDto.newFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.newFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetNotificationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", newFrom=");
        return ho8.a(sb, this.newFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NotificationsNotificationFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.newFrom);
    }

    public /* synthetic */ GroupsGetNotificationsResponseDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
