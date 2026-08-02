package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersCanNotCallReasonDto.kt */
/* loaded from: classes15.dex */
public final class UsersCanNotCallReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersCanNotCallReasonDto[] $VALUES;

    @pmi0("calling_banned_user")
    public static final UsersCanNotCallReasonDto CALLING_BANNED_USER;

    @pmi0("calling_deactivated_user")
    public static final UsersCanNotCallReasonDto CALLING_DEACTIVATED_USER;

    @pmi0("calling_dead_user")
    public static final UsersCanNotCallReasonDto CALLING_DEAD_USER;

    @pmi0("calling_deleted_user")
    public static final UsersCanNotCallReasonDto CALLING_DELETED_USER;

    @pmi0("calling_service_account")
    public static final UsersCanNotCallReasonDto CALLING_SERVICE_ACCOUNT;

    @pmi0("calling_yourself")
    public static final UsersCanNotCallReasonDto CALLING_YOURSELF;
    public static final Parcelable.Creator<UsersCanNotCallReasonDto> CREATOR;

    @pmi0("privacy_settings")
    public static final UsersCanNotCallReasonDto PRIVACY_SETTINGS;
    private final String value;

    /* compiled from: UsersCanNotCallReasonDto.kt */
    public static final class a implements Parcelable.Creator<UsersCanNotCallReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersCanNotCallReasonDto createFromParcel(Parcel parcel) {
            return UsersCanNotCallReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersCanNotCallReasonDto[] newArray(int i) {
            return new UsersCanNotCallReasonDto[i];
        }
    }

    static {
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = new UsersCanNotCallReasonDto("PRIVACY_SETTINGS", 0, "privacy_settings");
        PRIVACY_SETTINGS = usersCanNotCallReasonDto;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto2 = new UsersCanNotCallReasonDto("CALLING_YOURSELF", 1, "calling_yourself");
        CALLING_YOURSELF = usersCanNotCallReasonDto2;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto3 = new UsersCanNotCallReasonDto("CALLING_SERVICE_ACCOUNT", 2, "calling_service_account");
        CALLING_SERVICE_ACCOUNT = usersCanNotCallReasonDto3;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto4 = new UsersCanNotCallReasonDto("CALLING_DEAD_USER", 3, "calling_dead_user");
        CALLING_DEAD_USER = usersCanNotCallReasonDto4;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto5 = new UsersCanNotCallReasonDto("CALLING_BANNED_USER", 4, "calling_banned_user");
        CALLING_BANNED_USER = usersCanNotCallReasonDto5;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto6 = new UsersCanNotCallReasonDto("CALLING_DEACTIVATED_USER", 5, "calling_deactivated_user");
        CALLING_DEACTIVATED_USER = usersCanNotCallReasonDto6;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto7 = new UsersCanNotCallReasonDto("CALLING_DELETED_USER", 6, "calling_deleted_user");
        CALLING_DELETED_USER = usersCanNotCallReasonDto7;
        UsersCanNotCallReasonDto[] usersCanNotCallReasonDtoArr = {usersCanNotCallReasonDto, usersCanNotCallReasonDto2, usersCanNotCallReasonDto3, usersCanNotCallReasonDto4, usersCanNotCallReasonDto5, usersCanNotCallReasonDto6, usersCanNotCallReasonDto7};
        $VALUES = usersCanNotCallReasonDtoArr;
        $ENTRIES = new asp(usersCanNotCallReasonDtoArr);
        CREATOR = new a();
    }

    private UsersCanNotCallReasonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersCanNotCallReasonDto valueOf(String str) {
        return (UsersCanNotCallReasonDto) Enum.valueOf(UsersCanNotCallReasonDto.class, str);
    }

    public static UsersCanNotCallReasonDto[] values() {
        return (UsersCanNotCallReasonDto[]) $VALUES.clone();
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
