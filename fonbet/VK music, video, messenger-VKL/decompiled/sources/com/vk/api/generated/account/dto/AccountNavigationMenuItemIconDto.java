package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountNavigationMenuItemIconDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationMenuItemIconDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountNavigationMenuItemIconDto[] $VALUES;

    @pmi0("advertising")
    public static final AccountNavigationMenuItemIconDto ADVERTISING;

    @pmi0("archive")
    public static final AccountNavigationMenuItemIconDto ARCHIVE;

    @pmi0("bookmark")
    public static final AccountNavigationMenuItemIconDto BOOKMARK;

    @pmi0("bug")
    public static final AccountNavigationMenuItemIconDto BUG;
    public static final Parcelable.Creator<AccountNavigationMenuItemIconDto> CREATOR;

    @pmi0("document")
    public static final AccountNavigationMenuItemIconDto DOCUMENT;

    @pmi0("expert_card")
    public static final AccountNavigationMenuItemIconDto EXPERT_CARD;

    @pmi0("help")
    public static final AccountNavigationMenuItemIconDto HELP;

    @pmi0("history")
    public static final AccountNavigationMenuItemIconDto HISTORY;

    @pmi0("settings")
    public static final AccountNavigationMenuItemIconDto SETTINGS;

    @pmi0("vk_pay")
    public static final AccountNavigationMenuItemIconDto VK_PAY;
    private final String value;

    /* compiled from: AccountNavigationMenuItemIconDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationMenuItemIconDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationMenuItemIconDto createFromParcel(Parcel parcel) {
            return AccountNavigationMenuItemIconDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationMenuItemIconDto[] newArray(int i) {
            return new AccountNavigationMenuItemIconDto[i];
        }
    }

    static {
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto = new AccountNavigationMenuItemIconDto("ADVERTISING", 0, "advertising");
        ADVERTISING = accountNavigationMenuItemIconDto;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto2 = new AccountNavigationMenuItemIconDto("BOOKMARK", 1, "bookmark");
        BOOKMARK = accountNavigationMenuItemIconDto2;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto3 = new AccountNavigationMenuItemIconDto("DOCUMENT", 2, "document");
        DOCUMENT = accountNavigationMenuItemIconDto3;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto4 = new AccountNavigationMenuItemIconDto("HISTORY", 3, "history");
        HISTORY = accountNavigationMenuItemIconDto4;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto5 = new AccountNavigationMenuItemIconDto("ARCHIVE", 4, "archive");
        ARCHIVE = accountNavigationMenuItemIconDto5;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto6 = new AccountNavigationMenuItemIconDto("SETTINGS", 5, "settings");
        SETTINGS = accountNavigationMenuItemIconDto6;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto7 = new AccountNavigationMenuItemIconDto("HELP", 6, "help");
        HELP = accountNavigationMenuItemIconDto7;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto8 = new AccountNavigationMenuItemIconDto("BUG", 7, "bug");
        BUG = accountNavigationMenuItemIconDto8;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto9 = new AccountNavigationMenuItemIconDto("VK_PAY", 8, "vk_pay");
        VK_PAY = accountNavigationMenuItemIconDto9;
        AccountNavigationMenuItemIconDto accountNavigationMenuItemIconDto10 = new AccountNavigationMenuItemIconDto("EXPERT_CARD", 9, "expert_card");
        EXPERT_CARD = accountNavigationMenuItemIconDto10;
        AccountNavigationMenuItemIconDto[] accountNavigationMenuItemIconDtoArr = {accountNavigationMenuItemIconDto, accountNavigationMenuItemIconDto2, accountNavigationMenuItemIconDto3, accountNavigationMenuItemIconDto4, accountNavigationMenuItemIconDto5, accountNavigationMenuItemIconDto6, accountNavigationMenuItemIconDto7, accountNavigationMenuItemIconDto8, accountNavigationMenuItemIconDto9, accountNavigationMenuItemIconDto10};
        $VALUES = accountNavigationMenuItemIconDtoArr;
        $ENTRIES = new asp(accountNavigationMenuItemIconDtoArr);
        CREATOR = new a();
    }

    private AccountNavigationMenuItemIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountNavigationMenuItemIconDto valueOf(String str) {
        return (AccountNavigationMenuItemIconDto) Enum.valueOf(AccountNavigationMenuItemIconDto.class, str);
    }

    public static AccountNavigationMenuItemIconDto[] values() {
        return (AccountNavigationMenuItemIconDto[]) $VALUES.clone();
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
