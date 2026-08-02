package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsAddressesInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsAddressesInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsAddressesInfoDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("has_addresses")
    private final Boolean hasAddresses;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("main_address")
    private final GroupsAddressDto mainAddress;

    @pmi0("main_address_id")
    private final Integer mainAddressId;

    /* compiled from: GroupsAddressesInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsAddressesInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsAddressesInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsAddressesInfoDto(z, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : GroupsAddressDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsAddressesInfoDto[] newArray(int i) {
            return new GroupsAddressesInfoDto[i];
        }
    }

    public GroupsAddressesInfoDto(boolean z, Boolean bool, Integer num, GroupsAddressDto groupsAddressDto, Integer num2) {
        this.isEnabled = z;
        this.hasAddresses = bool;
        this.mainAddressId = num;
        this.mainAddress = groupsAddressDto;
        this.count = num2;
    }

    public final GroupsAddressDto d() {
        return this.mainAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddressesInfoDto)) {
            return false;
        }
        GroupsAddressesInfoDto groupsAddressesInfoDto = (GroupsAddressesInfoDto) obj;
        return this.isEnabled == groupsAddressesInfoDto.isEnabled && epx.f(this.hasAddresses, groupsAddressesInfoDto.hasAddresses) && epx.f(this.mainAddressId, groupsAddressesInfoDto.mainAddressId) && epx.f(this.mainAddress, groupsAddressesInfoDto.mainAddress) && epx.f(this.count, groupsAddressesInfoDto.count);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        Boolean bool = this.hasAddresses;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.mainAddressId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        GroupsAddressDto groupsAddressDto = this.mainAddress;
        int hashCode4 = (hashCode3 + (groupsAddressDto == null ? 0 : groupsAddressDto.hashCode())) * 31;
        Integer num2 = this.count;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsAddressesInfoDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", hasAddresses=");
        sb.append(this.hasAddresses);
        sb.append(", mainAddressId=");
        sb.append(this.mainAddressId);
        sb.append(", mainAddress=");
        sb.append(this.mainAddress);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Boolean bool = this.hasAddresses;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.mainAddressId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        GroupsAddressDto groupsAddressDto = this.mainAddress;
        if (groupsAddressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsAddressDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ GroupsAddressesInfoDto(boolean z, Boolean bool, Integer num, GroupsAddressDto groupsAddressDto, Integer num2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : groupsAddressDto, (i & 16) != 0 ? null : num2);
    }
}
