package com.vk.api.generated.vkMaps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMapsGeoSuggestTypesDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoSuggestTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeoSuggestTypesDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final VkMapsGeoSuggestTypesDto ADDRESS;
    public static final Parcelable.Creator<VkMapsGeoSuggestTypesDto> CREATOR;

    @pmi0("place")
    public static final VkMapsGeoSuggestTypesDto PLACE;
    private final String value;

    /* compiled from: VkMapsGeoSuggestTypesDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoSuggestTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestTypesDto createFromParcel(Parcel parcel) {
            return VkMapsGeoSuggestTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestTypesDto[] newArray(int i) {
            return new VkMapsGeoSuggestTypesDto[i];
        }
    }

    static {
        VkMapsGeoSuggestTypesDto vkMapsGeoSuggestTypesDto = new VkMapsGeoSuggestTypesDto("ADDRESS", 0, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = vkMapsGeoSuggestTypesDto;
        VkMapsGeoSuggestTypesDto vkMapsGeoSuggestTypesDto2 = new VkMapsGeoSuggestTypesDto("PLACE", 1, "place");
        PLACE = vkMapsGeoSuggestTypesDto2;
        VkMapsGeoSuggestTypesDto[] vkMapsGeoSuggestTypesDtoArr = {vkMapsGeoSuggestTypesDto, vkMapsGeoSuggestTypesDto2};
        $VALUES = vkMapsGeoSuggestTypesDtoArr;
        $ENTRIES = new asp(vkMapsGeoSuggestTypesDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeoSuggestTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkMapsGeoSuggestTypesDto valueOf(String str) {
        return (VkMapsGeoSuggestTypesDto) Enum.valueOf(VkMapsGeoSuggestTypesDto.class, str);
    }

    public static VkMapsGeoSuggestTypesDto[] values() {
        return (VkMapsGeoSuggestTypesDto[]) $VALUES.clone();
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
