package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AtumVkuiLabelPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiLabelPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiLabelPropsDto> CREATOR = new a();

    @pmi0("font_weight")
    private final AtumVkuiFontWeightDto fontWeight;

    @pmi0("is_user_interaction_enabled")
    private final Boolean isUserInteractionEnabled;

    @pmi0("line_break_mode")
    private final AtumVkuiLineBreakModeDto lineBreakMode;

    @pmi0("line_height")
    private final Float lineHeight;

    @pmi0("number_of_lines")
    private final Integer numberOfLines;

    @pmi0("text")
    private final String text;

    @pmi0("text_alignment")
    private final AtumVkuiTextAlignmentDto textAlignment;

    @pmi0("text_color")
    private final AtumStyledColorDto textColor;

    @pmi0("text_size")
    private final Float textSize;

    /* compiled from: AtumVkuiLabelPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiLabelPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiLabelPropsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            AtumVkuiLineBreakModeDto createFromParcel = parcel.readInt() == 0 ? null : AtumVkuiLineBreakModeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtumVkuiLabelPropsDto(readString, createFromParcel, valueOf2, valueOf, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : AtumStyledColorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiTextAlignmentDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiFontWeightDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiLabelPropsDto[] newArray(int i) {
            return new AtumVkuiLabelPropsDto[i];
        }
    }

    public AtumVkuiLabelPropsDto(String str, AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto, Integer num, Boolean bool, Float f, Float f2, AtumStyledColorDto atumStyledColorDto, AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto, AtumVkuiFontWeightDto atumVkuiFontWeightDto) {
        this.text = str;
        this.lineBreakMode = atumVkuiLineBreakModeDto;
        this.numberOfLines = num;
        this.isUserInteractionEnabled = bool;
        this.textSize = f;
        this.lineHeight = f2;
        this.textColor = atumStyledColorDto;
        this.textAlignment = atumVkuiTextAlignmentDto;
        this.fontWeight = atumVkuiFontWeightDto;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiLabelPropsDto)) {
            return false;
        }
        AtumVkuiLabelPropsDto atumVkuiLabelPropsDto = (AtumVkuiLabelPropsDto) obj;
        return epx.f(this.text, atumVkuiLabelPropsDto.text) && this.lineBreakMode == atumVkuiLabelPropsDto.lineBreakMode && epx.f(this.numberOfLines, atumVkuiLabelPropsDto.numberOfLines) && epx.f(this.isUserInteractionEnabled, atumVkuiLabelPropsDto.isUserInteractionEnabled) && epx.f(this.textSize, atumVkuiLabelPropsDto.textSize) && epx.f(this.lineHeight, atumVkuiLabelPropsDto.lineHeight) && epx.f(this.textColor, atumVkuiLabelPropsDto.textColor) && this.textAlignment == atumVkuiLabelPropsDto.textAlignment && this.fontWeight == atumVkuiLabelPropsDto.fontWeight;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto = this.lineBreakMode;
        int hashCode2 = (hashCode + (atumVkuiLineBreakModeDto == null ? 0 : atumVkuiLineBreakModeDto.hashCode())) * 31;
        Integer num = this.numberOfLines;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isUserInteractionEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.textSize;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.lineHeight;
        int hashCode6 = (hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        AtumStyledColorDto atumStyledColorDto = this.textColor;
        int hashCode7 = (hashCode6 + (atumStyledColorDto == null ? 0 : atumStyledColorDto.hashCode())) * 31;
        AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto = this.textAlignment;
        int hashCode8 = (hashCode7 + (atumVkuiTextAlignmentDto == null ? 0 : atumVkuiTextAlignmentDto.hashCode())) * 31;
        AtumVkuiFontWeightDto atumVkuiFontWeightDto = this.fontWeight;
        return hashCode8 + (atumVkuiFontWeightDto != null ? atumVkuiFontWeightDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiLabelPropsDto(text=" + this.text + ", lineBreakMode=" + this.lineBreakMode + ", numberOfLines=" + this.numberOfLines + ", isUserInteractionEnabled=" + this.isUserInteractionEnabled + ", textSize=" + this.textSize + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ", textAlignment=" + this.textAlignment + ", fontWeight=" + this.fontWeight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto = this.lineBreakMode;
        if (atumVkuiLineBreakModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiLineBreakModeDto.writeToParcel(parcel, i);
        }
        Integer num = this.numberOfLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isUserInteractionEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
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
        AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto = this.textAlignment;
        if (atumVkuiTextAlignmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiTextAlignmentDto.writeToParcel(parcel, i);
        }
        AtumVkuiFontWeightDto atumVkuiFontWeightDto = this.fontWeight;
        if (atumVkuiFontWeightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiFontWeightDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiLabelPropsDto(String str, AtumVkuiLineBreakModeDto atumVkuiLineBreakModeDto, Integer num, Boolean bool, Float f, Float f2, AtumStyledColorDto atumStyledColorDto, AtumVkuiTextAlignmentDto atumVkuiTextAlignmentDto, AtumVkuiFontWeightDto atumVkuiFontWeightDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : atumVkuiLineBreakModeDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : f2, (i & 64) != 0 ? null : atumStyledColorDto, (i & 128) != 0 ? null : atumVkuiTextAlignmentDto, (i & 256) != 0 ? null : atumVkuiFontWeightDto);
    }
}
