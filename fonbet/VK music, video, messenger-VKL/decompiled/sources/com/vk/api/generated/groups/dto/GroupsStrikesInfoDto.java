package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GroupsStrikesInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsStrikesInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsStrikesInfoDto> CREATOR = new a();

    @pmi0("button_href")
    private final String buttonHref;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final String icon;

    @pmi0("icon_color")
    private final String iconColor;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsStrikesInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsStrikesInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsStrikesInfoDto createFromParcel(Parcel parcel) {
            return new GroupsStrikesInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsStrikesInfoDto[] newArray(int i) {
            return new GroupsStrikesInfoDto[i];
        }
    }

    public GroupsStrikesInfoDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.icon = str;
        this.iconColor = str2;
        this.title = str3;
        this.description = str4;
        this.buttonText = str5;
        this.buttonHref = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsStrikesInfoDto)) {
            return false;
        }
        GroupsStrikesInfoDto groupsStrikesInfoDto = (GroupsStrikesInfoDto) obj;
        return epx.f(this.icon, groupsStrikesInfoDto.icon) && epx.f(this.iconColor, groupsStrikesInfoDto.iconColor) && epx.f(this.title, groupsStrikesInfoDto.title) && epx.f(this.description, groupsStrikesInfoDto.description) && epx.f(this.buttonText, groupsStrikesInfoDto.buttonText) && epx.f(this.buttonHref, groupsStrikesInfoDto.buttonHref);
    }

    public final int hashCode() {
        return this.buttonHref.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.icon.hashCode() * 31, 31, this.iconColor), 31, this.title), 31, this.description), 31, this.buttonText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsStrikesInfoDto(icon=");
        sb.append(this.icon);
        sb.append(", iconColor=");
        sb.append(this.iconColor);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", buttonHref=");
        return ho8.a(sb, this.buttonHref, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.icon);
        parcel.writeString(this.iconColor);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.buttonHref);
    }
}
