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

/* compiled from: GroupsGetBidOrganizationsListResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetBidOrganizationsListResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetBidOrganizationsListResponseDto> CREATOR = new a();

    @pmi0("orgs_list")
    private final List<GroupsBidOrganizationDto> orgsList;

    /* compiled from: GroupsGetBidOrganizationsListResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetBidOrganizationsListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetBidOrganizationsListResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsBidOrganizationDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsGetBidOrganizationsListResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetBidOrganizationsListResponseDto[] newArray(int i) {
            return new GroupsGetBidOrganizationsListResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsGetBidOrganizationsListResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<GroupsBidOrganizationDto> d() {
        return this.orgsList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsGetBidOrganizationsListResponseDto) && epx.f(this.orgsList, ((GroupsGetBidOrganizationsListResponseDto) obj).orgsList);
    }

    public final int hashCode() {
        List<GroupsBidOrganizationDto> list = this.orgsList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("GroupsGetBidOrganizationsListResponseDto(orgsList="), this.orgsList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<GroupsBidOrganizationDto> list = this.orgsList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsBidOrganizationDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public GroupsGetBidOrganizationsListResponseDto(List<GroupsBidOrganizationDto> list) {
        this.orgsList = list;
    }

    public /* synthetic */ GroupsGetBidOrganizationsListResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
