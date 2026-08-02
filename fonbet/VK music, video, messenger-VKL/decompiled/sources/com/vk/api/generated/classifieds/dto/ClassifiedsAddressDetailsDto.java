package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClassifiedsAddressDetailsDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsAddressDetailsDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsAddressDetailsDto> CREATOR = new a();

    @pmi0("building")
    private final String building;

    @pmi0("country")
    private final String country;

    @pmi0("isocode")
    private final String isocode;

    @pmi0("locality")
    private final String locality;

    @pmi0(TtmlNode.TAG_REGION)
    private final String region;

    @pmi0("street")
    private final String street;

    @pmi0("sublocality")
    private final String sublocality;

    @pmi0("subregion")
    private final String subregion;

    @pmi0("suburb")
    private final String suburb;

    /* compiled from: ClassifiedsAddressDetailsDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsAddressDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsAddressDetailsDto createFromParcel(Parcel parcel) {
            return new ClassifiedsAddressDetailsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsAddressDetailsDto[] newArray(int i) {
            return new ClassifiedsAddressDetailsDto[i];
        }
    }

    public ClassifiedsAddressDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.isocode = str;
        this.country = str2;
        this.region = str3;
        this.subregion = str4;
        this.locality = str5;
        this.suburb = str6;
        this.sublocality = str7;
        this.street = str8;
        this.building = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsAddressDetailsDto)) {
            return false;
        }
        ClassifiedsAddressDetailsDto classifiedsAddressDetailsDto = (ClassifiedsAddressDetailsDto) obj;
        return epx.f(this.isocode, classifiedsAddressDetailsDto.isocode) && epx.f(this.country, classifiedsAddressDetailsDto.country) && epx.f(this.region, classifiedsAddressDetailsDto.region) && epx.f(this.subregion, classifiedsAddressDetailsDto.subregion) && epx.f(this.locality, classifiedsAddressDetailsDto.locality) && epx.f(this.suburb, classifiedsAddressDetailsDto.suburb) && epx.f(this.sublocality, classifiedsAddressDetailsDto.sublocality) && epx.f(this.street, classifiedsAddressDetailsDto.street) && epx.f(this.building, classifiedsAddressDetailsDto.building);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.isocode.hashCode() * 31, 31, this.country), 31, this.region);
        String str = this.subregion;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locality;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suburb;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sublocality;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.street;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.building;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsAddressDetailsDto(isocode=");
        sb.append(this.isocode);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", subregion=");
        sb.append(this.subregion);
        sb.append(", locality=");
        sb.append(this.locality);
        sb.append(", suburb=");
        sb.append(this.suburb);
        sb.append(", sublocality=");
        sb.append(this.sublocality);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", building=");
        return ho8.a(sb, this.building, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.isocode);
        parcel.writeString(this.country);
        parcel.writeString(this.region);
        parcel.writeString(this.subregion);
        parcel.writeString(this.locality);
        parcel.writeString(this.suburb);
        parcel.writeString(this.sublocality);
        parcel.writeString(this.street);
        parcel.writeString(this.building);
    }

    public /* synthetic */ ClassifiedsAddressDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }
}
