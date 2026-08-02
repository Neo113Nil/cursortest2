package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountPushSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountPushSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountPushSettingsDto> CREATOR = new a();

    @pmi0("conversations")
    private final AccountPushConversationsDto conversations;

    @pmi0(C4217a2.e)
    private final BaseBoolIntDto disabled;

    @pmi0("disabled_until")
    private final Integer disabledUntil;

    @pmi0("settings")
    private final AccountPushParamsDto settings;

    /* compiled from: AccountPushSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountPushSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPushSettingsDto createFromParcel(Parcel parcel) {
            return new AccountPushSettingsDto((BaseBoolIntDto) parcel.readParcelable(AccountPushSettingsDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : AccountPushParamsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountPushConversationsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPushSettingsDto[] newArray(int i) {
            return new AccountPushSettingsDto[i];
        }
    }

    public AccountPushSettingsDto() {
        this(null, null, null, null, 15, null);
    }

    public final Integer d() {
        return this.disabledUntil;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushSettingsDto)) {
            return false;
        }
        AccountPushSettingsDto accountPushSettingsDto = (AccountPushSettingsDto) obj;
        return this.disabled == accountPushSettingsDto.disabled && epx.f(this.disabledUntil, accountPushSettingsDto.disabledUntil) && epx.f(this.settings, accountPushSettingsDto.settings) && epx.f(this.conversations, accountPushSettingsDto.conversations);
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.disabled;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        Integer num = this.disabledUntil;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AccountPushParamsDto accountPushParamsDto = this.settings;
        int hashCode3 = (hashCode2 + (accountPushParamsDto == null ? 0 : accountPushParamsDto.hashCode())) * 31;
        AccountPushConversationsDto accountPushConversationsDto = this.conversations;
        return hashCode3 + (accountPushConversationsDto != null ? accountPushConversationsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountPushSettingsDto(disabled=" + this.disabled + ", disabledUntil=" + this.disabledUntil + ", settings=" + this.settings + ", conversations=" + this.conversations + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.disabled, i);
        Integer num = this.disabledUntil;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        AccountPushParamsDto accountPushParamsDto = this.settings;
        if (accountPushParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountPushParamsDto.writeToParcel(parcel, i);
        }
        AccountPushConversationsDto accountPushConversationsDto = this.conversations;
        if (accountPushConversationsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountPushConversationsDto.writeToParcel(parcel, i);
        }
    }

    public AccountPushSettingsDto(BaseBoolIntDto baseBoolIntDto, Integer num, AccountPushParamsDto accountPushParamsDto, AccountPushConversationsDto accountPushConversationsDto) {
        this.disabled = baseBoolIntDto;
        this.disabledUntil = num;
        this.settings = accountPushParamsDto;
        this.conversations = accountPushConversationsDto;
    }

    public /* synthetic */ AccountPushSettingsDto(BaseBoolIntDto baseBoolIntDto, Integer num, AccountPushParamsDto accountPushParamsDto, AccountPushConversationsDto accountPushConversationsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : accountPushParamsDto, (i & 8) != 0 ? null : accountPushConversationsDto);
    }
}
