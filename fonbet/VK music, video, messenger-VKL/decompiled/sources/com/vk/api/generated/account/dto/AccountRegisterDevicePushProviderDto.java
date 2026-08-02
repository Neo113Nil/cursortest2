package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountRegisterDevicePushProviderDto.kt */
/* loaded from: classes14.dex */
public final class AccountRegisterDevicePushProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountRegisterDevicePushProviderDto[] $VALUES;

    @pmi0("apns")
    public static final AccountRegisterDevicePushProviderDto APNS;
    public static final Parcelable.Creator<AccountRegisterDevicePushProviderDto> CREATOR;

    @pmi0("fcm")
    public static final AccountRegisterDevicePushProviderDto FCM;

    @pmi0("gcm")
    public static final AccountRegisterDevicePushProviderDto GCM;

    @pmi0("huawei")
    public static final AccountRegisterDevicePushProviderDto HUAWEI;

    @pmi0("rustore")
    public static final AccountRegisterDevicePushProviderDto RUSTORE;

    @pmi0("wns")
    public static final AccountRegisterDevicePushProviderDto WNS;
    private final String value;

    /* compiled from: AccountRegisterDevicePushProviderDto.kt */
    public static final class a implements Parcelable.Creator<AccountRegisterDevicePushProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountRegisterDevicePushProviderDto createFromParcel(Parcel parcel) {
            return AccountRegisterDevicePushProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountRegisterDevicePushProviderDto[] newArray(int i) {
            return new AccountRegisterDevicePushProviderDto[i];
        }
    }

    static {
        AccountRegisterDevicePushProviderDto accountRegisterDevicePushProviderDto = new AccountRegisterDevicePushProviderDto("APNS", 0, "apns");
        APNS = accountRegisterDevicePushProviderDto;
        AccountRegisterDevicePushProviderDto accountRegisterDevicePushProviderDto2 = new AccountRegisterDevicePushProviderDto("FCM", 1, "fcm");
        FCM = accountRegisterDevicePushProviderDto2;
        AccountRegisterDevicePushProviderDto accountRegisterDevicePushProviderDto3 = new AccountRegisterDevicePushProviderDto("GCM", 2, "gcm");
        GCM = accountRegisterDevicePushProviderDto3;
        AccountRegisterDevicePushProviderDto accountRegisterDevicePushProviderDto4 = new AccountRegisterDevicePushProviderDto(SystemUtils.PRODUCT_HUAWEI, 3, "huawei");
        HUAWEI = accountRegisterDevicePushProviderDto4;
        AccountRegisterDevicePushProviderDto accountRegisterDevicePushProviderDto5 = new AccountRegisterDevicePushProviderDto("RUSTORE", 4, "rustore");
        RUSTORE = accountRegisterDevicePushProviderDto5;
        AccountRegisterDevicePushProviderDto accountRegisterDevicePushProviderDto6 = new AccountRegisterDevicePushProviderDto("WNS", 5, "wns");
        WNS = accountRegisterDevicePushProviderDto6;
        AccountRegisterDevicePushProviderDto[] accountRegisterDevicePushProviderDtoArr = {accountRegisterDevicePushProviderDto, accountRegisterDevicePushProviderDto2, accountRegisterDevicePushProviderDto3, accountRegisterDevicePushProviderDto4, accountRegisterDevicePushProviderDto5, accountRegisterDevicePushProviderDto6};
        $VALUES = accountRegisterDevicePushProviderDtoArr;
        $ENTRIES = new asp(accountRegisterDevicePushProviderDtoArr);
        CREATOR = new a();
    }

    private AccountRegisterDevicePushProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountRegisterDevicePushProviderDto valueOf(String str) {
        return (AccountRegisterDevicePushProviderDto) Enum.valueOf(AccountRegisterDevicePushProviderDto.class, str);
    }

    public static AccountRegisterDevicePushProviderDto[] values() {
        return (AccountRegisterDevicePushProviderDto[]) $VALUES.clone();
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
