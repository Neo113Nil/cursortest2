package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: GroupsStrikesContentRestrictionDto.kt */
/* loaded from: classes14.dex */
public final class GroupsStrikesContentRestrictionDto implements Parcelable {
    public static final Parcelable.Creator<GroupsStrikesContentRestrictionDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("error_subcode")
    private final int errorSubcode;

    @pmi0("title")
    private final String title;

    /* compiled from: GroupsStrikesContentRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<GroupsStrikesContentRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsStrikesContentRestrictionDto createFromParcel(Parcel parcel) {
            return new GroupsStrikesContentRestrictionDto(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsStrikesContentRestrictionDto[] newArray(int i) {
            return new GroupsStrikesContentRestrictionDto[i];
        }
    }

    public GroupsStrikesContentRestrictionDto(String str, int i, String str2) {
        this.title = str;
        this.errorSubcode = i;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsStrikesContentRestrictionDto)) {
            return false;
        }
        GroupsStrikesContentRestrictionDto groupsStrikesContentRestrictionDto = (GroupsStrikesContentRestrictionDto) obj;
        return epx.f(this.title, groupsStrikesContentRestrictionDto.title) && this.errorSubcode == groupsStrikesContentRestrictionDto.errorSubcode && epx.f(this.description, groupsStrikesContentRestrictionDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.description.hashCode() + shy.a(this.errorSubcode, this.title.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsStrikesContentRestrictionDto(title=");
        sb.append(this.title);
        sb.append(", errorSubcode=");
        sb.append(this.errorSubcode);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.errorSubcode);
        parcel.writeString(this.description);
    }
}
