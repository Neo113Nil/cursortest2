package com.vk.superapp.api.dto.geo.coder;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: AddressDetails.kt */
/* loaded from: classes6.dex */
public final class AddressDetails {

    @pmi0("building")
    private final String building;

    @pmi0("country")
    private final String country;

    @pmi0("isocode")
    private final String isoCode;

    @pmi0("locality")
    private final String locality;

    @pmi0("postal_code")
    private final int postalCode;

    @pmi0(TtmlNode.TAG_REGION)
    private final String region;

    @pmi0("street")
    private final String street;

    @pmi0("subregion")
    private final String subregion;

    @pmi0("suburb")
    private final String suburb;

    public AddressDetails(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8) {
        this.building = str;
        this.country = str2;
        this.isoCode = str3;
        this.locality = str4;
        this.postalCode = i;
        this.region = str5;
        this.street = str6;
        this.subregion = str7;
        this.suburb = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDetails)) {
            return false;
        }
        AddressDetails addressDetails = (AddressDetails) obj;
        return epx.f(this.building, addressDetails.building) && epx.f(this.country, addressDetails.country) && epx.f(this.isoCode, addressDetails.isoCode) && epx.f(this.locality, addressDetails.locality) && this.postalCode == addressDetails.postalCode && epx.f(this.region, addressDetails.region) && epx.f(this.street, addressDetails.street) && epx.f(this.subregion, addressDetails.subregion) && epx.f(this.suburb, addressDetails.suburb);
    }

    public final int hashCode() {
        return this.suburb.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.postalCode, urd0.a(urd0.a(urd0.a(this.building.hashCode() * 31, 31, this.country), 31, this.isoCode), 31, this.locality), 31), 31, this.region), 31, this.street), 31, this.subregion);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressDetails(building=");
        sb.append(this.building);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", isoCode=");
        sb.append(this.isoCode);
        sb.append(", locality=");
        sb.append(this.locality);
        sb.append(", postalCode=");
        sb.append(this.postalCode);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", subregion=");
        sb.append(this.subregion);
        sb.append(", suburb=");
        return ho8.a(sb, this.suburb, ')');
    }
}
