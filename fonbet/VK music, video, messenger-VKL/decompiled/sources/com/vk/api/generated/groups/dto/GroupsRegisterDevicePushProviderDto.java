package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupsRegisterDevicePushProviderDto.kt */
/* loaded from: classes14.dex */
public final class GroupsRegisterDevicePushProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupsRegisterDevicePushProviderDto[] $VALUES;

    @pmi0("apns")
    public static final GroupsRegisterDevicePushProviderDto APNS;
    public static final Parcelable.Creator<GroupsRegisterDevicePushProviderDto> CREATOR;

    @pmi0("fcm")
    public static final GroupsRegisterDevicePushProviderDto FCM;

    @pmi0("gcm")
    public static final GroupsRegisterDevicePushProviderDto GCM;

    @pmi0("wns")
    public static final GroupsRegisterDevicePushProviderDto WNS;
    private final String value;

    /* compiled from: GroupsRegisterDevicePushProviderDto.kt */
    public static final class a implements Parcelable.Creator<GroupsRegisterDevicePushProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsRegisterDevicePushProviderDto createFromParcel(Parcel parcel) {
            return GroupsRegisterDevicePushProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsRegisterDevicePushProviderDto[] newArray(int i) {
            return new GroupsRegisterDevicePushProviderDto[i];
        }
    }

    static {
        GroupsRegisterDevicePushProviderDto groupsRegisterDevicePushProviderDto = new GroupsRegisterDevicePushProviderDto("APNS", 0, "apns");
        APNS = groupsRegisterDevicePushProviderDto;
        GroupsRegisterDevicePushProviderDto groupsRegisterDevicePushProviderDto2 = new GroupsRegisterDevicePushProviderDto("FCM", 1, "fcm");
        FCM = groupsRegisterDevicePushProviderDto2;
        GroupsRegisterDevicePushProviderDto groupsRegisterDevicePushProviderDto3 = new GroupsRegisterDevicePushProviderDto("GCM", 2, "gcm");
        GCM = groupsRegisterDevicePushProviderDto3;
        GroupsRegisterDevicePushProviderDto groupsRegisterDevicePushProviderDto4 = new GroupsRegisterDevicePushProviderDto("WNS", 3, "wns");
        WNS = groupsRegisterDevicePushProviderDto4;
        GroupsRegisterDevicePushProviderDto[] groupsRegisterDevicePushProviderDtoArr = {groupsRegisterDevicePushProviderDto, groupsRegisterDevicePushProviderDto2, groupsRegisterDevicePushProviderDto3, groupsRegisterDevicePushProviderDto4};
        $VALUES = groupsRegisterDevicePushProviderDtoArr;
        $ENTRIES = new asp(groupsRegisterDevicePushProviderDtoArr);
        CREATOR = new a();
    }

    private GroupsRegisterDevicePushProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GroupsRegisterDevicePushProviderDto valueOf(String str) {
        return (GroupsRegisterDevicePushProviderDto) Enum.valueOf(GroupsRegisterDevicePushProviderDto.class, str);
    }

    public static GroupsRegisterDevicePushProviderDto[] values() {
        return (GroupsRegisterDevicePushProviderDto[]) $VALUES.clone();
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
