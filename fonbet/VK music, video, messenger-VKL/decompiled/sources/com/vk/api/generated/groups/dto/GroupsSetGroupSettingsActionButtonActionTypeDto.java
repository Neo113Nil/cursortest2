package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsSetGroupSettingsActionButtonActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsSetGroupSettingsActionButtonActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsSetGroupSettingsActionButtonActionTypeDto[] $VALUES;

    @pmi0("call_phone")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto CALL_PHONE;

    @pmi0("call_vk")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto CALL_VK;
    public static final Parcelable.Creator<GroupsSetGroupSettingsActionButtonActionTypeDto> CREATOR;

    @pmi0("open_app")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto OPEN_APP;

    @pmi0("open_group_app")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto OPEN_GROUP_APP;

    @pmi0("open_url")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto OPEN_URL;

    @pmi0("post_youla_ad")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto POST_YOULA_AD;

    @pmi0("post_youla_native")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto POST_YOULA_NATIVE;

    @pmi0("send_email")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto SEND_EMAIL;

    @pmi0("service_booking")
    public static final GroupsSetGroupSettingsActionButtonActionTypeDto SERVICE_BOOKING;
    private final String value;

    /* compiled from: GroupsSetGroupSettingsActionButtonActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsSetGroupSettingsActionButtonActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsActionButtonActionTypeDto createFromParcel(Parcel parcel) {
            return GroupsSetGroupSettingsActionButtonActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsSetGroupSettingsActionButtonActionTypeDto[] newArray(int i) {
            return new GroupsSetGroupSettingsActionButtonActionTypeDto[i];
        }
    }

    static {
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto = new GroupsSetGroupSettingsActionButtonActionTypeDto("CALL_PHONE", 0, "call_phone");
        CALL_PHONE = groupsSetGroupSettingsActionButtonActionTypeDto;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto2 = new GroupsSetGroupSettingsActionButtonActionTypeDto("CALL_VK", 1, "call_vk");
        CALL_VK = groupsSetGroupSettingsActionButtonActionTypeDto2;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto3 = new GroupsSetGroupSettingsActionButtonActionTypeDto("OPEN_APP", 2, "open_app");
        OPEN_APP = groupsSetGroupSettingsActionButtonActionTypeDto3;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto4 = new GroupsSetGroupSettingsActionButtonActionTypeDto("OPEN_GROUP_APP", 3, "open_group_app");
        OPEN_GROUP_APP = groupsSetGroupSettingsActionButtonActionTypeDto4;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto5 = new GroupsSetGroupSettingsActionButtonActionTypeDto("OPEN_URL", 4, "open_url");
        OPEN_URL = groupsSetGroupSettingsActionButtonActionTypeDto5;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto6 = new GroupsSetGroupSettingsActionButtonActionTypeDto("POST_YOULA_AD", 5, "post_youla_ad");
        POST_YOULA_AD = groupsSetGroupSettingsActionButtonActionTypeDto6;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto7 = new GroupsSetGroupSettingsActionButtonActionTypeDto("POST_YOULA_NATIVE", 6, "post_youla_native");
        POST_YOULA_NATIVE = groupsSetGroupSettingsActionButtonActionTypeDto7;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto8 = new GroupsSetGroupSettingsActionButtonActionTypeDto("SEND_EMAIL", 7, "send_email");
        SEND_EMAIL = groupsSetGroupSettingsActionButtonActionTypeDto8;
        GroupsSetGroupSettingsActionButtonActionTypeDto groupsSetGroupSettingsActionButtonActionTypeDto9 = new GroupsSetGroupSettingsActionButtonActionTypeDto("SERVICE_BOOKING", 8, "service_booking");
        SERVICE_BOOKING = groupsSetGroupSettingsActionButtonActionTypeDto9;
        GroupsSetGroupSettingsActionButtonActionTypeDto[] groupsSetGroupSettingsActionButtonActionTypeDtoArr = {groupsSetGroupSettingsActionButtonActionTypeDto, groupsSetGroupSettingsActionButtonActionTypeDto2, groupsSetGroupSettingsActionButtonActionTypeDto3, groupsSetGroupSettingsActionButtonActionTypeDto4, groupsSetGroupSettingsActionButtonActionTypeDto5, groupsSetGroupSettingsActionButtonActionTypeDto6, groupsSetGroupSettingsActionButtonActionTypeDto7, groupsSetGroupSettingsActionButtonActionTypeDto8, groupsSetGroupSettingsActionButtonActionTypeDto9};
        $VALUES = groupsSetGroupSettingsActionButtonActionTypeDtoArr;
        $ENTRIES = new asp(groupsSetGroupSettingsActionButtonActionTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsSetGroupSettingsActionButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsSetGroupSettingsActionButtonActionTypeDto valueOf(String str) {
        return (GroupsSetGroupSettingsActionButtonActionTypeDto) Enum.valueOf(GroupsSetGroupSettingsActionButtonActionTypeDto.class, str);
    }

    public static GroupsSetGroupSettingsActionButtonActionTypeDto[] values() {
        return (GroupsSetGroupSettingsActionButtonActionTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
