package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsGroupFullMemberStatusDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupFullMemberStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsGroupFullMemberStatusDto[] $VALUES;
    public static final Parcelable.Creator<GroupsGroupFullMemberStatusDto> CREATOR;

    @pmi0("3")
    public static final GroupsGroupFullMemberStatusDto DECLINED;

    @pmi0("4")
    public static final GroupsGroupFullMemberStatusDto HAS_SENT_A_REQUEST;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final GroupsGroupFullMemberStatusDto INVITED;

    @pmi0("1")
    public static final GroupsGroupFullMemberStatusDto MEMBER;

    @pmi0("0")
    public static final GroupsGroupFullMemberStatusDto NOT_A_MEMBER;

    @pmi0("2")
    public static final GroupsGroupFullMemberStatusDto NOT_SURE;
    private final int value;

    /* compiled from: GroupsGroupFullMemberStatusDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupFullMemberStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullMemberStatusDto createFromParcel(Parcel parcel) {
            return GroupsGroupFullMemberStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupFullMemberStatusDto[] newArray(int i) {
            return new GroupsGroupFullMemberStatusDto[i];
        }
    }

    static {
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto = new GroupsGroupFullMemberStatusDto("NOT_A_MEMBER", 0, 0);
        NOT_A_MEMBER = groupsGroupFullMemberStatusDto;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto2 = new GroupsGroupFullMemberStatusDto("MEMBER", 1, 1);
        MEMBER = groupsGroupFullMemberStatusDto2;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto3 = new GroupsGroupFullMemberStatusDto("NOT_SURE", 2, 2);
        NOT_SURE = groupsGroupFullMemberStatusDto3;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto4 = new GroupsGroupFullMemberStatusDto("DECLINED", 3, 3);
        DECLINED = groupsGroupFullMemberStatusDto4;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto5 = new GroupsGroupFullMemberStatusDto("HAS_SENT_A_REQUEST", 4, 4);
        HAS_SENT_A_REQUEST = groupsGroupFullMemberStatusDto5;
        GroupsGroupFullMemberStatusDto groupsGroupFullMemberStatusDto6 = new GroupsGroupFullMemberStatusDto("INVITED", 5, 5);
        INVITED = groupsGroupFullMemberStatusDto6;
        GroupsGroupFullMemberStatusDto[] groupsGroupFullMemberStatusDtoArr = {groupsGroupFullMemberStatusDto, groupsGroupFullMemberStatusDto2, groupsGroupFullMemberStatusDto3, groupsGroupFullMemberStatusDto4, groupsGroupFullMemberStatusDto5, groupsGroupFullMemberStatusDto6};
        $VALUES = groupsGroupFullMemberStatusDtoArr;
        $ENTRIES = new asp(groupsGroupFullMemberStatusDtoArr);
        CREATOR = new a();
    }

    private GroupsGroupFullMemberStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static GroupsGroupFullMemberStatusDto valueOf(String str) {
        return (GroupsGroupFullMemberStatusDto) Enum.valueOf(GroupsGroupFullMemberStatusDto.class, str);
    }

    public static GroupsGroupFullMemberStatusDto[] values() {
        return (GroupsGroupFullMemberStatusDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
