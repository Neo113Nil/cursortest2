package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMapsGeocodingReverseFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeocodingReverseFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeocodingReverseFieldsDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final VkMapsGeocodingReverseFieldsDto ADDRESS;

    @pmi0("address_details")
    public static final VkMapsGeocodingReverseFieldsDto ADDRESS_DETAILS;

    @pmi0("bbox")
    public static final VkMapsGeocodingReverseFieldsDto BBOX;
    public static final Parcelable.Creator<VkMapsGeocodingReverseFieldsDto> CREATOR;

    @pmi0("entrances")
    public static final VkMapsGeocodingReverseFieldsDto ENTRANCES;

    @pmi0("geometry")
    public static final VkMapsGeocodingReverseFieldsDto GEOMETRY;

    @pmi0("pin")
    public static final VkMapsGeocodingReverseFieldsDto PIN;

    @pmi0("type")
    public static final VkMapsGeocodingReverseFieldsDto TYPE;
    private final String value;

    /* compiled from: VkMapsGeocodingReverseFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeocodingReverseFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingReverseFieldsDto createFromParcel(Parcel parcel) {
            return VkMapsGeocodingReverseFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingReverseFieldsDto[] newArray(int i) {
            return new VkMapsGeocodingReverseFieldsDto[i];
        }
    }

    static {
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto = new VkMapsGeocodingReverseFieldsDto("ADDRESS", 0, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = vkMapsGeocodingReverseFieldsDto;
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto2 = new VkMapsGeocodingReverseFieldsDto("ADDRESS_DETAILS", 1, "address_details");
        ADDRESS_DETAILS = vkMapsGeocodingReverseFieldsDto2;
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto3 = new VkMapsGeocodingReverseFieldsDto("BBOX", 2, "bbox");
        BBOX = vkMapsGeocodingReverseFieldsDto3;
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto4 = new VkMapsGeocodingReverseFieldsDto("ENTRANCES", 3, "entrances");
        ENTRANCES = vkMapsGeocodingReverseFieldsDto4;
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto5 = new VkMapsGeocodingReverseFieldsDto("GEOMETRY", 4, "geometry");
        GEOMETRY = vkMapsGeocodingReverseFieldsDto5;
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto6 = new VkMapsGeocodingReverseFieldsDto("PIN", 5, "pin");
        PIN = vkMapsGeocodingReverseFieldsDto6;
        VkMapsGeocodingReverseFieldsDto vkMapsGeocodingReverseFieldsDto7 = new VkMapsGeocodingReverseFieldsDto(CredentialProviderBaseController.TYPE_TAG, 6, "type");
        TYPE = vkMapsGeocodingReverseFieldsDto7;
        VkMapsGeocodingReverseFieldsDto[] vkMapsGeocodingReverseFieldsDtoArr = {vkMapsGeocodingReverseFieldsDto, vkMapsGeocodingReverseFieldsDto2, vkMapsGeocodingReverseFieldsDto3, vkMapsGeocodingReverseFieldsDto4, vkMapsGeocodingReverseFieldsDto5, vkMapsGeocodingReverseFieldsDto6, vkMapsGeocodingReverseFieldsDto7};
        $VALUES = vkMapsGeocodingReverseFieldsDtoArr;
        $ENTRIES = new asp(vkMapsGeocodingReverseFieldsDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeocodingReverseFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkMapsGeocodingReverseFieldsDto valueOf(String str) {
        return (VkMapsGeocodingReverseFieldsDto) Enum.valueOf(VkMapsGeocodingReverseFieldsDto.class, str);
    }

    public static VkMapsGeocodingReverseFieldsDto[] values() {
        return (VkMapsGeocodingReverseFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
