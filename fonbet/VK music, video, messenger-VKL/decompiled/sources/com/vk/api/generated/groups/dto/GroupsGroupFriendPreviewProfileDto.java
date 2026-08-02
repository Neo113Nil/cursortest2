package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupFriendPreviewProfileDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFriendPreviewProfileDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupFriendPreviewProfileDto> CREATOR = new a();

    @pmi0("first_name")
    private final String firstName;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    /* compiled from: GroupsGroupFriendPreviewProfileDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFriendPreviewProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFriendPreviewProfileDto createFromParcel(Parcel parcel) {
            return new GroupsGroupFriendPreviewProfileDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFriendPreviewProfileDto[] newArray(int i) {
            return new GroupsGroupFriendPreviewProfileDto[i];
        }
    }

    public GroupsGroupFriendPreviewProfileDto(String str, String str2, String str3, String str4, String str5) {
        this.firstName = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photo200 = str4;
        this.photoBase = str5;
    }

    public final String d() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photo100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupFriendPreviewProfileDto)) {
            return false;
        }
        GroupsGroupFriendPreviewProfileDto groupsGroupFriendPreviewProfileDto = (GroupsGroupFriendPreviewProfileDto) obj;
        return epx.f(this.firstName, groupsGroupFriendPreviewProfileDto.firstName) && epx.f(this.photo50, groupsGroupFriendPreviewProfileDto.photo50) && epx.f(this.photo100, groupsGroupFriendPreviewProfileDto.photo100) && epx.f(this.photo200, groupsGroupFriendPreviewProfileDto.photo200) && epx.f(this.photoBase, groupsGroupFriendPreviewProfileDto.photoBase);
    }

    public final String f() {
        return this.photo200;
    }

    public final String g() {
        return this.photo50;
    }

    public final int hashCode() {
        int hashCode = this.firstName.hashCode() * 31;
        String str = this.photo50;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo100;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.photoBase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupFriendPreviewProfileDto(firstName=");
        sb.append(this.firstName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        return ho8.a(sb, this.photoBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
    }

    public /* synthetic */ GroupsGroupFriendPreviewProfileDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
