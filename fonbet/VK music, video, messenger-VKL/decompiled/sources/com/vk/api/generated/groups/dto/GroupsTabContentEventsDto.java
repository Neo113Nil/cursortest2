package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsTabContentEventsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentEventsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentEventsDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<GroupsGroupFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentEventsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentEventsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentEventsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(GroupsTabContentEventsDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsTabContentEventsDto(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentEventsDto[] newArray(int i) {
            return new GroupsTabContentEventsDto[i];
        }
    }

    public GroupsTabContentEventsDto(List<GroupsGroupFullDto> list, boolean z, Integer num, String str) {
        this.items = list;
        this.canAdd = z;
        this.count = num;
        this.nextFrom = str;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentEventsDto)) {
            return false;
        }
        GroupsTabContentEventsDto groupsTabContentEventsDto = (GroupsTabContentEventsDto) obj;
        return epx.f(this.items, groupsTabContentEventsDto.items) && this.canAdd == groupsTabContentEventsDto.canAdd && epx.f(this.count, groupsTabContentEventsDto.count) && epx.f(this.nextFrom, groupsTabContentEventsDto.nextFrom);
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.canAdd);
        Integer num = this.count;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentEventsDto(items=");
        sb.append(this.items);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentEventsDto(List list, boolean z, Integer num, String str, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
