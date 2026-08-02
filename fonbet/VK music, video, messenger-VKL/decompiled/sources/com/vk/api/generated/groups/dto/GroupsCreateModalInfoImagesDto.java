package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: GroupsCreateModalInfoImagesDto.kt */
/* loaded from: classes14.dex */
public final class GroupsCreateModalInfoImagesDto implements Parcelable {
    public static final Parcelable.Creator<GroupsCreateModalInfoImagesDto> CREATOR = new a();

    @pmi0("focus")
    private final List<String> focus;

    @pmi0("icons")
    private final List<String> icons;

    /* compiled from: GroupsCreateModalInfoImagesDto.kt */
    public static final class a implements Parcelable.Creator<GroupsCreateModalInfoImagesDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsCreateModalInfoImagesDto createFromParcel(Parcel parcel) {
            return new GroupsCreateModalInfoImagesDto(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsCreateModalInfoImagesDto[] newArray(int i) {
            return new GroupsCreateModalInfoImagesDto[i];
        }
    }

    public GroupsCreateModalInfoImagesDto(List<String> list, List<String> list2) {
        this.icons = list;
        this.focus = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCreateModalInfoImagesDto)) {
            return false;
        }
        GroupsCreateModalInfoImagesDto groupsCreateModalInfoImagesDto = (GroupsCreateModalInfoImagesDto) obj;
        return epx.f(this.icons, groupsCreateModalInfoImagesDto.icons) && epx.f(this.focus, groupsCreateModalInfoImagesDto.focus);
    }

    public final int hashCode() {
        return this.focus.hashCode() + (this.icons.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCreateModalInfoImagesDto(icons=");
        sb.append(this.icons);
        sb.append(", focus=");
        return ms9.a(')', sb, this.focus);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.icons);
        parcel.writeStringList(this.focus);
    }
}
