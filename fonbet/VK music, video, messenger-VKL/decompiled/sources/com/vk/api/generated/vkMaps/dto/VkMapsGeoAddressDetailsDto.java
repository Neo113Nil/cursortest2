package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkMapsGeoAddressDetailsDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoAddressDetailsDto implements Parcelable {
    public static final Parcelable.Creator<VkMapsGeoAddressDetailsDto> CREATOR = new a();

    @pmi0("building")
    private final String building;

    @pmi0("country")
    private final String country;

    @pmi0("isocode")
    private final String isocode;

    @pmi0("locality")
    private final String locality;

    @pmi0("postal_code")
    private final String postalCode;

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

    /* compiled from: VkMapsGeoAddressDetailsDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoAddressDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoAddressDetailsDto createFromParcel(Parcel parcel) {
            return new VkMapsGeoAddressDetailsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoAddressDetailsDto[] newArray(int i) {
            return new VkMapsGeoAddressDetailsDto[i];
        }
    }

    public VkMapsGeoAddressDetailsDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final String d() {
        return this.building;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.country;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMapsGeoAddressDetailsDto)) {
            return false;
        }
        VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto = (VkMapsGeoAddressDetailsDto) obj;
        return epx.f(this.building, vkMapsGeoAddressDetailsDto.building) && epx.f(this.country, vkMapsGeoAddressDetailsDto.country) && epx.f(this.locality, vkMapsGeoAddressDetailsDto.locality) && epx.f(this.postalCode, vkMapsGeoAddressDetailsDto.postalCode) && epx.f(this.region, vkMapsGeoAddressDetailsDto.region) && epx.f(this.street, vkMapsGeoAddressDetailsDto.street) && epx.f(this.sublocality, vkMapsGeoAddressDetailsDto.sublocality) && epx.f(this.subregion, vkMapsGeoAddressDetailsDto.subregion) && epx.f(this.suburb, vkMapsGeoAddressDetailsDto.suburb) && epx.f(this.isocode, vkMapsGeoAddressDetailsDto.isocode);
    }

    public final String f() {
        return this.isocode;
    }

    public final String g() {
        return this.locality;
    }

    public final int hashCode() {
        String str = this.building;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locality;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.region;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.street;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sublocality;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subregion;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.suburb;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.isocode;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String i() {
        return this.postalCode;
    }

    public final String j() {
        return this.region;
    }

    public final String k() {
        return this.street;
    }

    public final String l() {
        return this.sublocality;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMapsGeoAddressDetailsDto(building=");
        sb.append(this.building);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", locality=");
        sb.append(this.locality);
        sb.append(", postalCode=");
        sb.append(this.postalCode);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", sublocality=");
        sb.append(this.sublocality);
        sb.append(", subregion=");
        sb.append(this.subregion);
        sb.append(", suburb=");
        sb.append(this.suburb);
        sb.append(", isocode=");
        return ho8.a(sb, this.isocode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.building);
        parcel.writeString(this.country);
        parcel.writeString(this.locality);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.region);
        parcel.writeString(this.street);
        parcel.writeString(this.sublocality);
        parcel.writeString(this.subregion);
        parcel.writeString(this.suburb);
        parcel.writeString(this.isocode);
    }

    public VkMapsGeoAddressDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.building = str;
        this.country = str2;
        this.locality = str3;
        this.postalCode = str4;
        this.region = str5;
        this.street = str6;
        this.sublocality = str7;
        this.subregion = str8;
        this.suburb = str9;
        this.isocode = str10;
    }

    public /* synthetic */ VkMapsGeoAddressDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
