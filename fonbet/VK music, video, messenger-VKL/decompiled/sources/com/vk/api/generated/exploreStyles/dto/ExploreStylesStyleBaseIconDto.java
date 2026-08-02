package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreStylesStyleBaseIconDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseIconDto implements Parcelable {
    public static final Parcelable.Creator<ExploreStylesStyleBaseIconDto> CREATOR = new a();

    @pmi0("color")
    private final ExploreStylesStyleBaseColorDto color;

    @pmi0("vertical_align")
    private final ExploreStylesStyleBaseVerticalAlignDto verticalAlign;

    /* compiled from: ExploreStylesStyleBaseIconDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseIconDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseIconDto createFromParcel(Parcel parcel) {
            return new ExploreStylesStyleBaseIconDto(parcel.readInt() == 0 ? null : ExploreStylesStyleBaseColorDto.CREATOR.createFromParcel(parcel), (ExploreStylesStyleBaseVerticalAlignDto) parcel.readParcelable(ExploreStylesStyleBaseIconDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseIconDto[] newArray(int i) {
            return new ExploreStylesStyleBaseIconDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreStylesStyleBaseIconDto() {
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
        if (!(obj instanceof ExploreStylesStyleBaseIconDto)) {
            return false;
        }
        ExploreStylesStyleBaseIconDto exploreStylesStyleBaseIconDto = (ExploreStylesStyleBaseIconDto) obj;
        return this.color == exploreStylesStyleBaseIconDto.color && this.verticalAlign == exploreStylesStyleBaseIconDto.verticalAlign;
    }

    public final int hashCode() {
        ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto = this.color;
        int hashCode = (exploreStylesStyleBaseColorDto == null ? 0 : exploreStylesStyleBaseColorDto.hashCode()) * 31;
        ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto = this.verticalAlign;
        return hashCode + (exploreStylesStyleBaseVerticalAlignDto != null ? exploreStylesStyleBaseVerticalAlignDto.hashCode() : 0);
    }

    public final String toString() {
        return "ExploreStylesStyleBaseIconDto(color=" + this.color + ", verticalAlign=" + this.verticalAlign + ')';
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
        parcel.writeParcelable(this.verticalAlign, i);
    }

    public ExploreStylesStyleBaseIconDto(ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto, ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto) {
        this.color = exploreStylesStyleBaseColorDto;
        this.verticalAlign = exploreStylesStyleBaseVerticalAlignDto;
    }

    public /* synthetic */ ExploreStylesStyleBaseIconDto(ExploreStylesStyleBaseColorDto exploreStylesStyleBaseColorDto, ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : exploreStylesStyleBaseColorDto, (i & 2) != 0 ? null : exploreStylesStyleBaseVerticalAlignDto);
    }
}
