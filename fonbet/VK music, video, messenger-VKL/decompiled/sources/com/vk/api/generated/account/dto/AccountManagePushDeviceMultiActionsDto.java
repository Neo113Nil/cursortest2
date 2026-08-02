package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountManagePushDeviceMultiActionsDto.kt */
/* loaded from: classes14.dex */
public final class AccountManagePushDeviceMultiActionsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountManagePushDeviceMultiActionsDto[] $VALUES;
    public static final Parcelable.Creator<AccountManagePushDeviceMultiActionsDto> CREATOR;

    @pmi0("register")
    public static final AccountManagePushDeviceMultiActionsDto REGISTER;

    @pmi0("unregister")
    public static final AccountManagePushDeviceMultiActionsDto UNREGISTER;
    private final String value;

    /* compiled from: AccountManagePushDeviceMultiActionsDto.kt */
    public static final class a implements Parcelable.Creator<AccountManagePushDeviceMultiActionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiActionsDto createFromParcel(Parcel parcel) {
            return AccountManagePushDeviceMultiActionsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiActionsDto[] newArray(int i) {
            return new AccountManagePushDeviceMultiActionsDto[i];
        }
    }

    static {
        AccountManagePushDeviceMultiActionsDto accountManagePushDeviceMultiActionsDto = new AccountManagePushDeviceMultiActionsDto("REGISTER", 0, "register");
        REGISTER = accountManagePushDeviceMultiActionsDto;
        AccountManagePushDeviceMultiActionsDto accountManagePushDeviceMultiActionsDto2 = new AccountManagePushDeviceMultiActionsDto("UNREGISTER", 1, "unregister");
        UNREGISTER = accountManagePushDeviceMultiActionsDto2;
        AccountManagePushDeviceMultiActionsDto[] accountManagePushDeviceMultiActionsDtoArr = {accountManagePushDeviceMultiActionsDto, accountManagePushDeviceMultiActionsDto2};
        $VALUES = accountManagePushDeviceMultiActionsDtoArr;
        $ENTRIES = new asp(accountManagePushDeviceMultiActionsDtoArr);
        CREATOR = new a();
    }

    private AccountManagePushDeviceMultiActionsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountManagePushDeviceMultiActionsDto valueOf(String str) {
        return (AccountManagePushDeviceMultiActionsDto) Enum.valueOf(AccountManagePushDeviceMultiActionsDto.class, str);
    }

    public static AccountManagePushDeviceMultiActionsDto[] values() {
        return (AccountManagePushDeviceMultiActionsDto[]) $VALUES.clone();
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
