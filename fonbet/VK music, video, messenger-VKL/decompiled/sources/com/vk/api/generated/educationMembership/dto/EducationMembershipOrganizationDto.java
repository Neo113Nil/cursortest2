package com.vk.api.generated.educationMembership.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: EducationMembershipOrganizationDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipOrganizationDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipOrganizationDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: EducationMembershipOrganizationDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipOrganizationDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipOrganizationDto createFromParcel(Parcel parcel) {
            return new EducationMembershipOrganizationDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipOrganizationDto[] newArray(int i) {
            return new EducationMembershipOrganizationDto[i];
        }
    }

    public EducationMembershipOrganizationDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipOrganizationDto)) {
            return false;
        }
        EducationMembershipOrganizationDto educationMembershipOrganizationDto = (EducationMembershipOrganizationDto) obj;
        return this.id == educationMembershipOrganizationDto.id && epx.f(this.name, educationMembershipOrganizationDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationMembershipOrganizationDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
}
