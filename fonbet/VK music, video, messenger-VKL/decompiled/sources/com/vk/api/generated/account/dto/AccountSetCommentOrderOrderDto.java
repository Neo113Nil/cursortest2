package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSetCommentOrderOrderDto.kt */
/* loaded from: classes14.dex */
public final class AccountSetCommentOrderOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSetCommentOrderOrderDto[] $VALUES;

    @pmi0("asc")
    public static final AccountSetCommentOrderOrderDto ASC;
    public static final Parcelable.Creator<AccountSetCommentOrderOrderDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final AccountSetCommentOrderOrderDto DESC;

    @pmi0("smart")
    public static final AccountSetCommentOrderOrderDto SMART;
    private final String value;

    /* compiled from: AccountSetCommentOrderOrderDto.kt */
    public static final class a implements Parcelable.Creator<AccountSetCommentOrderOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSetCommentOrderOrderDto createFromParcel(Parcel parcel) {
            return AccountSetCommentOrderOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSetCommentOrderOrderDto[] newArray(int i) {
            return new AccountSetCommentOrderOrderDto[i];
        }
    }

    static {
        AccountSetCommentOrderOrderDto accountSetCommentOrderOrderDto = new AccountSetCommentOrderOrderDto("ASC", 0, "asc");
        ASC = accountSetCommentOrderOrderDto;
        AccountSetCommentOrderOrderDto accountSetCommentOrderOrderDto2 = new AccountSetCommentOrderOrderDto("DESC", 1, CampaignEx.JSON_KEY_DESC);
        DESC = accountSetCommentOrderOrderDto2;
        AccountSetCommentOrderOrderDto accountSetCommentOrderOrderDto3 = new AccountSetCommentOrderOrderDto("SMART", 2, "smart");
        SMART = accountSetCommentOrderOrderDto3;
        AccountSetCommentOrderOrderDto[] accountSetCommentOrderOrderDtoArr = {accountSetCommentOrderOrderDto, accountSetCommentOrderOrderDto2, accountSetCommentOrderOrderDto3};
        $VALUES = accountSetCommentOrderOrderDtoArr;
        $ENTRIES = new asp(accountSetCommentOrderOrderDtoArr);
        CREATOR = new a();
    }

    private AccountSetCommentOrderOrderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountSetCommentOrderOrderDto valueOf(String str) {
        return (AccountSetCommentOrderOrderDto) Enum.valueOf(AccountSetCommentOrderOrderDto.class, str);
    }

    public static AccountSetCommentOrderOrderDto[] values() {
        return (AccountSetCommentOrderOrderDto[]) $VALUES.clone();
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
