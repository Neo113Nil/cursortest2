package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsSuggestionByCategoryDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSuggestionByCategoryDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSuggestionByCategoryDto> CREATOR = new a();

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: GroupsSuggestionByCategoryDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSuggestionByCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSuggestionByCategoryDto createFromParcel(Parcel parcel) {
            return new GroupsSuggestionByCategoryDto((GroupsGroupFullDto) parcel.readParcelable(GroupsSuggestionByCategoryDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSuggestionByCategoryDto[] newArray(int i) {
            return new GroupsSuggestionByCategoryDto[i];
        }
    }

    public GroupsSuggestionByCategoryDto(GroupsGroupFullDto groupsGroupFullDto, String str) {
        this.group = groupsGroupFullDto;
        this.trackCode = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSuggestionByCategoryDto)) {
            return false;
        }
        GroupsSuggestionByCategoryDto groupsSuggestionByCategoryDto = (GroupsSuggestionByCategoryDto) obj;
        return epx.f(this.group, groupsSuggestionByCategoryDto.group) && epx.f(this.trackCode, groupsSuggestionByCategoryDto.trackCode);
    }

    public final int hashCode() {
        return this.trackCode.hashCode() + (this.group.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSuggestionByCategoryDto(group=");
        sb.append(this.group);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.group, i);
        parcel.writeString(this.trackCode);
    }
}
