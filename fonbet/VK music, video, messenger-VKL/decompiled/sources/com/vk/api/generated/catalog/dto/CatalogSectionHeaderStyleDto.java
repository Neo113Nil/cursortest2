package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogSectionHeaderStyleDto.kt */
/* loaded from: classes14.dex */
public final class CatalogSectionHeaderStyleDto implements Parcelable {
    public static final Parcelable.Creator<CatalogSectionHeaderStyleDto> CREATOR = new a();

    @pmi0("title_gradient")
    private final CatalogTitleGradientDto titleGradient;

    /* compiled from: CatalogSectionHeaderStyleDto.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionHeaderStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionHeaderStyleDto createFromParcel(Parcel parcel) {
            return new CatalogSectionHeaderStyleDto(parcel.readInt() == 0 ? null : CatalogTitleGradientDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionHeaderStyleDto[] newArray(int i) {
            return new CatalogSectionHeaderStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogSectionHeaderStyleDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogSectionHeaderStyleDto) && epx.f(this.titleGradient, ((CatalogSectionHeaderStyleDto) obj).titleGradient);
    }

    public final int hashCode() {
        CatalogTitleGradientDto catalogTitleGradientDto = this.titleGradient;
        if (catalogTitleGradientDto == null) {
            return 0;
        }
        return catalogTitleGradientDto.hashCode();
    }

    public final String toString() {
        return "CatalogSectionHeaderStyleDto(titleGradient=" + this.titleGradient + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CatalogTitleGradientDto catalogTitleGradientDto = this.titleGradient;
        if (catalogTitleGradientDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogTitleGradientDto.writeToParcel(parcel, i);
        }
    }

    public CatalogSectionHeaderStyleDto(CatalogTitleGradientDto catalogTitleGradientDto) {
        this.titleGradient = catalogTitleGradientDto;
    }

    public /* synthetic */ CatalogSectionHeaderStyleDto(CatalogTitleGradientDto catalogTitleGradientDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : catalogTitleGradientDto);
    }
}
