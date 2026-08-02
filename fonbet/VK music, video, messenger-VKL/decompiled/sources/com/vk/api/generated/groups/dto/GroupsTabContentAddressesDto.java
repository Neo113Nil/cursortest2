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

/* compiled from: GroupsTabContentAddressesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentAddressesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentAddressesDto> CREATOR = new a();

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<GroupsAddressDto> items;

    @pmi0("modal_new_address_hash")
    private final String modalNewAddressHash;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentAddressesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentAddressesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentAddressesDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(GroupsTabContentAddressesDto.class, parcel, arrayList, i, 1);
            }
            return new GroupsTabContentAddressesDto(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentAddressesDto[] newArray(int i) {
            return new GroupsTabContentAddressesDto[i];
        }
    }

    public GroupsTabContentAddressesDto(List<GroupsAddressDto> list, boolean z, String str, Integer num, String str2) {
        this.items = list;
        this.canAdd = z;
        this.modalNewAddressHash = str;
        this.count = num;
        this.nextFrom = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentAddressesDto)) {
            return false;
        }
        GroupsTabContentAddressesDto groupsTabContentAddressesDto = (GroupsTabContentAddressesDto) obj;
        return epx.f(this.items, groupsTabContentAddressesDto.items) && this.canAdd == groupsTabContentAddressesDto.canAdd && epx.f(this.modalNewAddressHash, groupsTabContentAddressesDto.modalNewAddressHash) && epx.f(this.count, groupsTabContentAddressesDto.count) && epx.f(this.nextFrom, groupsTabContentAddressesDto.nextFrom);
    }

    public final int hashCode() {
        int b = qoy.b(this.items.hashCode() * 31, 31, this.canAdd);
        String str = this.modalNewAddressHash;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentAddressesDto(items=");
        sb.append(this.items);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", modalNewAddressHash=");
        sb.append(this.modalNewAddressHash);
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
        parcel.writeString(this.modalNewAddressHash);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentAddressesDto(List list, boolean z, String str, Integer num, String str2, int i, zcl zclVar) {
        this(list, z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2);
    }
}
