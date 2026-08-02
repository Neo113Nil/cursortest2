package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: GroupsSimpleButtonDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSimpleButtonDto implements Parcelable {
    public static final Parcelable.Creator<GroupsSimpleButtonDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: GroupsSimpleButtonDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSimpleButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSimpleButtonDto createFromParcel(Parcel parcel) {
            return new GroupsSimpleButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSimpleButtonDto[] newArray(int i) {
            return new GroupsSimpleButtonDto[i];
        }
    }

    public GroupsSimpleButtonDto(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSimpleButtonDto)) {
            return false;
        }
        GroupsSimpleButtonDto groupsSimpleButtonDto = (GroupsSimpleButtonDto) obj;
        return epx.f(this.title, groupsSimpleButtonDto.title) && epx.f(this.url, groupsSimpleButtonDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsSimpleButtonDto(title=");
        sb.append(this.title);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }
}
