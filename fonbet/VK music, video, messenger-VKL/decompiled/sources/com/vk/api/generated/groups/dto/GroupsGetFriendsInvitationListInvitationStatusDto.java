package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGetFriendsInvitationListInvitationStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetFriendsInvitationListInvitationStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGetFriendsInvitationListInvitationStatusDto[] $VALUES;

    @pmi0("accepted")
    public static final GroupsGetFriendsInvitationListInvitationStatusDto ACCEPTED;

    @pmi0("all")
    public static final GroupsGetFriendsInvitationListInvitationStatusDto ALL;
    public static final Parcelable.Creator<GroupsGetFriendsInvitationListInvitationStatusDto> CREATOR;

    @pmi0("invited")
    public static final GroupsGetFriendsInvitationListInvitationStatusDto INVITED;

    @pmi0("not_invited")
    public static final GroupsGetFriendsInvitationListInvitationStatusDto NOT_INVITED;
    private final String value;

    /* compiled from: GroupsGetFriendsInvitationListInvitationStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetFriendsInvitationListInvitationStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetFriendsInvitationListInvitationStatusDto createFromParcel(Parcel parcel) {
            return GroupsGetFriendsInvitationListInvitationStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetFriendsInvitationListInvitationStatusDto[] newArray(int i) {
            return new GroupsGetFriendsInvitationListInvitationStatusDto[i];
        }
    }

    static {
        GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto = new GroupsGetFriendsInvitationListInvitationStatusDto(SignalingProtocol.PARTICIPANT_STATE_ACCEPTED, 0, "accepted");
        ACCEPTED = groupsGetFriendsInvitationListInvitationStatusDto;
        GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto2 = new GroupsGetFriendsInvitationListInvitationStatusDto("ALL", 1, "all");
        ALL = groupsGetFriendsInvitationListInvitationStatusDto2;
        GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto3 = new GroupsGetFriendsInvitationListInvitationStatusDto("INVITED", 2, "invited");
        INVITED = groupsGetFriendsInvitationListInvitationStatusDto3;
        GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto4 = new GroupsGetFriendsInvitationListInvitationStatusDto("NOT_INVITED", 3, "not_invited");
        NOT_INVITED = groupsGetFriendsInvitationListInvitationStatusDto4;
        GroupsGetFriendsInvitationListInvitationStatusDto[] groupsGetFriendsInvitationListInvitationStatusDtoArr = {groupsGetFriendsInvitationListInvitationStatusDto, groupsGetFriendsInvitationListInvitationStatusDto2, groupsGetFriendsInvitationListInvitationStatusDto3, groupsGetFriendsInvitationListInvitationStatusDto4};
        $VALUES = groupsGetFriendsInvitationListInvitationStatusDtoArr;
        $ENTRIES = new asp(groupsGetFriendsInvitationListInvitationStatusDtoArr);
        CREATOR = new a();
    }

    private GroupsGetFriendsInvitationListInvitationStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsGetFriendsInvitationListInvitationStatusDto valueOf(String str) {
        return (GroupsGetFriendsInvitationListInvitationStatusDto) Enum.valueOf(GroupsGetFriendsInvitationListInvitationStatusDto.class, str);
    }

    public static GroupsGetFriendsInvitationListInvitationStatusDto[] values() {
        return (GroupsGetFriendsInvitationListInvitationStatusDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
