package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsMarketDeliveryInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMarketDeliveryInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMarketDeliveryInfoDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: GroupsMarketDeliveryInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMarketDeliveryInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMarketDeliveryInfoDto createFromParcel(Parcel parcel) {
            return new GroupsMarketDeliveryInfoDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMarketDeliveryInfoDto[] newArray(int i) {
            return new GroupsMarketDeliveryInfoDto[i];
        }
    }

    public GroupsMarketDeliveryInfoDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final int d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMarketDeliveryInfoDto)) {
            return false;
        }
        GroupsMarketDeliveryInfoDto groupsMarketDeliveryInfoDto = (GroupsMarketDeliveryInfoDto) obj;
        return this.id == groupsMarketDeliveryInfoDto.id && epx.f(this.name, groupsMarketDeliveryInfoDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsMarketDeliveryInfoDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
}
