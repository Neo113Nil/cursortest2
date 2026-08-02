package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountContactInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountContactInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountContactInfoDto> CREATOR = new a();

    @pmi0("additional_phone")
    private final AccountContactInfoPhoneDto additionalPhone;

    @pmi0("city")
    private final AccountHomeItemDto city;

    @pmi0("country")
    private final AccountHomeItemDto country;

    @pmi0("mobile_phone")
    private final AccountContactInfoPhoneDto mobilePhone;

    @pmi0("website")
    private final String website;

    /* compiled from: AccountContactInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountContactInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountContactInfoDto createFromParcel(Parcel parcel) {
            return new AccountContactInfoDto(parcel.readInt() == 0 ? null : AccountContactInfoPhoneDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountContactInfoPhoneDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountContactInfoDto[] newArray(int i) {
            return new AccountContactInfoDto[i];
        }
    }

    public AccountContactInfoDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountContactInfoDto)) {
            return false;
        }
        AccountContactInfoDto accountContactInfoDto = (AccountContactInfoDto) obj;
        return epx.f(this.additionalPhone, accountContactInfoDto.additionalPhone) && epx.f(this.city, accountContactInfoDto.city) && epx.f(this.country, accountContactInfoDto.country) && epx.f(this.mobilePhone, accountContactInfoDto.mobilePhone) && epx.f(this.website, accountContactInfoDto.website);
    }

    public final int hashCode() {
        AccountContactInfoPhoneDto accountContactInfoPhoneDto = this.additionalPhone;
        int hashCode = (accountContactInfoPhoneDto == null ? 0 : accountContactInfoPhoneDto.hashCode()) * 31;
        AccountHomeItemDto accountHomeItemDto = this.city;
        int hashCode2 = (hashCode + (accountHomeItemDto == null ? 0 : accountHomeItemDto.hashCode())) * 31;
        AccountHomeItemDto accountHomeItemDto2 = this.country;
        int hashCode3 = (hashCode2 + (accountHomeItemDto2 == null ? 0 : accountHomeItemDto2.hashCode())) * 31;
        AccountContactInfoPhoneDto accountContactInfoPhoneDto2 = this.mobilePhone;
        int hashCode4 = (hashCode3 + (accountContactInfoPhoneDto2 == null ? 0 : accountContactInfoPhoneDto2.hashCode())) * 31;
        String str = this.website;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountContactInfoDto(additionalPhone=");
        sb.append(this.additionalPhone);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", mobilePhone=");
        sb.append(this.mobilePhone);
        sb.append(", website=");
        return ho8.a(sb, this.website, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountContactInfoPhoneDto accountContactInfoPhoneDto = this.additionalPhone;
        if (accountContactInfoPhoneDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountContactInfoPhoneDto.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto = this.city;
        if (accountHomeItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto2 = this.country;
        if (accountHomeItemDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto2.writeToParcel(parcel, i);
        }
        AccountContactInfoPhoneDto accountContactInfoPhoneDto2 = this.mobilePhone;
        if (accountContactInfoPhoneDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountContactInfoPhoneDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.website);
    }

    public AccountContactInfoDto(AccountContactInfoPhoneDto accountContactInfoPhoneDto, AccountHomeItemDto accountHomeItemDto, AccountHomeItemDto accountHomeItemDto2, AccountContactInfoPhoneDto accountContactInfoPhoneDto2, String str) {
        this.additionalPhone = accountContactInfoPhoneDto;
        this.city = accountHomeItemDto;
        this.country = accountHomeItemDto2;
        this.mobilePhone = accountContactInfoPhoneDto2;
        this.website = str;
    }

    public /* synthetic */ AccountContactInfoDto(AccountContactInfoPhoneDto accountContactInfoPhoneDto, AccountHomeItemDto accountHomeItemDto, AccountHomeItemDto accountHomeItemDto2, AccountContactInfoPhoneDto accountContactInfoPhoneDto2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountContactInfoPhoneDto, (i & 2) != 0 ? null : accountHomeItemDto, (i & 4) != 0 ? null : accountHomeItemDto2, (i & 8) != 0 ? null : accountContactInfoPhoneDto2, (i & 16) != 0 ? null : str);
    }
}
