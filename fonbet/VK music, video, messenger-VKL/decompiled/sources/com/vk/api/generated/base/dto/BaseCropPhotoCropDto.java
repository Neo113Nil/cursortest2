package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.xq;

/* compiled from: BaseCropPhotoCropDto.kt */
/* loaded from: classes14.dex */
public final class BaseCropPhotoCropDto implements Parcelable {
    public static final Parcelable.Creator<BaseCropPhotoCropDto> CREATOR = new a();

    @pmi0("x")
    private final float x;

    @pmi0("x2")
    private final float x2;

    @pmi0("y")
    private final float y;

    @pmi0("y2")
    private final float y2;

    /* compiled from: BaseCropPhotoCropDto.kt */
    public static final class a implements Parcelable.Creator<BaseCropPhotoCropDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCropPhotoCropDto createFromParcel(Parcel parcel) {
            return new BaseCropPhotoCropDto(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCropPhotoCropDto[] newArray(int i) {
            return new BaseCropPhotoCropDto[i];
        }
    }

    public BaseCropPhotoCropDto(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.x2 = f3;
        this.y2 = f4;
    }

    public final float d() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.x2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhotoCropDto)) {
            return false;
        }
        BaseCropPhotoCropDto baseCropPhotoCropDto = (BaseCropPhotoCropDto) obj;
        return Float.compare(this.x, baseCropPhotoCropDto.x) == 0 && Float.compare(this.y, baseCropPhotoCropDto.y) == 0 && Float.compare(this.x2, baseCropPhotoCropDto.x2) == 0 && Float.compare(this.y2, baseCropPhotoCropDto.y2) == 0;
    }

    public final float f() {
        return this.y;
    }

    public final float g() {
        return this.y2;
    }

    public final int hashCode() {
        return Float.hashCode(this.y2) + b.a(this.x2, b.a(this.y, Float.hashCode(this.x) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCropPhotoCropDto(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", x2=");
        sb.append(this.x2);
        sb.append(", y2=");
        return xq.c(')', this.y2, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.x2);
        parcel.writeFloat(this.y2);
    }
}
