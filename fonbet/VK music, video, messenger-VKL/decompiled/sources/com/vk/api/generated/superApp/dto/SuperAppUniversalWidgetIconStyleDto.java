package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetIconStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetIconStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetIconStyleDto> CREATOR = new a();

    @pmi0("color")
    private final SuperAppUniversalWidgetColorDto color;

    @pmi0("vertical_align")
    private final SuperAppUniversalWidgetVerticalAlignDto verticalAlign;

    /* compiled from: SuperAppUniversalWidgetIconStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetIconStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetIconStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetIconStyleDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetVerticalAlignDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetIconStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetIconStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetIconStyleDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetIconStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = (SuperAppUniversalWidgetIconStyleDto) obj;
        return this.color == superAppUniversalWidgetIconStyleDto.color && this.verticalAlign == superAppUniversalWidgetIconStyleDto.verticalAlign;
    }

    public final int hashCode() {
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto = this.color;
        int hashCode = (superAppUniversalWidgetColorDto == null ? 0 : superAppUniversalWidgetColorDto.hashCode()) * 31;
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = this.verticalAlign;
        return hashCode + (superAppUniversalWidgetVerticalAlignDto != null ? superAppUniversalWidgetVerticalAlignDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetIconStyleDto(color=" + this.color + ", verticalAlign=" + this.verticalAlign + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto = this.color;
        if (superAppUniversalWidgetColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetColorDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = this.verticalAlign;
        if (superAppUniversalWidgetVerticalAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetVerticalAlignDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetIconStyleDto(SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto, SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto) {
        this.color = superAppUniversalWidgetColorDto;
        this.verticalAlign = superAppUniversalWidgetVerticalAlignDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetIconStyleDto(SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto, SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetColorDto, (i & 2) != 0 ? null : superAppUniversalWidgetVerticalAlignDto);
    }
}
