package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsGetOwnersForCreateResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetOwnersForCreateResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetOwnersForCreateResponseDto> CREATOR = new a();

    @pmi0("all_owner_ids")
    private final List<UserId> allOwnerIds;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("owner_ids")
    private final List<UserId> ownerIds;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: ChannelsGetOwnersForCreateResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetOwnersForCreateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetOwnersForCreateResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(ChannelsGetOwnersForCreateResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i3 = 0;
            while (i3 != readInt2) {
                i3 = bo.b(ChannelsGetOwnersForCreateResponseDto.class, parcel, arrayList3, i3, 1);
            }
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(ChannelsGetOwnersForCreateResponseDto.class, parcel, arrayList, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ChannelsGetOwnersForCreateResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new ChannelsGetOwnersForCreateResponseDto(arrayList2, arrayList3, arrayList, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetOwnersForCreateResponseDto[] newArray(int i) {
            return new ChannelsGetOwnersForCreateResponseDto[i];
        }
    }

    public ChannelsGetOwnersForCreateResponseDto(List<UserId> list, List<UserId> list2, List<GroupsGroupFullDto> list3, List<UsersUserFullDto> list4) {
        this.ownerIds = list;
        this.allOwnerIds = list2;
        this.groups = list3;
        this.profiles = list4;
    }

    public final List<UserId> d() {
        return this.allOwnerIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.ownerIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetOwnersForCreateResponseDto)) {
            return false;
        }
        ChannelsGetOwnersForCreateResponseDto channelsGetOwnersForCreateResponseDto = (ChannelsGetOwnersForCreateResponseDto) obj;
        return epx.f(this.ownerIds, channelsGetOwnersForCreateResponseDto.ownerIds) && epx.f(this.allOwnerIds, channelsGetOwnersForCreateResponseDto.allOwnerIds) && epx.f(this.groups, channelsGetOwnersForCreateResponseDto.groups) && epx.f(this.profiles, channelsGetOwnersForCreateResponseDto.profiles);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.ownerIds.hashCode() * 31, 31, this.allOwnerIds);
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetOwnersForCreateResponseDto(ownerIds=");
        sb.append(this.ownerIds);
        sb.append(", allOwnerIds=");
        sb.append(this.allOwnerIds);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.ownerIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.allOwnerIds);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        List<GroupsGroupFullDto> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ ChannelsGetOwnersForCreateResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this(list, list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
