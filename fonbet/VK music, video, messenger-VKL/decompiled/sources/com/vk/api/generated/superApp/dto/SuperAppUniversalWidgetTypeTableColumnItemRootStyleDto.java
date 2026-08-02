package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto> CREATOR = new a();

    @pmi0("align")
    private final SuperAppUniversalWidgetAlignDto align;

    @pmi0("image")
    private final SuperAppUniversalWidgetImageStyleDto image;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextStyleDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    /* compiled from: SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetImageStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetAlignDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto superAppUniversalWidgetTypeTableColumnItemRootStyleDto = (SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto) obj;
        return epx.f(this.image, superAppUniversalWidgetTypeTableColumnItemRootStyleDto.image) && epx.f(this.title, superAppUniversalWidgetTypeTableColumnItemRootStyleDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeTableColumnItemRootStyleDto.subtitle) && this.align == superAppUniversalWidgetTypeTableColumnItemRootStyleDto.align;
    }

    public final int hashCode() {
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.image;
        int hashCode = (superAppUniversalWidgetImageStyleDto == null ? 0 : superAppUniversalWidgetImageStyleDto.hashCode()) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.subtitle;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextStyleDto2 == null ? 0 : superAppUniversalWidgetTextStyleDto2.hashCode())) * 31;
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto = this.align;
        return hashCode3 + (superAppUniversalWidgetAlignDto != null ? superAppUniversalWidgetAlignDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto(image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ", align=" + this.align + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.image;
        if (superAppUniversalWidgetImageStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetImageStyleDto.writeToParcel(parcel, i);
        }
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
        SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto = this.align;
        if (superAppUniversalWidgetAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetAlignDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto(SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto) {
        this.image = superAppUniversalWidgetImageStyleDto;
        this.title = superAppUniversalWidgetTextStyleDto;
        this.subtitle = superAppUniversalWidgetTextStyleDto2;
        this.align = superAppUniversalWidgetAlignDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeTableColumnItemRootStyleDto(SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetAlignDto superAppUniversalWidgetAlignDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetImageStyleDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextStyleDto, (i & 4) != 0 ? null : superAppUniversalWidgetTextStyleDto2, (i & 8) != 0 ? null : superAppUniversalWidgetAlignDto);
    }
}
