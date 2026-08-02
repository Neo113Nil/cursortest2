package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountHomeDto.kt */
/* loaded from: classes14.dex */
public final class AccountHomeDto implements Parcelable {
    public static final Parcelable.Creator<AccountHomeDto> CREATOR = new a();

    @pmi0("building")
    private final AccountHomeItemDto building;

    @pmi0("city")
    private final AccountHomeItemDto city;

    @pmi0("country")
    private final AccountHomeItemDto country;

    @pmi0("district")
    private final AccountHomeItemDto district;

    @pmi0("place")
    private final AccountHomeItemDto place;

    @pmi0("station")
    private final AccountHomeItemDto station;

    @pmi0("street")
    private final AccountHomeItemDto street;

    @pmi0("title")
    private final String title;

    /* compiled from: AccountHomeDto.kt */
    public static final class a implements Parcelable.Creator<AccountHomeDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountHomeDto createFromParcel(Parcel parcel) {
            return new AccountHomeDto(parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountHomeItemDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountHomeItemDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountHomeDto[] newArray(int i) {
            return new AccountHomeDto[i];
        }
    }

    public AccountHomeDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountHomeDto)) {
            return false;
        }
        AccountHomeDto accountHomeDto = (AccountHomeDto) obj;
        return epx.f(this.building, accountHomeDto.building) && epx.f(this.city, accountHomeDto.city) && epx.f(this.country, accountHomeDto.country) && epx.f(this.district, accountHomeDto.district) && epx.f(this.place, accountHomeDto.place) && epx.f(this.station, accountHomeDto.station) && epx.f(this.street, accountHomeDto.street) && epx.f(this.title, accountHomeDto.title);
    }

    public final int hashCode() {
        AccountHomeItemDto accountHomeItemDto = this.building;
        int hashCode = (accountHomeItemDto == null ? 0 : accountHomeItemDto.hashCode()) * 31;
        AccountHomeItemDto accountHomeItemDto2 = this.city;
        int hashCode2 = (hashCode + (accountHomeItemDto2 == null ? 0 : accountHomeItemDto2.hashCode())) * 31;
        AccountHomeItemDto accountHomeItemDto3 = this.country;
        int hashCode3 = (hashCode2 + (accountHomeItemDto3 == null ? 0 : accountHomeItemDto3.hashCode())) * 31;
        AccountHomeItemDto accountHomeItemDto4 = this.district;
        int hashCode4 = (hashCode3 + (accountHomeItemDto4 == null ? 0 : accountHomeItemDto4.hashCode())) * 31;
        AccountHomeItemDto accountHomeItemDto5 = this.place;
        int hashCode5 = (hashCode4 + (accountHomeItemDto5 == null ? 0 : accountHomeItemDto5.hashCode())) * 31;
        AccountHomeItemDto accountHomeItemDto6 = this.station;
        int hashCode6 = (hashCode5 + (accountHomeItemDto6 == null ? 0 : accountHomeItemDto6.hashCode())) * 31;
        AccountHomeItemDto accountHomeItemDto7 = this.street;
        int hashCode7 = (hashCode6 + (accountHomeItemDto7 == null ? 0 : accountHomeItemDto7.hashCode())) * 31;
        String str = this.title;
        return hashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountHomeDto(building=");
        sb.append(this.building);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", district=");
        sb.append(this.district);
        sb.append(", place=");
        sb.append(this.place);
        sb.append(", station=");
        sb.append(this.station);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountHomeItemDto accountHomeItemDto = this.building;
        if (accountHomeItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto2 = this.city;
        if (accountHomeItemDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto2.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto3 = this.country;
        if (accountHomeItemDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto3.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto4 = this.district;
        if (accountHomeItemDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto4.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto5 = this.place;
        if (accountHomeItemDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto5.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto6 = this.station;
        if (accountHomeItemDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto6.writeToParcel(parcel, i);
        }
        AccountHomeItemDto accountHomeItemDto7 = this.street;
        if (accountHomeItemDto7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountHomeItemDto7.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
    }

    public AccountHomeDto(AccountHomeItemDto accountHomeItemDto, AccountHomeItemDto accountHomeItemDto2, AccountHomeItemDto accountHomeItemDto3, AccountHomeItemDto accountHomeItemDto4, AccountHomeItemDto accountHomeItemDto5, AccountHomeItemDto accountHomeItemDto6, AccountHomeItemDto accountHomeItemDto7, String str) {
        this.building = accountHomeItemDto;
        this.city = accountHomeItemDto2;
        this.country = accountHomeItemDto3;
        this.district = accountHomeItemDto4;
        this.place = accountHomeItemDto5;
        this.station = accountHomeItemDto6;
        this.street = accountHomeItemDto7;
        this.title = str;
    }

    public /* synthetic */ AccountHomeDto(AccountHomeItemDto accountHomeItemDto, AccountHomeItemDto accountHomeItemDto2, AccountHomeItemDto accountHomeItemDto3, AccountHomeItemDto accountHomeItemDto4, AccountHomeItemDto accountHomeItemDto5, AccountHomeItemDto accountHomeItemDto6, AccountHomeItemDto accountHomeItemDto7, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountHomeItemDto, (i & 2) != 0 ? null : accountHomeItemDto2, (i & 4) != 0 ? null : accountHomeItemDto3, (i & 8) != 0 ? null : accountHomeItemDto4, (i & 16) != 0 ? null : accountHomeItemDto5, (i & 32) != 0 ? null : accountHomeItemDto6, (i & 64) != 0 ? null : accountHomeItemDto7, (i & 128) != 0 ? null : str);
    }
}
