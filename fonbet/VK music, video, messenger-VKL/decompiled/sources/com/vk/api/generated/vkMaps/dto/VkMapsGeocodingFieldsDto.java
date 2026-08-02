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
/* compiled from: VkMapsGeocodingFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeocodingFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeocodingFieldsDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final VkMapsGeocodingFieldsDto ADDRESS;

    @pmi0("address_details")
    public static final VkMapsGeocodingFieldsDto ADDRESS_DETAILS;

    @pmi0("bbox")
    public static final VkMapsGeocodingFieldsDto BBOX;
    public static final Parcelable.Creator<VkMapsGeocodingFieldsDto> CREATOR;

    @pmi0("entrances")
    public static final VkMapsGeocodingFieldsDto ENTRANCES;

    @pmi0("geometry")
    public static final VkMapsGeocodingFieldsDto GEOMETRY;

    @pmi0("pin")
    public static final VkMapsGeocodingFieldsDto PIN;

    @pmi0("type")
    public static final VkMapsGeocodingFieldsDto TYPE;
    private final String value;

    /* compiled from: VkMapsGeocodingFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeocodingFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingFieldsDto createFromParcel(Parcel parcel) {
            return VkMapsGeocodingFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingFieldsDto[] newArray(int i) {
            return new VkMapsGeocodingFieldsDto[i];
        }
    }

    static {
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto = new VkMapsGeocodingFieldsDto("ADDRESS", 0, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = vkMapsGeocodingFieldsDto;
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto2 = new VkMapsGeocodingFieldsDto("ADDRESS_DETAILS", 1, "address_details");
        ADDRESS_DETAILS = vkMapsGeocodingFieldsDto2;
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto3 = new VkMapsGeocodingFieldsDto("BBOX", 2, "bbox");
        BBOX = vkMapsGeocodingFieldsDto3;
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto4 = new VkMapsGeocodingFieldsDto("ENTRANCES", 3, "entrances");
        ENTRANCES = vkMapsGeocodingFieldsDto4;
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto5 = new VkMapsGeocodingFieldsDto("GEOMETRY", 4, "geometry");
        GEOMETRY = vkMapsGeocodingFieldsDto5;
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto6 = new VkMapsGeocodingFieldsDto("PIN", 5, "pin");
        PIN = vkMapsGeocodingFieldsDto6;
        VkMapsGeocodingFieldsDto vkMapsGeocodingFieldsDto7 = new VkMapsGeocodingFieldsDto(CredentialProviderBaseController.TYPE_TAG, 6, "type");
        TYPE = vkMapsGeocodingFieldsDto7;
        VkMapsGeocodingFieldsDto[] vkMapsGeocodingFieldsDtoArr = {vkMapsGeocodingFieldsDto, vkMapsGeocodingFieldsDto2, vkMapsGeocodingFieldsDto3, vkMapsGeocodingFieldsDto4, vkMapsGeocodingFieldsDto5, vkMapsGeocodingFieldsDto6, vkMapsGeocodingFieldsDto7};
        $VALUES = vkMapsGeocodingFieldsDtoArr;
        $ENTRIES = new asp(vkMapsGeocodingFieldsDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeocodingFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkMapsGeocodingFieldsDto valueOf(String str) {
        return (VkMapsGeocodingFieldsDto) Enum.valueOf(VkMapsGeocodingFieldsDto.class, str);
    }

    public static VkMapsGeocodingFieldsDto[] values() {
        return (VkMapsGeocodingFieldsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
