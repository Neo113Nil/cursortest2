package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountSaveProfileInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountSaveProfileInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountSaveProfileInfoResponseDto> CREATOR = new a();

    @pmi0("changed")
    private final BaseBoolIntDto changed;

    @pmi0("name_request")
    private final AccountNameRequestDto nameRequest;

    /* compiled from: AccountSaveProfileInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountSaveProfileInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoResponseDto createFromParcel(Parcel parcel) {
            return new AccountSaveProfileInfoResponseDto((BaseBoolIntDto) parcel.readParcelable(AccountSaveProfileInfoResponseDto.class.getClassLoader()), (AccountNameRequestDto) parcel.readParcelable(AccountSaveProfileInfoResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoResponseDto[] newArray(int i) {
            return new AccountSaveProfileInfoResponseDto[i];
        }
    }

    public AccountSaveProfileInfoResponseDto(BaseBoolIntDto baseBoolIntDto, AccountNameRequestDto accountNameRequestDto) {
        this.changed = baseBoolIntDto;
        this.nameRequest = accountNameRequestDto;
    }

    public final BaseBoolIntDto d() {
        return this.changed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSaveProfileInfoResponseDto)) {
            return false;
        }
        AccountSaveProfileInfoResponseDto accountSaveProfileInfoResponseDto = (AccountSaveProfileInfoResponseDto) obj;
        return this.changed == accountSaveProfileInfoResponseDto.changed && epx.f(this.nameRequest, accountSaveProfileInfoResponseDto.nameRequest);
    }

    public final int hashCode() {
        int hashCode = this.changed.hashCode() * 31;
        AccountNameRequestDto accountNameRequestDto = this.nameRequest;
        return hashCode + (accountNameRequestDto == null ? 0 : accountNameRequestDto.hashCode());
    }

    public final String toString() {
        return "AccountSaveProfileInfoResponseDto(changed=" + this.changed + ", nameRequest=" + this.nameRequest + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.changed, i);
        parcel.writeParcelable(this.nameRequest, i);
    }

    public /* synthetic */ AccountSaveProfileInfoResponseDto(BaseBoolIntDto baseBoolIntDto, AccountNameRequestDto accountNameRequestDto, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : accountNameRequestDto);
    }
}
