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
/* compiled from: VkMapsGeoDataByRefFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoDataByRefFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeoDataByRefFieldsDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final VkMapsGeoDataByRefFieldsDto ADDRESS;

    @pmi0("address_details")
    public static final VkMapsGeoDataByRefFieldsDto ADDRESS_DETAILS;

    @pmi0("bbox")
    public static final VkMapsGeoDataByRefFieldsDto BBOX;
    public static final Parcelable.Creator<VkMapsGeoDataByRefFieldsDto> CREATOR;

    @pmi0("entrances")
    public static final VkMapsGeoDataByRefFieldsDto ENTRANCES;

    @pmi0("geometry")
    public static final VkMapsGeoDataByRefFieldsDto GEOMETRY;

    @pmi0("pin")
    public static final VkMapsGeoDataByRefFieldsDto PIN;

    @pmi0("type")
    public static final VkMapsGeoDataByRefFieldsDto TYPE;
    private final String value;

    /* compiled from: VkMapsGeoDataByRefFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoDataByRefFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoDataByRefFieldsDto createFromParcel(Parcel parcel) {
            return VkMapsGeoDataByRefFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoDataByRefFieldsDto[] newArray(int i) {
            return new VkMapsGeoDataByRefFieldsDto[i];
        }
    }

    static {
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto = new VkMapsGeoDataByRefFieldsDto("ADDRESS", 0, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = vkMapsGeoDataByRefFieldsDto;
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto2 = new VkMapsGeoDataByRefFieldsDto("ADDRESS_DETAILS", 1, "address_details");
        ADDRESS_DETAILS = vkMapsGeoDataByRefFieldsDto2;
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto3 = new VkMapsGeoDataByRefFieldsDto("BBOX", 2, "bbox");
        BBOX = vkMapsGeoDataByRefFieldsDto3;
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto4 = new VkMapsGeoDataByRefFieldsDto("ENTRANCES", 3, "entrances");
        ENTRANCES = vkMapsGeoDataByRefFieldsDto4;
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto5 = new VkMapsGeoDataByRefFieldsDto("GEOMETRY", 4, "geometry");
        GEOMETRY = vkMapsGeoDataByRefFieldsDto5;
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto6 = new VkMapsGeoDataByRefFieldsDto("PIN", 5, "pin");
        PIN = vkMapsGeoDataByRefFieldsDto6;
        VkMapsGeoDataByRefFieldsDto vkMapsGeoDataByRefFieldsDto7 = new VkMapsGeoDataByRefFieldsDto(CredentialProviderBaseController.TYPE_TAG, 6, "type");
        TYPE = vkMapsGeoDataByRefFieldsDto7;
        VkMapsGeoDataByRefFieldsDto[] vkMapsGeoDataByRefFieldsDtoArr = {vkMapsGeoDataByRefFieldsDto, vkMapsGeoDataByRefFieldsDto2, vkMapsGeoDataByRefFieldsDto3, vkMapsGeoDataByRefFieldsDto4, vkMapsGeoDataByRefFieldsDto5, vkMapsGeoDataByRefFieldsDto6, vkMapsGeoDataByRefFieldsDto7};
        $VALUES = vkMapsGeoDataByRefFieldsDtoArr;
        $ENTRIES = new asp(vkMapsGeoDataByRefFieldsDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeoDataByRefFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkMapsGeoDataByRefFieldsDto valueOf(String str) {
        return (VkMapsGeoDataByRefFieldsDto) Enum.valueOf(VkMapsGeoDataByRefFieldsDto.class, str);
    }

    public static VkMapsGeoDataByRefFieldsDto[] values() {
        return (VkMapsGeoDataByRefFieldsDto[]) $VALUES.clone();
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
