package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumAnyLayerTransformStateDto.kt */
/* loaded from: classes14.dex */
public final class AtumAnyLayerTransformStateDto implements Parcelable {
    public static final Parcelable.Creator<AtumAnyLayerTransformStateDto> CREATOR = new a();

    @pmi0("repo_refs")
    private final AtumAnyLayerTransformRepoRefsDto repoRefs;

    @pmi0("transform")
    private final AtumAnyLayerTransformPropsDto transform;

    /* compiled from: AtumAnyLayerTransformStateDto.kt */
    public static final class a implements Parcelable.Creator<AtumAnyLayerTransformStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerTransformStateDto createFromParcel(Parcel parcel) {
            return new AtumAnyLayerTransformStateDto(AtumAnyLayerTransformPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerTransformRepoRefsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerTransformStateDto[] newArray(int i) {
            return new AtumAnyLayerTransformStateDto[i];
        }
    }

    public AtumAnyLayerTransformStateDto(AtumAnyLayerTransformPropsDto atumAnyLayerTransformPropsDto, AtumAnyLayerTransformRepoRefsDto atumAnyLayerTransformRepoRefsDto) {
        this.transform = atumAnyLayerTransformPropsDto;
        this.repoRefs = atumAnyLayerTransformRepoRefsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumAnyLayerTransformStateDto)) {
            return false;
        }
        AtumAnyLayerTransformStateDto atumAnyLayerTransformStateDto = (AtumAnyLayerTransformStateDto) obj;
        return epx.f(this.transform, atumAnyLayerTransformStateDto.transform) && epx.f(this.repoRefs, atumAnyLayerTransformStateDto.repoRefs);
    }

    public final int hashCode() {
        int hashCode = this.transform.hashCode() * 31;
        AtumAnyLayerTransformRepoRefsDto atumAnyLayerTransformRepoRefsDto = this.repoRefs;
        return hashCode + (atumAnyLayerTransformRepoRefsDto == null ? 0 : atumAnyLayerTransformRepoRefsDto.hashCode());
    }

    public final String toString() {
        return "AtumAnyLayerTransformStateDto(transform=" + this.transform + ", repoRefs=" + this.repoRefs + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.transform.writeToParcel(parcel, i);
        AtumAnyLayerTransformRepoRefsDto atumAnyLayerTransformRepoRefsDto = this.repoRefs;
        if (atumAnyLayerTransformRepoRefsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumAnyLayerTransformRepoRefsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumAnyLayerTransformStateDto(AtumAnyLayerTransformPropsDto atumAnyLayerTransformPropsDto, AtumAnyLayerTransformRepoRefsDto atumAnyLayerTransformRepoRefsDto, int i, zcl zclVar) {
        this(atumAnyLayerTransformPropsDto, (i & 2) != 0 ? null : atumAnyLayerTransformRepoRefsDto);
    }
}
