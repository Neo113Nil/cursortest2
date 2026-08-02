package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkMapsGeocodingItemDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeocodingItemDto implements Parcelable {
    public static final Parcelable.Creator<VkMapsGeocodingItemDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("address_details")
    private final VkMapsGeoAddressDetailsDto addressDetails;

    @pmi0("bbox")
    private final List<Float> bbox;

    @pmi0("entrances")
    private final List<VkMapsGeoEntranceItemDto> entrances;

    @pmi0("geometry")
    private final VkMapsGeoGeometryDto geometry;

    @pmi0("pin")
    private final List<Float> pin;

    @pmi0("type")
    private final String type;

    /* compiled from: VkMapsGeocodingItemDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeocodingItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            ArrayList arrayList3 = null;
            VkMapsGeoAddressDetailsDto createFromParcel = parcel.readInt() == 0 ? null : VkMapsGeoAddressDetailsDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList4.add(Float.valueOf(parcel.readFloat()));
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
            }
            VkMapsGeoGeometryDto createFromParcel2 = parcel.readInt() == 0 ? null : VkMapsGeoGeometryDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(VkMapsGeoEntranceItemDto.CREATOR, parcel, arrayList5, i, 1);
                }
                arrayList3 = arrayList5;
            }
            return new VkMapsGeocodingItemDto(readString, createFromParcel, arrayList, arrayList2, createFromParcel2, arrayList3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingItemDto[] newArray(int i) {
            return new VkMapsGeocodingItemDto[i];
        }
    }

    public VkMapsGeocodingItemDto() {
        this(null, null, null, null, null, null, null, 127, null);
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
        if (!(obj instanceof VkMapsGeocodingItemDto)) {
            return false;
        }
        VkMapsGeocodingItemDto vkMapsGeocodingItemDto = (VkMapsGeocodingItemDto) obj;
        return epx.f(this.address, vkMapsGeocodingItemDto.address) && epx.f(this.addressDetails, vkMapsGeocodingItemDto.addressDetails) && epx.f(this.pin, vkMapsGeocodingItemDto.pin) && epx.f(this.bbox, vkMapsGeocodingItemDto.bbox) && epx.f(this.geometry, vkMapsGeocodingItemDto.geometry) && epx.f(this.entrances, vkMapsGeocodingItemDto.entrances) && epx.f(this.type, vkMapsGeocodingItemDto.type);
    }

    public final List<Float> f() {
        return this.pin;
    }

    public final int hashCode() {
        String str = this.address;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto = this.addressDetails;
        int hashCode2 = (hashCode + (vkMapsGeoAddressDetailsDto == null ? 0 : vkMapsGeoAddressDetailsDto.hashCode())) * 31;
        List<Float> list = this.pin;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Float> list2 = this.bbox;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VkMapsGeoGeometryDto vkMapsGeoGeometryDto = this.geometry;
        int hashCode5 = (hashCode4 + (vkMapsGeoGeometryDto == null ? 0 : vkMapsGeoGeometryDto.hashCode())) * 31;
        List<VkMapsGeoEntranceItemDto> list3 = this.entrances;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.type;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMapsGeocodingItemDto(address=");
        sb.append(this.address);
        sb.append(", addressDetails=");
        sb.append(this.addressDetails);
        sb.append(", pin=");
        sb.append(this.pin);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", geometry=");
        sb.append(this.geometry);
        sb.append(", entrances=");
        sb.append(this.entrances);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
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
        List<Float> list = this.pin;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeFloat(((Number) f.next()).floatValue());
            }
        }
        List<Float> list2 = this.bbox;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeFloat(((Number) f2.next()).floatValue());
            }
        }
        VkMapsGeoGeometryDto vkMapsGeoGeometryDto = this.geometry;
        if (vkMapsGeoGeometryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkMapsGeoGeometryDto.writeToParcel(parcel, i);
        }
        List<VkMapsGeoEntranceItemDto> list3 = this.entrances;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((VkMapsGeoEntranceItemDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.type);
    }

    public VkMapsGeocodingItemDto(String str, VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto, List<Float> list, List<Float> list2, VkMapsGeoGeometryDto vkMapsGeoGeometryDto, List<VkMapsGeoEntranceItemDto> list3, String str2) {
        this.address = str;
        this.addressDetails = vkMapsGeoAddressDetailsDto;
        this.pin = list;
        this.bbox = list2;
        this.geometry = vkMapsGeoGeometryDto;
        this.entrances = list3;
        this.type = str2;
    }

    public /* synthetic */ VkMapsGeocodingItemDto(String str, VkMapsGeoAddressDetailsDto vkMapsGeoAddressDetailsDto, List list, List list2, VkMapsGeoGeometryDto vkMapsGeoGeometryDto, List list3, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : vkMapsGeoAddressDetailsDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : vkMapsGeoGeometryDto, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : str2);
    }
}
