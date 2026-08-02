package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: ClassifiedsDetectClassifiedsMlResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsDetectClassifiedsMlResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsDetectClassifiedsMlResponseDto> CREATOR = new a();

    @pmi0("is_classifieds_product")
    private final boolean isClassifiedsProduct;

    @pmi0("is_photo_name_predictor_used")
    private final boolean isPhotoNamePredictorUsed;

    @pmi0("price_found")
    private final boolean priceFound;

    @pmi0("title_found")
    private final boolean titleFound;

    /* compiled from: ClassifiedsDetectClassifiedsMlResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsDetectClassifiedsMlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsDetectClassifiedsMlResponseDto createFromParcel(Parcel parcel) {
            return new ClassifiedsDetectClassifiedsMlResponseDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsDetectClassifiedsMlResponseDto[] newArray(int i) {
            return new ClassifiedsDetectClassifiedsMlResponseDto[i];
        }
    }

    public ClassifiedsDetectClassifiedsMlResponseDto(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isClassifiedsProduct = z;
        this.priceFound = z2;
        this.titleFound = z3;
        this.isPhotoNamePredictorUsed = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsDetectClassifiedsMlResponseDto)) {
            return false;
        }
        ClassifiedsDetectClassifiedsMlResponseDto classifiedsDetectClassifiedsMlResponseDto = (ClassifiedsDetectClassifiedsMlResponseDto) obj;
        return this.isClassifiedsProduct == classifiedsDetectClassifiedsMlResponseDto.isClassifiedsProduct && this.priceFound == classifiedsDetectClassifiedsMlResponseDto.priceFound && this.titleFound == classifiedsDetectClassifiedsMlResponseDto.titleFound && this.isPhotoNamePredictorUsed == classifiedsDetectClassifiedsMlResponseDto.isPhotoNamePredictorUsed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPhotoNamePredictorUsed) + qoy.b(qoy.b(Boolean.hashCode(this.isClassifiedsProduct) * 31, 31, this.priceFound), 31, this.titleFound);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsDetectClassifiedsMlResponseDto(isClassifiedsProduct=");
        sb.append(this.isClassifiedsProduct);
        sb.append(", priceFound=");
        sb.append(this.priceFound);
        sb.append(", titleFound=");
        sb.append(this.titleFound);
        sb.append(", isPhotoNamePredictorUsed=");
        return q0.a(sb, this.isPhotoNamePredictorUsed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isClassifiedsProduct ? 1 : 0);
        parcel.writeInt(this.priceFound ? 1 : 0);
        parcel.writeInt(this.titleFound ? 1 : 0);
        parcel.writeInt(this.isPhotoNamePredictorUsed ? 1 : 0);
    }
}
