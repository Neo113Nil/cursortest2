package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountBanUserSourceDto.kt */
/* loaded from: classes14.dex */
public final class AccountBanUserSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountBanUserSourceDto[] $VALUES;

    @pmi0("antispam_modal")
    public static final AccountBanUserSourceDto ANTISPAM_MODAL;

    @pmi0("contact_view")
    public static final AccountBanUserSourceDto CONTACT_VIEW;
    public static final Parcelable.Creator<AccountBanUserSourceDto> CREATOR;

    @pmi0("old_spam_modal")
    public static final AccountBanUserSourceDto OLD_SPAM_MODAL;

    @pmi0("profile_header")
    public static final AccountBanUserSourceDto PROFILE_HEADER;
    private final String value;

    /* compiled from: AccountBanUserSourceDto.kt */
    public static final class a implements Parcelable.Creator<AccountBanUserSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountBanUserSourceDto createFromParcel(Parcel parcel) {
            return AccountBanUserSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountBanUserSourceDto[] newArray(int i) {
            return new AccountBanUserSourceDto[i];
        }
    }

    static {
        AccountBanUserSourceDto accountBanUserSourceDto = new AccountBanUserSourceDto("ANTISPAM_MODAL", 0, "antispam_modal");
        ANTISPAM_MODAL = accountBanUserSourceDto;
        AccountBanUserSourceDto accountBanUserSourceDto2 = new AccountBanUserSourceDto("CONTACT_VIEW", 1, "contact_view");
        CONTACT_VIEW = accountBanUserSourceDto2;
        AccountBanUserSourceDto accountBanUserSourceDto3 = new AccountBanUserSourceDto("OLD_SPAM_MODAL", 2, "old_spam_modal");
        OLD_SPAM_MODAL = accountBanUserSourceDto3;
        AccountBanUserSourceDto accountBanUserSourceDto4 = new AccountBanUserSourceDto("PROFILE_HEADER", 3, "profile_header");
        PROFILE_HEADER = accountBanUserSourceDto4;
        AccountBanUserSourceDto[] accountBanUserSourceDtoArr = {accountBanUserSourceDto, accountBanUserSourceDto2, accountBanUserSourceDto3, accountBanUserSourceDto4};
        $VALUES = accountBanUserSourceDtoArr;
        $ENTRIES = new asp(accountBanUserSourceDtoArr);
        CREATOR = new a();
    }

    private AccountBanUserSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountBanUserSourceDto valueOf(String str) {
        return (AccountBanUserSourceDto) Enum.valueOf(AccountBanUserSourceDto.class, str);
    }

    public static AccountBanUserSourceDto[] values() {
        return (AccountBanUserSourceDto[]) $VALUES.clone();
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
