package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;

/* compiled from: SuperAppUniversalWidgetImageStackStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetImageStackStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetImageStackStyleDto> CREATOR = new a();

    @pmi0("shape")
    private final SuperAppUniversalWidgetImageStackStyleShapeDto shape;

    @pmi0("size")
    private final SuperAppUniversalWidgetImageStackStyleSizeDto size;

    /* compiled from: SuperAppUniversalWidgetImageStackStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageStackStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetImageStackStyleDto(SuperAppUniversalWidgetImageStackStyleShapeDto.CREATOR.createFromParcel(parcel), SuperAppUniversalWidgetImageStackStyleSizeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetImageStackStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetImageStackStyleDto(SuperAppUniversalWidgetImageStackStyleShapeDto superAppUniversalWidgetImageStackStyleShapeDto, SuperAppUniversalWidgetImageStackStyleSizeDto superAppUniversalWidgetImageStackStyleSizeDto) {
        this.shape = superAppUniversalWidgetImageStackStyleShapeDto;
        this.size = superAppUniversalWidgetImageStackStyleSizeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetImageStackStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetImageStackStyleDto superAppUniversalWidgetImageStackStyleDto = (SuperAppUniversalWidgetImageStackStyleDto) obj;
        return this.shape == superAppUniversalWidgetImageStackStyleDto.shape && this.size == superAppUniversalWidgetImageStackStyleDto.size;
    }

    public final int hashCode() {
        return this.size.hashCode() + (this.shape.hashCode() * 31);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetImageStackStyleDto(shape=" + this.shape + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.shape.writeToParcel(parcel, i);
        this.size.writeToParcel(parcel, i);
    }
}
