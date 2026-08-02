package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreStylesStyleBaseTextDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseTextDto implements Parcelable {
    public static final Parcelable.Creator<ExploreStylesStyleBaseTextDto> CREATOR = new a();

    @pmi0("color")
    private final ExploreStylesStyleBaseColorDto color;

    @pmi0("weight")
    private final ExploreStylesStyleBaseWeightDto weight;

    /* compiled from: ExploreStylesStyleBaseTextDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseTextDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseTextDto createFromParcel(Parcel parcel) {
            return new ExploreStylesStyleBaseTextDto(parcel.readInt() == 0 ? null : ExploreStylesStyleBaseColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExploreStylesStyleBaseWeightDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseTextDto[] newArray(int i) {
            return new ExploreStylesStyleBaseTextDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreStylesStyleBaseTextDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final ExploreStylesStyleBaseColorDto d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreStylesStyleBaseTextDto)) {
            return false;
        }
        ExploreStylesStyleBaseTextDto exploreStylesStyleBaseTextDto = (ExploreStylesStyleBaseTextDto) obj;
        return this.color == exploreStylesStyleBaseTextDto.color && this.weight == exploreStylesStyleBaseTextDto.weight;
    }

    public final int hashCode() {
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto = this.color;
        int hashCode = (exploreStylesStyleBaseColorDto == null ? 0 : exploreStylesStyleBaseColorDto.hashCode()) * 31;
        ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto = this.weight;
        return hashCode + (exploreStylesStyleBaseWeightDto != null ? exploreStylesStyleBaseWeightDto.hashCode() : 0);
    }

    public final String toString() {
        return "ExploreStylesStyleBaseTextDto(color=" + this.color + ", weight=" + this.weight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto = this.color;
        if (exploreStylesStyleBaseColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseColorDto.writeToParcel(parcel, i);
        }
        ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto = this.weight;
        if (exploreStylesStyleBaseWeightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseWeightDto.writeToParcel(parcel, i);
        }
    }

    public ExploreStylesStyleBaseTextDto(ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto, ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto) {
        this.color = exploreStylesStyleBaseColorDto;
        this.weight = exploreStylesStyleBaseWeightDto;
    }

    public /* synthetic */ ExploreStylesStyleBaseTextDto(ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto, ExploreStylesStyleBaseWeightDto exploreStylesStyleBaseWeightDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : exploreStylesStyleBaseColorDto, (i & 2) != 0 ? null : exploreStylesStyleBaseWeightDto);
    }
}
