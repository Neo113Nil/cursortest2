package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.k73;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SpacesNotificationsForUserDto.kt */
/* loaded from: classes15.dex */
public final class SpacesNotificationsForUserDto implements Parcelable {
    public static final Parcelable.Creator<SpacesNotificationsForUserDto> CREATOR = new a();

    @pmi0("room_ids")
    private final List<Long> roomIds;

    @pmi0("unread_count")
    private final Integer unreadCount;

    /* compiled from: SpacesNotificationsForUserDto.kt */
    public static final class a implements Parcelable.Creator<SpacesNotificationsForUserDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesNotificationsForUserDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = k73.b(parcel, arrayList, i, 1);
            }
            return new SpacesNotificationsForUserDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesNotificationsForUserDto[] newArray(int i) {
            return new SpacesNotificationsForUserDto[i];
        }
    }

    public SpacesNotificationsForUserDto(List<Long> list, Integer num) {
        this.roomIds = list;
        this.unreadCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesNotificationsForUserDto)) {
            return false;
        }
        SpacesNotificationsForUserDto spacesNotificationsForUserDto = (SpacesNotificationsForUserDto) obj;
        return epx.f(this.roomIds, spacesNotificationsForUserDto.roomIds) && epx.f(this.unreadCount, spacesNotificationsForUserDto.unreadCount);
    }

    public final int hashCode() {
        int hashCode = this.roomIds.hashCode() * 31;
        Integer num = this.unreadCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesNotificationsForUserDto(roomIds=");
        sb.append(this.roomIds);
        sb.append(", unreadCount=");
        return uqi.b(sb, this.unreadCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.roomIds);
        while (a2.hasNext()) {
            parcel.writeLong(((Number) a2.next()).longValue());
        }
        Integer num = this.unreadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ SpacesNotificationsForUserDto(List list, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num);
    }
}
