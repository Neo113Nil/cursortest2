package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsSectionsListItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSectionsListItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSectionsListItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsSectionsListItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSectionsListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSectionsListItemDto createFromParcel(Parcel parcel) {
            return new GroupsSectionsListItemDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSectionsListItemDto[] newArray(int i) {
            return new GroupsSectionsListItemDto[i];
        }
    }

    public GroupsSectionsListItemDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSectionsListItemDto)) {
            return false;
        }
        GroupsSectionsListItemDto groupsSectionsListItemDto = (GroupsSectionsListItemDto) obj;
        return this.id == groupsSectionsListItemDto.id && epx.f(this.title, groupsSectionsListItemDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSectionsListItemDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
