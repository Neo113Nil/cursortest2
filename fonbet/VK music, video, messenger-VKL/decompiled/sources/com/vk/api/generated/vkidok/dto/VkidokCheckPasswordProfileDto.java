package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkidokCheckPasswordProfileDto.kt */
/* loaded from: classes15.dex */
public final class VkidokCheckPasswordProfileDto implements Parcelable {
    public static final Parcelable.Creator<VkidokCheckPasswordProfileDto> CREATOR = new a();

    @pmi0("birthday")
    private final String birthday;

    @pmi0("bithday")
    private final String bithday;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("gender")
    private final GenderDto gender;

    @pmi0("last_name")
    private final String lastName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkidokCheckPasswordProfileDto.kt */
    public static final class GenderDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GenderDto[] $VALUES;
        public static final Parcelable.Creator<GenderDto> CREATOR;

        @pmi0("2")
        public static final GenderDto FEMALE;

        @pmi0("1")
        public static final GenderDto MALE;
        private final int value;

        /* compiled from: VkidokCheckPasswordProfileDto.kt */
        public static final class a implements Parcelable.Creator<GenderDto> {
            @Override // android.os.Parcelable.Creator
            public final GenderDto createFromParcel(Parcel parcel) {
                return GenderDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GenderDto[] newArray(int i) {
                return new GenderDto[i];
            }
        }

        static {
            GenderDto genderDto = new GenderDto("MALE", 0, 1);
            MALE = genderDto;
            GenderDto genderDto2 = new GenderDto("FEMALE", 1, 2);
            FEMALE = genderDto2;
            GenderDto[] genderDtoArr = {genderDto, genderDto2};
            $VALUES = genderDtoArr;
            $ENTRIES = new asp(genderDtoArr);
            CREATOR = new a();
        }

        private GenderDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static GenderDto valueOf(String str) {
            return (GenderDto) Enum.valueOf(GenderDto.class, str);
        }

        public static GenderDto[] values() {
            return (GenderDto[]) $VALUES.clone();
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

    /* compiled from: VkidokCheckPasswordProfileDto.kt */
    public static final class a implements Parcelable.Creator<VkidokCheckPasswordProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokCheckPasswordProfileDto createFromParcel(Parcel parcel) {
            return new VkidokCheckPasswordProfileDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GenderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokCheckPasswordProfileDto[] newArray(int i) {
            return new VkidokCheckPasswordProfileDto[i];
        }
    }

    public VkidokCheckPasswordProfileDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokCheckPasswordProfileDto)) {
            return false;
        }
        VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto = (VkidokCheckPasswordProfileDto) obj;
        return epx.f(this.firstName, vkidokCheckPasswordProfileDto.firstName) && epx.f(this.lastName, vkidokCheckPasswordProfileDto.lastName) && epx.f(this.bithday, vkidokCheckPasswordProfileDto.bithday) && epx.f(this.birthday, vkidokCheckPasswordProfileDto.birthday) && this.gender == vkidokCheckPasswordProfileDto.gender;
    }

    public final int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bithday;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthday;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GenderDto genderDto = this.gender;
        return hashCode4 + (genderDto != null ? genderDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkidokCheckPasswordProfileDto(firstName=" + this.firstName + ", lastName=" + this.lastName + ", bithday=" + this.bithday + ", birthday=" + this.birthday + ", gender=" + this.gender + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.bithday);
        parcel.writeString(this.birthday);
        GenderDto genderDto = this.gender;
        if (genderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            genderDto.writeToParcel(parcel, i);
        }
    }

    public VkidokCheckPasswordProfileDto(String str, String str2, String str3, String str4, GenderDto genderDto) {
        this.firstName = str;
        this.lastName = str2;
        this.bithday = str3;
        this.birthday = str4;
        this.gender = genderDto;
    }

    public /* synthetic */ VkidokCheckPasswordProfileDto(String str, String str2, String str3, String str4, GenderDto genderDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : genderDto);
    }
}
