package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountGetMenuTypeDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetMenuTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountGetMenuTypeDto[] $VALUES;
    public static final Parcelable.Creator<AccountGetMenuTypeDto> CREATOR;

    @pmi0("discover")
    public static final AccountGetMenuTypeDto DISCOVER;

    @pmi0("other")
    public static final AccountGetMenuTypeDto OTHER;

    @pmi0("super_app")
    public static final AccountGetMenuTypeDto SUPER_APP;
    private final String value;

    /* compiled from: AccountGetMenuTypeDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetMenuTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetMenuTypeDto createFromParcel(Parcel parcel) {
            return AccountGetMenuTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetMenuTypeDto[] newArray(int i) {
            return new AccountGetMenuTypeDto[i];
        }
    }

    static {
        AccountGetMenuTypeDto accountGetMenuTypeDto = new AccountGetMenuTypeDto("DISCOVER", 0, "discover");
        DISCOVER = accountGetMenuTypeDto;
        AccountGetMenuTypeDto accountGetMenuTypeDto2 = new AccountGetMenuTypeDto(NativeAdContent.ViewTag.OTHER, 1, "other");
        OTHER = accountGetMenuTypeDto2;
        AccountGetMenuTypeDto accountGetMenuTypeDto3 = new AccountGetMenuTypeDto("SUPER_APP", 2, "super_app");
        SUPER_APP = accountGetMenuTypeDto3;
        AccountGetMenuTypeDto[] accountGetMenuTypeDtoArr = {accountGetMenuTypeDto, accountGetMenuTypeDto2, accountGetMenuTypeDto3};
        $VALUES = accountGetMenuTypeDtoArr;
        $ENTRIES = new asp(accountGetMenuTypeDtoArr);
        CREATOR = new a();
    }

    private AccountGetMenuTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountGetMenuTypeDto valueOf(String str) {
        return (AccountGetMenuTypeDto) Enum.valueOf(AccountGetMenuTypeDto.class, str);
    }

    public static AccountGetMenuTypeDto[] values() {
        return (AccountGetMenuTypeDto[]) $VALUES.clone();
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
