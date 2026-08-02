package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AtumLayerPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumLayerPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumLayerPropsDto> CREATOR = new a();

    @pmi0("background_color")
    private final AtumStyledColorDto backgroundColor;

    @pmi0("border_color")
    private final AtumStyledColorDto borderColor;

    @pmi0("border_width")
    private final Float borderWidth;

    @pmi0("clips_to_bounds")
    private final Boolean clipsToBounds;

    @pmi0("corner_radius")
    private final Float cornerRadius;

    /* compiled from: AtumLayerPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumLayerPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumLayerPropsDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            AtumStyledColorDto createFromParcel = parcel.readInt() == 0 ? null : AtumStyledColorDto.CREATOR.createFromParcel(parcel);
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            AtumStyledColorDto createFromParcel2 = parcel.readInt() == 0 ? null : AtumStyledColorDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtumLayerPropsDto(createFromParcel, valueOf, valueOf2, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumLayerPropsDto[] newArray(int i) {
            return new AtumLayerPropsDto[i];
        }
    }

    public AtumLayerPropsDto() {
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
        if (!(obj instanceof AtumLayerPropsDto)) {
            return false;
        }
        AtumLayerPropsDto atumLayerPropsDto = (AtumLayerPropsDto) obj;
        return epx.f(this.backgroundColor, atumLayerPropsDto.backgroundColor) && epx.f(this.cornerRadius, atumLayerPropsDto.cornerRadius) && epx.f(this.borderWidth, atumLayerPropsDto.borderWidth) && epx.f(this.borderColor, atumLayerPropsDto.borderColor) && epx.f(this.clipsToBounds, atumLayerPropsDto.clipsToBounds);
    }

    public final int hashCode() {
        AtumStyledColorDto atumStyledColorDto = this.backgroundColor;
        int hashCode = (atumStyledColorDto == null ? 0 : atumStyledColorDto.hashCode()) * 31;
        Float f = this.cornerRadius;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.borderWidth;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        AtumStyledColorDto atumStyledColorDto2 = this.borderColor;
        int hashCode4 = (hashCode3 + (atumStyledColorDto2 == null ? 0 : atumStyledColorDto2.hashCode())) * 31;
        Boolean bool = this.clipsToBounds;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumLayerPropsDto(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", cornerRadius=");
        sb.append(this.cornerRadius);
        sb.append(", borderWidth=");
        sb.append(this.borderWidth);
        sb.append(", borderColor=");
        sb.append(this.borderColor);
        sb.append(", clipsToBounds=");
        return tn.a(sb, this.clipsToBounds, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumStyledColorDto atumStyledColorDto = this.backgroundColor;
        if (atumStyledColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumStyledColorDto.writeToParcel(parcel, i);
        }
        Float f = this.cornerRadius;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.borderWidth;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        AtumStyledColorDto atumStyledColorDto2 = this.borderColor;
        if (atumStyledColorDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumStyledColorDto2.writeToParcel(parcel, i);
        }
        Boolean bool = this.clipsToBounds;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AtumLayerPropsDto(AtumStyledColorDto atumStyledColorDto, Float f, Float f2, AtumStyledColorDto atumStyledColorDto2, Boolean bool) {
        this.backgroundColor = atumStyledColorDto;
        this.cornerRadius = f;
        this.borderWidth = f2;
        this.borderColor = atumStyledColorDto2;
        this.clipsToBounds = bool;
    }

    public /* synthetic */ AtumLayerPropsDto(AtumStyledColorDto atumStyledColorDto, Float f, Float f2, AtumStyledColorDto atumStyledColorDto2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumStyledColorDto, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : atumStyledColorDto2, (i & 16) != 0 ? null : bool);
    }
}
