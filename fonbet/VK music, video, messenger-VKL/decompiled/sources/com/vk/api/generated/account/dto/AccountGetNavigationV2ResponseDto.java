package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountGetNavigationV2ResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetNavigationV2ResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetNavigationV2ResponseDto> CREATOR = new a();

    @pmi0("state")
    private final AccountNavigationStateDto state;

    @pmi0("variant")
    private final AccountNavigationVariantDto variant;

    /* compiled from: AccountGetNavigationV2ResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetNavigationV2ResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetNavigationV2ResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetNavigationV2ResponseDto(parcel.readInt() == 0 ? null : AccountNavigationStateDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountNavigationVariantDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetNavigationV2ResponseDto[] newArray(int i) {
            return new AccountGetNavigationV2ResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountGetNavigationV2ResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetNavigationV2ResponseDto)) {
            return false;
        }
        AccountGetNavigationV2ResponseDto accountGetNavigationV2ResponseDto = (AccountGetNavigationV2ResponseDto) obj;
        return epx.f(this.state, accountGetNavigationV2ResponseDto.state) && epx.f(this.variant, accountGetNavigationV2ResponseDto.variant);
    }

    public final int hashCode() {
        AccountNavigationStateDto accountNavigationStateDto = this.state;
        int hashCode = (accountNavigationStateDto == null ? 0 : accountNavigationStateDto.hashCode()) * 31;
        AccountNavigationVariantDto accountNavigationVariantDto = this.variant;
        return hashCode + (accountNavigationVariantDto != null ? accountNavigationVariantDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountGetNavigationV2ResponseDto(state=" + this.state + ", variant=" + this.variant + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountNavigationStateDto accountNavigationStateDto = this.state;
        if (accountNavigationStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNavigationStateDto.writeToParcel(parcel, i);
        }
        AccountNavigationVariantDto accountNavigationVariantDto = this.variant;
        if (accountNavigationVariantDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNavigationVariantDto.writeToParcel(parcel, i);
        }
    }

    public AccountGetNavigationV2ResponseDto(AccountNavigationStateDto accountNavigationStateDto, AccountNavigationVariantDto accountNavigationVariantDto) {
        this.state = accountNavigationStateDto;
        this.variant = accountNavigationVariantDto;
    }

    public /* synthetic */ AccountGetNavigationV2ResponseDto(AccountNavigationStateDto accountNavigationStateDto, AccountNavigationVariantDto accountNavigationVariantDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountNavigationStateDto, (i & 2) != 0 ? null : accountNavigationVariantDto);
    }
}
