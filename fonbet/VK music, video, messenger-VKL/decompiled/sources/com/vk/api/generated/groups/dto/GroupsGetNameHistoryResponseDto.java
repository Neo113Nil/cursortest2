package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetNameHistoryResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetNameHistoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetNameHistoryResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsGroupNameHistoryActionDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsGetNameHistoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetNameHistoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetNameHistoryResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(GroupsGetNameHistoryResponseDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsGetNameHistoryResponseDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetNameHistoryResponseDto[] newArray(int i) {
            return new GroupsGetNameHistoryResponseDto[i];
        }
    }

    public GroupsGetNameHistoryResponseDto(int i, List<GroupsGroupNameHistoryActionDto> list, String str) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
    }

    public final List<GroupsGroupNameHistoryActionDto> d() {
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
        if (!(obj instanceof GroupsGetNameHistoryResponseDto)) {
            return false;
        }
        GroupsGetNameHistoryResponseDto groupsGetNameHistoryResponseDto = (GroupsGetNameHistoryResponseDto) obj;
        return this.count == groupsGetNameHistoryResponseDto.count && epx.f(this.items, groupsGetNameHistoryResponseDto.items) && epx.f(this.nextFrom, groupsGetNameHistoryResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetNameHistoryResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsGetNameHistoryResponseDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
