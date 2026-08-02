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
/* compiled from: VkMapsGeoSuggestFieldsDto.kt */
/* loaded from: classes15.dex */
public final class VkMapsGeoSuggestFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMapsGeoSuggestFieldsDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final VkMapsGeoSuggestFieldsDto ADDRESS;

    @pmi0("address_details")
    public static final VkMapsGeoSuggestFieldsDto ADDRESS_DETAILS;
    public static final Parcelable.Creator<VkMapsGeoSuggestFieldsDto> CREATOR;

    @pmi0("name")
    public static final VkMapsGeoSuggestFieldsDto NAME;

    @pmi0("ref")
    public static final VkMapsGeoSuggestFieldsDto REF;

    @pmi0("type")
    public static final VkMapsGeoSuggestFieldsDto TYPE;
    private final String value;

    /* compiled from: VkMapsGeoSuggestFieldsDto.kt */
    public static final class a implements Parcelable.Creator<VkMapsGeoSuggestFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestFieldsDto createFromParcel(Parcel parcel) {
            return VkMapsGeoSuggestFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkMapsGeoSuggestFieldsDto[] newArray(int i) {
            return new VkMapsGeoSuggestFieldsDto[i];
        }
    }

    static {
        VkMapsGeoSuggestFieldsDto vkMapsGeoSuggestFieldsDto = new VkMapsGeoSuggestFieldsDto("ADDRESS", 0, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = vkMapsGeoSuggestFieldsDto;
        VkMapsGeoSuggestFieldsDto vkMapsGeoSuggestFieldsDto2 = new VkMapsGeoSuggestFieldsDto("ADDRESS_DETAILS", 1, "address_details");
        ADDRESS_DETAILS = vkMapsGeoSuggestFieldsDto2;
        VkMapsGeoSuggestFieldsDto vkMapsGeoSuggestFieldsDto3 = new VkMapsGeoSuggestFieldsDto("NAME", 2, "name");
        NAME = vkMapsGeoSuggestFieldsDto3;
        VkMapsGeoSuggestFieldsDto vkMapsGeoSuggestFieldsDto4 = new VkMapsGeoSuggestFieldsDto("REF", 3, "ref");
        REF = vkMapsGeoSuggestFieldsDto4;
        VkMapsGeoSuggestFieldsDto vkMapsGeoSuggestFieldsDto5 = new VkMapsGeoSuggestFieldsDto(CredentialProviderBaseController.TYPE_TAG, 4, "type");
        TYPE = vkMapsGeoSuggestFieldsDto5;
        VkMapsGeoSuggestFieldsDto[] vkMapsGeoSuggestFieldsDtoArr = {vkMapsGeoSuggestFieldsDto, vkMapsGeoSuggestFieldsDto2, vkMapsGeoSuggestFieldsDto3, vkMapsGeoSuggestFieldsDto4, vkMapsGeoSuggestFieldsDto5};
        $VALUES = vkMapsGeoSuggestFieldsDtoArr;
        $ENTRIES = new asp(vkMapsGeoSuggestFieldsDtoArr);
        CREATOR = new a();
    }

    private VkMapsGeoSuggestFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkMapsGeoSuggestFieldsDto valueOf(String str) {
        return (VkMapsGeoSuggestFieldsDto) Enum.valueOf(VkMapsGeoSuggestFieldsDto.class, str);
    }

    public static VkMapsGeoSuggestFieldsDto[] values() {
        return (VkMapsGeoSuggestFieldsDto[]) $VALUES.clone();
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
