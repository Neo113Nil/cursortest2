package com.vk.api.generated.educationOrganization.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: EducationOrganizationGetOrganizationStateResponseDto.kt */
/* loaded from: classes14.dex */
public final class EducationOrganizationGetOrganizationStateResponseDto implements Parcelable {
    public static final Parcelable.Creator<EducationOrganizationGetOrganizationStateResponseDto> CREATOR = new a();

    @pmi0("has_admin")
    private final boolean hasAdmin;

    @pmi0("has_vendor")
    private final boolean hasVendor;

    /* compiled from: EducationOrganizationGetOrganizationStateResponseDto.kt */
    public static final class a implements Parcelable.Creator<EducationOrganizationGetOrganizationStateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationOrganizationGetOrganizationStateResponseDto createFromParcel(Parcel parcel) {
            return new EducationOrganizationGetOrganizationStateResponseDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationOrganizationGetOrganizationStateResponseDto[] newArray(int i) {
            return new EducationOrganizationGetOrganizationStateResponseDto[i];
        }
    }

    public EducationOrganizationGetOrganizationStateResponseDto(boolean z, boolean z2) {
        this.hasAdmin = z;
        this.hasVendor = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationOrganizationGetOrganizationStateResponseDto)) {
            return false;
        }
        EducationOrganizationGetOrganizationStateResponseDto educationOrganizationGetOrganizationStateResponseDto = (EducationOrganizationGetOrganizationStateResponseDto) obj;
        return this.hasAdmin == educationOrganizationGetOrganizationStateResponseDto.hasAdmin && this.hasVendor == educationOrganizationGetOrganizationStateResponseDto.hasVendor;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasVendor) + (Boolean.hashCode(this.hasAdmin) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationOrganizationGetOrganizationStateResponseDto(hasAdmin=");
        sb.append(this.hasAdmin);
        sb.append(", hasVendor=");
        return q0.a(sb, this.hasVendor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasAdmin ? 1 : 0);
        parcel.writeInt(this.hasVendor ? 1 : 0);
    }
}
