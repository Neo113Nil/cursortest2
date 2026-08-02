package com.vk.api.generated.educationMembership.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: EducationMembershipGetRequestResponseDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipGetRequestResponseDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipGetRequestResponseDto> CREATOR = new a();

    @pmi0("request")
    private final EducationMembershipRequestDto request;

    /* compiled from: EducationMembershipGetRequestResponseDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipGetRequestResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipGetRequestResponseDto createFromParcel(Parcel parcel) {
            return new EducationMembershipGetRequestResponseDto(EducationMembershipRequestDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipGetRequestResponseDto[] newArray(int i) {
            return new EducationMembershipGetRequestResponseDto[i];
        }
    }

    public EducationMembershipGetRequestResponseDto(EducationMembershipRequestDto educationMembershipRequestDto) {
        this.request = educationMembershipRequestDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationMembershipGetRequestResponseDto) && epx.f(this.request, ((EducationMembershipGetRequestResponseDto) obj).request);
    }

    public final int hashCode() {
        return this.request.hashCode();
    }

    public final String toString() {
        return "EducationMembershipGetRequestResponseDto(request=" + this.request + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.request.writeToParcel(parcel, i);
    }
}
