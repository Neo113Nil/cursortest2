package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.xq;

/* compiled from: BaseCropPhotoRectDto.kt */
/* loaded from: classes14.dex */
public final class BaseCropPhotoRectDto implements Parcelable {
    public static final Parcelable.Creator<BaseCropPhotoRectDto> CREATOR = new a();

    @pmi0("x")
    private final float x;

    @pmi0("x2")
    private final float x2;

    @pmi0("y")
    private final float y;

    @pmi0("y2")
    private final float y2;

    /* compiled from: BaseCropPhotoRectDto.kt */
    public static final class a implements Parcelable.Creator<BaseCropPhotoRectDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseCropPhotoRectDto createFromParcel(Parcel parcel) {
            return new BaseCropPhotoRectDto(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseCropPhotoRectDto[] newArray(int i) {
            return new BaseCropPhotoRectDto[i];
        }
    }

    public BaseCropPhotoRectDto(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.x2 = f3;
        this.y2 = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhotoRectDto)) {
            return false;
        }
        BaseCropPhotoRectDto baseCropPhotoRectDto = (BaseCropPhotoRectDto) obj;
        return Float.compare(this.x, baseCropPhotoRectDto.x) == 0 && Float.compare(this.y, baseCropPhotoRectDto.y) == 0 && Float.compare(this.x2, baseCropPhotoRectDto.x2) == 0 && Float.compare(this.y2, baseCropPhotoRectDto.y2) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y2) + b.a(this.x2, b.a(this.y, Float.hashCode(this.x) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCropPhotoRectDto(x=");
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
