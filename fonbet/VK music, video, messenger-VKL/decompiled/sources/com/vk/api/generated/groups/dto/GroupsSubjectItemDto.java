package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsSubjectItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSubjectItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSubjectItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: GroupsSubjectItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSubjectItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSubjectItemDto createFromParcel(Parcel parcel) {
            return new GroupsSubjectItemDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSubjectItemDto[] newArray(int i) {
            return new GroupsSubjectItemDto[i];
        }
    }

    public GroupsSubjectItemDto(int i, String str) {
        this.id = i;
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
        if (!(obj instanceof GroupsSubjectItemDto)) {
            return false;
        }
        GroupsSubjectItemDto groupsSubjectItemDto = (GroupsSubjectItemDto) obj;
        return this.id == groupsSubjectItemDto.id && epx.f(this.name, groupsSubjectItemDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSubjectItemDto(id=");
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
