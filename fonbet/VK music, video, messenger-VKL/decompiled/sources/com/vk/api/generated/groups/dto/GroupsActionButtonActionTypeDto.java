package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsActionButtonActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class GroupsActionButtonActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsActionButtonActionTypeDto[] $VALUES;

    @pmi0("call_phone")
    public static final GroupsActionButtonActionTypeDto CALL_PHONE;

    @pmi0("call_vk")
    public static final GroupsActionButtonActionTypeDto CALL_VK;
    public static final Parcelable.Creator<GroupsActionButtonActionTypeDto> CREATOR;

    @pmi0("open_app")
    public static final GroupsActionButtonActionTypeDto OPEN_APP;

    @pmi0("open_group_app")
    public static final GroupsActionButtonActionTypeDto OPEN_GROUP_APP;

    @pmi0("open_url")
    public static final GroupsActionButtonActionTypeDto OPEN_URL;

    @pmi0("post_youla_ad")
    public static final GroupsActionButtonActionTypeDto POST_YOULA_AD;

    @pmi0("post_youla_native")
    public static final GroupsActionButtonActionTypeDto POST_YOULA_NATIVE;

    @pmi0("send_email")
    public static final GroupsActionButtonActionTypeDto SEND_EMAIL;

    @pmi0("service_booking")
    public static final GroupsActionButtonActionTypeDto SERVICE_BOOKING;
    private final String value;

    /* compiled from: GroupsActionButtonActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<GroupsActionButtonActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonActionTypeDto createFromParcel(Parcel parcel) {
            return GroupsActionButtonActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonActionTypeDto[] newArray(int i) {
            return new GroupsActionButtonActionTypeDto[i];
        }
    }

    static {
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto = new GroupsActionButtonActionTypeDto("SEND_EMAIL", 0, "send_email");
        SEND_EMAIL = groupsActionButtonActionTypeDto;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto2 = new GroupsActionButtonActionTypeDto("CALL_PHONE", 1, "call_phone");
        CALL_PHONE = groupsActionButtonActionTypeDto2;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto3 = new GroupsActionButtonActionTypeDto("CALL_VK", 2, "call_vk");
        CALL_VK = groupsActionButtonActionTypeDto3;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto4 = new GroupsActionButtonActionTypeDto("OPEN_URL", 3, "open_url");
        OPEN_URL = groupsActionButtonActionTypeDto4;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto5 = new GroupsActionButtonActionTypeDto("OPEN_APP", 4, "open_app");
        OPEN_APP = groupsActionButtonActionTypeDto5;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto6 = new GroupsActionButtonActionTypeDto("OPEN_GROUP_APP", 5, "open_group_app");
        OPEN_GROUP_APP = groupsActionButtonActionTypeDto6;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto7 = new GroupsActionButtonActionTypeDto("POST_YOULA_AD", 6, "post_youla_ad");
        POST_YOULA_AD = groupsActionButtonActionTypeDto7;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto8 = new GroupsActionButtonActionTypeDto("POST_YOULA_NATIVE", 7, "post_youla_native");
        POST_YOULA_NATIVE = groupsActionButtonActionTypeDto8;
        GroupsActionButtonActionTypeDto groupsActionButtonActionTypeDto9 = new GroupsActionButtonActionTypeDto("SERVICE_BOOKING", 8, "service_booking");
        SERVICE_BOOKING = groupsActionButtonActionTypeDto9;
        GroupsActionButtonActionTypeDto[] groupsActionButtonActionTypeDtoArr = {groupsActionButtonActionTypeDto, groupsActionButtonActionTypeDto2, groupsActionButtonActionTypeDto3, groupsActionButtonActionTypeDto4, groupsActionButtonActionTypeDto5, groupsActionButtonActionTypeDto6, groupsActionButtonActionTypeDto7, groupsActionButtonActionTypeDto8, groupsActionButtonActionTypeDto9};
        $VALUES = groupsActionButtonActionTypeDtoArr;
        $ENTRIES = new asp(groupsActionButtonActionTypeDtoArr);
        CREATOR = new a();
    }

    private GroupsActionButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsActionButtonActionTypeDto valueOf(String str) {
        return (GroupsActionButtonActionTypeDto) Enum.valueOf(GroupsActionButtonActionTypeDto.class, str);
    }

    public static GroupsActionButtonActionTypeDto[] values() {
        return (GroupsActionButtonActionTypeDto[]) $VALUES.clone();
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
