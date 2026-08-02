package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AtumVkuiHeaderSubtitleDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderSubtitleDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiHeaderSubtitleDto> CREATOR = new a();

    @pmi0("left_icon")
    private final AtumVkuiLocalImageDto leftIcon;

    @pmi0("number_of_lines")
    private final int numberOfLines;

    @pmi0("right_icon")
    private final AtumVkuiLocalImageDto rightIcon;

    @pmi0("subtitle")
    private final String subtitle;

    /* compiled from: AtumVkuiHeaderSubtitleDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderSubtitleDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderSubtitleDto createFromParcel(Parcel parcel) {
            return new AtumVkuiHeaderSubtitleDto(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderSubtitleDto[] newArray(int i) {
            return new AtumVkuiHeaderSubtitleDto[i];
        }
    }

    public AtumVkuiHeaderSubtitleDto(String str, int i, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto2) {
        this.subtitle = str;
        this.numberOfLines = i;
        this.leftIcon = atumVkuiLocalImageDto;
        this.rightIcon = atumVkuiLocalImageDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiHeaderSubtitleDto)) {
            return false;
        }
        AtumVkuiHeaderSubtitleDto atumVkuiHeaderSubtitleDto = (AtumVkuiHeaderSubtitleDto) obj;
        return epx.f(this.subtitle, atumVkuiHeaderSubtitleDto.subtitle) && this.numberOfLines == atumVkuiHeaderSubtitleDto.numberOfLines && this.leftIcon == atumVkuiHeaderSubtitleDto.leftIcon && this.rightIcon == atumVkuiHeaderSubtitleDto.rightIcon;
    }

    public final int hashCode() {
        int a2 = shy.a(this.numberOfLines, this.subtitle.hashCode() * 31, 31);
        AtumVkuiLocalImageDto atumVkuiLocalImageDto = this.leftIcon;
        int hashCode = (a2 + (atumVkuiLocalImageDto == null ? 0 : atumVkuiLocalImageDto.hashCode())) * 31;
        AtumVkuiLocalImageDto atumVkuiLocalImageDto2 = this.rightIcon;
        return hashCode + (atumVkuiLocalImageDto2 != null ? atumVkuiLocalImageDto2.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiHeaderSubtitleDto(subtitle=" + this.subtitle + ", numberOfLines=" + this.numberOfLines + ", leftIcon=" + this.leftIcon + ", rightIcon=" + this.rightIcon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.numberOfLines);
        AtumVkuiLocalImageDto atumVkuiLocalImageDto = this.leftIcon;
        if (atumVkuiLocalImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiLocalImageDto.writeToParcel(parcel, i);
        }
        AtumVkuiLocalImageDto atumVkuiLocalImageDto2 = this.rightIcon;
        if (atumVkuiLocalImageDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiLocalImageDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiHeaderSubtitleDto(String str, int i, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto2, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : atumVkuiLocalImageDto, (i2 & 8) != 0 ? null : atumVkuiLocalImageDto2);
    }
}
