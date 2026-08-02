package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsOnlineStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsOnlineStatusDto implements Parcelable {
    public static final Parcelable.Creator<GroupsOnlineStatusDto> CREATOR = new a();

    @pmi0("minutes")
    private final Integer minutes;

    @pmi0("status")
    private final GroupsOnlineStatusTypeDto status;

    /* compiled from: GroupsOnlineStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsOnlineStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsOnlineStatusDto createFromParcel(Parcel parcel) {
            return new GroupsOnlineStatusDto(GroupsOnlineStatusTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsOnlineStatusDto[] newArray(int i) {
            return new GroupsOnlineStatusDto[i];
        }
    }

    public GroupsOnlineStatusDto(GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto, Integer num) {
        this.status = groupsOnlineStatusTypeDto;
        this.minutes = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsOnlineStatusDto)) {
            return false;
        }
        GroupsOnlineStatusDto groupsOnlineStatusDto = (GroupsOnlineStatusDto) obj;
        return this.status == groupsOnlineStatusDto.status && epx.f(this.minutes, groupsOnlineStatusDto.minutes);
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Integer num = this.minutes;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsOnlineStatusDto(status=");
        sb.append(this.status);
        sb.append(", minutes=");
        return uqi.b(sb, this.minutes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.status.writeToParcel(parcel, i);
        Integer num = this.minutes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ GroupsOnlineStatusDto(GroupsOnlineStatusTypeDto groupsOnlineStatusTypeDto, Integer num, int i, zcl zclVar) {
        this(groupsOnlineStatusTypeDto, (i & 2) != 0 ? null : num);
    }
}
