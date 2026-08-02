package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: IdentityGetCardResponseDto.kt */
/* loaded from: classes14.dex */
public final class IdentityGetCardResponseDto implements Parcelable {
    public static final Parcelable.Creator<IdentityGetCardResponseDto> CREATOR = new a();

    @pmi0("addresses")
    private final List<IdentityAddressDto> addresses;

    @pmi0("cities")
    private final List<BaseCityDto> cities;

    @pmi0("countries")
    private final List<BaseCountryDto> countries;

    @pmi0("emails")
    private final List<IdentityEmailDto> emails;

    @pmi0("limits")
    private final List<IdentityLimitDto> limits;

    @pmi0("phones")
    private final List<IdentityPhoneDto> phones;

    /* compiled from: IdentityGetCardResponseDto.kt */
    public static final class a implements Parcelable.Creator<IdentityGetCardResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityGetCardResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int i = 0;
            ArrayList arrayList6 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(IdentityPhoneDto.CREATOR, parcel, arrayList7, i2, 1);
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(IdentityEmailDto.CREATOR, parcel, arrayList8, i3, 1);
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(IdentityAddressDto.CREATOR, parcel, arrayList9, i4, 1);
                }
                arrayList3 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(IdentityGetCardResponseDto.class, parcel, arrayList10, i5, 1);
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = bo.b(IdentityGetCardResponseDto.class, parcel, arrayList11, i6, 1);
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(IdentityLimitDto.CREATOR, parcel, arrayList6, i, 1);
                }
            }
            return new IdentityGetCardResponseDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityGetCardResponseDto[] newArray(int i) {
            return new IdentityGetCardResponseDto[i];
        }
    }

    public IdentityGetCardResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final List<IdentityAddressDto> d() {
        return this.addresses;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseCityDto> e() {
        return this.cities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityGetCardResponseDto)) {
            return false;
        }
        IdentityGetCardResponseDto identityGetCardResponseDto = (IdentityGetCardResponseDto) obj;
        return epx.f(this.phones, identityGetCardResponseDto.phones) && epx.f(this.emails, identityGetCardResponseDto.emails) && epx.f(this.addresses, identityGetCardResponseDto.addresses) && epx.f(this.countries, identityGetCardResponseDto.countries) && epx.f(this.cities, identityGetCardResponseDto.cities) && epx.f(this.limits, identityGetCardResponseDto.limits);
    }

    public final List<BaseCountryDto> f() {
        return this.countries;
    }

    public final List<IdentityEmailDto> g() {
        return this.emails;
    }

    public final int hashCode() {
        List<IdentityPhoneDto> list = this.phones;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<IdentityEmailDto> list2 = this.emails;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<IdentityAddressDto> list3 = this.addresses;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BaseCountryDto> list4 = this.countries;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BaseCityDto> list5 = this.cities;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<IdentityLimitDto> list6 = this.limits;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final List<IdentityLimitDto> i() {
        return this.limits;
    }

    public final List<IdentityPhoneDto> j() {
        return this.phones;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityGetCardResponseDto(phones=");
        sb.append(this.phones);
        sb.append(", emails=");
        sb.append(this.emails);
        sb.append(", addresses=");
        sb.append(this.addresses);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(", cities=");
        sb.append(this.cities);
        sb.append(", limits=");
        return ms9.a(')', sb, this.limits);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<IdentityPhoneDto> list = this.phones;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((IdentityPhoneDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<IdentityEmailDto> list2 = this.emails;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((IdentityEmailDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<IdentityAddressDto> list3 = this.addresses;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((IdentityAddressDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<BaseCountryDto> list4 = this.countries;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<BaseCityDto> list5 = this.cities;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<IdentityLimitDto> list6 = this.limits;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f6 = dn.f(parcel, list6, 1);
        while (f6.hasNext()) {
            ((IdentityLimitDto) f6.next()).writeToParcel(parcel, i);
        }
    }

    public IdentityGetCardResponseDto(List<IdentityPhoneDto> list, List<IdentityEmailDto> list2, List<IdentityAddressDto> list3, List<BaseCountryDto> list4, List<BaseCityDto> list5, List<IdentityLimitDto> list6) {
        this.phones = list;
        this.emails = list2;
        this.addresses = list3;
        this.countries = list4;
        this.cities = list5;
        this.limits = list6;
    }

    public /* synthetic */ IdentityGetCardResponseDto(List list, List list2, List list3, List list4, List list5, List list6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6);
    }
}
