package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsWorkGroupInfoDetailsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsWorkGroupInfoDetailsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsWorkGroupInfoDetailsDto> CREATOR = new a();

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("description")
    private final String description;

    @pmi0("icon_name")
    private final String iconName;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsWorkGroupInfoDetailsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsWorkGroupInfoDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsWorkGroupInfoDetailsDto createFromParcel(Parcel parcel) {
            return new GroupsWorkGroupInfoDetailsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsWorkGroupInfoDetailsDto[] newArray(int i) {
            return new GroupsWorkGroupInfoDetailsDto[i];
        }
    }

    public GroupsWorkGroupInfoDetailsDto(String str, String str2, String str3, String str4) {
        this.title = str;
        this.buttonTitle = str2;
        this.iconName = str3;
        this.description = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsWorkGroupInfoDetailsDto)) {
            return false;
        }
        GroupsWorkGroupInfoDetailsDto groupsWorkGroupInfoDetailsDto = (GroupsWorkGroupInfoDetailsDto) obj;
        return epx.f(this.title, groupsWorkGroupInfoDetailsDto.title) && epx.f(this.buttonTitle, groupsWorkGroupInfoDetailsDto.buttonTitle) && epx.f(this.iconName, groupsWorkGroupInfoDetailsDto.iconName) && epx.f(this.description, groupsWorkGroupInfoDetailsDto.description);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.buttonTitle);
        String str = this.iconName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsWorkGroupInfoDetailsDto(title=");
        sb.append(this.title);
        sb.append(", buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", iconName=");
        sb.append(this.iconName);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.iconName);
        parcel.writeString(this.description);
    }

    public /* synthetic */ GroupsWorkGroupInfoDetailsDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
