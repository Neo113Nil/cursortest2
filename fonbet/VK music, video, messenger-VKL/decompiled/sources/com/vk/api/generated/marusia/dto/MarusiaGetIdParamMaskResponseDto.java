package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarusiaGetIdParamMaskResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetIdParamMaskResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetIdParamMaskResponseDto> CREATOR = new a();

    @pmi0("mask")
    private final String mask;

    /* compiled from: MarusiaGetIdParamMaskResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetIdParamMaskResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetIdParamMaskResponseDto createFromParcel(Parcel parcel) {
            return new MarusiaGetIdParamMaskResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetIdParamMaskResponseDto[] newArray(int i) {
            return new MarusiaGetIdParamMaskResponseDto[i];
        }
    }

    public MarusiaGetIdParamMaskResponseDto(String str) {
        this.mask = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarusiaGetIdParamMaskResponseDto) && epx.f(this.mask, ((MarusiaGetIdParamMaskResponseDto) obj).mask);
    }

    public final int hashCode() {
        return this.mask.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MarusiaGetIdParamMaskResponseDto(mask="), this.mask, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mask);
    }
}
