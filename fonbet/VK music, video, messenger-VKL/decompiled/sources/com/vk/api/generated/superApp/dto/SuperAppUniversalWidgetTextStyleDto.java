package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTextStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTextStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTextStyleDto> CREATOR = new a();

    @pmi0("color")
    private final SuperAppUniversalWidgetColorDto color;

    @pmi0("weight")
    private final SuperAppUniversalWidgetWeightDto weight;

    /* compiled from: SuperAppUniversalWidgetTextStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTextStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTextStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTextStyleDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetWeightDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTextStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTextStyleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetTextStyleDto() {
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
        if (!(obj instanceof SuperAppUniversalWidgetTextStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = (SuperAppUniversalWidgetTextStyleDto) obj;
        return this.color == superAppUniversalWidgetTextStyleDto.color && this.weight == superAppUniversalWidgetTextStyleDto.weight;
    }

    public final int hashCode() {
        SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto = this.color;
        int hashCode = (superAppUniversalWidgetColorDto == null ? 0 : superAppUniversalWidgetColorDto.hashCode()) * 31;
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto = this.weight;
        return hashCode + (superAppUniversalWidgetWeightDto != null ? superAppUniversalWidgetWeightDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTextStyleDto(color=" + this.color + ", weight=" + this.weight + ')';
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
        SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto = this.weight;
        if (superAppUniversalWidgetWeightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetWeightDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTextStyleDto(SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto, SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto) {
        this.color = superAppUniversalWidgetColorDto;
        this.weight = superAppUniversalWidgetWeightDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTextStyleDto(SuperAppUniversalWidgetColorDto superAppUniversalWidgetColorDto, SuperAppUniversalWidgetWeightDto superAppUniversalWidgetWeightDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetColorDto, (i & 2) != 0 ? null : superAppUniversalWidgetWeightDto);
    }
}
