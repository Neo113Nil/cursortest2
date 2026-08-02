package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GroupsModalParamsChatJoinDto.kt */
/* loaded from: classes14.dex */
public final class GroupsModalParamsChatJoinDto implements Parcelable {
    public static final Parcelable.Creator<GroupsModalParamsChatJoinDto> CREATOR = new a();

    @pmi0("global_id")
    private final String globalId;

    @pmi0("invite_hash")
    private final String inviteHash;

    @pmi0("invite_link")
    private final String inviteLink;

    @pmi0("write_hash")
    private final String writeHash;

    /* compiled from: GroupsModalParamsChatJoinDto.kt */
    public static final class a implements Parcelable.Creator<GroupsModalParamsChatJoinDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsModalParamsChatJoinDto createFromParcel(Parcel parcel) {
            return new GroupsModalParamsChatJoinDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsModalParamsChatJoinDto[] newArray(int i) {
            return new GroupsModalParamsChatJoinDto[i];
        }
    }

    public GroupsModalParamsChatJoinDto(String str, String str2, String str3, String str4) {
        this.globalId = str;
        this.inviteHash = str2;
        this.writeHash = str3;
        this.inviteLink = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsModalParamsChatJoinDto)) {
            return false;
        }
        GroupsModalParamsChatJoinDto groupsModalParamsChatJoinDto = (GroupsModalParamsChatJoinDto) obj;
        return epx.f(this.globalId, groupsModalParamsChatJoinDto.globalId) && epx.f(this.inviteHash, groupsModalParamsChatJoinDto.inviteHash) && epx.f(this.writeHash, groupsModalParamsChatJoinDto.writeHash) && epx.f(this.inviteLink, groupsModalParamsChatJoinDto.inviteLink);
    }

    public final int hashCode() {
        return this.inviteLink.hashCode() + urd0.a(urd0.a(this.globalId.hashCode() * 31, 31, this.inviteHash), 31, this.writeHash);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsModalParamsChatJoinDto(globalId=");
        sb.append(this.globalId);
        sb.append(", inviteHash=");
        sb.append(this.inviteHash);
        sb.append(", writeHash=");
        sb.append(this.writeHash);
        sb.append(", inviteLink=");
        return ho8.a(sb, this.inviteLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.globalId);
        parcel.writeString(this.inviteHash);
        parcel.writeString(this.writeHash);
        parcel.writeString(this.inviteLink);
    }
}
