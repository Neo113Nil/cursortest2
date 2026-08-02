package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountManagePushDeviceMultiTypesDto.kt */
/* loaded from: classes14.dex */
public final class AccountManagePushDeviceMultiTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountManagePushDeviceMultiTypesDto[] $VALUES;

    @pmi0("all")
    public static final AccountManagePushDeviceMultiTypesDto ALL;
    public static final Parcelable.Creator<AccountManagePushDeviceMultiTypesDto> CREATOR;

    @pmi0(BuildConfig.FLAVOR)
    public static final AccountManagePushDeviceMultiTypesDto DEFAULT;

    @pmi0("voip")
    public static final AccountManagePushDeviceMultiTypesDto VOIP;
    private final String value;

    /* compiled from: AccountManagePushDeviceMultiTypesDto.kt */
    public static final class a implements Parcelable.Creator<AccountManagePushDeviceMultiTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiTypesDto createFromParcel(Parcel parcel) {
            return AccountManagePushDeviceMultiTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiTypesDto[] newArray(int i) {
            return new AccountManagePushDeviceMultiTypesDto[i];
        }
    }

    static {
        AccountManagePushDeviceMultiTypesDto accountManagePushDeviceMultiTypesDto = new AccountManagePushDeviceMultiTypesDto("ALL", 0, "all");
        ALL = accountManagePushDeviceMultiTypesDto;
        AccountManagePushDeviceMultiTypesDto accountManagePushDeviceMultiTypesDto2 = new AccountManagePushDeviceMultiTypesDto("DEFAULT", 1, BuildConfig.FLAVOR);
        DEFAULT = accountManagePushDeviceMultiTypesDto2;
        AccountManagePushDeviceMultiTypesDto accountManagePushDeviceMultiTypesDto3 = new AccountManagePushDeviceMultiTypesDto("VOIP", 2, "voip");
        VOIP = accountManagePushDeviceMultiTypesDto3;
        AccountManagePushDeviceMultiTypesDto[] accountManagePushDeviceMultiTypesDtoArr = {accountManagePushDeviceMultiTypesDto, accountManagePushDeviceMultiTypesDto2, accountManagePushDeviceMultiTypesDto3};
        $VALUES = accountManagePushDeviceMultiTypesDtoArr;
        $ENTRIES = new asp(accountManagePushDeviceMultiTypesDtoArr);
        CREATOR = new a();
    }

    private AccountManagePushDeviceMultiTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountManagePushDeviceMultiTypesDto valueOf(String str) {
        return (AccountManagePushDeviceMultiTypesDto) Enum.valueOf(AccountManagePushDeviceMultiTypesDto.class, str);
    }

    public static AccountManagePushDeviceMultiTypesDto[] values() {
        return (AccountManagePushDeviceMultiTypesDto[]) $VALUES.clone();
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
