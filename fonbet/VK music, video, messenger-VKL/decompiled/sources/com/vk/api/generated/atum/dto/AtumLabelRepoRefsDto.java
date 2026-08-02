package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumLabelRepoRefsDto.kt */
/* loaded from: classes14.dex */
public final class AtumLabelRepoRefsDto implements Parcelable {
    public static final Parcelable.Creator<AtumLabelRepoRefsDto> CREATOR = new a();

    @pmi0("font_weight")
    private final AtumRepositoryReferenceDto fontWeight;

    @pmi0("line_height")
    private final AtumRepositoryReferenceDto lineHeight;

    @pmi0("text")
    private final AtumRepositoryReferenceDto text;

    @pmi0("text_alignment")
    private final AtumRepositoryReferenceDto textAlignment;

    @pmi0("text_color")
    private final AtumRepositoryReferenceDto textColor;

    @pmi0("text_size")
    private final AtumRepositoryReferenceDto textSize;

    /* compiled from: AtumLabelRepoRefsDto.kt */
    public static final class a implements Parcelable.Creator<AtumLabelRepoRefsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumLabelRepoRefsDto createFromParcel(Parcel parcel) {
            return new AtumLabelRepoRefsDto(parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumRepositoryReferenceDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumLabelRepoRefsDto[] newArray(int i) {
            return new AtumLabelRepoRefsDto[i];
        }
    }

    public AtumLabelRepoRefsDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumLabelRepoRefsDto)) {
            return false;
        }
        AtumLabelRepoRefsDto atumLabelRepoRefsDto = (AtumLabelRepoRefsDto) obj;
        return epx.f(this.text, atumLabelRepoRefsDto.text) && epx.f(this.textSize, atumLabelRepoRefsDto.textSize) && epx.f(this.lineHeight, atumLabelRepoRefsDto.lineHeight) && epx.f(this.textColor, atumLabelRepoRefsDto.textColor) && epx.f(this.textAlignment, atumLabelRepoRefsDto.textAlignment) && epx.f(this.fontWeight, atumLabelRepoRefsDto.fontWeight);
    }

    public final int hashCode() {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.text;
        int hashCode = (atumRepositoryReferenceDto == null ? 0 : atumRepositoryReferenceDto.hashCode()) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.textSize;
        int hashCode2 = (hashCode + (atumRepositoryReferenceDto2 == null ? 0 : atumRepositoryReferenceDto2.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.lineHeight;
        int hashCode3 = (hashCode2 + (atumRepositoryReferenceDto3 == null ? 0 : atumRepositoryReferenceDto3.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto4 = this.textColor;
        int hashCode4 = (hashCode3 + (atumRepositoryReferenceDto4 == null ? 0 : atumRepositoryReferenceDto4.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto5 = this.textAlignment;
        int hashCode5 = (hashCode4 + (atumRepositoryReferenceDto5 == null ? 0 : atumRepositoryReferenceDto5.hashCode())) * 31;
        AtumRepositoryReferenceDto atumRepositoryReferenceDto6 = this.fontWeight;
        return hashCode5 + (atumRepositoryReferenceDto6 != null ? atumRepositoryReferenceDto6.hashCode() : 0);
    }

    public final String toString() {
        return "AtumLabelRepoRefsDto(text=" + this.text + ", textSize=" + this.textSize + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ", textAlignment=" + this.textAlignment + ", fontWeight=" + this.fontWeight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumRepositoryReferenceDto atumRepositoryReferenceDto = this.text;
        if (atumRepositoryReferenceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto2 = this.textSize;
        if (atumRepositoryReferenceDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto2.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto3 = this.lineHeight;
        if (atumRepositoryReferenceDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto3.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto4 = this.textColor;
        if (atumRepositoryReferenceDto4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto4.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto5 = this.textAlignment;
        if (atumRepositoryReferenceDto5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto5.writeToParcel(parcel, i);
        }
        AtumRepositoryReferenceDto atumRepositoryReferenceDto6 = this.fontWeight;
        if (atumRepositoryReferenceDto6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumRepositoryReferenceDto6.writeToParcel(parcel, i);
        }
    }

    public AtumLabelRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3, AtumRepositoryReferenceDto atumRepositoryReferenceDto4, AtumRepositoryReferenceDto atumRepositoryReferenceDto5, AtumRepositoryReferenceDto atumRepositoryReferenceDto6) {
        this.text = atumRepositoryReferenceDto;
        this.textSize = atumRepositoryReferenceDto2;
        this.lineHeight = atumRepositoryReferenceDto3;
        this.textColor = atumRepositoryReferenceDto4;
        this.textAlignment = atumRepositoryReferenceDto5;
        this.fontWeight = atumRepositoryReferenceDto6;
    }

    public /* synthetic */ AtumLabelRepoRefsDto(AtumRepositoryReferenceDto atumRepositoryReferenceDto, AtumRepositoryReferenceDto atumRepositoryReferenceDto2, AtumRepositoryReferenceDto atumRepositoryReferenceDto3, AtumRepositoryReferenceDto atumRepositoryReferenceDto4, AtumRepositoryReferenceDto atumRepositoryReferenceDto5, AtumRepositoryReferenceDto atumRepositoryReferenceDto6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumRepositoryReferenceDto, (i & 2) != 0 ? null : atumRepositoryReferenceDto2, (i & 4) != 0 ? null : atumRepositoryReferenceDto3, (i & 8) != 0 ? null : atumRepositoryReferenceDto4, (i & 16) != 0 ? null : atumRepositoryReferenceDto5, (i & 32) != 0 ? null : atumRepositoryReferenceDto6);
    }
}
