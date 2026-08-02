package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetRequestsFieldsResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetRequestsFieldsResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetRequestsFieldsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("count_with_query")
    private final Integer countWithQuery;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsGetRequestsFieldsResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetRequestsFieldsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetRequestsFieldsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(GroupsGetRequestsFieldsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsGetRequestsFieldsResponseDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetRequestsFieldsResponseDto[] newArray(int i) {
            return new GroupsGetRequestsFieldsResponseDto[i];
        }
    }

    public GroupsGetRequestsFieldsResponseDto(int i, List<UsersUserFullDto> list, Integer num, String str) {
        this.count = i;
        this.items = list;
        this.countWithQuery = num;
        this.nextFrom = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetRequestsFieldsResponseDto)) {
            return false;
        }
        GroupsGetRequestsFieldsResponseDto groupsGetRequestsFieldsResponseDto = (GroupsGetRequestsFieldsResponseDto) obj;
        return this.count == groupsGetRequestsFieldsResponseDto.count && epx.f(this.items, groupsGetRequestsFieldsResponseDto.items) && epx.f(this.countWithQuery, groupsGetRequestsFieldsResponseDto.countWithQuery) && epx.f(this.nextFrom, groupsGetRequestsFieldsResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.countWithQuery;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nextFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetRequestsFieldsResponseDto(count=");
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
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Integer num = this.countWithQuery;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsGetRequestsFieldsResponseDto(int i, List list, Integer num, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}
