package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsInviteLinkPreviewFieldsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsInviteLinkPreviewFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsInviteLinkPreviewFieldsDto[] $VALUES;
    public static final Parcelable.Creator<GroupsInviteLinkPreviewFieldsDto> CREATOR;

    @pmi0("group")
    public static final GroupsInviteLinkPreviewFieldsDto GROUP;

    @pmi0("invite_link")
    public static final GroupsInviteLinkPreviewFieldsDto INVITE_LINK;

    @pmi0("profiles")
    public static final GroupsInviteLinkPreviewFieldsDto PROFILES;
    private final String value;

    /* compiled from: GroupsInviteLinkPreviewFieldsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsInviteLinkPreviewFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsInviteLinkPreviewFieldsDto createFromParcel(Parcel parcel) {
            return GroupsInviteLinkPreviewFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsInviteLinkPreviewFieldsDto[] newArray(int i) {
            return new GroupsInviteLinkPreviewFieldsDto[i];
        }
    }

    static {
        GroupsInviteLinkPreviewFieldsDto groupsInviteLinkPreviewFieldsDto = new GroupsInviteLinkPreviewFieldsDto("GROUP", 0, "group");
        GROUP = groupsInviteLinkPreviewFieldsDto;
        GroupsInviteLinkPreviewFieldsDto groupsInviteLinkPreviewFieldsDto2 = new GroupsInviteLinkPreviewFieldsDto("INVITE_LINK", 1, "invite_link");
        INVITE_LINK = groupsInviteLinkPreviewFieldsDto2;
        GroupsInviteLinkPreviewFieldsDto groupsInviteLinkPreviewFieldsDto3 = new GroupsInviteLinkPreviewFieldsDto("PROFILES", 2, "profiles");
        PROFILES = groupsInviteLinkPreviewFieldsDto3;
        GroupsInviteLinkPreviewFieldsDto[] groupsInviteLinkPreviewFieldsDtoArr = {groupsInviteLinkPreviewFieldsDto, groupsInviteLinkPreviewFieldsDto2, groupsInviteLinkPreviewFieldsDto3};
        $VALUES = groupsInviteLinkPreviewFieldsDtoArr;
        $ENTRIES = new asp(groupsInviteLinkPreviewFieldsDtoArr);
        CREATOR = new a();
    }

    private GroupsInviteLinkPreviewFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsInviteLinkPreviewFieldsDto valueOf(String str) {
        return (GroupsInviteLinkPreviewFieldsDto) Enum.valueOf(GroupsInviteLinkPreviewFieldsDto.class, str);
    }

    public static GroupsInviteLinkPreviewFieldsDto[] values() {
        return (GroupsInviteLinkPreviewFieldsDto[]) $VALUES.clone();
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
