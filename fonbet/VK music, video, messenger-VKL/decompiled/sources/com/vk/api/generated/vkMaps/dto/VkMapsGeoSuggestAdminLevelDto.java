package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMapsGeoSuggestAdminLevelDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoSuggestAdminLevelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeoSuggestAdminLevelDto[] $VALUES;

    @pmi0("1")
    public static final VkMapsGeoSuggestAdminLevelDto COUNTRY;
    public static final Parcelable.Creator<VkMapsGeoSuggestAdminLevelDto> CREATOR;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final VkMapsGeoSuggestAdminLevelDto HOUSE;

    @pmi0("3")
    public static final VkMapsGeoSuggestAdminLevelDto LOCALITY;

    @pmi0("2")
    public static final VkMapsGeoSuggestAdminLevelDto REGION;

    @pmi0("4")
    public static final VkMapsGeoSuggestAdminLevelDto STREET;
    private final int value;

    /* compiled from: VkMapsGeoSuggestAdminLevelDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoSuggestAdminLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestAdminLevelDto createFromParcel(Parcel parcel) {
            return VkMapsGeoSuggestAdminLevelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestAdminLevelDto[] newArray(int i) {
            return new VkMapsGeoSuggestAdminLevelDto[i];
        }
    }

    static {
        VkMapsGeoSuggestAdminLevelDto vkMapsGeoSuggestAdminLevelDto = new VkMapsGeoSuggestAdminLevelDto("COUNTRY", 0, 1);
        COUNTRY = vkMapsGeoSuggestAdminLevelDto;
        VkMapsGeoSuggestAdminLevelDto vkMapsGeoSuggestAdminLevelDto2 = new VkMapsGeoSuggestAdminLevelDto("REGION", 1, 2);
        REGION = vkMapsGeoSuggestAdminLevelDto2;
        VkMapsGeoSuggestAdminLevelDto vkMapsGeoSuggestAdminLevelDto3 = new VkMapsGeoSuggestAdminLevelDto("LOCALITY", 2, 3);
        LOCALITY = vkMapsGeoSuggestAdminLevelDto3;
        VkMapsGeoSuggestAdminLevelDto vkMapsGeoSuggestAdminLevelDto4 = new VkMapsGeoSuggestAdminLevelDto("STREET", 3, 4);
        STREET = vkMapsGeoSuggestAdminLevelDto4;
        VkMapsGeoSuggestAdminLevelDto vkMapsGeoSuggestAdminLevelDto5 = new VkMapsGeoSuggestAdminLevelDto("HOUSE", 4, 5);
        HOUSE = vkMapsGeoSuggestAdminLevelDto5;
        VkMapsGeoSuggestAdminLevelDto[] vkMapsGeoSuggestAdminLevelDtoArr = {vkMapsGeoSuggestAdminLevelDto, vkMapsGeoSuggestAdminLevelDto2, vkMapsGeoSuggestAdminLevelDto3, vkMapsGeoSuggestAdminLevelDto4, vkMapsGeoSuggestAdminLevelDto5};
        $VALUES = vkMapsGeoSuggestAdminLevelDtoArr;
        $ENTRIES = new asp(vkMapsGeoSuggestAdminLevelDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeoSuggestAdminLevelDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VkMapsGeoSuggestAdminLevelDto valueOf(String str) {
        return (VkMapsGeoSuggestAdminLevelDto) Enum.valueOf(VkMapsGeoSuggestAdminLevelDto.class, str);
    }

    public static VkMapsGeoSuggestAdminLevelDto[] values() {
        return (VkMapsGeoSuggestAdminLevelDto[]) $VALUES.clone();
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
