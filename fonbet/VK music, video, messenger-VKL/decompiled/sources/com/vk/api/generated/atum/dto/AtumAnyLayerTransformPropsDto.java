package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumAnyLayerTransformPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumAnyLayerTransformPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumAnyLayerTransformPropsDto> CREATOR = new a();

    @pmi0("anchor_point")
    private final AtumUiPointDto anchorPoint;

    @pmi0("rotate")
    private final AtumTransformRotateDto rotate;

    @pmi0("scale")
    private final AtumTransformPointDto scale;

    /* compiled from: AtumAnyLayerTransformPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumAnyLayerTransformPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerTransformPropsDto createFromParcel(Parcel parcel) {
            return new AtumAnyLayerTransformPropsDto(parcel.readInt() == 0 ? null : AtumTransformRotateDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumTransformPointDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumUiPointDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerTransformPropsDto[] newArray(int i) {
            return new AtumAnyLayerTransformPropsDto[i];
        }
    }

    public AtumAnyLayerTransformPropsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumAnyLayerTransformPropsDto)) {
            return false;
        }
        AtumAnyLayerTransformPropsDto atumAnyLayerTransformPropsDto = (AtumAnyLayerTransformPropsDto) obj;
        return epx.f(this.rotate, atumAnyLayerTransformPropsDto.rotate) && epx.f(this.scale, atumAnyLayerTransformPropsDto.scale) && epx.f(this.anchorPoint, atumAnyLayerTransformPropsDto.anchorPoint);
    }

    public final int hashCode() {
        AtumTransformRotateDto atumTransformRotateDto = this.rotate;
        int hashCode = (atumTransformRotateDto == null ? 0 : atumTransformRotateDto.hashCode()) * 31;
        AtumTransformPointDto atumTransformPointDto = this.scale;
        int hashCode2 = (hashCode + (atumTransformPointDto == null ? 0 : atumTransformPointDto.hashCode())) * 31;
        AtumUiPointDto atumUiPointDto = this.anchorPoint;
        return hashCode2 + (atumUiPointDto != null ? atumUiPointDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumAnyLayerTransformPropsDto(rotate=" + this.rotate + ", scale=" + this.scale + ", anchorPoint=" + this.anchorPoint + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumTransformRotateDto atumTransformRotateDto = this.rotate;
        if (atumTransformRotateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumTransformRotateDto.writeToParcel(parcel, i);
        }
        AtumTransformPointDto atumTransformPointDto = this.scale;
        if (atumTransformPointDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumTransformPointDto.writeToParcel(parcel, i);
        }
        AtumUiPointDto atumUiPointDto = this.anchorPoint;
        if (atumUiPointDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumUiPointDto.writeToParcel(parcel, i);
        }
    }

    public AtumAnyLayerTransformPropsDto(AtumTransformRotateDto atumTransformRotateDto, AtumTransformPointDto atumTransformPointDto, AtumUiPointDto atumUiPointDto) {
        this.rotate = atumTransformRotateDto;
        this.scale = atumTransformPointDto;
        this.anchorPoint = atumUiPointDto;
    }

    public /* synthetic */ AtumAnyLayerTransformPropsDto(AtumTransformRotateDto atumTransformRotateDto, AtumTransformPointDto atumTransformPointDto, AtumUiPointDto atumUiPointDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumTransformRotateDto, (i & 2) != 0 ? null : atumTransformPointDto, (i & 4) != 0 ? null : atumUiPointDto);
    }
}
