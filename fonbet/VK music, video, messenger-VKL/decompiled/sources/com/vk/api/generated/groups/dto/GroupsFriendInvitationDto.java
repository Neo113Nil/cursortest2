package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: GroupsFriendInvitationDto.kt */
/* loaded from: classes14.dex */
public final class GroupsFriendInvitationDto implements Parcelable {
    public static final Parcelable.Creator<GroupsFriendInvitationDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("invitation_status")
    private final String invitationStatus;

    @pmi0("is_available")
    private final Boolean isAvailable;

    @pmi0("name")
    private final String name;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("surname")
    private final String surname;

    /* compiled from: GroupsFriendInvitationDto.kt */
    public static final class a implements Parcelable.Creator<GroupsFriendInvitationDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsFriendInvitationDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(GroupsFriendInvitationDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GroupsFriendInvitationDto(userId, readString, readString2, readString3, readString4, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsFriendInvitationDto[] newArray(int i) {
            return new GroupsFriendInvitationDto[i];
        }
    }

    public GroupsFriendInvitationDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.invitationStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsFriendInvitationDto)) {
            return false;
        }
        GroupsFriendInvitationDto groupsFriendInvitationDto = (GroupsFriendInvitationDto) obj;
        return epx.f(this.id, groupsFriendInvitationDto.id) && epx.f(this.name, groupsFriendInvitationDto.name) && epx.f(this.surname, groupsFriendInvitationDto.surname) && epx.f(this.photoUrl, groupsFriendInvitationDto.photoUrl) && epx.f(this.invitationStatus, groupsFriendInvitationDto.invitationStatus) && epx.f(this.isAvailable, groupsFriendInvitationDto.isAvailable);
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.photoUrl;
    }

    public final int hashCode() {
        UserId userId = this.id;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.surname;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.invitationStatus;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isAvailable;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.surname;
    }

    public final Boolean j() {
        return this.isAvailable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsFriendInvitationDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", surname=");
        sb.append(this.surname);
        sb.append(", photoUrl=");
        sb.append(this.photoUrl);
        sb.append(", invitationStatus=");
        sb.append(this.invitationStatus);
        sb.append(", isAvailable=");
        return tn.a(sb, this.isAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.surname);
        parcel.writeString(this.photoUrl);
        parcel.writeString(this.invitationStatus);
        Boolean bool = this.isAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public GroupsFriendInvitationDto(UserId userId, String str, String str2, String str3, String str4, Boolean bool) {
        this.id = userId;
        this.name = str;
        this.surname = str2;
        this.photoUrl = str3;
        this.invitationStatus = str4;
        this.isAvailable = bool;
    }

    public /* synthetic */ GroupsFriendInvitationDto(UserId userId, String str, String str2, String str3, String str4, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool);
    }
}
