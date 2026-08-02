package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumAnyLayerTransformRepoRefsDto.kt */
/* loaded from: classes14.dex */
public final class AtumAnyLayerTransformRepoRefsDto implements Parcelable {
    public static final Parcelable.Creator<AtumAnyLayerTransformRepoRefsDto> CREATOR = new a();

    @pmi0("anchor_point")
    private final AtumRepositoryReferenceDto anchorPoint;

    @pmi0("rotate")
    private final AtumRepositoryReferenceDto rotate;

    @pmi0("scale")
    private final AtumRepositoryReferenceDto scale;

    /* compiled from: AtumAnyLayerTransformRepoRefsDto.kt */
    public static final class a implements Parcelable.Creator<AtumAnyLayerTransformRepoRefsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerTransformRepoRefsDto createFromParcel(Parcel parcel) {
            return new AtumAnyLayerTransformRepoRefsDto(parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerTransformRepoRefsDto[] newArray(int i) {
            return new AtumAnyLayerTransformRepoRefsDto[i];
        }
    }

    public AtumAnyLayerTransformRepoRefsDto() {
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
        if (!(obj instanceof AtumAnyLayerTransformRepoRefsDto)) {
            return false;
        }
        AtumAnyLayerTransformRepoRefsDto atumAnyLayerTransformRepoRefsDto = (AtumAnyLayerTransformRepoRefsDto) obj;
        return epx.f(this.rotate, atumAnyLayerTransformRepoRefsDto.rotate) && epx.f(this.scale, atumAnyLayerTransformRepoRefsDto.scale) && epx.f(this.anchorPoint, atumAnyLayerTransformRepoRefsDto.anchorPoint);
    }

    public final int hashCode() {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.rotate;
        int hashCode = (atumRepositoryReferenceDto == null ? 0 : atumRepositoryReferenceDto.hashCode()) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.scale;
        int hashCode2 = (hashCode + (atumRepositoryReferenceDto2 == null ? 0 : atumRepositoryReferenceDto2.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.anchorPoint;
        return hashCode2 + (atumRepositoryReferenceDto3 != null ? atumRepositoryReferenceDto3.hashCode() : 0);
    }

    public final String toString() {
        return "AtumAnyLayerTransformRepoRefsDto(rotate=" + this.rotate + ", scale=" + this.scale + ", anchorPoint=" + this.anchorPoint + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.rotate;
        if (atumRepositoryReferenceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.scale;
        if (atumRepositoryReferenceDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto2.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.anchorPoint;
        if (atumRepositoryReferenceDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto3.writeToParcel(parcel, i);
        }
    }

    public AtumAnyLayerTransformRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3) {
        this.rotate = atumRepositoryReferenceDto;
        this.scale = atumRepositoryReferenceDto2;
        this.anchorPoint = atumRepositoryReferenceDto3;
    }

    public /* synthetic */ AtumAnyLayerTransformRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumRepositoryReferenceDto, (i & 2) != 0 ? null : atumRepositoryReferenceDto2, (i & 4) != 0 ? null : atumRepositoryReferenceDto3);
    }
}
