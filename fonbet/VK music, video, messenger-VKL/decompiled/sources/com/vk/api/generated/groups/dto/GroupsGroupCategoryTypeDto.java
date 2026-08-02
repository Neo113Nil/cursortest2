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
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGroupCategoryTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupCategoryTypeDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupCategoryTypeDto> CREATOR = new a();

    @pmi0("genders")
    private final List<GroupsGroupCategoryGenderDto> genders;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: GroupsGroupCategoryTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupCategoryTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupCategoryTypeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(GroupsGroupCategoryGenderDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsGroupCategoryTypeDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupCategoryTypeDto[] newArray(int i) {
            return new GroupsGroupCategoryTypeDto[i];
        }
    }

    public GroupsGroupCategoryTypeDto(int i, String str, List<GroupsGroupCategoryGenderDto> list) {
        this.id = i;
        this.name = str;
        this.genders = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategoryTypeDto)) {
            return false;
        }
        GroupsGroupCategoryTypeDto groupsGroupCategoryTypeDto = (GroupsGroupCategoryTypeDto) obj;
        return this.id == groupsGroupCategoryTypeDto.id && epx.f(this.name, groupsGroupCategoryTypeDto.name) && epx.f(this.genders, groupsGroupCategoryTypeDto.genders);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        List<GroupsGroupCategoryGenderDto> list = this.genders;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupCategoryTypeDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", genders=");
        return ms9.a(')', sb, this.genders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        List<GroupsGroupCategoryGenderDto> list = this.genders;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsGroupCategoryGenderDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsGroupCategoryTypeDto(int i, String str, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : list);
    }
}
