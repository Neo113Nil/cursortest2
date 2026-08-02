package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsActionButtonsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsActionButtonsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsActionButtonsDto> CREATOR = new a();

    @pmi0("goods")
    private final Boolean goods;

    @pmi0("services")
    private final Boolean services;

    @pmi0("y_clients")
    private final Boolean yClients;

    /* compiled from: GroupsActionButtonsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsActionButtonsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsActionButtonsDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonsDto[] newArray(int i) {
            return new GroupsActionButtonsDto[i];
        }
    }

    public GroupsActionButtonsDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.goods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.services;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsActionButtonsDto)) {
            return false;
        }
        GroupsActionButtonsDto groupsActionButtonsDto = (GroupsActionButtonsDto) obj;
        return epx.f(this.yClients, groupsActionButtonsDto.yClients) && epx.f(this.goods, groupsActionButtonsDto.goods) && epx.f(this.services, groupsActionButtonsDto.services);
    }

    public final Boolean f() {
        return this.yClients;
    }

    public final int hashCode() {
        Boolean bool = this.yClients;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.goods;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.services;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsActionButtonsDto(yClients=");
        sb.append(this.yClients);
        sb.append(", goods=");
        sb.append(this.goods);
        sb.append(", services=");
        return tn.a(sb, this.services, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.yClients;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.goods;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.services;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public GroupsActionButtonsDto(Boolean bool, Boolean bool2, Boolean bool3) {
        this.yClients = bool;
        this.goods = bool2;
        this.services = bool3;
    }

    public /* synthetic */ GroupsActionButtonsDto(Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
