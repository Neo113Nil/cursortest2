package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpacesSearchMembersResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesSearchMembersResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesSearchMembersResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<SpacesMemberDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(SignalingProtocol.KEY_ROLES)
    private final List<SpacesRoleDto> roles;

    /* compiled from: SpacesSearchMembersResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesSearchMembersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesSearchMembersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(SpacesMemberDto.CREATOR, parcel, arrayList2, i, 1);
            }
            int readInt3 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = en.a(SpacesRoleDto.CREATOR, parcel, arrayList3, i3, 1);
            }
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(SpacesSearchMembersResponseDto.class, parcel, arrayList, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                while (i2 != readInt5) {
                    i2 = bo.b(SpacesSearchMembersResponseDto.class, parcel, arrayList4, i2, 1);
                }
            }
            return new SpacesSearchMembersResponseDto(readInt, arrayList2, arrayList3, arrayList, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesSearchMembersResponseDto[] newArray(int i) {
            return new SpacesSearchMembersResponseDto[i];
        }
    }

    public SpacesSearchMembersResponseDto(int i, List<SpacesMemberDto> list, List<SpacesRoleDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4) {
        this.count = i;
        this.items = list;
        this.roles = list2;
        this.profiles = list3;
        this.groups = list4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesSearchMembersResponseDto)) {
            return false;
        }
        SpacesSearchMembersResponseDto spacesSearchMembersResponseDto = (SpacesSearchMembersResponseDto) obj;
        return this.count == spacesSearchMembersResponseDto.count && epx.f(this.items, spacesSearchMembersResponseDto.items) && epx.f(this.roles, spacesSearchMembersResponseDto.roles) && epx.f(this.profiles, spacesSearchMembersResponseDto.profiles) && epx.f(this.groups, spacesSearchMembersResponseDto.groups);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.roles);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesSearchMembersResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", roles=");
        sb.append(this.roles);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SpacesMemberDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.roles);
        while (a3.hasNext()) {
            ((SpacesRoleDto) a3.next()).writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ SpacesSearchMembersResponseDto(int i, List list, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4);
    }
}
