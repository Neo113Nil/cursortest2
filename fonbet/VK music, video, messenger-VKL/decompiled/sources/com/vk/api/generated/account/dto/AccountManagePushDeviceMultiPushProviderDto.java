package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountManagePushDeviceMultiPushProviderDto.kt */
/* loaded from: classes14.dex */
public final class AccountManagePushDeviceMultiPushProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountManagePushDeviceMultiPushProviderDto[] $VALUES;

    @pmi0("apns")
    public static final AccountManagePushDeviceMultiPushProviderDto APNS;
    public static final Parcelable.Creator<AccountManagePushDeviceMultiPushProviderDto> CREATOR;

    @pmi0("fcm")
    public static final AccountManagePushDeviceMultiPushProviderDto FCM;

    @pmi0("gcm")
    public static final AccountManagePushDeviceMultiPushProviderDto GCM;

    @pmi0("huawei")
    public static final AccountManagePushDeviceMultiPushProviderDto HUAWEI;

    @pmi0("rustore")
    public static final AccountManagePushDeviceMultiPushProviderDto RUSTORE;

    @pmi0("wns")
    public static final AccountManagePushDeviceMultiPushProviderDto WNS;
    private final String value;

    /* compiled from: AccountManagePushDeviceMultiPushProviderDto.kt */
    public static final class a implements Parcelable.Creator<AccountManagePushDeviceMultiPushProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiPushProviderDto createFromParcel(Parcel parcel) {
            return AccountManagePushDeviceMultiPushProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiPushProviderDto[] newArray(int i) {
            return new AccountManagePushDeviceMultiPushProviderDto[i];
        }
    }

    static {
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto = new AccountManagePushDeviceMultiPushProviderDto("APNS", 0, "apns");
        APNS = accountManagePushDeviceMultiPushProviderDto;
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto2 = new AccountManagePushDeviceMultiPushProviderDto("FCM", 1, "fcm");
        FCM = accountManagePushDeviceMultiPushProviderDto2;
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto3 = new AccountManagePushDeviceMultiPushProviderDto("GCM", 2, "gcm");
        GCM = accountManagePushDeviceMultiPushProviderDto3;
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto4 = new AccountManagePushDeviceMultiPushProviderDto(SystemUtils.PRODUCT_HUAWEI, 3, "huawei");
        HUAWEI = accountManagePushDeviceMultiPushProviderDto4;
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto5 = new AccountManagePushDeviceMultiPushProviderDto("RUSTORE", 4, "rustore");
        RUSTORE = accountManagePushDeviceMultiPushProviderDto5;
        AccountManagePushDeviceMultiPushProviderDto accountManagePushDeviceMultiPushProviderDto6 = new AccountManagePushDeviceMultiPushProviderDto("WNS", 5, "wns");
        WNS = accountManagePushDeviceMultiPushProviderDto6;
        AccountManagePushDeviceMultiPushProviderDto[] accountManagePushDeviceMultiPushProviderDtoArr = {accountManagePushDeviceMultiPushProviderDto, accountManagePushDeviceMultiPushProviderDto2, accountManagePushDeviceMultiPushProviderDto3, accountManagePushDeviceMultiPushProviderDto4, accountManagePushDeviceMultiPushProviderDto5, accountManagePushDeviceMultiPushProviderDto6};
        $VALUES = accountManagePushDeviceMultiPushProviderDtoArr;
        $ENTRIES = new asp(accountManagePushDeviceMultiPushProviderDtoArr);
        CREATOR = new a();
    }

    private AccountManagePushDeviceMultiPushProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountManagePushDeviceMultiPushProviderDto valueOf(String str) {
        return (AccountManagePushDeviceMultiPushProviderDto) Enum.valueOf(AccountManagePushDeviceMultiPushProviderDto.class, str);
    }

    public static AccountManagePushDeviceMultiPushProviderDto[] values() {
        return (AccountManagePushDeviceMultiPushProviderDto[]) $VALUES.clone();
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
