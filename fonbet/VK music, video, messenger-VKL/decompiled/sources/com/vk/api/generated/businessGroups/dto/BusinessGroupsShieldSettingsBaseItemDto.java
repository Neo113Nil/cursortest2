package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BusinessGroupsShieldSettingsBaseItemDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsBaseItemDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsBaseItemDto> CREATOR = new a();

    @pmi0("has_error")
    private final Boolean hasError;

    @pmi0("is_completed")
    private final boolean isCompleted;

    @pmi0("name")
    private final NameDto name;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BusinessGroupsShieldSettingsBaseItemDto.kt */
    public static final class NameDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;

        @pmi0("business_profile")
        public static final NameDto BUSINESS_PROFILE;

        @pmi0("community_all_2fa")
        public static final NameDto COMMUNITY_ALL_2FA;

        @pmi0("community_city")
        public static final NameDto COMMUNITY_CITY;

        @pmi0("community_no_donut")
        public static final NameDto COMMUNITY_NO_DONUT;

        @pmi0("community_open")
        public static final NameDto COMMUNITY_OPEN;

        @pmi0("community_owner")
        public static final NameDto COMMUNITY_OWNER;

        @pmi0("community_owner_or_admin")
        public static final NameDto COMMUNITY_OWNER_OR_ADMIN;

        @pmi0("community_photo_and_description")
        public static final NameDto COMMUNITY_PHOTO_AND_DESCRIPTION;
        public static final Parcelable.Creator<NameDto> CREATOR;

        @pmi0(CampaignEx.JSON_KEY_STAR)
        public static final NameDto RATING;

        @pmi0("strike")
        public static final NameDto STRIKE;

        @pmi0("subscription")
        public static final NameDto SUBSCRIPTION;

        @pmi0("verified_business_profile")
        public static final NameDto VERIFIED_BUSINESS_PROFILE;
        private final String value;

        /* compiled from: BusinessGroupsShieldSettingsBaseItemDto.kt */
        public static final class a implements Parcelable.Creator<NameDto> {
            @Override // android.os.Parcelable.Creator
            public final NameDto createFromParcel(Parcel parcel) {
                return NameDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NameDto[] newArray(int i) {
                return new NameDto[i];
            }
        }

        static {
            NameDto nameDto = new NameDto("COMMUNITY_OWNER", 0, "community_owner");
            COMMUNITY_OWNER = nameDto;
            NameDto nameDto2 = new NameDto("BUSINESS_PROFILE", 1, "business_profile");
            BUSINESS_PROFILE = nameDto2;
            NameDto nameDto3 = new NameDto("VERIFIED_BUSINESS_PROFILE", 2, "verified_business_profile");
            VERIFIED_BUSINESS_PROFILE = nameDto3;
            NameDto nameDto4 = new NameDto(NativeAdContent.ViewTag.RATING, 3, CampaignEx.JSON_KEY_STAR);
            RATING = nameDto4;
            NameDto nameDto5 = new NameDto("STRIKE", 4, "strike");
            STRIKE = nameDto5;
            NameDto nameDto6 = new NameDto("SUBSCRIPTION", 5, "subscription");
            SUBSCRIPTION = nameDto6;
            NameDto nameDto7 = new NameDto("COMMUNITY_OWNER_OR_ADMIN", 6, "community_owner_or_admin");
            COMMUNITY_OWNER_OR_ADMIN = nameDto7;
            NameDto nameDto8 = new NameDto("COMMUNITY_NO_DONUT", 7, "community_no_donut");
            COMMUNITY_NO_DONUT = nameDto8;
            NameDto nameDto9 = new NameDto("COMMUNITY_ALL_2FA", 8, "community_all_2fa");
            COMMUNITY_ALL_2FA = nameDto9;
            NameDto nameDto10 = new NameDto("COMMUNITY_OPEN", 9, "community_open");
            COMMUNITY_OPEN = nameDto10;
            NameDto nameDto11 = new NameDto("COMMUNITY_PHOTO_AND_DESCRIPTION", 10, "community_photo_and_description");
            COMMUNITY_PHOTO_AND_DESCRIPTION = nameDto11;
            NameDto nameDto12 = new NameDto("COMMUNITY_CITY", 11, "community_city");
            COMMUNITY_CITY = nameDto12;
            NameDto[] nameDtoArr = {nameDto, nameDto2, nameDto3, nameDto4, nameDto5, nameDto6, nameDto7, nameDto8, nameDto9, nameDto10, nameDto11, nameDto12};
            $VALUES = nameDtoArr;
            $ENTRIES = new asp(nameDtoArr);
            CREATOR = new a();
        }

        private NameDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NameDto valueOf(String str) {
            return (NameDto) Enum.valueOf(NameDto.class, str);
        }

        public static NameDto[] values() {
            return (NameDto[]) $VALUES.clone();
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

    /* compiled from: BusinessGroupsShieldSettingsBaseItemDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsBaseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsBaseItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            NameDto createFromParcel = NameDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BusinessGroupsShieldSettingsBaseItemDto(createFromParcel, readString, z, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsBaseItemDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsBaseItemDto[i];
        }
    }

    public BusinessGroupsShieldSettingsBaseItemDto(NameDto nameDto, String str, boolean z, Boolean bool) {
        this.name = nameDto;
        this.title = str;
        this.isCompleted = z;
        this.hasError = bool;
    }

    public final NameDto d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isCompleted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsBaseItemDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsBaseItemDto businessGroupsShieldSettingsBaseItemDto = (BusinessGroupsShieldSettingsBaseItemDto) obj;
        return this.name == businessGroupsShieldSettingsBaseItemDto.name && epx.f(this.title, businessGroupsShieldSettingsBaseItemDto.title) && this.isCompleted == businessGroupsShieldSettingsBaseItemDto.isCompleted && epx.f(this.hasError, businessGroupsShieldSettingsBaseItemDto.hasError);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.name.hashCode() * 31, 31, this.title), 31, this.isCompleted);
        Boolean bool = this.hasError;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessGroupsShieldSettingsBaseItemDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isCompleted=");
        sb.append(this.isCompleted);
        sb.append(", hasError=");
        return tn.a(sb, this.hasError, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.name.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.isCompleted ? 1 : 0);
        Boolean bool = this.hasError;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ BusinessGroupsShieldSettingsBaseItemDto(NameDto nameDto, String str, boolean z, Boolean bool, int i, zcl zclVar) {
        this(nameDto, str, z, (i & 8) != 0 ? null : bool);
    }
}
