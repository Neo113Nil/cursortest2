package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseSexDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsGroupCategoryGenderDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupCategoryGenderDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupCategoryGenderDto> CREATOR = new a();

    @pmi0("id")
    private final BaseSexDto id;

    @pmi0("name")
    private final String name;

    /* compiled from: GroupsGroupCategoryGenderDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupCategoryGenderDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupCategoryGenderDto createFromParcel(Parcel parcel) {
            return new GroupsGroupCategoryGenderDto((BaseSexDto) parcel.readParcelable(GroupsGroupCategoryGenderDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupCategoryGenderDto[] newArray(int i) {
            return new GroupsGroupCategoryGenderDto[i];
        }
    }

    public GroupsGroupCategoryGenderDto(BaseSexDto baseSexDto, String str) {
        this.id = baseSexDto;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupCategoryGenderDto)) {
            return false;
        }
        GroupsGroupCategoryGenderDto groupsGroupCategoryGenderDto = (GroupsGroupCategoryGenderDto) obj;
        return this.id == groupsGroupCategoryGenderDto.id && epx.f(this.name, groupsGroupCategoryGenderDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupCategoryGenderDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
    }
}
