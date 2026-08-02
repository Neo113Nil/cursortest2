package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.xq;

/* compiled from: AtumTransformPointDto.kt */
/* loaded from: classes14.dex */
public final class AtumTransformPointDto implements Parcelable {
    public static final Parcelable.Creator<AtumTransformPointDto> CREATOR = new a();

    @pmi0("x")
    private final float x;

    @pmi0("y")
    private final float y;

    @pmi0("z")
    private final float z;

    /* compiled from: AtumTransformPointDto.kt */
    public static final class a implements Parcelable.Creator<AtumTransformPointDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumTransformPointDto createFromParcel(Parcel parcel) {
            return new AtumTransformPointDto(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumTransformPointDto[] newArray(int i) {
            return new AtumTransformPointDto[i];
        }
    }

    public AtumTransformPointDto(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumTransformPointDto)) {
            return false;
        }
        AtumTransformPointDto atumTransformPointDto = (AtumTransformPointDto) obj;
        return Float.compare(this.x, atumTransformPointDto.x) == 0 && Float.compare(this.y, atumTransformPointDto.y) == 0 && Float.compare(this.z, atumTransformPointDto.z) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.z) + b.a(this.y, Float.hashCode(this.x) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumTransformPointDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", z=");
        return xq.c(')', this.z, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.z);
    }
}
