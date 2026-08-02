package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BusinessGroupsGetShieldSettingsScreenDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsGetShieldSettingsScreenDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BusinessGroupsGetShieldSettingsScreenDto[] $VALUES;

    @pmi0("base")
    public static final BusinessGroupsGetShieldSettingsScreenDto BASE;

    @pmi0("base_activation")
    public static final BusinessGroupsGetShieldSettingsScreenDto BASE_ACTIVATION;
    public static final Parcelable.Creator<BusinessGroupsGetShieldSettingsScreenDto> CREATOR;

    @pmi0("nko")
    public static final BusinessGroupsGetShieldSettingsScreenDto NKO;

    @pmi0("premium")
    public static final BusinessGroupsGetShieldSettingsScreenDto PREMIUM;

    @pmi0("premium_activation")
    public static final BusinessGroupsGetShieldSettingsScreenDto PREMIUM_ACTIVATION;

    @pmi0("unlink_bid")
    public static final BusinessGroupsGetShieldSettingsScreenDto UNLINK_BID;

    @pmi0("verification")
    public static final BusinessGroupsGetShieldSettingsScreenDto VERIFICATION;
    private final String value;

    /* compiled from: BusinessGroupsGetShieldSettingsScreenDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsGetShieldSettingsScreenDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetShieldSettingsScreenDto createFromParcel(Parcel parcel) {
            return BusinessGroupsGetShieldSettingsScreenDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetShieldSettingsScreenDto[] newArray(int i) {
            return new BusinessGroupsGetShieldSettingsScreenDto[i];
        }
    }

    static {
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto = new BusinessGroupsGetShieldSettingsScreenDto("BASE", 0, "base");
        BASE = businessGroupsGetShieldSettingsScreenDto;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto2 = new BusinessGroupsGetShieldSettingsScreenDto("BASE_ACTIVATION", 1, "base_activation");
        BASE_ACTIVATION = businessGroupsGetShieldSettingsScreenDto2;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto3 = new BusinessGroupsGetShieldSettingsScreenDto("NKO", 2, "nko");
        NKO = businessGroupsGetShieldSettingsScreenDto3;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto4 = new BusinessGroupsGetShieldSettingsScreenDto("PREMIUM", 3, "premium");
        PREMIUM = businessGroupsGetShieldSettingsScreenDto4;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto5 = new BusinessGroupsGetShieldSettingsScreenDto("PREMIUM_ACTIVATION", 4, "premium_activation");
        PREMIUM_ACTIVATION = businessGroupsGetShieldSettingsScreenDto5;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto6 = new BusinessGroupsGetShieldSettingsScreenDto("UNLINK_BID", 5, "unlink_bid");
        UNLINK_BID = businessGroupsGetShieldSettingsScreenDto6;
        BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto7 = new BusinessGroupsGetShieldSettingsScreenDto("VERIFICATION", 6, "verification");
        VERIFICATION = businessGroupsGetShieldSettingsScreenDto7;
        BusinessGroupsGetShieldSettingsScreenDto[] businessGroupsGetShieldSettingsScreenDtoArr = {businessGroupsGetShieldSettingsScreenDto, businessGroupsGetShieldSettingsScreenDto2, businessGroupsGetShieldSettingsScreenDto3, businessGroupsGetShieldSettingsScreenDto4, businessGroupsGetShieldSettingsScreenDto5, businessGroupsGetShieldSettingsScreenDto6, businessGroupsGetShieldSettingsScreenDto7};
        $VALUES = businessGroupsGetShieldSettingsScreenDtoArr;
        $ENTRIES = new asp(businessGroupsGetShieldSettingsScreenDtoArr);
        CREATOR = new a();
    }

    private BusinessGroupsGetShieldSettingsScreenDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BusinessGroupsGetShieldSettingsScreenDto valueOf(String str) {
        return (BusinessGroupsGetShieldSettingsScreenDto) Enum.valueOf(BusinessGroupsGetShieldSettingsScreenDto.class, str);
    }

    public static BusinessGroupsGetShieldSettingsScreenDto[] values() {
        return (BusinessGroupsGetShieldSettingsScreenDto[]) $VALUES.clone();
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
