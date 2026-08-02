package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountBanSourceDto.kt */
/* loaded from: classes14.dex */
public final class AccountBanSourceDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountBanSourceDto[] $VALUES;

    @pmi0("antispam_modal")
    public static final AccountBanSourceDto ANTISPAM_MODAL;

    @pmi0("contact_view")
    public static final AccountBanSourceDto CONTACT_VIEW;
    public static final Parcelable.Creator<AccountBanSourceDto> CREATOR;

    @pmi0("old_spam_modal")
    public static final AccountBanSourceDto OLD_SPAM_MODAL;

    @pmi0("profile_header")
    public static final AccountBanSourceDto PROFILE_HEADER;
    private final String value;

    /* compiled from: AccountBanSourceDto.kt */
    public static final class a implements Parcelable.Creator<AccountBanSourceDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountBanSourceDto createFromParcel(Parcel parcel) {
            return AccountBanSourceDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountBanSourceDto[] newArray(int i) {
            return new AccountBanSourceDto[i];
        }
    }

    static {
        AccountBanSourceDto accountBanSourceDto = new AccountBanSourceDto("ANTISPAM_MODAL", 0, "antispam_modal");
        ANTISPAM_MODAL = accountBanSourceDto;
        AccountBanSourceDto accountBanSourceDto2 = new AccountBanSourceDto("CONTACT_VIEW", 1, "contact_view");
        CONTACT_VIEW = accountBanSourceDto2;
        AccountBanSourceDto accountBanSourceDto3 = new AccountBanSourceDto("OLD_SPAM_MODAL", 2, "old_spam_modal");
        OLD_SPAM_MODAL = accountBanSourceDto3;
        AccountBanSourceDto accountBanSourceDto4 = new AccountBanSourceDto("PROFILE_HEADER", 3, "profile_header");
        PROFILE_HEADER = accountBanSourceDto4;
        AccountBanSourceDto[] accountBanSourceDtoArr = {accountBanSourceDto, accountBanSourceDto2, accountBanSourceDto3, accountBanSourceDto4};
        $VALUES = accountBanSourceDtoArr;
        $ENTRIES = new asp(accountBanSourceDtoArr);
        CREATOR = new a();
    }

    private AccountBanSourceDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountBanSourceDto valueOf(String str) {
        return (AccountBanSourceDto) Enum.valueOf(AccountBanSourceDto.class, str);
    }

    public static AccountBanSourceDto[] values() {
        return (AccountBanSourceDto[]) $VALUES.clone();
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
