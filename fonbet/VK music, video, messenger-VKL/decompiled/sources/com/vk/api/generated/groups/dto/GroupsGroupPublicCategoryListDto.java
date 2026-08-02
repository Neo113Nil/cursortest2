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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupPublicCategoryListDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupPublicCategoryListDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupPublicCategoryListDto> CREATOR = new a();

    @pmi0("genders")
    private final List<GroupsGroupCategoryGenderDto> genders;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("subcategories")
    private final List<GroupsGroupCategoryTypeDto> subcategories;

    /* compiled from: GroupsGroupPublicCategoryListDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupPublicCategoryListDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupPublicCategoryListDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(GroupsGroupCategoryGenderDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(GroupsGroupCategoryTypeDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new GroupsGroupPublicCategoryListDto(valueOf, readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupPublicCategoryListDto[] newArray(int i) {
            return new GroupsGroupPublicCategoryListDto[i];
        }
    }

    public GroupsGroupPublicCategoryListDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupPublicCategoryListDto)) {
            return false;
        }
        GroupsGroupPublicCategoryListDto groupsGroupPublicCategoryListDto = (GroupsGroupPublicCategoryListDto) obj;
        return epx.f(this.id, groupsGroupPublicCategoryListDto.id) && epx.f(this.name, groupsGroupPublicCategoryListDto.name) && epx.f(this.genders, groupsGroupPublicCategoryListDto.genders) && epx.f(this.subcategories, groupsGroupPublicCategoryListDto.subcategories);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<GroupsGroupCategoryGenderDto> list = this.genders;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupCategoryTypeDto> list2 = this.subcategories;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupPublicCategoryListDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", genders=");
        sb.append(this.genders);
        sb.append(", subcategories=");
        return ms9.a(')', sb, this.subcategories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        List<GroupsGroupCategoryGenderDto> list = this.genders;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsGroupCategoryGenderDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupCategoryTypeDto> list2 = this.subcategories;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((GroupsGroupCategoryTypeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public GroupsGroupPublicCategoryListDto(Integer num, String str, List<GroupsGroupCategoryGenderDto> list, List<GroupsGroupCategoryTypeDto> list2) {
        this.id = num;
        this.name = str;
        this.genders = list;
        this.subcategories = list2;
    }

    public /* synthetic */ GroupsGroupPublicCategoryListDto(Integer num, String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
