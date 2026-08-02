package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMapsGeocodingReverseAdminLevelDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeocodingReverseAdminLevelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeocodingReverseAdminLevelDto[] $VALUES;

    @pmi0("1")
    public static final VkMapsGeocodingReverseAdminLevelDto COUNTRY;
    public static final Parcelable.Creator<VkMapsGeocodingReverseAdminLevelDto> CREATOR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final VkMapsGeocodingReverseAdminLevelDto HOUSE;

    @pmi0("3")
    public static final VkMapsGeocodingReverseAdminLevelDto LOCALITY;

    @pmi0("2")
    public static final VkMapsGeocodingReverseAdminLevelDto REGION;

    @pmi0("4")
    public static final VkMapsGeocodingReverseAdminLevelDto STREET;
    private final int value;

    /* compiled from: VkMapsGeocodingReverseAdminLevelDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeocodingReverseAdminLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingReverseAdminLevelDto createFromParcel(Parcel parcel) {
            return VkMapsGeocodingReverseAdminLevelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeocodingReverseAdminLevelDto[] newArray(int i) {
            return new VkMapsGeocodingReverseAdminLevelDto[i];
        }
    }

    static {
        VkMapsGeocodingReverseAdminLevelDto vkMapsGeocodingReverseAdminLevelDto = new VkMapsGeocodingReverseAdminLevelDto("COUNTRY", 0, 1);
        COUNTRY = vkMapsGeocodingReverseAdminLevelDto;
        VkMapsGeocodingReverseAdminLevelDto vkMapsGeocodingReverseAdminLevelDto2 = new VkMapsGeocodingReverseAdminLevelDto("REGION", 1, 2);
        REGION = vkMapsGeocodingReverseAdminLevelDto2;
        VkMapsGeocodingReverseAdminLevelDto vkMapsGeocodingReverseAdminLevelDto3 = new VkMapsGeocodingReverseAdminLevelDto("LOCALITY", 2, 3);
        LOCALITY = vkMapsGeocodingReverseAdminLevelDto3;
        VkMapsGeocodingReverseAdminLevelDto vkMapsGeocodingReverseAdminLevelDto4 = new VkMapsGeocodingReverseAdminLevelDto("STREET", 3, 4);
        STREET = vkMapsGeocodingReverseAdminLevelDto4;
        VkMapsGeocodingReverseAdminLevelDto vkMapsGeocodingReverseAdminLevelDto5 = new VkMapsGeocodingReverseAdminLevelDto("HOUSE", 4, 5);
        HOUSE = vkMapsGeocodingReverseAdminLevelDto5;
        VkMapsGeocodingReverseAdminLevelDto[] vkMapsGeocodingReverseAdminLevelDtoArr = {vkMapsGeocodingReverseAdminLevelDto, vkMapsGeocodingReverseAdminLevelDto2, vkMapsGeocodingReverseAdminLevelDto3, vkMapsGeocodingReverseAdminLevelDto4, vkMapsGeocodingReverseAdminLevelDto5};
        $VALUES = vkMapsGeocodingReverseAdminLevelDtoArr;
        $ENTRIES = new asp(vkMapsGeocodingReverseAdminLevelDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeocodingReverseAdminLevelDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VkMapsGeocodingReverseAdminLevelDto valueOf(String str) {
        return (VkMapsGeocodingReverseAdminLevelDto) Enum.valueOf(VkMapsGeocodingReverseAdminLevelDto.class, str);
    }

    public static VkMapsGeocodingReverseAdminLevelDto[] values() {
        return (VkMapsGeocodingReverseAdminLevelDto[]) $VALUES.clone();
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
