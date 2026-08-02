package com.vk.api.generated.services.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: ServicesYcVKReviewsPublishGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServicesYcVKReviewsPublishGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServicesYcVKReviewsPublishGetResponseDto> CREATOR = new a();

    @pmi0("is_import_enabled")
    private final boolean isImportEnabled;

    @pmi0("yc_branch_id")
    private final int ycBranchId;

    /* compiled from: ServicesYcVKReviewsPublishGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServicesYcVKReviewsPublishGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServicesYcVKReviewsPublishGetResponseDto createFromParcel(Parcel parcel) {
            return new ServicesYcVKReviewsPublishGetResponseDto(parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesYcVKReviewsPublishGetResponseDto[] newArray(int i) {
            return new ServicesYcVKReviewsPublishGetResponseDto[i];
        }
    }

    public ServicesYcVKReviewsPublishGetResponseDto(int i, boolean z) {
        this.ycBranchId = i;
        this.isImportEnabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesYcVKReviewsPublishGetResponseDto)) {
            return false;
        }
        ServicesYcVKReviewsPublishGetResponseDto servicesYcVKReviewsPublishGetResponseDto = (ServicesYcVKReviewsPublishGetResponseDto) obj;
        return this.ycBranchId == servicesYcVKReviewsPublishGetResponseDto.ycBranchId && this.isImportEnabled == servicesYcVKReviewsPublishGetResponseDto.isImportEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isImportEnabled) + (Integer.hashCode(this.ycBranchId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesYcVKReviewsPublishGetResponseDto(ycBranchId=");
        sb.append(this.ycBranchId);
        sb.append(", isImportEnabled=");
        return q0.a(sb, this.isImportEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ycBranchId);
        parcel.writeInt(this.isImportEnabled ? 1 : 0);
    }
}
