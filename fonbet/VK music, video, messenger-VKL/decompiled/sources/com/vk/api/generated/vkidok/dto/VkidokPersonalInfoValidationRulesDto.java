package com.vk.api.generated.vkidok.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: VkidokPersonalInfoValidationRulesDto.kt */
/* loaded from: classes15.dex */
public final class VkidokPersonalInfoValidationRulesDto implements Parcelable {
    public static final Parcelable.Creator<VkidokPersonalInfoValidationRulesDto> CREATOR = new a();

    @pmi0("first_name_max_length")
    private final int firstNameMaxLength;

    @pmi0("first_name_min_length")
    private final int firstNameMinLength;

    @pmi0("last_name_max_length")
    private final int lastNameMaxLength;

    @pmi0("last_name_min_length")
    private final int lastNameMinLength;

    @pmi0("min_age")
    private final int minAge;

    /* compiled from: VkidokPersonalInfoValidationRulesDto.kt */
    public static final class a implements Parcelable.Creator<VkidokPersonalInfoValidationRulesDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidokPersonalInfoValidationRulesDto createFromParcel(Parcel parcel) {
            return new VkidokPersonalInfoValidationRulesDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VkidokPersonalInfoValidationRulesDto[] newArray(int i) {
            return new VkidokPersonalInfoValidationRulesDto[i];
        }
    }

    public VkidokPersonalInfoValidationRulesDto(int i, int i2, int i3, int i4, int i5) {
        this.firstNameMinLength = i;
        this.firstNameMaxLength = i2;
        this.lastNameMinLength = i3;
        this.lastNameMaxLength = i4;
        this.minAge = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidokPersonalInfoValidationRulesDto)) {
            return false;
        }
        VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto = (VkidokPersonalInfoValidationRulesDto) obj;
        return this.firstNameMinLength == vkidokPersonalInfoValidationRulesDto.firstNameMinLength && this.firstNameMaxLength == vkidokPersonalInfoValidationRulesDto.firstNameMaxLength && this.lastNameMinLength == vkidokPersonalInfoValidationRulesDto.lastNameMinLength && this.lastNameMaxLength == vkidokPersonalInfoValidationRulesDto.lastNameMaxLength && this.minAge == vkidokPersonalInfoValidationRulesDto.minAge;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minAge) + shy.a(this.lastNameMaxLength, shy.a(this.lastNameMinLength, shy.a(this.firstNameMaxLength, Integer.hashCode(this.firstNameMinLength) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkidokPersonalInfoValidationRulesDto(firstNameMinLength=");
        sb.append(this.firstNameMinLength);
        sb.append(", firstNameMaxLength=");
        sb.append(this.firstNameMaxLength);
        sb.append(", lastNameMinLength=");
        sb.append(this.lastNameMinLength);
        sb.append(", lastNameMaxLength=");
        sb.append(this.lastNameMaxLength);
        sb.append(", minAge=");
        return vu5.b(sb, this.minAge, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.firstNameMinLength);
        parcel.writeInt(this.firstNameMaxLength);
        parcel.writeInt(this.lastNameMinLength);
        parcel.writeInt(this.lastNameMaxLength);
        parcel.writeInt(this.minAge);
    }
}
