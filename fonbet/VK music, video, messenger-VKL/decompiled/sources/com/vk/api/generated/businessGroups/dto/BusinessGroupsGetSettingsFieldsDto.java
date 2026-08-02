package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BusinessGroupsGetSettingsFieldsDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsGetSettingsFieldsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BusinessGroupsGetSettingsFieldsDto[] $VALUES;

    @pmi0("business_profile")
    public static final BusinessGroupsGetSettingsFieldsDto BUSINESS_PROFILE;
    public static final Parcelable.Creator<BusinessGroupsGetSettingsFieldsDto> CREATOR;
    private final String value;

    /* compiled from: BusinessGroupsGetSettingsFieldsDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsGetSettingsFieldsDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetSettingsFieldsDto createFromParcel(Parcel parcel) {
            return BusinessGroupsGetSettingsFieldsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetSettingsFieldsDto[] newArray(int i) {
            return new BusinessGroupsGetSettingsFieldsDto[i];
        }
    }

    static {
        BusinessGroupsGetSettingsFieldsDto businessGroupsGetSettingsFieldsDto = new BusinessGroupsGetSettingsFieldsDto("BUSINESS_PROFILE", 0, "business_profile");
        BUSINESS_PROFILE = businessGroupsGetSettingsFieldsDto;
        BusinessGroupsGetSettingsFieldsDto[] businessGroupsGetSettingsFieldsDtoArr = {businessGroupsGetSettingsFieldsDto};
        $VALUES = businessGroupsGetSettingsFieldsDtoArr;
        $ENTRIES = new asp(businessGroupsGetSettingsFieldsDtoArr);
        CREATOR = new a();
    }

    private BusinessGroupsGetSettingsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BusinessGroupsGetSettingsFieldsDto valueOf(String str) {
        return (BusinessGroupsGetSettingsFieldsDto) Enum.valueOf(BusinessGroupsGetSettingsFieldsDto.class, str);
    }

    public static BusinessGroupsGetSettingsFieldsDto[] values() {
        return (BusinessGroupsGetSettingsFieldsDto[]) $VALUES.clone();
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
