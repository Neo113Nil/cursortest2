package com.vk.api.generated.educationMembership.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseSexDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: EducationMembershipCreatorDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipCreatorDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipCreatorDto> CREATOR = new a();

    @pmi0("fullName")
    private final String fullName;

    @pmi0("id")
    private final int id;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("shortName")
    private final String shortName;

    /* compiled from: EducationMembershipCreatorDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipCreatorDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipCreatorDto createFromParcel(Parcel parcel) {
            return new EducationMembershipCreatorDto(parcel.readInt(), parcel.readString(), parcel.readString(), (BaseSexDto) parcel.readParcelable(EducationMembershipCreatorDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipCreatorDto[] newArray(int i) {
            return new EducationMembershipCreatorDto[i];
        }
    }

    public EducationMembershipCreatorDto(int i, String str, String str2, BaseSexDto baseSexDto) {
        this.id = i;
        this.shortName = str;
        this.fullName = str2;
        this.sex = baseSexDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipCreatorDto)) {
            return false;
        }
        EducationMembershipCreatorDto educationMembershipCreatorDto = (EducationMembershipCreatorDto) obj;
        return this.id == educationMembershipCreatorDto.id && epx.f(this.shortName, educationMembershipCreatorDto.shortName) && epx.f(this.fullName, educationMembershipCreatorDto.fullName) && this.sex == educationMembershipCreatorDto.sex;
    }

    public final int hashCode() {
        return this.sex.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.shortName), 31, this.fullName);
    }

    public final String toString() {
        return "EducationMembershipCreatorDto(id=" + this.id + ", shortName=" + this.shortName + ", fullName=" + this.fullName + ", sex=" + this.sex + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.shortName);
        parcel.writeString(this.fullName);
        parcel.writeParcelable(this.sex, i);
    }
}
