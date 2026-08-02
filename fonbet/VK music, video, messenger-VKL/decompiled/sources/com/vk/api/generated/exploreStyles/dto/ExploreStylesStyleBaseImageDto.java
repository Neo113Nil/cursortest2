package com.vk.api.generated.exploreStyles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreStylesStyleBaseImageDto.kt */
/* loaded from: classes14.dex */
public final class ExploreStylesStyleBaseImageDto implements Parcelable {
    public static final Parcelable.Creator<ExploreStylesStyleBaseImageDto> CREATOR = new a();

    @pmi0("type")
    private final ExploreStylesStyleBaseImageTypeDto type;

    @pmi0("vertical_align")
    private final ExploreStylesStyleBaseVerticalAlignDto verticalAlign;

    /* compiled from: ExploreStylesStyleBaseImageDto.kt */
    public static final class a implements Parcelable.Creator<ExploreStylesStyleBaseImageDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseImageDto createFromParcel(Parcel parcel) {
            return new ExploreStylesStyleBaseImageDto(ExploreStylesStyleBaseImageTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExploreStylesStyleBaseVerticalAlignDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreStylesStyleBaseImageDto[] newArray(int i) {
            return new ExploreStylesStyleBaseImageDto[i];
        }
    }

    public ExploreStylesStyleBaseImageDto(ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto, ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto) {
        this.type = exploreStylesStyleBaseImageTypeDto;
        this.verticalAlign = exploreStylesStyleBaseVerticalAlignDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreStylesStyleBaseImageDto)) {
            return false;
        }
        ExploreStylesStyleBaseImageDto exploreStylesStyleBaseImageDto = (ExploreStylesStyleBaseImageDto) obj;
        return this.type == exploreStylesStyleBaseImageDto.type && this.verticalAlign == exploreStylesStyleBaseImageDto.verticalAlign;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto = this.verticalAlign;
        return hashCode + (exploreStylesStyleBaseVerticalAlignDto == null ? 0 : exploreStylesStyleBaseVerticalAlignDto.hashCode());
    }

    public final String toString() {
        return "ExploreStylesStyleBaseImageDto(type=" + this.type + ", verticalAlign=" + this.verticalAlign + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto = this.verticalAlign;
        if (exploreStylesStyleBaseVerticalAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseVerticalAlignDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreStylesStyleBaseImageDto(ExploreStylesStyleBaseImageTypeDto exploreStylesStyleBaseImageTypeDto, ExploreStylesStyleBaseVerticalAlignDto exploreStylesStyleBaseVerticalAlignDto, int i, zcl zclVar) {
        this(exploreStylesStyleBaseImageTypeDto, (i & 2) != 0 ? null : exploreStylesStyleBaseVerticalAlignDto);
    }
}
