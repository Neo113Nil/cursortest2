package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetByIdObjectResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetByIdObjectResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetByIdObjectResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<GroupsProfileItemDto> profiles;

    /* compiled from: GroupsGetByIdObjectResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetByIdObjectResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetByIdObjectResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(GroupsGroupFullDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(GroupsProfileItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new GroupsGetByIdObjectResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetByIdObjectResponseDto[] newArray(int i) {
            return new GroupsGetByIdObjectResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsGetByIdObjectResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsProfileItemDto> e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetByIdObjectResponseDto)) {
            return false;
        }
        GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) obj;
        return epx.f(this.groups, groupsGetByIdObjectResponseDto.groups) && epx.f(this.profiles, groupsGetByIdObjectResponseDto.profiles);
    }

    public final int hashCode() {
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GroupsProfileItemDto> list2 = this.profiles;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetByIdObjectResponseDto(groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<GroupsGroupFullDto> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsGroupFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsProfileItemDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((GroupsProfileItemDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public GroupsGetByIdObjectResponseDto(List<GroupsGroupFullDto> list, List<GroupsProfileItemDto> list2) {
        this.groups = list;
        this.profiles = list2;
    }

    public /* synthetic */ GroupsGetByIdObjectResponseDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
