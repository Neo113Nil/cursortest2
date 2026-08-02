package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsGetObjectExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetObjectExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetObjectExtendedResponseDto> CREATOR = new a();

    @pmi0("can_add")
    private final Boolean canAdd;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsGroupFullDto> items;

    @pmi0("last_updated_time")
    private final Integer lastUpdatedTime;

    @pmi0("track_codes")
    private final List<GroupsTrackCodeDto> trackCodes;

    /* compiled from: GroupsGetObjectExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetObjectExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetObjectExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(GroupsGetObjectExtendedResponseDto.class, parcel, arrayList2, i, 1);
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(GroupsTrackCodeDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsGetObjectExtendedResponseDto(readInt, arrayList2, arrayList, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetObjectExtendedResponseDto[] newArray(int i) {
            return new GroupsGetObjectExtendedResponseDto[i];
        }
    }

    public GroupsGetObjectExtendedResponseDto(int i, List<GroupsGroupFullDto> list, List<GroupsTrackCodeDto> list2, Integer num, Boolean bool) {
        this.count = i;
        this.items = list;
        this.trackCodes = list2;
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

    public final List<GroupsGroupFullDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetObjectExtendedResponseDto)) {
            return false;
        }
        GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) obj;
        return this.count == groupsGetObjectExtendedResponseDto.count && epx.f(this.items, groupsGetObjectExtendedResponseDto.items) && epx.f(this.trackCodes, groupsGetObjectExtendedResponseDto.trackCodes) && epx.f(this.lastUpdatedTime, groupsGetObjectExtendedResponseDto.lastUpdatedTime) && epx.f(this.canAdd, groupsGetObjectExtendedResponseDto.canAdd);
    }

    public final Integer f() {
        return this.lastUpdatedTime;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<GroupsTrackCodeDto> list = this.trackCodes;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.lastUpdatedTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.canAdd;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetObjectExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", trackCodes=");
        sb.append(this.trackCodes);
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
        List<GroupsTrackCodeDto> list = this.trackCodes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsTrackCodeDto) f.next()).writeToParcel(parcel, i);
            }
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

    public /* synthetic */ GroupsGetObjectExtendedResponseDto(int i, List list, List list2, Integer num, Boolean bool, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : bool);
    }
}
