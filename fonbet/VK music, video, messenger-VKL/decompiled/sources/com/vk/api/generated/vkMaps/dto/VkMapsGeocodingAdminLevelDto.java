package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMapsGeocodingAdminLevelDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeocodingAdminLevelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeocodingAdminLevelDto[] $VALUES;

    @pmi0("1")
    public static final VkMapsGeocodingAdminLevelDto COUNTRY;
    public static final Parcelable.Creator<VkMapsGeocodingAdminLevelDto> CREATOR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final VkMapsGeocodingAdminLevelDto HOUSE;

    @pmi0("3")
    public static final VkMapsGeocodingAdminLevelDto LOCALITY;

    @pmi0("2")
    public static final VkMapsGeocodingAdminLevelDto REGION;

    @pmi0("4")
    public static final VkMapsGeocodingAdminLevelDto STREET;
    private final int value;

    /* compiled from: VkMapsGeocodingAdminLevelDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeocodingAdminLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingAdminLevelDto createFromParcel(Parcel parcel) {
            return VkMapsGeocodingAdminLevelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingAdminLevelDto[] newArray(int i) {
            return new VkMapsGeocodingAdminLevelDto[i];
        }
    }

    static {
        VkMapsGeocodingAdminLevelDto vkMapsGeocodingAdminLevelDto = new VkMapsGeocodingAdminLevelDto("COUNTRY", 0, 1);
        COUNTRY = vkMapsGeocodingAdminLevelDto;
        VkMapsGeocodingAdminLevelDto vkMapsGeocodingAdminLevelDto2 = new VkMapsGeocodingAdminLevelDto("REGION", 1, 2);
        REGION = vkMapsGeocodingAdminLevelDto2;
        VkMapsGeocodingAdminLevelDto vkMapsGeocodingAdminLevelDto3 = new VkMapsGeocodingAdminLevelDto("LOCALITY", 2, 3);
        LOCALITY = vkMapsGeocodingAdminLevelDto3;
        VkMapsGeocodingAdminLevelDto vkMapsGeocodingAdminLevelDto4 = new VkMapsGeocodingAdminLevelDto("STREET", 3, 4);
        STREET = vkMapsGeocodingAdminLevelDto4;
        VkMapsGeocodingAdminLevelDto vkMapsGeocodingAdminLevelDto5 = new VkMapsGeocodingAdminLevelDto("HOUSE", 4, 5);
        HOUSE = vkMapsGeocodingAdminLevelDto5;
        VkMapsGeocodingAdminLevelDto[] vkMapsGeocodingAdminLevelDtoArr = {vkMapsGeocodingAdminLevelDto, vkMapsGeocodingAdminLevelDto2, vkMapsGeocodingAdminLevelDto3, vkMapsGeocodingAdminLevelDto4, vkMapsGeocodingAdminLevelDto5};
        $VALUES = vkMapsGeocodingAdminLevelDtoArr;
        $ENTRIES = new asp(vkMapsGeocodingAdminLevelDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeocodingAdminLevelDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VkMapsGeocodingAdminLevelDto valueOf(String str) {
        return (VkMapsGeocodingAdminLevelDto) Enum.valueOf(VkMapsGeocodingAdminLevelDto.class, str);
    }

    public static VkMapsGeocodingAdminLevelDto[] values() {
        return (VkMapsGeocodingAdminLevelDto[]) $VALUES.clone();
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
