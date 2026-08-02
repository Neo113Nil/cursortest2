package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: IdentityAddressDto.kt */
/* loaded from: classes14.dex */
public final class IdentityAddressDto implements Parcelable {
    public static final Parcelable.Creator<IdentityAddressDto> CREATOR = new a();

    @pmi0("city_id")
    private final int cityId;

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final int countryId;

    @pmi0("full_address")
    private final String fullAddress;

    @pmi0("id")
    private final Integer id;

    @pmi0("label")
    private final IdentityLabelDto label;

    @pmi0("postal_code")
    private final String postalCode;

    @pmi0("specified_address")
    private final String specifiedAddress;

    /* compiled from: IdentityAddressDto.kt */
    public static final class a implements Parcelable.Creator<IdentityAddressDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityAddressDto createFromParcel(Parcel parcel) {
            return new IdentityAddressDto(parcel.readInt(), parcel.readInt(), parcel.readString(), IdentityLabelDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityAddressDto[] newArray(int i) {
            return new IdentityAddressDto[i];
        }
    }

    public IdentityAddressDto(int i, int i2, String str, IdentityLabelDto identityLabelDto, String str2, String str3, Integer num) {
        this.cityId = i;
        this.countryId = i2;
        this.fullAddress = str;
        this.label = identityLabelDto;
        this.postalCode = str2;
        this.specifiedAddress = str3;
        this.id = num;
    }

    public final int d() {
        return this.cityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.countryId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityAddressDto)) {
            return false;
        }
        IdentityAddressDto identityAddressDto = (IdentityAddressDto) obj;
        return this.cityId == identityAddressDto.cityId && this.countryId == identityAddressDto.countryId && epx.f(this.fullAddress, identityAddressDto.fullAddress) && epx.f(this.label, identityAddressDto.label) && epx.f(this.postalCode, identityAddressDto.postalCode) && epx.f(this.specifiedAddress, identityAddressDto.specifiedAddress) && epx.f(this.id, identityAddressDto.id);
    }

    public final String f() {
        return this.fullAddress;
    }

    public final Integer g() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.label.hashCode() + urd0.a(shy.a(this.countryId, Integer.hashCode(this.cityId) * 31, 31), 31, this.fullAddress)) * 31, 31, this.postalCode), 31, this.specifiedAddress);
        Integer num = this.id;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final IdentityLabelDto i() {
        return this.label;
    }

    public final String j() {
        return this.postalCode;
    }

    public final String k() {
        return this.specifiedAddress;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityAddressDto(cityId=");
        sb.append(this.cityId);
        sb.append(", countryId=");
        sb.append(this.countryId);
        sb.append(", fullAddress=");
        sb.append(this.fullAddress);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", postalCode=");
        sb.append(this.postalCode);
        sb.append(", specifiedAddress=");
        sb.append(this.specifiedAddress);
        sb.append(", id=");
        return uqi.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cityId);
        parcel.writeInt(this.countryId);
        parcel.writeString(this.fullAddress);
        this.label.writeToParcel(parcel, i);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.specifiedAddress);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ IdentityAddressDto(int i, int i2, String str, IdentityLabelDto identityLabelDto, String str2, String str3, Integer num, int i3, zcl zclVar) {
        this(i, i2, str, identityLabelDto, str2, str3, (i3 & 64) != 0 ? null : num);
    }
}
