package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AtumTransformRotateDto.kt */
/* loaded from: classes14.dex */
public final class AtumTransformRotateDto implements Parcelable {
    public static final Parcelable.Creator<AtumTransformRotateDto> CREATOR = new a();

    @pmi0("angle")
    private final int angle;

    @pmi0("vector")
    private final AtumTransformPointDto vector;

    /* compiled from: AtumTransformRotateDto.kt */
    public static final class a implements Parcelable.Creator<AtumTransformRotateDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumTransformRotateDto createFromParcel(Parcel parcel) {
            return new AtumTransformRotateDto(AtumTransformPointDto.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumTransformRotateDto[] newArray(int i) {
            return new AtumTransformRotateDto[i];
        }
    }

    public AtumTransformRotateDto(AtumTransformPointDto atumTransformPointDto, int i) {
        this.vector = atumTransformPointDto;
        this.angle = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumTransformRotateDto)) {
            return false;
        }
        AtumTransformRotateDto atumTransformRotateDto = (AtumTransformRotateDto) obj;
        return epx.f(this.vector, atumTransformRotateDto.vector) && this.angle == atumTransformRotateDto.angle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.angle) + (this.vector.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumTransformRotateDto(vector=");
        sb.append(this.vector);
        sb.append(", angle=");
        return vu5.b(sb, this.angle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.vector.writeToParcel(parcel, i);
        parcel.writeInt(this.angle);
    }
}
