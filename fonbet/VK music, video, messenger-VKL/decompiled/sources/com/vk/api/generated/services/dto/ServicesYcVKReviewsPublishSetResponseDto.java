package com.vk.api.generated.services.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: ServicesYcVKReviewsPublishSetResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServicesYcVKReviewsPublishSetResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServicesYcVKReviewsPublishSetResponseDto> CREATOR = new a();

    @pmi0("is_import_enabled")
    private final boolean isImportEnabled;

    @pmi0("yc_branch_id")
    private final int ycBranchId;

    /* compiled from: ServicesYcVKReviewsPublishSetResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServicesYcVKReviewsPublishSetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServicesYcVKReviewsPublishSetResponseDto createFromParcel(Parcel parcel) {
            return new ServicesYcVKReviewsPublishSetResponseDto(parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesYcVKReviewsPublishSetResponseDto[] newArray(int i) {
            return new ServicesYcVKReviewsPublishSetResponseDto[i];
        }
    }

    public ServicesYcVKReviewsPublishSetResponseDto(int i, boolean z) {
        this.ycBranchId = i;
        this.isImportEnabled = z;
    }

    public final boolean d() {
        return this.isImportEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesYcVKReviewsPublishSetResponseDto)) {
            return false;
        }
        ServicesYcVKReviewsPublishSetResponseDto servicesYcVKReviewsPublishSetResponseDto = (ServicesYcVKReviewsPublishSetResponseDto) obj;
        return this.ycBranchId == servicesYcVKReviewsPublishSetResponseDto.ycBranchId && this.isImportEnabled == servicesYcVKReviewsPublishSetResponseDto.isImportEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isImportEnabled) + (Integer.hashCode(this.ycBranchId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServicesYcVKReviewsPublishSetResponseDto(ycBranchId=");
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
