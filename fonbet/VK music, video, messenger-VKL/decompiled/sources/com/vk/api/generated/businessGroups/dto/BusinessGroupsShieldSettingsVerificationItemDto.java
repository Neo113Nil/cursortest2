package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BusinessGroupsShieldSettingsVerificationItemDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsVerificationItemDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsVerificationItemDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("details")
    private final BusinessGroupsShieldSettingsDetailsDto details;

    @pmi0("is_completed")
    private final Boolean isCompleted;

    @pmi0("is_warning")
    private final Boolean isWarning;

    @pmi0("legal_entity_name")
    private final String legalEntityName;

    @pmi0("link")
    private final String link;

    @pmi0("logo_dark")
    private final String logoDark;

    @pmi0("logo_light")
    private final String logoLight;

    @pmi0("name")
    private final NameDto name;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BusinessGroupsShieldSettingsVerificationItemDto.kt */
    public static final class NameDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;

        @pmi0("base")
        public static final NameDto BASE;
        public static final Parcelable.Creator<NameDto> CREATOR;

        @pmi0("mark")
        public static final NameDto MARK;

        @pmi0("nko")
        public static final NameDto NKO;

        @pmi0("premium")
        public static final NameDto PREMIUM;
        private final String value;

        /* compiled from: BusinessGroupsShieldSettingsVerificationItemDto.kt */
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
            NameDto nameDto = new NameDto("MARK", 0, "mark");
            MARK = nameDto;
            NameDto nameDto2 = new NameDto("BASE", 1, "base");
            BASE = nameDto2;
            NameDto nameDto3 = new NameDto("PREMIUM", 2, "premium");
            PREMIUM = nameDto3;
            NameDto nameDto4 = new NameDto("NKO", 3, "nko");
            NKO = nameDto4;
            NameDto[] nameDtoArr = {nameDto, nameDto2, nameDto3, nameDto4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BusinessGroupsShieldSettingsVerificationItemDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("available")
        public static final StatusDto AVAILABLE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("error")
        public static final StatusDto ERROR;

        @pmi0("pending")
        public static final StatusDto PENDING;

        @pmi0("rejected")
        public static final StatusDto REJECTED;

        @pmi0("revoked")
        public static final StatusDto REVOKED;

        @pmi0("verified")
        public static final StatusDto VERIFIED;
        private final String value;

        /* compiled from: BusinessGroupsShieldSettingsVerificationItemDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("AVAILABLE", 0, "available");
            AVAILABLE = statusDto;
            StatusDto statusDto2 = new StatusDto("PENDING", 1, "pending");
            PENDING = statusDto2;
            StatusDto statusDto3 = new StatusDto("VERIFIED", 2, "verified");
            VERIFIED = statusDto3;
            StatusDto statusDto4 = new StatusDto("REJECTED", 3, "rejected");
            REJECTED = statusDto4;
            StatusDto statusDto5 = new StatusDto("REVOKED", 4, "revoked");
            REVOKED = statusDto5;
            StatusDto statusDto6 = new StatusDto("ERROR", 5, "error");
            ERROR = statusDto6;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5, statusDto6};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: BusinessGroupsShieldSettingsVerificationItemDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsVerificationItemDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsVerificationItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            NameDto createFromParcel = NameDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BusinessGroupsShieldSettingsVerificationItemDto(createFromParcel, readString, readString2, readString3, readString4, readString5, readString6, readString7, valueOf, valueOf2, parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BusinessGroupsShieldSettingsDetailsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsVerificationItemDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsVerificationItemDto[i];
        }
    }

    public BusinessGroupsShieldSettingsVerificationItemDto(NameDto nameDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, StatusDto statusDto, BusinessGroupsShieldSettingsDetailsDto businessGroupsShieldSettingsDetailsDto) {
        this.name = nameDto;
        this.title = str;
        this.description = str2;
        this.link = str3;
        this.logoLight = str4;
        this.logoDark = str5;
        this.legalEntityName = str6;
        this.subtitle = str7;
        this.isCompleted = bool;
        this.isWarning = bool2;
        this.status = statusDto;
        this.details = businessGroupsShieldSettingsDetailsDto;
    }

    public final String d() {
        return this.logoDark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.logoLight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsVerificationItemDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsVerificationItemDto businessGroupsShieldSettingsVerificationItemDto = (BusinessGroupsShieldSettingsVerificationItemDto) obj;
        return this.name == businessGroupsShieldSettingsVerificationItemDto.name && epx.f(this.title, businessGroupsShieldSettingsVerificationItemDto.title) && epx.f(this.description, businessGroupsShieldSettingsVerificationItemDto.description) && epx.f(this.link, businessGroupsShieldSettingsVerificationItemDto.link) && epx.f(this.logoLight, businessGroupsShieldSettingsVerificationItemDto.logoLight) && epx.f(this.logoDark, businessGroupsShieldSettingsVerificationItemDto.logoDark) && epx.f(this.legalEntityName, businessGroupsShieldSettingsVerificationItemDto.legalEntityName) && epx.f(this.subtitle, businessGroupsShieldSettingsVerificationItemDto.subtitle) && epx.f(this.isCompleted, businessGroupsShieldSettingsVerificationItemDto.isCompleted) && epx.f(this.isWarning, businessGroupsShieldSettingsVerificationItemDto.isWarning) && this.status == businessGroupsShieldSettingsVerificationItemDto.status && epx.f(this.details, businessGroupsShieldSettingsVerificationItemDto.details);
    }

    public final NameDto f() {
        return this.name;
    }

    public final Boolean g() {
        return this.isCompleted;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.title), 31, this.description), 31, this.link), 31, this.logoLight), 31, this.logoDark);
        String str = this.legalEntityName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCompleted;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isWarning;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StatusDto statusDto = this.status;
        int hashCode5 = (hashCode4 + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        BusinessGroupsShieldSettingsDetailsDto businessGroupsShieldSettingsDetailsDto = this.details;
        return hashCode5 + (businessGroupsShieldSettingsDetailsDto != null ? businessGroupsShieldSettingsDetailsDto.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isWarning;
    }

    public final String toString() {
        return "BusinessGroupsShieldSettingsVerificationItemDto(name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", link=" + this.link + ", logoLight=" + this.logoLight + ", logoDark=" + this.logoDark + ", legalEntityName=" + this.legalEntityName + ", subtitle=" + this.subtitle + ", isCompleted=" + this.isCompleted + ", isWarning=" + this.isWarning + ", status=" + this.status + ", details=" + this.details + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.name.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.link);
        parcel.writeString(this.logoLight);
        parcel.writeString(this.logoDark);
        parcel.writeString(this.legalEntityName);
        parcel.writeString(this.subtitle);
        Boolean bool = this.isCompleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isWarning;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        BusinessGroupsShieldSettingsDetailsDto businessGroupsShieldSettingsDetailsDto = this.details;
        if (businessGroupsShieldSettingsDetailsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            businessGroupsShieldSettingsDetailsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BusinessGroupsShieldSettingsVerificationItemDto(NameDto nameDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, StatusDto statusDto, BusinessGroupsShieldSettingsDetailsDto businessGroupsShieldSettingsDetailsDto, int i, zcl zclVar) {
        this(nameDto, str, str2, str3, str4, str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : statusDto, (i & 2048) != 0 ? null : businessGroupsShieldSettingsDetailsDto);
    }
}
