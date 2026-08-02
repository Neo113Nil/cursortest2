package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeCardRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeCardRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeCardRootStyleDto> CREATOR = new a();

    @pmi0("image_padding")
    private final boolean imagePadding;

    @pmi0("second_subtitle")
    private final SuperAppUniversalWidgetTextStyleDto secondSubtitle;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextStyleDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    /* compiled from: SuperAppUniversalWidgetTypeCardRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeCardRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeCardRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeCardRootStyleDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeCardRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeCardRootStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeCardRootStyleDto(boolean z, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3) {
        this.imagePadding = z;
        this.title = superAppUniversalWidgetTextStyleDto;
        this.subtitle = superAppUniversalWidgetTextStyleDto2;
        this.secondSubtitle = superAppUniversalWidgetTextStyleDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeCardRootStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeCardRootStyleDto superAppUniversalWidgetTypeCardRootStyleDto = (SuperAppUniversalWidgetTypeCardRootStyleDto) obj;
        return this.imagePadding == superAppUniversalWidgetTypeCardRootStyleDto.imagePadding && epx.f(this.title, superAppUniversalWidgetTypeCardRootStyleDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeCardRootStyleDto.subtitle) && epx.f(this.secondSubtitle, superAppUniversalWidgetTypeCardRootStyleDto.secondSubtitle);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.imagePadding) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.subtitle;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextStyleDto2 == null ? 0 : superAppUniversalWidgetTextStyleDto2.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3 = this.secondSubtitle;
        return hashCode3 + (superAppUniversalWidgetTextStyleDto3 != null ? superAppUniversalWidgetTextStyleDto3.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeCardRootStyleDto(imagePadding=" + this.imagePadding + ", title=" + this.title + ", subtitle=" + this.subtitle + ", secondSubtitle=" + this.secondSubtitle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.imagePadding ? 1 : 0);
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        if (superAppUniversalWidgetTextStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.subtitle;
        if (superAppUniversalWidgetTextStyleDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto2.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3 = this.secondSubtitle;
        if (superAppUniversalWidgetTextStyleDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto3.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeCardRootStyleDto(boolean z, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : superAppUniversalWidgetTextStyleDto, (i & 4) != 0 ? null : superAppUniversalWidgetTextStyleDto2, (i & 8) != 0 ? null : superAppUniversalWidgetTextStyleDto3);
    }
}
