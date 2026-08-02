package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiImageViewPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiImageViewPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiImageViewPropsDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("image")
    private final AtumVkuiLocalImageDto image;

    @pmi0("sys_tint_color")
    private final AtumImageTintDto sysTintColor;

    @pmi0("tint_color")
    private final AtumVkuiColorNameDto tintColor;

    /* compiled from: AtumVkuiImageViewPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiImageViewPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiImageViewPropsDto createFromParcel(Parcel parcel) {
            return new AtumVkuiImageViewPropsDto(AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumImageTintDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiImageViewPropsDto[] newArray(int i) {
            return new AtumVkuiImageViewPropsDto[i];
        }
    }

    public AtumVkuiImageViewPropsDto(AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumImageTintDto atumImageTintDto, String str) {
        this.image = atumVkuiLocalImageDto;
        this.tintColor = atumVkuiColorNameDto;
        this.sysTintColor = atumImageTintDto;
        this.description = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiImageViewPropsDto)) {
            return false;
        }
        AtumVkuiImageViewPropsDto atumVkuiImageViewPropsDto = (AtumVkuiImageViewPropsDto) obj;
        return this.image == atumVkuiImageViewPropsDto.image && this.tintColor == atumVkuiImageViewPropsDto.tintColor && this.sysTintColor == atumVkuiImageViewPropsDto.sysTintColor && epx.f(this.description, atumVkuiImageViewPropsDto.description);
    }

    public final int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
        int hashCode2 = (hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode())) * 31;
        AtumImageTintDto atumImageTintDto = this.sysTintColor;
        int hashCode3 = (hashCode2 + (atumImageTintDto == null ? 0 : atumImageTintDto.hashCode())) * 31;
        String str = this.description;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiImageViewPropsDto(image=");
        sb.append(this.image);
        sb.append(", tintColor=");
        sb.append(this.tintColor);
        sb.append(", sysTintColor=");
        sb.append(this.sysTintColor);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.image.writeToParcel(parcel, i);
        AtumVkuiColorNameDto atumVkuiColorNameDto = this.tintColor;
        if (atumVkuiColorNameDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiColorNameDto.writeToParcel(parcel, i);
        }
        AtumImageTintDto atumImageTintDto = this.sysTintColor;
        if (atumImageTintDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumImageTintDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
    }

    public /* synthetic */ AtumVkuiImageViewPropsDto(AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumVkuiColorNameDto atumVkuiColorNameDto, AtumImageTintDto atumImageTintDto, String str, int i, zcl zclVar) {
        this(atumVkuiLocalImageDto, (i & 2) != 0 ? null : atumVkuiColorNameDto, (i & 4) != 0 ? null : atumImageTintDto, (i & 8) != 0 ? null : str);
    }
}
