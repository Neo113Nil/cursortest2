package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BusinessGroupsShieldSettingsMessageDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsMessageDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsMessageDto> CREATOR = new a();

    @pmi0("button")
    private final BusinessGroupsShieldSettingsButtonDto button;

    @pmi0("description")
    private final String description;

    @pmi0("name")
    private final NameDto name;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BusinessGroupsShieldSettingsMessageDto.kt */
    public static final class NameDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;
        public static final Parcelable.Creator<NameDto> CREATOR;

        @pmi0("error")
        public static final NameDto ERROR;

        @pmi0("success")
        public static final NameDto SUCCESS;
        private final String value;

        /* compiled from: BusinessGroupsShieldSettingsMessageDto.kt */
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
            NameDto nameDto = new NameDto("SUCCESS", 0, "success");
            SUCCESS = nameDto;
            NameDto nameDto2 = new NameDto("ERROR", 1, "error");
            ERROR = nameDto2;
            NameDto[] nameDtoArr = {nameDto, nameDto2};
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

    /* compiled from: BusinessGroupsShieldSettingsMessageDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsMessageDto createFromParcel(Parcel parcel) {
            return new BusinessGroupsShieldSettingsMessageDto(NameDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BusinessGroupsShieldSettingsButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsMessageDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsMessageDto[i];
        }
    }

    public BusinessGroupsShieldSettingsMessageDto(NameDto nameDto, String str, String str2, BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto) {
        this.name = nameDto;
        this.title = str;
        this.description = str2;
        this.button = businessGroupsShieldSettingsButtonDto;
    }

    public final BusinessGroupsShieldSettingsButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NameDto e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsMessageDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsMessageDto businessGroupsShieldSettingsMessageDto = (BusinessGroupsShieldSettingsMessageDto) obj;
        return this.name == businessGroupsShieldSettingsMessageDto.name && epx.f(this.title, businessGroupsShieldSettingsMessageDto.title) && epx.f(this.description, businessGroupsShieldSettingsMessageDto.description) && epx.f(this.button, businessGroupsShieldSettingsMessageDto.button);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.title), 31, this.description);
        BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto = this.button;
        return a2 + (businessGroupsShieldSettingsButtonDto == null ? 0 : businessGroupsShieldSettingsButtonDto.hashCode());
    }

    public final String toString() {
        return "BusinessGroupsShieldSettingsMessageDto(name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.name.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto = this.button;
        if (businessGroupsShieldSettingsButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            businessGroupsShieldSettingsButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BusinessGroupsShieldSettingsMessageDto(NameDto nameDto, String str, String str2, BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto, int i, zcl zclVar) {
        this(nameDto, str, str2, (i & 8) != 0 ? null : businessGroupsShieldSettingsButtonDto);
    }
}
