package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSearchContactsServiceDto.kt */
/* loaded from: classes14.dex */
public final class AccountSearchContactsServiceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSearchContactsServiceDto[] $VALUES;
    public static final Parcelable.Creator<AccountSearchContactsServiceDto> CREATOR;

    @pmi0("email")
    public static final AccountSearchContactsServiceDto EMAIL;

    @pmi0("facebook")
    public static final AccountSearchContactsServiceDto FACEBOOK;

    @pmi0(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)
    public static final AccountSearchContactsServiceDto GOOGLE;

    @pmi0("instagram")
    public static final AccountSearchContactsServiceDto INSTAGRAM;

    @pmi0("odnoklassniki")
    public static final AccountSearchContactsServiceDto ODNOKLASSNIKI;

    @pmi0("phone")
    public static final AccountSearchContactsServiceDto PHONE;

    @pmi0("twitter")
    public static final AccountSearchContactsServiceDto TWITTER;
    private final String value;

    /* compiled from: AccountSearchContactsServiceDto.kt */
    public static final class a implements Parcelable.Creator<AccountSearchContactsServiceDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsServiceDto createFromParcel(Parcel parcel) {
            return AccountSearchContactsServiceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSearchContactsServiceDto[] newArray(int i) {
            return new AccountSearchContactsServiceDto[i];
        }
    }

    static {
        AccountSearchContactsServiceDto accountSearchContactsServiceDto = new AccountSearchContactsServiceDto(CommonConstant.RETKEY.EMAIL, 0, "email");
        EMAIL = accountSearchContactsServiceDto;
        AccountSearchContactsServiceDto accountSearchContactsServiceDto2 = new AccountSearchContactsServiceDto("TWITTER", 1, "twitter");
        TWITTER = accountSearchContactsServiceDto2;
        AccountSearchContactsServiceDto accountSearchContactsServiceDto3 = new AccountSearchContactsServiceDto("FACEBOOK", 2, "facebook");
        FACEBOOK = accountSearchContactsServiceDto3;
        AccountSearchContactsServiceDto accountSearchContactsServiceDto4 = new AccountSearchContactsServiceDto("PHONE", 3, "phone");
        PHONE = accountSearchContactsServiceDto4;
        AccountSearchContactsServiceDto accountSearchContactsServiceDto5 = new AccountSearchContactsServiceDto("INSTAGRAM", 4, "instagram");
        INSTAGRAM = accountSearchContactsServiceDto5;
        AccountSearchContactsServiceDto accountSearchContactsServiceDto6 = new AccountSearchContactsServiceDto("GOOGLE", 5, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        GOOGLE = accountSearchContactsServiceDto6;
        AccountSearchContactsServiceDto accountSearchContactsServiceDto7 = new AccountSearchContactsServiceDto("ODNOKLASSNIKI", 6, "odnoklassniki");
        ODNOKLASSNIKI = accountSearchContactsServiceDto7;
        AccountSearchContactsServiceDto[] accountSearchContactsServiceDtoArr = {accountSearchContactsServiceDto, accountSearchContactsServiceDto2, accountSearchContactsServiceDto3, accountSearchContactsServiceDto4, accountSearchContactsServiceDto5, accountSearchContactsServiceDto6, accountSearchContactsServiceDto7};
        $VALUES = accountSearchContactsServiceDtoArr;
        $ENTRIES = new asp(accountSearchContactsServiceDtoArr);
        CREATOR = new a();
    }

    private AccountSearchContactsServiceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountSearchContactsServiceDto valueOf(String str) {
        return (AccountSearchContactsServiceDto) Enum.valueOf(AccountSearchContactsServiceDto.class, str);
    }

    public static AccountSearchContactsServiceDto[] values() {
        return (AccountSearchContactsServiceDto[]) $VALUES.clone();
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
