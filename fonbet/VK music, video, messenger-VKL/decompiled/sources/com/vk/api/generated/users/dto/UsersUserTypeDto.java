package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersUserTypeDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersUserTypeDto[] $VALUES;
    public static final Parcelable.Creator<UsersUserTypeDto> CREATOR;

    @pmi0("email")
    public static final UsersUserTypeDto EMAIL;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final UsersUserTypeDto PROFILE;
    private final String value;

    /* compiled from: UsersUserTypeDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserTypeDto createFromParcel(Parcel parcel) {
            return UsersUserTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserTypeDto[] newArray(int i) {
            return new UsersUserTypeDto[i];
        }
    }

    static {
        UsersUserTypeDto usersUserTypeDto = new UsersUserTypeDto("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = usersUserTypeDto;
        UsersUserTypeDto usersUserTypeDto2 = new UsersUserTypeDto(CommonConstant.RETKEY.EMAIL, 1, "email");
        EMAIL = usersUserTypeDto2;
        UsersUserTypeDto[] usersUserTypeDtoArr = {usersUserTypeDto, usersUserTypeDto2};
        $VALUES = usersUserTypeDtoArr;
        $ENTRIES = new asp(usersUserTypeDtoArr);
        CREATOR = new a();
    }

    private UsersUserTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersUserTypeDto valueOf(String str) {
        return (UsersUserTypeDto) Enum.valueOf(UsersUserTypeDto.class, str);
    }

    public static UsersUserTypeDto[] values() {
        return (UsersUserTypeDto[]) $VALUES.clone();
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
