package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkMapsGeoSuggestItemDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoSuggestItemDto implements Parcelable {
    public static final Parcelable.Creator<VkMapsGeoSuggestItemDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("address_details")
    private final VkMapsGeoAddressDetailsDto addressDetails;

    @pmi0("name")
    private final String name;

    @pmi0("ref")
    private final String ref;

    @pmi0("type")
    private final String type;

    /* compiled from: VkMapsGeoSuggestItemDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoSuggestItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestItemDto createFromParcel(Parcel parcel) {
            return new VkMapsGeoSuggestItemDto(parcel.readString(), parcel.readInt() == 0 ? null : VkMapsGeoAddressDetailsDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestItemDto[] newArray(int i) {
            return new VkMapsGeoSuggestItemDto[i];
        }
    }

    public VkMapsGeoSuggestItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final VkMapsGeoAddressDetailsDto e() {
        return this.addressDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkMapsGeoSuggestItemDto)) {
            return false;
        }
        VkMapsGeoSuggestItemDto vkMapsGeoSuggestItemDto = (VkMapsGeoSuggestItemDto) obj;
        return epx.f(this.address, vkMapsGeoSuggestItemDto.address) && epx.f(this.addressDetails, vkMapsGeoSuggestItemDto.addressDetails) && epx.f(this.ref, vkMapsGeoSuggestItemDto.ref) && epx.f(this.type, vkMapsGeoSuggestItemDto.type) && epx.f(this.name, vkMapsGeoSuggestItemDto.name);
    }

    public final String f() {
        return this.ref;
    }

    public final int hashCode() {
        String str = this.address;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto = this.addressDetails;
        int hashCode2 = (hashCode + (vkMapsGeoAddressDetailsDto == null ? 0 : vkMapsGeoAddressDetailsDto.hashCode())) * 31;
        String str2 = this.ref;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMapsGeoSuggestItemDto(address=");
        sb.append(this.address);
        sb.append(", addressDetails=");
        sb.append(this.addressDetails);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.address);
        VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto = this.addressDetails;
        if (vkMapsGeoAddressDetailsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkMapsGeoAddressDetailsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ref);
        parcel.writeString(this.type);
        parcel.writeString(this.name);
    }

    public VkMapsGeoSuggestItemDto(String str, VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto, String str2, String str3, String str4) {
        this.address = str;
        this.addressDetails = vkMapsGeoAddressDetailsDto;
        this.ref = str2;
        this.type = str3;
        this.name = str4;
    }

    public /* synthetic */ VkMapsGeoSuggestItemDto(String str, VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : vkMapsGeoAddressDetailsDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
