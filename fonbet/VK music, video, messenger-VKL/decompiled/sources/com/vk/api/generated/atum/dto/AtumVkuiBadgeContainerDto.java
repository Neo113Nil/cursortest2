package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiBadgeContainerDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiBadgeContainerDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiBadgeContainerDto> CREATOR = new a();

    @pmi0("bottom_right")
    private final AtumVkuiBadgeContainerBottomRightDto bottomRight;

    @pmi0("outline_top_badges_color")
    private final AtumVkuiColorNameDto outlineTopBadgesColor;

    @pmi0("top_left")
    private final AtumVkuiImageViewDto topLeft;

    @pmi0("top_right")
    private final AtumVkuiImageViewDto topRight;

    /* compiled from: AtumVkuiBadgeContainerDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiBadgeContainerDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiBadgeContainerDto createFromParcel(Parcel parcel) {
            return new AtumVkuiBadgeContainerDto((AtumVkuiBadgeContainerBottomRightDto) parcel.readParcelable(AtumVkuiBadgeContainerDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AtumVkuiImageViewDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiImageViewDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiBadgeContainerDto[] newArray(int i) {
            return new AtumVkuiBadgeContainerDto[i];
        }
    }

    public AtumVkuiBadgeContainerDto() {
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
        if (!(obj instanceof AtumVkuiBadgeContainerDto)) {
            return false;
        }
        AtumVkuiBadgeContainerDto atumVkuiBadgeContainerDto = (AtumVkuiBadgeContainerDto) obj;
        return epx.f(this.bottomRight, atumVkuiBadgeContainerDto.bottomRight) && epx.f(this.topLeft, atumVkuiBadgeContainerDto.topLeft) && epx.f(this.topRight, atumVkuiBadgeContainerDto.topRight) && this.outlineTopBadgesColor == atumVkuiBadgeContainerDto.outlineTopBadgesColor;
    }

    public final int hashCode() {
        AtumVkuiBadgeContainerBottomRightDto atumVkuiBadgeContainerBottomRightDto = this.bottomRight;
        int hashCode = (atumVkuiBadgeContainerBottomRightDto == null ? 0 : atumVkuiBadgeContainerBottomRightDto.hashCode()) * 31;
        AtumVkuiImageViewDto atumVkuiImageViewDto = this.topLeft;
        int hashCode2 = (hashCode + (atumVkuiImageViewDto == null ? 0 : atumVkuiImageViewDto.hashCode())) * 31;
        AtumVkuiImageViewDto atumVkuiImageViewDto2 = this.topRight;
        int hashCode3 = (hashCode2 + (atumVkuiImageViewDto2 == null ? 0 : atumVkuiImageViewDto2.hashCode())) * 31;
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineTopBadgesColor;
        return hashCode3 + (atumVkuiColorNameDto != null ? atumVkuiColorNameDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiBadgeContainerDto(bottomRight=" + this.bottomRight + ", topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", outlineTopBadgesColor=" + this.outlineTopBadgesColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.bottomRight, i);
        AtumVkuiImageViewDto atumVkuiImageViewDto = this.topLeft;
        if (atumVkuiImageViewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiImageViewDto.writeToParcel(parcel, i);
        }
        AtumVkuiImageViewDto atumVkuiImageViewDto2 = this.topRight;
        if (atumVkuiImageViewDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiImageViewDto2.writeToParcel(parcel, i);
        }
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineTopBadgesColor;
        if (atumVkuiColorNameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiColorNameDto.writeToParcel(parcel, i);
        }
    }

    public AtumVkuiBadgeContainerDto(AtumVkuiBadgeContainerBottomRightDto atumVkuiBadgeContainerBottomRightDto, AtumVkuiImageViewDto atumVkuiImageViewDto, AtumVkuiImageViewDto atumVkuiImageViewDto2, AtumVkuiColorNameDto atumVkuiColorNameDto) {
        this.bottomRight = atumVkuiBadgeContainerBottomRightDto;
        this.topLeft = atumVkuiImageViewDto;
        this.topRight = atumVkuiImageViewDto2;
        this.outlineTopBadgesColor = atumVkuiColorNameDto;
    }

    public /* synthetic */ AtumVkuiBadgeContainerDto(AtumVkuiBadgeContainerBottomRightDto atumVkuiBadgeContainerBottomRightDto, AtumVkuiImageViewDto atumVkuiImageViewDto, AtumVkuiImageViewDto atumVkuiImageViewDto2, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumVkuiBadgeContainerBottomRightDto, (i & 2) != 0 ? null : atumVkuiImageViewDto, (i & 4) != 0 ? null : atumVkuiImageViewDto2, (i & 8) != 0 ? null : atumVkuiColorNameDto);
    }
}
