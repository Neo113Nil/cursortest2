package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.xq;

/* compiled from: AtumUiPointDto.kt */
/* loaded from: classes14.dex */
public final class AtumUiPointDto implements Parcelable {
    public static final Parcelable.Creator<AtumUiPointDto> CREATOR = new a();

    @pmi0("x")
    private final float x;

    @pmi0("y")
    private final float y;

    /* compiled from: AtumUiPointDto.kt */
    public static final class a implements Parcelable.Creator<AtumUiPointDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumUiPointDto createFromParcel(Parcel parcel) {
            return new AtumUiPointDto(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumUiPointDto[] newArray(int i) {
            return new AtumUiPointDto[i];
        }
    }

    public AtumUiPointDto(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumUiPointDto)) {
            return false;
        }
        AtumUiPointDto atumUiPointDto = (AtumUiPointDto) obj;
        return Float.compare(this.x, atumUiPointDto.x) == 0 && Float.compare(this.y, atumUiPointDto.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumUiPointDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        return xq.c(')', this.y, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
    }
}
