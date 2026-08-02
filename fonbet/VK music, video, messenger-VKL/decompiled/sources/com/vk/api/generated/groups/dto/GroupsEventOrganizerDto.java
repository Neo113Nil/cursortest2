package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsEventOrganizerDto.kt */
/* loaded from: classes14.dex */
public final class GroupsEventOrganizerDto implements Parcelable {
    public static final Parcelable.Creator<GroupsEventOrganizerDto> CREATOR = new a();

    @pmi0("email")
    private final String email;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("phone_number")
    private final String phoneNumber;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: GroupsEventOrganizerDto.kt */
    public static final class a implements Parcelable.Creator<GroupsEventOrganizerDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsEventOrganizerDto createFromParcel(Parcel parcel) {
            return new GroupsEventOrganizerDto((UserId) parcel.readParcelable(GroupsEventOrganizerDto.class.getClassLoader()), (UserId) parcel.readParcelable(GroupsEventOrganizerDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsEventOrganizerDto[] newArray(int i) {
            return new GroupsEventOrganizerDto[i];
        }
    }

    public GroupsEventOrganizerDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsEventOrganizerDto)) {
            return false;
        }
        GroupsEventOrganizerDto groupsEventOrganizerDto = (GroupsEventOrganizerDto) obj;
        return epx.f(this.groupId, groupsEventOrganizerDto.groupId) && epx.f(this.userId, groupsEventOrganizerDto.userId) && epx.f(this.phoneNumber, groupsEventOrganizerDto.phoneNumber) && epx.f(this.email, groupsEventOrganizerDto.email);
    }

    public final int hashCode() {
        UserId userId = this.groupId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        UserId userId2 = this.userId;
        int hashCode2 = (hashCode + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str = this.phoneNumber;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsEventOrganizerDto(groupId=");
        sb.append(this.groupId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", email=");
        return ho8.a(sb, this.email, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.groupId, i);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.email);
    }

    public GroupsEventOrganizerDto(UserId userId, UserId userId2, String str, String str2) {
        this.groupId = userId;
        this.userId = userId2;
        this.phoneNumber = str;
        this.email = str2;
    }

    public /* synthetic */ GroupsEventOrganizerDto(UserId userId, UserId userId2, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : userId2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
