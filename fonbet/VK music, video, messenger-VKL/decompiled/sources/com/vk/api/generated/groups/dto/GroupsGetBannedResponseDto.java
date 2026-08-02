package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetBannedResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetBannedResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetBannedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("count_with_query")
    private final Integer countWithQuery;

    @pmi0("items")
    private final List<GroupsOwnerXtrBanInfoDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsGetBannedResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetBannedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetBannedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(GroupsOwnerXtrBanInfoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGetBannedResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetBannedResponseDto[] newArray(int i) {
            return new GroupsGetBannedResponseDto[i];
        }
    }

    public GroupsGetBannedResponseDto(int i, List<GroupsOwnerXtrBanInfoDto> list, Integer num, String str) {
        this.count = i;
        this.items = list;
        this.countWithQuery = num;
        this.nextFrom = str;
    }

    public final List<GroupsOwnerXtrBanInfoDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetBannedResponseDto)) {
            return false;
        }
        GroupsGetBannedResponseDto groupsGetBannedResponseDto = (GroupsGetBannedResponseDto) obj;
        return this.count == groupsGetBannedResponseDto.count && epx.f(this.items, groupsGetBannedResponseDto.items) && epx.f(this.countWithQuery, groupsGetBannedResponseDto.countWithQuery) && epx.f(this.nextFrom, groupsGetBannedResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.countWithQuery;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetBannedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", countWithQuery=");
        sb.append(this.countWithQuery);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((GroupsOwnerXtrBanInfoDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.countWithQuery;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsGetBannedResponseDto(int i, List list, Integer num, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}
