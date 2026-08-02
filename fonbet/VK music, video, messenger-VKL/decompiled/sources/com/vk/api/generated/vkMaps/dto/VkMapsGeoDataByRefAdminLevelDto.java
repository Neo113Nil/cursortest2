package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMapsGeoDataByRefAdminLevelDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoDataByRefAdminLevelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeoDataByRefAdminLevelDto[] $VALUES;

    @pmi0("1")
    public static final VkMapsGeoDataByRefAdminLevelDto COUNTRY;
    public static final Parcelable.Creator<VkMapsGeoDataByRefAdminLevelDto> CREATOR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final VkMapsGeoDataByRefAdminLevelDto HOUSE;

    @pmi0("3")
    public static final VkMapsGeoDataByRefAdminLevelDto LOCALITY;

    @pmi0("2")
    public static final VkMapsGeoDataByRefAdminLevelDto REGION;

    @pmi0("4")
    public static final VkMapsGeoDataByRefAdminLevelDto STREET;
    private final int value;

    /* compiled from: VkMapsGeoDataByRefAdminLevelDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoDataByRefAdminLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoDataByRefAdminLevelDto createFromParcel(Parcel parcel) {
            return VkMapsGeoDataByRefAdminLevelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoDataByRefAdminLevelDto[] newArray(int i) {
            return new VkMapsGeoDataByRefAdminLevelDto[i];
        }
    }

    static {
        VkMapsGeoDataByRefAdminLevelDto vkMapsGeoDataByRefAdminLevelDto = new VkMapsGeoDataByRefAdminLevelDto("COUNTRY", 0, 1);
        COUNTRY = vkMapsGeoDataByRefAdminLevelDto;
        VkMapsGeoDataByRefAdminLevelDto vkMapsGeoDataByRefAdminLevelDto2 = new VkMapsGeoDataByRefAdminLevelDto("REGION", 1, 2);
        REGION = vkMapsGeoDataByRefAdminLevelDto2;
        VkMapsGeoDataByRefAdminLevelDto vkMapsGeoDataByRefAdminLevelDto3 = new VkMapsGeoDataByRefAdminLevelDto("LOCALITY", 2, 3);
        LOCALITY = vkMapsGeoDataByRefAdminLevelDto3;
        VkMapsGeoDataByRefAdminLevelDto vkMapsGeoDataByRefAdminLevelDto4 = new VkMapsGeoDataByRefAdminLevelDto("STREET", 3, 4);
        STREET = vkMapsGeoDataByRefAdminLevelDto4;
        VkMapsGeoDataByRefAdminLevelDto vkMapsGeoDataByRefAdminLevelDto5 = new VkMapsGeoDataByRefAdminLevelDto("HOUSE", 4, 5);
        HOUSE = vkMapsGeoDataByRefAdminLevelDto5;
        VkMapsGeoDataByRefAdminLevelDto[] vkMapsGeoDataByRefAdminLevelDtoArr = {vkMapsGeoDataByRefAdminLevelDto, vkMapsGeoDataByRefAdminLevelDto2, vkMapsGeoDataByRefAdminLevelDto3, vkMapsGeoDataByRefAdminLevelDto4, vkMapsGeoDataByRefAdminLevelDto5};
        $VALUES = vkMapsGeoDataByRefAdminLevelDtoArr;
        $ENTRIES = new asp(vkMapsGeoDataByRefAdminLevelDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeoDataByRefAdminLevelDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VkMapsGeoDataByRefAdminLevelDto valueOf(String str) {
        return (VkMapsGeoDataByRefAdminLevelDto) Enum.valueOf(VkMapsGeoDataByRefAdminLevelDto.class, str);
    }

    public static VkMapsGeoDataByRefAdminLevelDto[] values() {
        return (VkMapsGeoDataByRefAdminLevelDto[]) $VALUES.clone();
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
