package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumLabelPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumLabelPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumLabelPropsDto> CREATOR = new a();

    @pmi0("font_weight")
    private final AtumFontWeightDto fontWeight;

    @pmi0("line_break_mode")
    private final AtumLineBreakModeDto lineBreakMode;

    @pmi0("line_height")
    private final Float lineHeight;

    @pmi0("text")
    private final String text;

    @pmi0("text_alignment")
    private final AtumTextAlignmentDto textAlignment;

    @pmi0("text_color")
    private final AtumStyledColorDto textColor;

    @pmi0("text_size")
    private final Float textSize;

    /* compiled from: AtumLabelPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumLabelPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumLabelPropsDto createFromParcel(Parcel parcel) {
            return new AtumLabelPropsDto(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : AtumStyledColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumTextAlignmentDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumFontWeightDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumLineBreakModeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumLabelPropsDto[] newArray(int i) {
            return new AtumLabelPropsDto[i];
        }
    }

    public AtumLabelPropsDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumLabelPropsDto)) {
            return false;
        }
        AtumLabelPropsDto atumLabelPropsDto = (AtumLabelPropsDto) obj;
        return epx.f(this.text, atumLabelPropsDto.text) && epx.f(this.textSize, atumLabelPropsDto.textSize) && epx.f(this.lineHeight, atumLabelPropsDto.lineHeight) && epx.f(this.textColor, atumLabelPropsDto.textColor) && this.textAlignment == atumLabelPropsDto.textAlignment && this.fontWeight == atumLabelPropsDto.fontWeight && this.lineBreakMode == atumLabelPropsDto.lineBreakMode;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.textSize;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.lineHeight;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        AtumStyledColorDto atumStyledColorDto = this.textColor;
        int hashCode4 = (hashCode3 + (atumStyledColorDto == null ? 0 : atumStyledColorDto.hashCode())) * 31;
        AtumTextAlignmentDto atumTextAlignmentDto = this.textAlignment;
        int hashCode5 = (hashCode4 + (atumTextAlignmentDto == null ? 0 : atumTextAlignmentDto.hashCode())) * 31;
        AtumFontWeightDto atumFontWeightDto = this.fontWeight;
        int hashCode6 = (hashCode5 + (atumFontWeightDto == null ? 0 : atumFontWeightDto.hashCode())) * 31;
        AtumLineBreakModeDto atumLineBreakModeDto = this.lineBreakMode;
        return hashCode6 + (atumLineBreakModeDto != null ? atumLineBreakModeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumLabelPropsDto(text=" + this.text + ", textSize=" + this.textSize + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ", textAlignment=" + this.textAlignment + ", fontWeight=" + this.fontWeight + ", lineBreakMode=" + this.lineBreakMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Float f = this.textSize;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.lineHeight;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        AtumStyledColorDto atumStyledColorDto = this.textColor;
        if (atumStyledColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumStyledColorDto.writeToParcel(parcel, i);
        }
        AtumTextAlignmentDto atumTextAlignmentDto = this.textAlignment;
        if (atumTextAlignmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumTextAlignmentDto.writeToParcel(parcel, i);
        }
        AtumFontWeightDto atumFontWeightDto = this.fontWeight;
        if (atumFontWeightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumFontWeightDto.writeToParcel(parcel, i);
        }
        AtumLineBreakModeDto atumLineBreakModeDto = this.lineBreakMode;
        if (atumLineBreakModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumLineBreakModeDto.writeToParcel(parcel, i);
        }
    }

    public AtumLabelPropsDto(String str, Float f, Float f2, AtumStyledColorDto atumStyledColorDto, AtumTextAlignmentDto atumTextAlignmentDto, AtumFontWeightDto atumFontWeightDto, AtumLineBreakModeDto atumLineBreakModeDto) {
        this.text = str;
        this.textSize = f;
        this.lineHeight = f2;
        this.textColor = atumStyledColorDto;
        this.textAlignment = atumTextAlignmentDto;
        this.fontWeight = atumFontWeightDto;
        this.lineBreakMode = atumLineBreakModeDto;
    }

    public /* synthetic */ AtumLabelPropsDto(String str, Float f, Float f2, AtumStyledColorDto atumStyledColorDto, AtumTextAlignmentDto atumTextAlignmentDto, AtumFontWeightDto atumFontWeightDto, AtumLineBreakModeDto atumLineBreakModeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : atumStyledColorDto, (i & 16) != 0 ? null : atumTextAlignmentDto, (i & 32) != 0 ? null : atumFontWeightDto, (i & 64) != 0 ? null : atumLineBreakModeDto);
    }
}
