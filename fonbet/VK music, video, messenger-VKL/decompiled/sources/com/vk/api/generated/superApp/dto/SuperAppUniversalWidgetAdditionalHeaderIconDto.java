package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: SuperAppUniversalWidgetAdditionalHeaderIconDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetAdditionalHeaderIconDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetAdditionalHeaderIconDto> CREATOR = new a();

    @pmi0("image")
    private final SuperAppUniversalWidgetImageBlockDto image;

    /* compiled from: SuperAppUniversalWidgetAdditionalHeaderIconDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetAdditionalHeaderIconDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetAdditionalHeaderIconDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetAdditionalHeaderIconDto((SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppUniversalWidgetAdditionalHeaderIconDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetAdditionalHeaderIconDto[] newArray(int i) {
            return new SuperAppUniversalWidgetAdditionalHeaderIconDto[i];
        }
    }

    public SuperAppUniversalWidgetAdditionalHeaderIconDto(SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
        this.image = superAppUniversalWidgetImageBlockDto;
    }

    public final SuperAppUniversalWidgetImageBlockDto d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppUniversalWidgetAdditionalHeaderIconDto) && epx.f(this.image, ((SuperAppUniversalWidgetAdditionalHeaderIconDto) obj).image);
    }

    public final int hashCode() {
        return this.image.hashCode();
    }

    public final String toString() {
        return "SuperAppUniversalWidgetAdditionalHeaderIconDto(image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.image, i);
    }
}
