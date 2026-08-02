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
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsGetResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetResponseDto> CREATOR = new a();

    @pmi0("can_add")
    private final Boolean canAdd;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("last_updated_time")
    private final Integer lastUpdatedTime;

    /* compiled from: GroupsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(GroupsGetResponseDto.class, parcel, arrayList, i, 1);
            }
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGetResponseDto(readInt, arrayList, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetResponseDto[] newArray(int i) {
            return new GroupsGetResponseDto[i];
        }
    }

    public GroupsGetResponseDto(int i, List<UserId> list, Integer num, Boolean bool) {
        this.count = i;
        this.items = list;
        this.lastUpdatedTime = num;
        this.canAdd = bool;
    }

    public final Boolean d() {
        return this.canAdd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetResponseDto)) {
            return false;
        }
        GroupsGetResponseDto groupsGetResponseDto = (GroupsGetResponseDto) obj;
        return this.count == groupsGetResponseDto.count && epx.f(this.items, groupsGetResponseDto.items) && epx.f(this.lastUpdatedTime, groupsGetResponseDto.lastUpdatedTime) && epx.f(this.canAdd, groupsGetResponseDto.canAdd);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.lastUpdatedTime;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canAdd;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", lastUpdatedTime=");
        sb.append(this.lastUpdatedTime);
        sb.append(", canAdd=");
        return tn.a(sb, this.canAdd, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Integer num = this.lastUpdatedTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.canAdd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GroupsGetResponseDto(int i, List list, Integer num, Boolean bool, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool);
    }
}
