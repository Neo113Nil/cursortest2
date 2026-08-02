package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpacesGetMembersResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetMembersResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetMembersResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<SpacesMemberDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("total_count")
    private final int totalCount;

    /* compiled from: SpacesGetMembersResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetMembersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetMembersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(SpacesMemberDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(SpacesGetMembersResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(SpacesGetMembersResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new SpacesGetMembersResponseDto(readInt, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetMembersResponseDto[] newArray(int i) {
            return new SpacesGetMembersResponseDto[i];
        }
    }

    public SpacesGetMembersResponseDto(int i, List<SpacesMemberDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.totalCount = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesGetMembersResponseDto)) {
            return false;
        }
        SpacesGetMembersResponseDto spacesGetMembersResponseDto = (SpacesGetMembersResponseDto) obj;
        return this.totalCount == spacesGetMembersResponseDto.totalCount && epx.f(this.items, spacesGetMembersResponseDto.items) && epx.f(this.profiles, spacesGetMembersResponseDto.profiles) && epx.f(this.groups, spacesGetMembersResponseDto.groups);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesGetMembersResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SpacesMemberDto) a2.next()).writeToParcel(parcel, i);
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

    public /* synthetic */ SpacesGetMembersResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
