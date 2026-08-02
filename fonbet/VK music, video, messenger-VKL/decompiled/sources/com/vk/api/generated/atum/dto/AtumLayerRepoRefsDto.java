package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumLayerRepoRefsDto.kt */
/* loaded from: classes14.dex */
public final class AtumLayerRepoRefsDto implements Parcelable {
    public static final Parcelable.Creator<AtumLayerRepoRefsDto> CREATOR = new a();

    @pmi0("background_color")
    private final AtumRepositoryReferenceDto backgroundColor;

    @pmi0("border_color")
    private final AtumRepositoryReferenceDto borderColor;

    @pmi0("border_width")
    private final AtumRepositoryReferenceDto borderWidth;

    @pmi0("clips_to_bounds")
    private final AtumRepositoryReferenceDto clipsToBounds;

    @pmi0("corner_radius")
    private final AtumRepositoryReferenceDto cornerRadius;

    /* compiled from: AtumLayerRepoRefsDto.kt */
    public static final class a implements Parcelable.Creator<AtumLayerRepoRefsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumLayerRepoRefsDto createFromParcel(Parcel parcel) {
            return new AtumLayerRepoRefsDto(parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumLayerRepoRefsDto[] newArray(int i) {
            return new AtumLayerRepoRefsDto[i];
        }
    }

    public AtumLayerRepoRefsDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumLayerRepoRefsDto)) {
            return false;
        }
        AtumLayerRepoRefsDto atumLayerRepoRefsDto = (AtumLayerRepoRefsDto) obj;
        return epx.f(this.backgroundColor, atumLayerRepoRefsDto.backgroundColor) && epx.f(this.cornerRadius, atumLayerRepoRefsDto.cornerRadius) && epx.f(this.borderWidth, atumLayerRepoRefsDto.borderWidth) && epx.f(this.borderColor, atumLayerRepoRefsDto.borderColor) && epx.f(this.clipsToBounds, atumLayerRepoRefsDto.clipsToBounds);
    }

    public final int hashCode() {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.backgroundColor;
        int hashCode = (atumRepositoryReferenceDto == null ? 0 : atumRepositoryReferenceDto.hashCode()) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.cornerRadius;
        int hashCode2 = (hashCode + (atumRepositoryReferenceDto2 == null ? 0 : atumRepositoryReferenceDto2.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.borderWidth;
        int hashCode3 = (hashCode2 + (atumRepositoryReferenceDto3 == null ? 0 : atumRepositoryReferenceDto3.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto4 = this.borderColor;
        int hashCode4 = (hashCode3 + (atumRepositoryReferenceDto4 == null ? 0 : atumRepositoryReferenceDto4.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto5 = this.clipsToBounds;
        return hashCode4 + (atumRepositoryReferenceDto5 != null ? atumRepositoryReferenceDto5.hashCode() : 0);
    }

    public final String toString() {
        return "AtumLayerRepoRefsDto(backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ", borderWidth=" + this.borderWidth + ", borderColor=" + this.borderColor + ", clipsToBounds=" + this.clipsToBounds + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.backgroundColor;
        if (atumRepositoryReferenceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.cornerRadius;
        if (atumRepositoryReferenceDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto2.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.borderWidth;
        if (atumRepositoryReferenceDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto3.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto4 = this.borderColor;
        if (atumRepositoryReferenceDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto4.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto5 = this.clipsToBounds;
        if (atumRepositoryReferenceDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto5.writeToParcel(parcel, i);
        }
    }

    public AtumLayerRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3, AtumRepositoryReferenceDto atumRepositoryReferenceDto4, AtumRepositoryReferenceDto atumRepositoryReferenceDto5) {
        this.backgroundColor = atumRepositoryReferenceDto;
        this.cornerRadius = atumRepositoryReferenceDto2;
        this.borderWidth = atumRepositoryReferenceDto3;
        this.borderColor = atumRepositoryReferenceDto4;
        this.clipsToBounds = atumRepositoryReferenceDto5;
    }

    public /* synthetic */ AtumLayerRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3, AtumRepositoryReferenceDto atumRepositoryReferenceDto4, AtumRepositoryReferenceDto atumRepositoryReferenceDto5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumRepositoryReferenceDto, (i & 2) != 0 ? null : atumRepositoryReferenceDto2, (i & 4) != 0 ? null : atumRepositoryReferenceDto3, (i & 8) != 0 ? null : atumRepositoryReferenceDto4, (i & 16) != 0 ? null : atumRepositoryReferenceDto5);
    }
}
