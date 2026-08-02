package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GroupsGroupsArrayDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupsArrayDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupsArrayDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    /* compiled from: GroupsGroupsArrayDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupsArrayDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupsArrayDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(GroupsGroupsArrayDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsGroupsArrayDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupsArrayDto[] newArray(int i) {
            return new GroupsGroupsArrayDto[i];
        }
    }

    public GroupsGroupsArrayDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupsArrayDto)) {
            return false;
        }
        GroupsGroupsArrayDto groupsGroupsArrayDto = (GroupsGroupsArrayDto) obj;
        return this.count == groupsGroupsArrayDto.count && epx.f(this.items, groupsGroupsArrayDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupsArrayDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
