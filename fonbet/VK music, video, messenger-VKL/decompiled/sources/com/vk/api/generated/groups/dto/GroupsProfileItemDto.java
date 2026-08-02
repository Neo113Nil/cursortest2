package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsProfileItemDto.kt */
/* loaded from: classes14.dex */
public final class GroupsProfileItemDto implements Parcelable {
    public static final Parcelable.Creator<GroupsProfileItemDto> CREATOR = new a();

    @pmi0("first_name")
    private final String firstName;

    @pmi0("id")
    private final int id;

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("screen_name")
    private final String screenName;

    /* compiled from: GroupsProfileItemDto.kt */
    public static final class a implements Parcelable.Creator<GroupsProfileItemDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsProfileItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsProfileItemDto(readInt, readString, readString2, readString3, readString4, readString5, readString6, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsProfileItemDto[] newArray(int i) {
            return new GroupsProfileItemDto[i];
        }
    }

    public GroupsProfileItemDto(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        this.id = i;
        this.photoBase = str;
        this.firstName = str2;
        this.photo50 = str3;
        this.photo100 = str4;
        this.lastName = str5;
        this.screenName = str6;
        this.isDon = bool;
    }

    public final String d() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsProfileItemDto)) {
            return false;
        }
        GroupsProfileItemDto groupsProfileItemDto = (GroupsProfileItemDto) obj;
        return this.id == groupsProfileItemDto.id && epx.f(this.photoBase, groupsProfileItemDto.photoBase) && epx.f(this.firstName, groupsProfileItemDto.firstName) && epx.f(this.photo50, groupsProfileItemDto.photo50) && epx.f(this.photo100, groupsProfileItemDto.photo100) && epx.f(this.lastName, groupsProfileItemDto.lastName) && epx.f(this.screenName, groupsProfileItemDto.screenName) && epx.f(this.isDon, groupsProfileItemDto.isDon);
    }

    public final String f() {
        return this.photo100;
    }

    public final String g() {
        return this.photo50;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.photoBase), 31, this.firstName);
        String str = this.photo50;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo100;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.screenName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDon;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.photoBase;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsProfileItemDto(id=");
        sb.append(this.id);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", isDon=");
        return tn.a(sb, this.isDon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.firstName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.lastName);
        parcel.writeString(this.screenName);
        Boolean bool = this.isDon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GroupsProfileItemDto(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : bool);
    }
}
